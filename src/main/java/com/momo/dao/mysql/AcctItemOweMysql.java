package com.momo.dao.mysql;

import com.momo.dao.AcctItemOweDao;
import com.momo.dto.AcctItemOwe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AcctItemOweMysql implements AcctItemOweDao {
    //注入JdbcTemplate
    @Autowired
    @Qualifier("acctJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<AcctItemOwe> getAcctBalanceListByAcctId(Long acctId) {
        String sql = "select * from acct_item_owe where acct_id = ?";
        List<AcctItemOwe> acctItemOweList = jdbcTemplate.query(sql, new Object[]{acctId}, new BeanPropertyRowMapper(AcctItemOwe.class));
        for (AcctItemOwe acctItemOwe : acctItemOweList) {
            System.out.println(acctItemOwe.toString());
        }

        return acctItemOweList;
    }

    @Override
    public Integer insert(String sql) {
        return jdbcTemplate.update(sql);
    }

    @Override
    public Integer deleteByAcctId(Long acctId) {
        String sql = "delete from acct_item_owe where acct_id = ?";
        return jdbcTemplate.update(sql, acctId);
    }
}
