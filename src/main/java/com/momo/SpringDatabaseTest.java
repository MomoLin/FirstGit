package com.momo;

import com.momo.dao.mysql.JdbcTemplateTestImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDatabaseTest {

    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-database.xml");

        long acctId = 200001347807L;

//        AcctBalanceMysql bean = ioc.getBean(AcctBalanceMysql.class);
//        Map<String, String> acctBalanceByAcctId = bean.getAcctBalanceByAcctId(acctId);
//        System.out.println(acctBalanceByAcctId);
//
//
//        AcctBalanceMDB bean1 = ioc.getBean(AcctBalanceMDB.class);
//        Map<String, String> acctBalanceByAcctId1 = bean1.getAcctBalanceByAcctId(acctId);
//        System.out.println(acctBalanceByAcctId1);
//
//        List<AcctBalance> acctBalanceListByAcctId = bean1.getAcctBalanceListByAcctId(acctId);
//        for (AcctBalance acctBalance : acctBalanceListByAcctId) {
//            System.out.println(acctBalance.toString());
//        }
        JdbcTemplateTestImpl bean = ioc.getBean(JdbcTemplateTestImpl.class);
//        bean.custMysqlExecute();
//        bean.custMDBExecute();
//        bean.acctMysqlExecute();
        bean.acctMDBExecute();
    }
}
