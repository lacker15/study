package main.java.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Xiloe
 *
 */
public class Test05 {

    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);

        String eg = "[0-9]{18}";
        String num;
        do{
            System.out.println("请输入身份证号");
            num = scan.next();
        }while(!num.matches(eg));
       //330184199512074514
       String str = num.substring(6,14);
         String sub = num.substring(6,10);
         String sub1 = num.substring(10,12);
         String sub3 = num.substring(12,14);
         String subb= sub+"-"+sub1+"-"+sub3;
        System.out.println(subb);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date  date = format.parse(subb);
       // System.out.print(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR,20);
         Date date2 =  calendar.getTime();
        String date3 = format.format(date2);
        System.out.println(date3);
        calendar.add(Calendar.DAY_OF_WEEK,3);
           Date day5 =  calendar.getTime();
           String day7 = format.format(day5);

        System.out.print(day7);


    }




            }
