package com.example.design.proxy.staticc;

/**
 * @author hongjiangming
 * @date 2022/2/21 3:44 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
public class TransactionHandler implements UserDao {

    //目标代理对象
    private UserDao target;

    //构造代理对象时传入目标对象
    public TransactionHandler(UserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        // 调用目标方法前的处理
        System.out.println("开启事务控制...");
        target.save();
        // 调用目标方法后的处理
        System.out.println("关闭事物控制");
    }

    public static void main(String[] args) {
        TransactionHandler transactionHandler = new TransactionHandler(new UserDaoImpl());
        transactionHandler.save();
    }
}
