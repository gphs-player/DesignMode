package com.design.proxy.rmicdemo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 这就是远程服务，提供服务但是要被客户端调用
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says: 'Hi!'";
    }

    public static void main(String [] args){

        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello",service);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
