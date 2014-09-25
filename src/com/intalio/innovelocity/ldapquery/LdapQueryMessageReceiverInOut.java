
/**
 * LdapQueryMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package com.intalio.innovelocity.ldapquery;

        /**
        *  LdapQueryMessageReceiverInOut message receiver
        */

        public class LdapQueryMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        LdapQuerySkeleton skel = (LdapQuerySkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("nameSearch".equals(methodName)){
                
                com.intalio.innovelocity.ldapquery.NameSearchResponse nameSearchResponse1 = null;
	                        com.intalio.innovelocity.ldapquery.NameSearchRequest wrappedParam =
                                                             (com.intalio.innovelocity.ldapquery.NameSearchRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.intalio.innovelocity.ldapquery.NameSearchRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               nameSearchResponse1 =
                                                   
                                                   
                                                         skel.nameSearch(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), nameSearchResponse1, false, new javax.xml.namespace.QName("http://innovelocity.intalio.com/LdapQuery/",
                                                    "nameSearch"));
                                    } else 

            if("uidSearch".equals(methodName)){
                
                com.intalio.innovelocity.ldapquery.UidSearchResponse uidSearchResponse3 = null;
	                        com.intalio.innovelocity.ldapquery.UidSearchRequest wrappedParam =
                                                             (com.intalio.innovelocity.ldapquery.UidSearchRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.intalio.innovelocity.ldapquery.UidSearchRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               uidSearchResponse3 =
                                                   
                                                   
                                                         skel.uidSearch(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), uidSearchResponse3, false, new javax.xml.namespace.QName("http://innovelocity.intalio.com/LdapQuery/",
                                                    "uidSearch"));
                                    } else 

            if("emailSearch".equals(methodName)){
                
                com.intalio.innovelocity.ldapquery.EmailSearchResponse emailSearchResponse5 = null;
	                        com.intalio.innovelocity.ldapquery.EmailSearchRequest wrappedParam =
                                                             (com.intalio.innovelocity.ldapquery.EmailSearchRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.intalio.innovelocity.ldapquery.EmailSearchRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               emailSearchResponse5 =
                                                   
                                                   
                                                         skel.emailSearch(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), emailSearchResponse5, false, new javax.xml.namespace.QName("http://innovelocity.intalio.com/LdapQuery/",
                                                    "emailSearch"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.innovelocity.ldapquery.NameSearchRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.innovelocity.ldapquery.NameSearchRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.innovelocity.ldapquery.NameSearchResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.innovelocity.ldapquery.NameSearchResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.innovelocity.ldapquery.UidSearchRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.innovelocity.ldapquery.UidSearchRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.innovelocity.ldapquery.UidSearchResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.innovelocity.ldapquery.UidSearchResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.innovelocity.ldapquery.EmailSearchRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.innovelocity.ldapquery.EmailSearchRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.innovelocity.ldapquery.EmailSearchResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.innovelocity.ldapquery.EmailSearchResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.innovelocity.ldapquery.NameSearchResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.innovelocity.ldapquery.NameSearchResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.intalio.innovelocity.ldapquery.NameSearchResponse wrapNameSearch(){
                                com.intalio.innovelocity.ldapquery.NameSearchResponse wrappedElement = new com.intalio.innovelocity.ldapquery.NameSearchResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.innovelocity.ldapquery.UidSearchResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.innovelocity.ldapquery.UidSearchResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.intalio.innovelocity.ldapquery.UidSearchResponse wrapUidSearch(){
                                com.intalio.innovelocity.ldapquery.UidSearchResponse wrappedElement = new com.intalio.innovelocity.ldapquery.UidSearchResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.innovelocity.ldapquery.EmailSearchResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.innovelocity.ldapquery.EmailSearchResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.intalio.innovelocity.ldapquery.EmailSearchResponse wrapEmailSearch(){
                                com.intalio.innovelocity.ldapquery.EmailSearchResponse wrappedElement = new com.intalio.innovelocity.ldapquery.EmailSearchResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.intalio.innovelocity.ldapquery.NameSearchRequest.class.equals(type)){
                
                           return com.intalio.innovelocity.ldapquery.NameSearchRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.innovelocity.ldapquery.NameSearchResponse.class.equals(type)){
                
                           return com.intalio.innovelocity.ldapquery.NameSearchResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.innovelocity.ldapquery.UidSearchRequest.class.equals(type)){
                
                           return com.intalio.innovelocity.ldapquery.UidSearchRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.innovelocity.ldapquery.UidSearchResponse.class.equals(type)){
                
                           return com.intalio.innovelocity.ldapquery.UidSearchResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.innovelocity.ldapquery.EmailSearchRequest.class.equals(type)){
                
                           return com.intalio.innovelocity.ldapquery.EmailSearchRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.innovelocity.ldapquery.EmailSearchResponse.class.equals(type)){
                
                           return com.intalio.innovelocity.ldapquery.EmailSearchResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    