package com.design.decorate;

/**
 * Author:lihua
 * Date:2017/4/6
 * Description:
 */
public class PackageFirst implements IEquip {
    @Override
    public int attackPlus() {
        System.out.print("基本攻击：100");
        return 100;
    }

    @Override
    public int defendPlus() {
        System.out.print("基本防御：100");
        return 100;
    }
}
