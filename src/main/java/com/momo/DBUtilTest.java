package com.momo;

import com.momo.dto.ParamConfigDto;
import com.momo.util.MySQLDBUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Lin.taoxiang
 * @create 2021-02-06 11:45
 * @desc ${DESCRIPTION}
 **/
public class DBUtilTest {
    public static Connection connection;

    public static void testQuery() {
        System.out.println("---------------testQuery");
        String sql = "select * from param_config where param_name = ?";

        try {
            connection = MySQLDBUtil.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            ParamConfigDto paramConfigDto = queryRunner.query(connection, sql,
                new BeanHandler<ParamConfigDto>(ParamConfigDto.class), "INVOICE_TIME_OUT");
            connection.close();
            System.out.println(paramConfigDto);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void testQueryList() {
        System.out.println("---------------testQueryList");

        String sql = "select * from param_config where param_name like ?";

        try {
            connection = MySQLDBUtil.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            List<ParamConfigDto> paramConfigDtoList = queryRunner.query(connection, sql,
                new BeanListHandler<ParamConfigDto>(ParamConfigDto.class), "INVOICE%");
            connection.close();
            for (ParamConfigDto paramConfigDto : paramConfigDtoList) {
                System.out.println(paramConfigDto);
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void testQueryArray() {
        System.out.println("---------------testQueryArray");

        String sql = "select * from param_config where param_name like ?";

        try {
            connection = MySQLDBUtil.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            Object[] query = queryRunner.query(connection, sql, new ArrayHandler(), "INVOICE%");
            connection.close();
            for (Object o : query) {
                System.out.println(o);
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void testQueryArrayList() {
        System.out.println("---------------testQueryArrayList");

        String sql = "select * from param_config where param_name like ?";

        try {
            connection = MySQLDBUtil.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            List<Object[]> query = queryRunner.query(connection, sql, new ArrayListHandler(), "INVOICE%");
            connection.close();
            for (Object[] objects : query) {
                System.out.println(objects[0] + "-" + objects[1]);
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void testQueryMap() {
        System.out.println("---------------testQueryMap");

        String sql = "select * from param_config where param_name like ?";

        try {
            connection = MySQLDBUtil.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            Map<String, Object> query = queryRunner.query(connection, sql, new MapHandler(), "INVOICE%");
            connection.close();
            Set<Map.Entry<String, Object>> entries = query.entrySet();
            for (Map.Entry<String, Object> entry : entries) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 单值查询
     */
    public static void testQueryScalar() {
        System.out.println("---------------testQueryScala");

        String sql = "select count(*) from param_config where param_name like ?";

        try {
            connection = MySQLDBUtil.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            Object query = queryRunner.query(connection, sql, new ScalarHandler<ParamConfigDto>(), "INVOICE%");
            connection.close();
            System.out.println(query);

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // testQuery();
        // testQueryList();
        // testQueryArray();
        // testQueryArrayList();
        // testQueryMap();
//        testQueryScalar();
        testMyHandler();
    }

    /**
     * 自定义handler
     */
    public static void testMyHandler() {
        System.out.println("---------------testMyHandler");

        String sql = "select * from param_config where param_name = ?";

        try {
            connection = MySQLDBUtil.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            ParamConfigDto P = queryRunner.query(connection, sql, new ResultSetHandler<ParamConfigDto>() {
                @Override
                public ParamConfigDto handle(ResultSet resultSet) throws SQLException {
                    if (resultSet.next()) {
                        ParamConfigDto P = new ParamConfigDto();
                        P.setParamId(resultSet.getInt("param_id"));
                        P.setParamName(resultSet.getString("param_name"));
                        return P;
                    }
                    return null;
                }
            }, "INVOICE_TIME_OUT");
            connection.close();
            System.out.println(P);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}