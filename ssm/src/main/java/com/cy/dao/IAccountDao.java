package com.cy.dao;

import com.cy.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户的持久层接口
 * @author cy
 * @create 2020-07-25-13:14
 */
@Repository
public interface IAccountDao {

    /**
     * 查询所有账户方法
     * @return
     */
    @Select("select * from account ")
    List<Account> findAll();

    /**
     * 保存账户方法
     * @param account
     */
    @Insert("insert into account (name,money) values(#{name},#{money})")
    void saveAccount(Account account);
}
