package com.design.decorate;

/**
 * Author   :   lihua
 * Date     :   2016/10/20.下午5:47
 * Description: 需要装饰的对象的抽象
 */
public interface IEquip {
	//显示角色的攻击力和防御力
	int attackPlus();
	int defendPlus();
}
