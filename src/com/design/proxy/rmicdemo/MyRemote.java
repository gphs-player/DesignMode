package com.design.proxy.rmicdemo;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 标记接口
 */
public interface MyRemote extends Remote {
    //远程方法还是涉及IO的
    //返回值必须是序列化的，
    public String sayHello() throws RemoteException;
}
