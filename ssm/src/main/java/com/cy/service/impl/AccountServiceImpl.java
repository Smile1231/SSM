package com.cy.service.impl;

import com.cy.dao.IAccountDao;
import com.cy.domain.Account;
import com.cy.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户业务层的实现类
 * @author cy
 * @create 2020-07-25-14:48
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        //System.out.println("查询所有执行了.....");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
       // System.out.println("保存账户执行了.....");
        accountDao.saveAccount(account);
    }
}
