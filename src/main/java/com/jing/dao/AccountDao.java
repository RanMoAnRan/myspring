package com.jing.dao;

import com.jing.pojo.Account;

import java.util.List;

/**
 * @ClassName:IAccountService
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/16 15:11
 * @Version 1.0
 */
public interface AccountDao {
    /**
     * @Description //TODO 保存
     * @Date 15:14 2019/5/16
     * @param account
     * @return void
     **/
    void saveAccount(Account account);
    /**
     * @Description //TODO 修改
     * @Date 15:15 2019/5/16
     * @param account
     * @return void
     **/
    void updateAccount(Account account);
    /**
     * @Description //TODO 删除
     * @Date 15:17 2019/5/16
     * @param accoundId
     * @return void
     **/
    void deleteAccount(Integer accoundId);
    /**
     * @Description //TODO 根据id查询账户
     * @Date 15:18 2019/5/16
     * @param accoundId
     * @return com.jing.pojo.Account
     **/
    Account queryAccountById(Integer accoundId);
    /**
     * @Description //TODO 查询所有用户
     * @Date 15:19 2019/5/16
     * @param 
     * @return java.util.List<com.jing.pojo.Account>
     **/
    List<Account> queryAccountList();

}
