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
public class MDBDBUtil {
    //ZmdbSQL bjdata/ZMDB_R9.0.26@bjdata -s
    //ZmdbSQL bjbal/ZMDB_R9.0.26@bjbal -s
    //ZmdbSQL bjcust/ZMDB_R9.0.26@bjcust -s
    //ZmdbSQL bjscf/ZMDB_R9.0.26@bjscf -s
    //ZmdbSQL bjinit/ZMDB_R9.0.26@bjinit -s
    //ZmdbSQL bjaccum/ZMDB_R9.0.26@bjaccum -s

    // "jdbc:iwhalecloud:mdb://10.45.85.6|8899/bjbal?openpool=false&querycache=false&querytimeout=600&heartbeat=false"
    public static final String URL = "jdbc:iwhalecloud:mdb://10.45.85.6|8899/";

    public static final String SCHEMA = "bjbal";

    public static final String URLPARAM = "?openpool=false&querycache=false&querytimeout=600&heartbeat=false";

    public static final String USERNAME = "bjbal";

    public static final String PASSWORD = "ZMDB_R9.0.26";


    static {
        try {
            // 加载驱动
            Class.forName("com.iwhalecloud.mdb.jdbc.Driver");
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
            return DriverManager.getConnection(URL + SCHEMA + URLPARAM, USERNAME, PASSWORD);
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