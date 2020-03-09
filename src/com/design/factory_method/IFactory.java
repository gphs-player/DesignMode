package com.design.factory_method;

/**
 * Author   :   lihua
 * Date     :   16/9/26.下午2:33
 * Description:	获取操作类,使类的实例化延迟到子类
 */
public interface IFactory {
	Operation createOperation();
}
