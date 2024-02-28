/**
 * ContactServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.service;

public class ContactServiceImplServiceLocator extends org.apache.axis.client.Service implements ws.service.ContactServiceImplService {

    public ContactServiceImplServiceLocator() {
    }


    public ContactServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ContactServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ContactServiceImplPort
    private java.lang.String ContactServiceImplPort_address = "http://localhost:8080/ContactWS";

    public java.lang.String getContactServiceImplPortAddress() {
        return ContactServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ContactServiceImplPortWSDDServiceName = "ContactServiceImplPort";

    public java.lang.String getContactServiceImplPortWSDDServiceName() {
        return ContactServiceImplPortWSDDServiceName;
    }

    public void setContactServiceImplPortWSDDServiceName(java.lang.String name) {
        ContactServiceImplPortWSDDServiceName = name;
    }

    public ws.service.ContactService getContactServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ContactServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getContactServiceImplPort(endpoint);
    }

    public ws.service.ContactService getContactServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.service.ContactServiceImplPortBindingStub _stub = new ws.service.ContactServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getContactServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setContactServiceImplPortEndpointAddress(java.lang.String address) {
        ContactServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.service.ContactService.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.service.ContactServiceImplPortBindingStub _stub = new ws.service.ContactServiceImplPortBindingStub(new java.net.URL(ContactServiceImplPort_address), this);
                _stub.setPortName(getContactServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ContactServiceImplPort".equals(inputPortName)) {
            return getContactServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.ws/", "ContactServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.ws/", "ContactServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ContactServiceImplPort".equals(portName)) {
            setContactServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
