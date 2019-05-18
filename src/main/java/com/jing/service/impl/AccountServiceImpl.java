package com.jing.service.impl;

import com.jing.dao.AccountDao;
import com.jing.dao.impl.AccountDaoImpl;
import com.jing.pojo.Account;
import com.jing.service.AccountService;
import com.jing.utils.ApplicationContextUtil;
import org.springframework.context.ApplicationContext;

import java.util.List;

/**
 * @ClassName:AccountServiceImpl
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/16 15:23
 * @Version 1.0
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

   /* public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }*/

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
