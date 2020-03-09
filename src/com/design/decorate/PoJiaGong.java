package com.design.decorate;

/**
 * Author:lihua
 * Date:2017/4/6
 * Description:
 */
public class PoJiaGong implements IWeapon {
    private IEquip mEquip;

    public PoJiaGong(IEquip equip) {
        this.mEquip = equip;
    }

    @Override
    public int attackPlus() {
        System.out.print(" 破甲弓加成攻击力：40");
        return mEquip.attackPlus() + 40;
    }

    @Override
    public int defendPlus() {
        System.out.print(" 破甲弓加成防御力：20");
        return mEquip.defendPlus() + 20;
    }
}
