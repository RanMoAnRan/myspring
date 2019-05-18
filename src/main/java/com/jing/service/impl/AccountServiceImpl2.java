package com.jing.service.impl;

import com.jing.dao.AccountDao;
import com.jing.pojo.Account;
import com.jing.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName:AccountServiceImpl
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/16 15:23
 * @Version 1.0
 */

@Service("accountService")
public class AccountServiceImpl2 implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer accoundId) {
        accountDao.deleteAccount(accoundId);
    }

    @Override
    public Account queryAccountById(Integer accoundId) {
        return accountDao.queryAccountById(accoundId);
    }

    @Override
    public List<Account> queryAccountList() {
        return accountDao.queryAccountList();
    }
}
