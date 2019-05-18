package com.jing.dao.impl;

import com.jing.dao.AccountDao;
import com.jing.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName:AccountDaoImpl
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/16 15:24
 * @Version 1.0
 */

@Repository("accountDao")
public class AccountDaoImpl2 implements AccountDao {
    /*自动按照类型注入。当使用注解注入属性时，set方法可以省略。它只能注入其他bean类型。当有多个类型匹配时，
    使用要注入的对象的变量名称作为bean的id，在spring容器查找，找到了也可以注入成功。找不到就报错。*/
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void saveAccount(Account account) {
        String sql = "insert into account values(null,?,?)";
        jdbcTemplate.update(sql, account.getName(), account.getMoney());
    }

    @Override
    public void updateAccount(Account account) {
        String sql = "update account set name=?, money = ? where id = ?";
        jdbcTemplate.update(sql,account.getName(), account.getMoney(), account.getId());
    }

    @Override
    public void deleteAccount(Integer accoundId) {
        String sql="delete from account where id = ?";
        jdbcTemplate.update(sql,accoundId);
    }

    @Override
    public Account queryAccountById(Integer accoundId) {
        String sql="select * from account where id=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Account>(Account.class), accoundId);
    }

    @Override
    public List<Account> queryAccountList() {
        String sql="select * from account";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Account>(Account.class));
    }
}
