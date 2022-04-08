package com.momo.dao.mdb;

import com.momo.dao.AcctBalanceDao;
import com.momo.dto.AcctBalance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AcctBalanceMDB implements AcctBalanceDao {
    //注入JdbcTemplate
    @Autowired
    @Qualifier("acctMDBJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public Map<String, String> getAcctBalanceByAcctId(Long acctId) {
        String sql = "select * from acct_balance where acct_id = :acct_id";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql, acctId);
        Map<String, String> resultMap = new HashMap<String, String>();
        for (Map<String, Object> map : maps) {
            String acct_balance_id = String.valueOf(map.get("acct_balance_id"));
            resultMap.put("acct_balance_id", acct_balance_id);
        }
        return resultMap;
    }


    @Override
    public List<AcctBalance> getAcctBalanceListByAcctId(Long acctId) {
        String sql = "select * from acct_balance where acct_id = :acct_id";
        List<AcctBalance> acctBalanceList = jdbcTemplate.query(sql, new Object[]{acctId}, new BeanPropertyRowMapper(AcctBalance.class));
        for (AcctBalance acctBalance : acctBalanceList) {
            System.out.println(acctBalance.toString());
        }

        return acctBalanceList;
    }

    @Override
    public Integer deleteByAcctId(Long acctId) {
        String sql = "delete from acct_balance where acct_id = :acct_id";
        return jdbcTemplate.update(sql, acctId);
    }
}
