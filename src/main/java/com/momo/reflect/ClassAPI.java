package com.momo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Lin.taoxiang
 * @create 2021-02-05 20:12
 * @desc ${DESCRIPTION}
 **/
public class ClassAPI {
    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("com.momo.reflect.Student");
        // 获取成员变量,包括子类及父类，同时只能包含公共访问修饰符
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getModifiers());
            System.out.println("----------");
        }

        // 此方法返回的是当前类的所有属性，不仅仅局限于公共访问修饰符，所有的访问修饰符都可以拿到
        System.out.println("===========");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

        System.out.println("===========");
        // 反射在一定程度上破坏了封装性，需要合理使用
        Field address = aClass.getDeclaredField("address");
        System.out.println(address);
        Object o = aClass.newInstance();
        // address为private会报错 can not access a member of class com.momo.reflect.Student with modifiers "private"
        //设置该属性是否能被访问，true表示能被访问，破坏了封装性
        address.setAccessible(true);
        address.set(o, "北京市");
        System.out.println(((Student) o).getAddress());

        System.out.println("===========");
        //获取该对象的普通方法,包含范围是当前对象及父类对象的所有公共方法
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
            System.out.println(method.getModifiers());
        }

        System.out.println("===========");
        //获取当前类中的所有方法，无论什么访问修饰符
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("-------------");
        Method add = aClass.getDeclaredMethod("add", int.class, int.class);
        add.setAccessible(true);
        Object invoke = add.invoke(o, 123, 123);
        System.out.println(invoke);


        System.out.println("-------------");
        //获取对象的所有构造方法（只能获取工有的构造方法），当前类的，不包括父类
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
        }
        System.out.println("-------------");
        //获取对象的所有构造方法（无论公有还是私有）
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
        }
        System.out.println("-------------");
        //如何调用私有的构造方法
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class, int.class, String.class);
        declaredConstructor.setAccessible(true);
        Object o1 = declaredConstructor.newInstance("test", 1, "eeee");
        System.out.println((Student) o1);
    }

}