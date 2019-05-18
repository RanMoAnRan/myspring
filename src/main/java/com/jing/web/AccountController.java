package com.jing.web;

import com.jing.pojo.Account;
import com.jing.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @ClassName:AccountController
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/18 15:02
 * @Version 1.0
 */
@Controller("accountController")
public class AccountController {
    @Autowired
    private AccountService accountService;

    public void saveAccount(Account account) {
        accountService.saveAccount(account);
    }


    public void updateAccount(Account account) {
        accountService.updateAccount(account);
    }


    public void deleteAccount(Integer accoundId) {
        accountService.deleteAccount(accoundId);
    }


    public Account queryAccountById(Integer accoundId) {
        return accountService.queryAccountById(accoundId);
    }


    public List<Account> queryAccountList() {
        return accountService.queryAccountList();
    }

}
