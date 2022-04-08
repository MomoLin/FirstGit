package com.momo.pool.dbcp;


import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Lin.taoxiang
 * @create 2021-02-08 14:32
 * @desc ${DESCRIPTION}
 **/
public class DBCPTest {
    public static void main(String[] args) throws SQLException {
        //数据库的连接池资源，在之后操作的时候只需要从池中获取即可
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://10.45.44.136:9089/cq_prod");
        basicDataSource.setUsername("bsstest");
        basicDataSource.setPassword("Bsstest123!@#");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = basicDataSource.getConnection();
            String sql = "select * from param_config where param_name = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "INVOICE_TIME_OUT");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("param_id"));
                System.out.println(resultSet.getString("param_name"));
                System.out.println(resultSet.getString("default_value"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } 
/*        finally {
            // 不会真正关闭链接，放回池子里面
            connection.close();
        }*/
    }
}