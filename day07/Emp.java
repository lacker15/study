package day07;

import java.io.Serializable;
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
 *    姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2006-02-15
 * 
 * 定义equals方法，要求名字，年龄，性别，薪资都相同，则认为内容一致。
 * 实现序列化接口，并定义版本号。
 * @author Xiloere
 *
 */
public class Emp implements Serializable {
    private static final long SerializableUID = 1L;
    private String name;
    private int age ;
    private String gender;
    private  int salary;
    private Date hiredate;

    Emp(){

    }
    Emp(String name ,int age , String gender , int salary ,Date hiredate){
        this.name = name ;
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
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", hiredate=" + hiredate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emp emp = (Emp) o;

        if (age != emp.age) return false;
        if (salary != emp.salary) return false;
        if (name != null ? !name.equals(emp.name) : emp.name != null) return false;
        if (gender != null ? !gender.equals(emp.gender) : emp.gender != null) return false;
        return hiredate != null ? hiredate.equals(emp.hiredate) : emp.hiredate == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + salary;
        result = 31 * result + (hiredate != null ? hiredate.hashCode() : 0);
        return result;
    }
}
