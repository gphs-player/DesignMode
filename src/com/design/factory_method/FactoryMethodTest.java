package com.design.factory_method;

/**
 * Author   :   lihua
 * Date     :   16/9/26.下午2:42
 * Description: 工厂方法模式
 */
public class FactoryMethodTest {

	public static void main(String[] args) {
		//在这里,客户端决定实例化哪一个工厂实现运算类
		IFactory factory = new AddFactory();

		Operation operation = factory.createOperation();
		operation.x = 6;
		operation.y = 7;
		int result = operation.getResult();
		System.out.println(result);

	}
}
