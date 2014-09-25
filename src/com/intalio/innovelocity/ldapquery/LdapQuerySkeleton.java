package com.intalio.innovelocity.ldapquery;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.UnsupportedEncodingException;

public class LdapQuerySkeleton{
    private InitialDirContext ctx;
    private String prop_providerUrl;
    private String prop_securityPrincipal;
    private String prop_securityCredentials;
    private String prop_userUid;
    private String prop_userEmail;
    private String prop_userName;
    private String prop_searchBase;

    private void loadProps() throws IOException{
        String filename = "ldapquery.properties";
        Properties props = new Properties();
        InputStream isr = this.getClass().getResourceAsStream("/"+filename);
        if (isr != null){
          InputStreamReader isrProperties = new InputStreamReader(isr);
          props.load(isrProperties);
          prop_providerUrl = props.getProperty("url");
          prop_securityPrincipal = props.getProperty("principal");
          prop_securityCredentials = props.getProperty("credentials");
          prop_userUid = props.getProperty("user_uid_key");
          prop_userEmail = props.getProperty("user_email_key");
          prop_userName = props.getProperty("user_name_key");
          prop_searchBase = props.getProperty("search_base");
        }
        
    }
    
    private void connect() throws NamingException{
        
        Hashtable env = new Hashtable();

        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, prop_providerUrl);
        env.put(Context.SECURITY_PRINCIPAL, prop_securityPrincipal);
        env.put(Context.SECURITY_CREDENTIALS, prop_securityCredentials);
        env.put(Context.SECURITY_AUTHENTICATION, "simple");
        
        ctx = new InitialDirContext(env);
    }
    private List<com.intalio.innovelocity.ldapquery.UserInfoType> search(String key,String value) throws NamingException{
        String[] attrReturn = {prop_userUid,prop_userName,prop_userEmail}; 
        SearchControls ctls = new SearchControls();
        String filter = "(" + key + "="+ value + ")";
        ctls.setSearchScope(SearchControls.SUBTREE_SCOPE);
        ctls.setReturningAttributes(attrReturn);
        NamingEnumeration answer = ctx.search(prop_searchBase, filter, ctls);
        if(answer != null){
            List<com.intalio.innovelocity.ldapquery.UserInfoType> list = new ArrayList<com.intalio.innovelocity.ldapquery.UserInfoType>();
            while(answer.hasMoreElements()){
                com.intalio.innovelocity.ldapquery.UserInfoType info = new com.intalio.innovelocity.ldapquery.UserInfoType();
                SearchResult current = (SearchResult)answer.nextElement();
                Attributes attr = current.getAttributes();
                info.setUserID(attr.get(prop_userUid).get().toString());
                info.setUserName(attr.get(prop_userName).get().toString());
                info.setUserEmail(attr.get(prop_userEmail).get().toString());
                list.add(info);
            }
            return list;
        }
        else
        {
            return null;
        }
    }
    private com.intalio.innovelocity.ldapquery.UserInfoType[] searchByKey(String key, String value){
        com.intalio.innovelocity.ldapquery.UserInfoType u = new com.intalio.innovelocity.ldapquery.UserInfoType();
        try {
            connect();
            List<com.intalio.innovelocity.ldapquery.UserInfoType> list =  search(key,value);
            com.intalio.innovelocity.ldapquery.UserInfoType[] results = new com.intalio.innovelocity.ldapquery.UserInfoType[list.size()];
            for(int i=0; i < list.size(); i++){
                results[i] = list.get(i);
            }
            return results;
        } catch (NamingException ex) {
            Logger.getLogger(LdapQuerySkeleton.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    private String sanatize(String input){
        String s = "";
        for(int i=0; i < input.length(); i++){
            char c = input.charAt(i);
            if (c == '*') {
                s += "\\2a";
            }
            else if (c == '(') {
                    // escape left parenthesis
                    s += "\\28";
            }
            else if (c == ')') {
                    // escape right parenthesis
                    s += "\\29";
            }
            else if (c == '\\') {
                    // escape backslash
                    s += "\\5c";
            }
            else if (c == '\u0000') {
                    // escape NULL char
                    s += "\\00";
            }
            else if (c <= 0x7f) {
                    // regular 1-byte UTF-8 char
                    s += String.valueOf(c);
            }
            else if (c >= 0x080) { 

                // higher-order 2, 3 and 4-byte UTF-8 chars

                try {
                        byte[] utf8bytes = String.valueOf(c).getBytes("UTF8");

                        for (byte b: utf8bytes)
                                s += String.format("\\%02x", b);

                } catch (UnsupportedEncodingException e) {
                        // ignore
                }
            }
        }

        return s;
    }
    
    public com.intalio.innovelocity.ldapquery.NameSearchResponse nameSearch(com.intalio.innovelocity.ldapquery.NameSearchRequest request){
        try {
            loadProps();
        } catch (IOException e) {
            Logger.getLogger(LdapQuerySkeleton.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
        String value = request.getNameSearchRequest().getLookup_value();
        com.intalio.innovelocity.ldapquery.NameSearchResponse response = new com.intalio.innovelocity.ldapquery.NameSearchResponse();
        com.intalio.innovelocity.ldapquery.LdapQueryResponseMessageType r = new com.intalio.innovelocity.ldapquery.LdapQueryResponseMessageType();
        r.setResults(searchByKey(prop_userName,"*" + sanatize(value) + "*"));
        response.setNameSearchResponse(r);
        return response;
    }
    public com.intalio.innovelocity.ldapquery.EmailSearchResponse emailSearch(com.intalio.innovelocity.ldapquery.EmailSearchRequest request){
        try {
            loadProps();
        } catch (IOException e) {
            Logger.getLogger(LdapQuerySkeleton.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
        String value = request.getEmailSearchRequest().getLookup_value();
        com.intalio.innovelocity.ldapquery.EmailSearchResponse response = new com.intalio.innovelocity.ldapquery.EmailSearchResponse();
        com.intalio.innovelocity.ldapquery.LdapQueryResponseMessageType r = new com.intalio.innovelocity.ldapquery.LdapQueryResponseMessageType();
        r.setResults(searchByKey(prop_userEmail,"*" + sanatize(value) + "*"));
        response.setEmailSearchResponse(r);
        return response;
    }
    public com.intalio.innovelocity.ldapquery.UidSearchResponse uidSearch(com.intalio.innovelocity.ldapquery.UidSearchRequest request)
    {
        try {
            loadProps();
        } catch (IOException e) {
            Logger.getLogger(LdapQuerySkeleton.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
        String value = request.getUidSearchRequest().getLookup_value();
        com.intalio.innovelocity.ldapquery.UidSearchResponse response = new com.intalio.innovelocity.ldapquery.UidSearchResponse();
        com.intalio.innovelocity.ldapquery.LdapQueryResponseMessageType r = new com.intalio.innovelocity.ldapquery.LdapQueryResponseMessageType();
        r.setResults(searchByKey(prop_userUid,sanatize(value)));
        response.setUidSearchResponse(r);
        return response;
    }
 
}
