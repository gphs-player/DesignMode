package com.design.proxy.gumball;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {


    public int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException;

}

interface State extends Serializable{
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();

}
