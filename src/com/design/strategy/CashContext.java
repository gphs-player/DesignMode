package com.design.strategy;

/**
 * Author:lihua
 * Date:2017/4/1
 * Description :
 */
public class CashContext {
    private CashSuper cashSuper;
    private int mCondition, mReturn;

    /**
     * @param cashSuper 接收一个收费实现类
     */
    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    /**
     * @param type 结合简单工厂的实现
     */
    public CashContext(String type) {
        switch (type) {
            case "normal":
                this.cashSuper = new CashNormal();
                break;
            case "rebate":
                this.cashSuper = new CashNormal();
                break;
            case "return":
                this.cashSuper = new CashReturn(mCondition, mReturn);
                break;
        }
    }

    /**
     * @param condition   返现条件
     * @param returnMoney 返现额度
     */
    public void setCondition(int condition, int returnMoney) {
        mCondition = condition;
        mReturn = returnMoney;
    }

    /**
     * @param money
     * @return 返回收费结果
     */
    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
