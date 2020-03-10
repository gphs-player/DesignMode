package com.design.singleton;

public class Singleton {
    private static final Singleton mInstance = new Singleton();

    static Singleton getInstance() {
        return mInstance;
    }


    private Singleton() {
    }

    public void show(){
        System.out.println(getClass().getSimpleName());
    }
}
