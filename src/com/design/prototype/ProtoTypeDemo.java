package com.design.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式，用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 * 从一个对象再创建另外一个可定制的对象，不需要知道任何创建的细节
 * 深复制和浅复制的问题需要考虑，java的Cloneable就是原型模式的实现
 */
public class ProtoTypeDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        ConCreatePrototype prototype = new ConCreatePrototype();
//        prototype.setId("origin");
//        list.add("ball");
//        prototype.setHobbies(list);
//        prototype.show();
//        System.out.println(prototype.getHobbies().hashCode());
//        ConCreatePrototype clone = prototype.clone();
//        clone.show();
//        System.out.println(clone.getHobbies().hashCode());
//        clone.setId("copy");
//        clone.getHobbies().add("book");
//        clone.show();
//        prototype.show();
        list.add("ball");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            ConCreatePrototype prototype = new ConCreatePrototype();
            prototype.setId("origin");
            prototype.setHobbies(list);
            prototype.show();
        }
        long end = System.currentTimeMillis();
        System.out.println("spend : " + (end - start));  //  ~300


//        ConCreatePrototype prototype = new ConCreatePrototype();
//        prototype.setId("origin");
//        prototype.setHobbies(list);
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            ConCreatePrototype prototype1 = prototype.clone();
//            prototype1.show();
//
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("spend : " + (end - start));~250
    }
}
