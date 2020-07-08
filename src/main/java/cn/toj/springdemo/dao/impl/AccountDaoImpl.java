package cn.toj.springdemo.dao.impl;

import cn.toj.springdemo.dao.IAccountDao;

/**
 * @author Carlos
 * @description 持久层
 * @Date 2020/7/8
 */

public class AccountDaoImpl implements IAccountDao {

    @Override
    public void saveAccount() {

        System.out.println("保存用户信息成功!");

    }
}
