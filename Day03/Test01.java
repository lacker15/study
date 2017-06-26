package main.java.day03;

import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Xiloer
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long s = date.getTime();
        long b =s+24*60*60*1000*3;
        System.out.println(b);
        date.setTime(b);
     System.out.println(date);
    }



}
