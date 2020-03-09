package com.design.factory;

/**
 * Author   :   lihua
 * Date     :   2016/10/20.下午4:28
 * Description: 运算类生产工厂
 */
public class OperateFactory {

	/**
	 * @param type 具体操作类型
	 * @return 根据传入类型获取具体操作类
	 */
	public static Operate createOperate(String type) {
		Operate operate = null;
		switch (type) {
			case "+":
				operate = new OperateAdd();
				break;
			case "-":
				operate = new OperateMin();
				break;
			case "*":
				operate = new OperateMul();
				break;
			case "/":
				operate = new OperateDiv();
				break;
		}
		return operate;
	}
}
