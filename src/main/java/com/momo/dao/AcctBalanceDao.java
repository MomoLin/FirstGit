package com.momo.dao;

import com.momo.dto.AcctBalance;

import java.util.List;
import java.util.Map;

public interface AcctBalanceDao {
    Map<String, String> getAcctBalanceByAcctId(Long acctId);

    List<AcctBalance> getAcctBalanceListByAcctId(Long acctId);

    Integer deleteByAcctId(Long acctId);
}
