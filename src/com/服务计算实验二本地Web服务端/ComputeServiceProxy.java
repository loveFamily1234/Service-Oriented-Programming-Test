package com.服务计算实验二本地Web服务端;

public class ComputeServiceProxy implements com.服务计算实验二本地Web服务端.ComputeService {
  private String _endpoint = null;
  private com.服务计算实验二本地Web服务端.ComputeService computeService = null;
  
  public ComputeServiceProxy() {
    _initComputeServiceProxy();
  }
  
  public ComputeServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initComputeServiceProxy();
  }
  
  private void _initComputeServiceProxy() {
    try {
      computeService = (new com.服务计算实验二本地Web服务端.ComputeServiceServiceLocator()).getComputeService();
      if (computeService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)computeService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)computeService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (computeService != null)
      ((javax.xml.rpc.Stub)computeService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.服务计算实验二本地Web服务端.ComputeService getComputeService() {
    if (computeService == null)
      _initComputeServiceProxy();
    return computeService;
  }
  
  public float getProduct(float number_1, float number_2) throws java.rmi.RemoteException{
    if (computeService == null)
      _initComputeServiceProxy();
    return computeService.getProduct(number_1, number_2);
  }
  
  public float getDifference(float number_1, float number_2) throws java.rmi.RemoteException{
    if (computeService == null)
      _initComputeServiceProxy();
    return computeService.getDifference(number_1, number_2);
  }
  
  public float getQuotient(float number_1, float number_2) throws java.rmi.RemoteException{
    if (computeService == null)
      _initComputeServiceProxy();
    return computeService.getQuotient(number_1, number_2);
  }
  
  public float getSum(float number_1, float number_2) throws java.rmi.RemoteException{
    if (computeService == null)
      _initComputeServiceProxy();
    return computeService.getSum(number_1, number_2);
  }
  
  
}