package com.momo.dao.mdb;

import com.momo.dao.ProdInstAcctRelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProdInstAcctRelMDB implements ProdInstAcctRelDao {
    //注入JdbcTemplate
    @Autowired
    @Qualifier("custMDBJdbcTemplate")
    private JdbcTemplate jdbcTemplate;
}
