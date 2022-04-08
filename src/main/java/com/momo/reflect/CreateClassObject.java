package com.momo.reflect;

import com.momo.JDBCTest;

/**
 * @author Lin.taoxiang
 * @create 2021-02-05 20:01
 * @desc ${DESCRIPTION}
 **/
public class CreateClassObject {
    public static void main(String[] args) throws ClassNotFoundException {
        //通过class.forname（）来获取Class对象
        Class<?> aClass = Class.forName("com.momo.JDBCTest");
        System.out.println(aClass.getPackage());
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getCanonicalName());

        //通过类.class 获取Class对象
        Class<JDBCTest> jdbcTestClass = JDBCTest.class;
        System.out.println(jdbcTestClass.getPackage());
        System.out.println(jdbcTestClass.getName());
        System.out.println(jdbcTestClass.getSimpleName());
        System.out.println(jdbcTestClass.getCanonicalName());

        //通过对象获取Class对象 （不推荐）
        Class<? extends JDBCTest> aClass1 = new JDBCTest().getClass();
        System.out.println(aClass1.getPackage());
        System.out.println(aClass1.getName());
        System.out.println(aClass1.getSimpleName());
        System.out.println(aClass1.getCanonicalName());


        //基本数据类型，可以通过.TYPE获取Class对象
        Class<Integer> type = Integer.TYPE;
        System.out.println(type.getPackage());
        System.out.println(type.getName());
        System.out.println(type.getSimpleName());
        System.out.println(type.getCanonicalName());

    }
}