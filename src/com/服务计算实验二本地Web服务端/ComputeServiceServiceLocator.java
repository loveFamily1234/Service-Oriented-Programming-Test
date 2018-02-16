/**
 * ComputeServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.服务计算实验二本地Web服务端;

public class ComputeServiceServiceLocator extends org.apache.axis.client.Service implements com.服务计算实验二本地Web服务端.ComputeServiceService {

    public ComputeServiceServiceLocator() {
    }


    public ComputeServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ComputeServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ComputeService
    private java.lang.String ComputeService_address = "http://localhost:8080/%E6%9C%8D%E5%8A%A1%E8%AE%A1%E7%AE%97%E5%AE%9E%E9%AA%8C%E4%BA%8CWeb%E6%9C%8D%E5%8A%A1%E7%AB%AF/services/ComputeService";

    public java.lang.String getComputeServiceAddress() {
        return ComputeService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ComputeServiceWSDDServiceName = "ComputeService";

    public java.lang.String getComputeServiceWSDDServiceName() {
        return ComputeServiceWSDDServiceName;
    }

    public void setComputeServiceWSDDServiceName(java.lang.String name) {
        ComputeServiceWSDDServiceName = name;
    }

    public com.服务计算实验二本地Web服务端.ComputeService getComputeService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ComputeService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getComputeService(endpoint);
    }

    public com.服务计算实验二本地Web服务端.ComputeService getComputeService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.服务计算实验二本地Web服务端.ComputeServiceSoapBindingStub _stub = new com.服务计算实验二本地Web服务端.ComputeServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getComputeServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setComputeServiceEndpointAddress(java.lang.String address) {
        ComputeService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.服务计算实验二本地Web服务端.ComputeService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.服务计算实验二本地Web服务端.ComputeServiceSoapBindingStub _stub = new com.服务计算实验二本地Web服务端.ComputeServiceSoapBindingStub(new java.net.URL(ComputeService_address), this);
                _stub.setPortName(getComputeServiceWSDDServiceName());
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
        if ("ComputeService".equals(inputPortName)) {
            return getComputeService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://服务计算实验二Web服务端.com", "ComputeServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://服务计算实验二Web服务端.com", "ComputeService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ComputeService".equals(portName)) {
            setComputeServiceEndpointAddress(address);
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
