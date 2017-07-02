package day07;

import day03.*;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户控制台输入想输入的员工人数（至少5个），然后依序输入员工信息，每行为
 * 一条员工信息，格式如:张三,25,男,5000,2006-3-18
 * 然后将该对象写入到文件<name>.obj并保存到当前项目根目录中，例如:张三.obj。
 * @author Xiloer
 *
 */
public class Test03 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner scan = new Scanner(System.in);
        int i=0;
        while(true){
            System.out.print("number");
            i = scan.nextInt();
            if (i >= 5 ){
                for(int k = 1 ; k <= i ; k++ ){
                    System.out.print("请输入"+k+"员工");
                    Emp cc = getemp() ;
                    writeEmp(cc);
                }

            }
         System.out.print("完美");
        }









    }

    public static Emp getemp() throws IOException, ParseException {
        Scanner scan = new Scanner(System.in);
        String oop = scan.next();
      //  格式如:张三,25,男,5000,2006-3-18
        String[] ccm = oop.split(",");
        String name = ccm[0];
        int age =Integer.parseInt(ccm[1]) ;
        String gender = ccm[2];
        int salary =Integer.parseInt( ccm[3]);
        SimpleDateFormat farm = new SimpleDateFormat("yyyy-MM-dd");
        Date hiredate = farm.parse(ccm[4]);
        Emp emp = new Emp(name , age , gender , salary , hiredate);
        return emp;

    }

    public static void writeEmp(Emp emp) throws IOException {
        FileOutputStream bbc = new FileOutputStream(emp.getName()+".obj");
        ObjectOutputStream bcc = new ObjectOutputStream(bbc);
        bcc.writeObject(emp);

        bbc.close();
        System.out.print("ok");
    }

}
