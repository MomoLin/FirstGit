package com.momo.dao.mdb;

import com.momo.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountMDB implements AccountDao {
    //注入JdbcTemplate
    @Autowired
    @Qualifier("custMDBJdbcTemplate")
    private JdbcTemplate jdbcTemplate;
}
