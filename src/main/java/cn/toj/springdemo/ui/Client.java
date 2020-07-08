package cn.toj.springdemo.ui;

import cn.toj.springdemo.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Carlos
 * @description 表现层
 * @Date 2020/7/8
 */

public class Client {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        as.saveAccount();

    }

}
