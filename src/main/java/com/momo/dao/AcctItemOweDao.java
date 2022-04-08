package com.momo.dao;

import com.momo.dto.AcctItemOwe;

import java.util.List;

public interface AcctItemOweDao {
    List<AcctItemOwe> getAcctBalanceListByAcctId(Long acctId);

    Integer insert(String sql);

    Integer deleteByAcctId(Long acctId);
}
