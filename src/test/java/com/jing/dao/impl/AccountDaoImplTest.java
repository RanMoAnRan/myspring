package com.jing.dao.impl;

import com.jing.pojo.Account;
import com.jing.service.AccountService;
import com.jing.service.impl.AccountServiceImpl;
import com.jing.utils.ApplicationContextUtil;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class AccountDaoImplTest {

    private AccountService accountService;
    @Before
    public void setUp() throws Exception {
        //加载配置文件初始化容器
        ApplicationContext applicationContext = ApplicationContextUtil.getApplicationContext("applicationContext.xml");
        System.out.println("+++++++++"+applicationContext);

        //从容器中获取对象
        accountService = (AccountService) applicationContext.getBean("accountService");
    }

    @Test
    public void saveAccount() {
        Account account = new Account();
        account.setName("靖哥1");
        account.setMoney(100f);
        accountService.saveAccount(account);
    }

    @Test
    public void updateAccount() {
        Account account = new Account();
        account.setId(7);
        account.setName("靖哥22");
        account.setMoney(5000f);
        accountService.updateAccount(account);
    }

    @Test
    public void deleteAccount() {
        accountService.deleteAccount(5);
        System.out.println("删除成功");
    }

    @Test
    public void queryAccountById() {
        Account account = accountService.queryAccountById(4);
        System.out.println(account);
    }

    @Test
    public void queryAccountList() {
        List<Account> accounts = accountService.queryAccountList();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}