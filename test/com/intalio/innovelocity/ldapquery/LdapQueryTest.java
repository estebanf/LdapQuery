

/**
 * LdapQueryTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package com.intalio.innovelocity.ldapquery;

    /*
     *  LdapQueryTest Junit test case
    */

    public class LdapQueryTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testnameSearch() throws java.lang.Exception{

        com.intalio.innovelocity.ldapquery.LdapQueryStub stub =
                    new com.intalio.innovelocity.ldapquery.LdapQueryStub();//the default implementation should point to the right endpoint

           com.intalio.innovelocity.ldapquery.LdapQueryStub.NameSearchRequest nameSearchRequest12=
                                                        (com.intalio.innovelocity.ldapquery.LdapQueryStub.NameSearchRequest)getTestObject(com.intalio.innovelocity.ldapquery.LdapQueryStub.NameSearchRequest.class);
                    // TODO : Fill in the nameSearchRequest12 here
                
                        assertNotNull(stub.nameSearch(
                        nameSearchRequest12));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartnameSearch() throws java.lang.Exception{
            com.intalio.innovelocity.ldapquery.LdapQueryStub stub = new com.intalio.innovelocity.ldapquery.LdapQueryStub();
             com.intalio.innovelocity.ldapquery.LdapQueryStub.NameSearchRequest nameSearchRequest12=
                                                        (com.intalio.innovelocity.ldapquery.LdapQueryStub.NameSearchRequest)getTestObject(com.intalio.innovelocity.ldapquery.LdapQueryStub.NameSearchRequest.class);
                    // TODO : Fill in the nameSearchRequest12 here
                

                stub.startnameSearch(
                         nameSearchRequest12,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends com.intalio.innovelocity.ldapquery.LdapQueryCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultnameSearch(
                         com.intalio.innovelocity.ldapquery.LdapQueryStub.NameSearchResponse result
                            ) {
                
            }

            public void receiveErrornameSearch(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testuidSearch() throws java.lang.Exception{

        com.intalio.innovelocity.ldapquery.LdapQueryStub stub =
                    new com.intalio.innovelocity.ldapquery.LdapQueryStub();//the default implementation should point to the right endpoint

           com.intalio.innovelocity.ldapquery.LdapQueryStub.UidSearchRequest uidSearchRequest14=
                                                        (com.intalio.innovelocity.ldapquery.LdapQueryStub.UidSearchRequest)getTestObject(com.intalio.innovelocity.ldapquery.LdapQueryStub.UidSearchRequest.class);
                    // TODO : Fill in the uidSearchRequest14 here
                
                        assertNotNull(stub.uidSearch(
                        uidSearchRequest14));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartuidSearch() throws java.lang.Exception{
            com.intalio.innovelocity.ldapquery.LdapQueryStub stub = new com.intalio.innovelocity.ldapquery.LdapQueryStub();
             com.intalio.innovelocity.ldapquery.LdapQueryStub.UidSearchRequest uidSearchRequest14=
                                                        (com.intalio.innovelocity.ldapquery.LdapQueryStub.UidSearchRequest)getTestObject(com.intalio.innovelocity.ldapquery.LdapQueryStub.UidSearchRequest.class);
                    // TODO : Fill in the uidSearchRequest14 here
                

                stub.startuidSearch(
                         uidSearchRequest14,
                    new tempCallbackN10035()
                );
              


        }

        private class tempCallbackN10035  extends com.intalio.innovelocity.ldapquery.LdapQueryCallbackHandler{
            public tempCallbackN10035(){ super(null);}

            public void receiveResultuidSearch(
                         com.intalio.innovelocity.ldapquery.LdapQueryStub.UidSearchResponse result
                            ) {
                
            }

            public void receiveErroruidSearch(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testemailSearch() throws java.lang.Exception{

        com.intalio.innovelocity.ldapquery.LdapQueryStub stub =
                    new com.intalio.innovelocity.ldapquery.LdapQueryStub();//the default implementation should point to the right endpoint

           com.intalio.innovelocity.ldapquery.LdapQueryStub.EmailSearchRequest emailSearchRequest16=
                                                        (com.intalio.innovelocity.ldapquery.LdapQueryStub.EmailSearchRequest)getTestObject(com.intalio.innovelocity.ldapquery.LdapQueryStub.EmailSearchRequest.class);
                    // TODO : Fill in the emailSearchRequest16 here
                
                        assertNotNull(stub.emailSearch(
                        emailSearchRequest16));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartemailSearch() throws java.lang.Exception{
            com.intalio.innovelocity.ldapquery.LdapQueryStub stub = new com.intalio.innovelocity.ldapquery.LdapQueryStub();
             com.intalio.innovelocity.ldapquery.LdapQueryStub.EmailSearchRequest emailSearchRequest16=
                                                        (com.intalio.innovelocity.ldapquery.LdapQueryStub.EmailSearchRequest)getTestObject(com.intalio.innovelocity.ldapquery.LdapQueryStub.EmailSearchRequest.class);
                    // TODO : Fill in the emailSearchRequest16 here
                

                stub.startemailSearch(
                         emailSearchRequest16,
                    new tempCallbackN1005E()
                );
              


        }

        private class tempCallbackN1005E  extends com.intalio.innovelocity.ldapquery.LdapQueryCallbackHandler{
            public tempCallbackN1005E(){ super(null);}

            public void receiveResultemailSearch(
                         com.intalio.innovelocity.ldapquery.LdapQueryStub.EmailSearchResponse result
                            ) {
                
            }

            public void receiveErroremailSearch(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    