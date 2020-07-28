package com.cy.test;

import com.cy.dao.IAccountDao;
import com.cy.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * MyBatis的测试类
 * @author cy
 * @create 2020-07-26-13:19
 */
public class TestMyBatis {

    @Test
    public void TestMybatis() throws IOException {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取到代理对象
        IAccountDao dao = session.getMapper(IAccountDao.class);
        //查询到所有数据
        List<Account> accounts = dao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        //关闭资源
        session.close();
        in.close();
    }

    @Test
    public  void TestSaveAccount() throws IOException {
        Account account = new Account();
        account.setName("赵六");
        account.setMoney((double) 500);

        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        IAccountDao dao = session.getMapper(IAccountDao.class);

        dao.saveAccount(account);
        session.commit();

        session.close();
        in.close();

    }
}
