package com.cy.service;

import com.cy.domain.Account;

import java.util.List;

/**
 * 账户的业务层接口
 * @author cy
 * @create 2020-07-25-13:17
 */
public interface IAccountService {

    /**
     * 查询所有账户方法
     * @return
     */
    List<Account> findAll();

    /**
     * 保存账户方法
     * @param account
     */
    void saveAccount(Account account);
}
