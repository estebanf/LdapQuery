
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package com.intalio.innovelocity.ldapquery;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://innovelocity.intalio.com/LdapQuery/".equals(namespaceURI) &&
                  "UserInfoType".equals(typeName)){
                   
                            return  com.intalio.innovelocity.ldapquery.UserInfoType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://innovelocity.intalio.com/LdapQuery/".equals(namespaceURI) &&
                  "LdapQueryResponseMessageType".equals(typeName)){
                   
                            return  com.intalio.innovelocity.ldapquery.LdapQueryResponseMessageType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://innovelocity.intalio.com/LdapQuery/".equals(namespaceURI) &&
                  "LdapQueryRequestMessageType".equals(typeName)){
                   
                            return  com.intalio.innovelocity.ldapquery.LdapQueryRequestMessageType.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    