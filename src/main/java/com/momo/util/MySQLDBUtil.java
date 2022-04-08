package com.momo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Lin.taoxiang
 * @create 2021-02-06 11:19
 * @desc ${DESCRIPTION}
 **/
public class MySQLDBUtil {
    public static final String URL = "jdbc:mysql://10.45.44.136:9089/cq_prod";

    public static final String USERNAME = "bsstest";

    public static final String PASSWORD = "Bsstest123!@#";

    static {
        try {
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接
     * 
     * @return 返回连接对象
     * @throws SQLException
     */
    public static Connection getConnection() {
        // 建立连接
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 关闭数据库连接
     * 
     * @param con
     */
    public static void closeConnection(Connection con, Statement statement, ResultSet resultSet) {
        if (con != null) {
            try {
                con.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (resultSet != null) {
            try {
                resultSet.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}