package com.design.decorate;

/**
 * Author:lihua
 * Date:2017/4/6
 * Description:
 */
public class DouPeng implements IClothes {
    private IEquip mEquip;

    public DouPeng(IEquip equip) {
        this.mEquip = equip;
    }

    @Override
    public int attackPlus() {
        System.out.print(" 斗篷加成攻击力：20");
        return mEquip.attackPlus() + 20;
    }

    @Override
    public int defendPlus() {
        System.out.print(" 斗篷加成防御力：20");
        return mEquip.defendPlus() + 20;
    }
}
