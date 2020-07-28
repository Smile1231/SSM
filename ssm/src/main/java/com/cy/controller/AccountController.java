package com.cy.controller;

import com.cy.domain.Account;
import com.cy.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 账户的表现层
 * @author cy
 * @create 2020-07-26-11:11
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public  String TestFindAll(Model model){
        List<Account> accounts = accountService.findAll();
        model.addAttribute("list", accounts);
        return "list";
    }

    @RequestMapping("/saveAccount")
    public  String TestSaveAccount(Account account){
        accountService.saveAccount(account);
        return "forward:/account/findAll";
    }
}
