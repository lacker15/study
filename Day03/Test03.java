package main.java.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Xiloer
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入某人生日");
        String birther = scan.next();

        SimpleDateFormat time = new  SimpleDateFormat("yyyy-MM-dd");
        Date date = time.parse(birther);

          long star=  date.getTime();
          Date now = new Date();
          long end = now.getTime();
          long qq = (end - star)/1000/60/60/24/7;
          System.out.print(qq);

    }

}
