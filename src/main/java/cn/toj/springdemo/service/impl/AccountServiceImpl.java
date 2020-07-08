package cn.toj.springdemo.service.impl;

import cn.toj.springdemo.dao.IAccountDao;
import cn.toj.springdemo.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Carlos
 * @description 服务层
 * @Date 2020/7/8
 */

public class AccountServiceImpl implements IAccountService {


    @Override
    public void saveAccount() {

        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountDao ad = ac.getBean("accountDao", IAccountDao.class);
        ad.saveAccount();

    }
}
