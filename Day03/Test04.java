package main.java.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入日期");
        String birther = scan.next();
        System.out.print("保质期天数");
        int day = scan.nextInt();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(birther) ;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DATE,day);
      System.out.println(calendar.getTime());
      calendar.add(Calendar.DATE,-14);
      calendar.set(Calendar.DAY_OF_WEEK,4);
      System.out.println(calendar.getTime());



    }

}
