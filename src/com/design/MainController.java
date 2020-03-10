package com.design;

import com.design.decorate.*;
import com.design.factory.Operate;
import com.design.factory.OperateFactory;
import com.design.observe.FirstSubject;
import com.design.observe.StockObserver;
import com.design.proxy.demo.Panjinlian;
import com.design.proxy.demo.WangPo;
import com.design.proxy.demo.Women;
import com.design.strategy.CashContext;

/**
 * Author:lihua
 * Date:2017/3/31
 * Description:
 */
public class MainController {
    public static void main(String[] args) {

//        proxyTest();
//        observerTest();
//        strategyTest();
//        factoryTest();
     decorateTest();
    }

    /**
     * 1.代理
     */
    private static void proxyTest() {
        Women women = new WangPo(new Panjinlian());
        women.throwEye("小西");
        women.doSomething("武松");
    }

    /**
     * 2.观察者
     */
    private static void observerTest() {
        FirstSubject subject = new FirstSubject();
        subject.attach(new StockObserver(subject, "paul"));
        subject.setmSubjectState("老板来了");
        subject.notifyObserver();
    }

    /**
     * 3.策略
     */
    private static void strategyTest() {
        //直接暴露出实现方案
//        CashContext cashContext = new CashContext(new CashNormal());
        //结合简单工厂方式实现
        CashContext context = new CashContext("normal");
        double result = context.getResult(1000);
        System.out.println(result);
    }

    /**
     * 简单工厂
     */
    private static void factoryTest() {
        Operate operate = OperateFactory.createOperate("+");
        operate.mNumberA = 8;
        operate.mNumberB = 9;
        float result = operate.getResult();
        System.out.println(result);
    }

    /**
     * 装饰模式
     */
    private static void decorateTest() {
        IEquip poJiaGong = new PoJiaGong(new FanJia(new DouPeng(new PackageFirst())));
        int attack = poJiaGong.attackPlus();
        int defend = poJiaGong.defendPlus();
        System.out.println("attack : " + attack);
        System.out.println("defend : " + defend);
    }
}
