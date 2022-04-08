package com.momo;

import com.iwhalecloud.vendor.MDBExceptionSorter;
import com.momo.dto.AcctBalance;
import com.momo.util.MDBDBUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class MDBTest {
    public static void main(String[] args) {
//        testMyHandler();
        testQuery1();
    }


    private static void testQuery1() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:iwhalecloud:mdb://10.45.85.6|8899/bjbal?openpool=false&querycache=false&querytimeout=600&heartbeat=false", "bjbal", "ZMDB_R9.0.26");
            System.out.println("conn:" + conn);
            String querySQLTest1 = "select * from acct_balance where acct_id = :acct_id ";
            conn.isClosed();

            stmt = conn.prepareStatement(querySQLTest1);
            Map params = new HashMap<String, Object>();
            params.put("acct_id", 200001347807L);


            rs = stmt.executeQuery();
            byte i = 0;
            while (rs.next()) {
                System.out.println("第" + i + "条数据:");
                System.out.println(rs.getObject(1));
                System.out.println(rs.getObject(2));
                System.out.println(rs.getObject(3));
            }

        } catch (SQLException var19) {
            MDBExceptionSorter p = new MDBExceptionSorter();
            p.isExceptionFatal(var19);
            var19.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }

                if (stmt != null) {
                    stmt.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException var18) {
                var18.printStackTrace();
            }

        }

    }

    private static void testQuery2() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:iwhalecloud:mdb://10.45.85.6|8899/bjbal?openpool=false&querycache=false&querytimeout=600&heartbeat=false", "bjbal", "ZMDB_R9.0.26");
            System.out.println("conn:" + conn);
            String querySQLTest0 = "select * from acct_balance where acct_id = ? ";

            conn.isClosed();

            stmt = conn.prepareStatement(querySQLTest0);
            stmt.setLong( 1,200001347807L);

            rs = stmt.executeQuery();
            byte i = 0;
            while (rs.next()) {
                System.out.println("第" + i + "条数据:");
                System.out.println(rs.getObject(1));
                System.out.println(rs.getObject(2));
                System.out.println(rs.getObject(3));
            }

        } catch (SQLException var19) {
            MDBExceptionSorter p = new MDBExceptionSorter();
            p.isExceptionFatal(var19);
            var19.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }

                if (stmt != null) {
                    stmt.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException var18) {
                var18.printStackTrace();
            }

        }

    }

    /**
     * 自定义handler
     */
    public static void testMyHandler() {
        System.out.println("---------------testMyHandler");
        String sql = "select acct_balance_id from acct_balance where acct_id = 200001347807 ";
        Connection connection = MDBDBUtil.getConnection();


        try {
            Class.forName("com.iwhalecloud.mdb.jdbc.Driver");
//            Map params = new HashMap<String, Object>();
//            params.put("acct_id", 200001347807L);
            QueryRunner queryRunner = new QueryRunner();
            AcctBalance P = queryRunner.query(connection, sql, new ResultSetHandler<AcctBalance>() {
                public AcctBalance handle(ResultSet resultSet) throws SQLException {
                    if (resultSet.next()) {
                        AcctBalance P = new AcctBalance();
                        P.setAcctBalanceId(resultSet.getLong("acct_balance_id"));
                        return P;
                    }
                    return null;
                }
            });

            System.out.println(P);


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
