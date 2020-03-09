package com.design.prototype;

import java.util.ArrayList;
import java.util.List;

public class ConCreatePrototype implements Cloneable {

    private String id;
    protected ArrayList<String> hobbies;


    public ConCreatePrototype() {
        System.out.println("--------构造方法---------");
        hobbies = new ArrayList<>();
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected ConCreatePrototype clone() {
        ConCreatePrototype instance = null;
        try {
            instance = (ConCreatePrototype) super.clone();
            instance.hobbies = (ArrayList<String>) this.hobbies.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }

    public void show() {
        System.out.println("--------show start---------:");
        System.out.println("id:" + id);
        for (String hobby : hobbies) {
            System.out.println("hobby:" + hobby);

        }
        System.out.println("--------show end---------:");
    }
}
