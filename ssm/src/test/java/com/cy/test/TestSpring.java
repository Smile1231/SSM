package com.cy.test;

import com.cy.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Spring的测试类
 * @author cy
 * @create 2020-07-25-14:51
 */
public class TestSpring {

    @Test
    public void testSpring(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        //加载方法
        as.findAll();

        /*for (Account account : accounts) {
            System.out.println(account);
        }*/
    }
}
