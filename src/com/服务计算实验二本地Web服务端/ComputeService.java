/**
 * ComputeService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.服务计算实验二本地Web服务端;

public interface ComputeService extends java.rmi.Remote {
    public float getProduct(float number_1, float number_2) throws java.rmi.RemoteException;
    public float getDifference(float number_1, float number_2) throws java.rmi.RemoteException;
    public float getQuotient(float number_1, float number_2) throws java.rmi.RemoteException;
    public float getSum(float number_1, float number_2) throws java.rmi.RemoteException;
}
