package main.java.day04;

import java.util.Date;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    张三,25,男,5000,2006-02-15
 * 
 * 定义equals方法，要求名字以及年龄相同，则认为内容一致。
 * @author Xiloer
 *
 */
public class Emp {
private String name ;
private int age;
private String gender;
private int salary;
private Date hiredate;

Emp(String name , int age , String gender ,int salary ,Date hiredate ){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.salary = salary;
    this.hiredate = hiredate;

}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {  //张三,25,男,5000,2006-02-15
        return  "姓名"+ name+"年龄"+age+ "性别"+gender+"工资"+salary+"入职时间"+ hiredate;
    }
    public boolean equals(Object obj){
    if ( obj == null){
        return  false;
    }
    if (this == obj){
        return  true;
    }
    if (obj instanceof Emp){
        Emp c = (Emp)obj;
        return this.name == c.name && this.age == c.age;
    }
    return false;
    }
}