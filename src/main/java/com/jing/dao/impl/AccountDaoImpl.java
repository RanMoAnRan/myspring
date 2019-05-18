package com.jing.dao.impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.jing.dao.AccountDao;
import com.jing.pojo.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @ClassName:AccountDaoImpl
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/16 15:24
 * @Version 1.0
 */
public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public void saveAccount(Account account) {
        String sql = "insert into account values(null,?,?)";
        jdbcTemplate.update(sql, account.getName(), account.getMoney());
    }

    @Override
    public void updateAccount(Account account) {
        String sql = "update account set name=? , money = ? where id = ?";
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
