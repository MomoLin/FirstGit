package com.momo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Lin.taoxiang
 * @create 2021-01-27 19:38
 * @desc ${DESCRIPTION}
 **/
public class JDBCTest2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 加载驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        // 建立连接
        Connection connection = DriverManager.getConnection(
            "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=10.45.44.44)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=ora122)))",
            "cq_cust", "cq_cust");
        // 测试连接是否成功
        System.out.println(connection);
        // 定义sql语句
        String sql = "select prod_inst_id from prod_inst where prod_inst_id = ? and state = ?";
        // 准备静态处理块对象，将sql语句放置到静态处理块中,理解为sql语句放置对象
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, 20000736);
        statement.setInt(2, 1000);

        // 执行sql语句，返回值对象是结果集合
        ResultSet resultSet = statement.executeQuery();
        // 循环处理
        while (resultSet.next()) {
            int anInt = resultSet.getInt(1); // 从1开始
            System.out.println(anInt);
            String prodInstId = resultSet.getString("prod_inst_id");
            System.out.println(prodInstId);
        }
        // 关闭连接
        statement.close();
        connection.close();

    }
}