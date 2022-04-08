package com.momo.dao.mysql;

import com.momo.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerMysql implements CustomerDao {
    //注入JdbcTemplate
    @Autowired
    @Qualifier("custJdbcTemplate")
    private JdbcTemplate jdbcTemplate;
}
