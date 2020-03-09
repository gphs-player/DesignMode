package com.design.decorate;

/**
 * Author:lihua
 * Date:2017/4/6
 * Description:
 */
public class FanJia implements IClothes {
    private IEquip mEquip;

    public FanJia(IEquip equip) {
        this.mEquip = equip;
    }

    @Override
    public int attackPlus() {
        System.out.print(" 反甲加成攻击力：20");
        return mEquip.attackPlus() + 20;
    }

    @Override
    public int defendPlus() {
        System.out.print(" 反甲加成防御力：50");
        return mEquip.defendPlus() + 50;
    }
}
