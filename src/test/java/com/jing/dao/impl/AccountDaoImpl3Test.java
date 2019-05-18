package com.jing.dao.impl;

import com.jing.configuration.SpringConfiguration;
import com.jing.pojo.Account;
import com.jing.utils.ApplicationContextUtil;
import com.jing.web.AccountController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Description //TODO 使用纯注解代替xml的装配 测试
 * @Date 16:08 2019/5/18
 *
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfiguration.class})//加载配置类或者xml配置文件
//用注解代替@Before中的内容
public class AccountDaoImpl3Test {

    @Autowired
    private AccountController accountController;
    /*@Before
    public void setUp() throws Exception {
        //加载配置类初始化容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        //从容器中获取对象
        accountController = (AccountController) applicationContext.getBean("accountController");
    }*/

    @Test
    public void saveAccount() {
        Account account = new Account();
        account.setName("丫头");
        account.setMoney(100f);
        accountController.saveAccount(account);
    }

    @Test
    public void updateAccount() {
        Account account = new Account();
        account.setId(6);
        account.setName("丫头");
        account.setMoney(5000f);
        accountController.updateAccount(account);
    }

    @Test
    public void deleteAccount() {
        accountController.deleteAccount(5);
        System.out.println("删除成功");
    }

    @Test
    public void queryAccountById() {
        Account account = accountController.queryAccountById(4);
        System.out.println(account);
    }

    @Test
    public void queryAccountList() {
        List<Account> accounts = accountController.queryAccountList();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}