package com.design.proxy.gumball;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    public GumballMachine(String location, int num) throws RemoteException {
    }

    @Override
    public int getCount() throws RemoteException {
        return 0;
    }

    @Override
    public String getLocation() throws RemoteException {
        return null;
    }

    @Override
    public State getState() throws RemoteException {
        return null;
    }
}
