package com.momo.dao.mysql;

import com.momo.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoMysql implements AccountDao {
    //注入JdbcTemplate
    @Autowired
    @Qualifier("custJdbcTemplate")
    private JdbcTemplate jdbcTemplate;
}
