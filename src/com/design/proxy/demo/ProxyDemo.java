package com.design.proxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>Author:lihua</p>
 * <p>Date:2016/12/23</p>
 * <p>Description:
 * &nbsp&nbsp代理模式用于扩展已有对象的功能，但是不影响已有类的功能，比继承更加灵活
 * <h3>1.静态代理</h3>
 * <pre>
 *     需要自己实现对象的实例化，
 * </pre>
 * <h3>2.动态代理</h3>
 * <pre>
 *     实例化过程由Proxy.newInstance()在运行时完成，调用的是native方法，AOP思想切入。
 *     动态生成代理类的格式是：packageName+$Proxy+id
 * </pre>
 * </p>
 */
public class ProxyDemo {

    public static void main(String[] args) {

        Women pan = new Panjinlian();
        /*1.代理模式基本实现
        WangPo wp = new WangPo(pan);
        wp.throwEye();
        wp.doSomething();*/
        //2.动态代理，不需要代理类，由系统自行实现代理类
        /*
        * Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
        * ClassLoader:类加载器，固定写法，和被代理类使用相同的加载器即可
        * Class<?>[] interfaces：代理类要实现的接口，固定写法，和被代理类使用相同的接口即可
        * InvocationHandler 策略（方案）设计模式的应用
        * */
        Women wm = (Women) Proxy.newProxyInstance(pan.getClass().getClassLoader(), pan.getClass().getInterfaces(), new InvocationHandler() {
            /*
            * invoke(Object proxy, Method method, Object[] args)
            * proxy :对象本身的引用，一般用不到
            * method:对象要执行的方法
            * args:方法执行时候要用到的参数
            * */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //利用这一特性，接入了AOP的思想，将部分代码抽离，典型的是数据库事务，在业务层只关心业务即可，事务的操作可以分离出来。不影响代码。
                //
                if ("throwEye".equals(method.getName())) {
                    System.out.println("好戏开始了");
                }
                Object invoke = method.invoke(pan, args);
                if ("throwEye".equals(method.getName())) {
                    System.out.println("好戏落幕了");
                }
                return invoke;
            }
        });

        wm.throwEye("小西");
        wm.doSomething("武松");

        //动态代理将Invoc单独的类ationHandler抽离成
        CompanyA companyA = new CompanyA();
        ProxyHandler proxyHandler = new ProxyHandler(companyA);
        ProductOutput proxy = proxyHandler.proxy();
        proxy.outPutSth();


    }
}
