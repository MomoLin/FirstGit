package com.momo.dao.mysql;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.FileReader;

@Repository
public class JdbcTemplateTestImpl {

    private static Logger logger = LoggerFactory.getLogger(JdbcTemplateTestImpl.class);

    @Autowired
    @Qualifier("acctJdbcTemplate")
    private JdbcTemplate acctJdbcTemplate;

    @Autowired
    @Qualifier("acctMDBJdbcTemplate")
    private JdbcTemplate acctMDBJdbcTemplate;

    @Autowired
    @Qualifier("custJdbcTemplate")
    private JdbcTemplate custJdbcTemplate;

    @Autowired
    @Qualifier("custMDBJdbcTemplate")
    private JdbcTemplate custMDBJdbcTemplate;

    public void custMysqlExecute() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("F:\\学习\\jdbctest\\src\\main\\resources\\custMysql.sql"));
            String str;
            while ((str = in.readLine()) != null && StringUtils.isNotEmpty(str)) {
                custJdbcTemplate.execute(str);
            }
            System.out.println(str);
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    public void custMDBExecute() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("F:\\学习\\jdbctest\\src\\main\\resources\\custMDB.sql"));
            String str;
            while ((str = in.readLine()) != null && StringUtils.isNotEmpty(str)) {
                custMDBJdbcTemplate.execute(str);
            }
            System.out.println(str);
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    public void acctMDBExecute() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("F:\\学习\\jdbctest\\src\\main\\resources\\acctMDB.sql"));
            String str;
            while ((str = in.readLine()) != null && StringUtils.isNotEmpty(str)) {
                acctMDBJdbcTemplate.execute(str);
            }
            System.out.println(str);
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    public void acctMysqlExecute() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("F:\\学习\\jdbctest\\src\\main\\resources\\acctMysql.sql"));
            String str;
            while ((str = in.readLine()) != null) {
                acctJdbcTemplate.execute(str);
            }
            System.out.println(str);
        } catch (Exception e) {
            logger.error("", e);
        }
    }
//    private static Long acctId = 0L;
//    private static Long prodInstId = 0L;
//    private static Long custId = 0L;
//    private static Long accNbr = 0L;
//    private static Integer regionId = 0;
//    private static Integer billingCycleId = 0;
//
//    public void delete() {
//        // 删除三户资料
//        String str1 = "delete from prod_inst where prod_inst_id = " + prodInstId;
//        String str2 = "delete from account where acct_id = " + acctId;
//        String str3 = "delete from prod_inst_acct_rel where acct_id = " + acctId;
//        String str4 = "delete from customer where cust_id = " + custId;
//        // MYSQL
//        custJdbcTemplate.update(str1);
//        custJdbcTemplate.update(str2);
//        custJdbcTemplate.update(str3);
//        custJdbcTemplate.update(str4);
//        // MDB
//        custMDBJdbcTemplate.update(str1);
//        custMDBJdbcTemplate.update(str2);
//        custMDBJdbcTemplate.update(str3);
//        custMDBJdbcTemplate.update(str4);
//
//        //删除账本和账单
//        String str5 = "delete from acct_balance where acct_id = " + acctId;
//        String str6 = "delete from acct_item_owe where acct_id = " + acctId;
//        // MYSQL
//        acctJdbcTemplate.update(str5);
//        acctJdbcTemplate.update(str6);
//        // MDB
//        acctMDBJdbcTemplate.update(str5);
//        acctMDBJdbcTemplate.update(str6);
//
//    }
//
//    public void insert() {
//
//    }


}
