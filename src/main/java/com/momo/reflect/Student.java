package com.momo.reflect;

/**
 * @author Lin.taoxiang
 * @create 2021-02-05 20:18
 * @desc ${DESCRIPTION}
 **/
public class Student extends Person {
    public String className;

    private String address;

    public Student() {
        super();
    }

    private Student(String name, int age, String className) {
        super(name, age);
        this.className = className;
    }

    public Student(String name, int age, String className, String address) {
        super(name, age);
        this.className = className;
        this.address = address;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private int add(int a, int b) {
        return a + b;
    }

}