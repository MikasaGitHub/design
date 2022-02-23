package com.example.design.proxy.staticc;

import com.example.design.proxy.staticc.UserDao;

/**
 * @author hongjiangming
 * @date 2022/2/21 3:43 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("正在保存用户");
    }
}
