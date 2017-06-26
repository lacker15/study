package main.java.day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Xiloer
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {

        Scanner scan = new  Scanner(System.in);
        List<Date> ff  = new ArrayList<Date>();
        for(int i= 1 ; i < 4 ;i++ ) {
            System.out.println("输入日期");
            String f = scan.next();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date wo = format.parse(f);
            ff.add(wo);



        }
        Collections.sort(ff);
        System.out.println(ff);




    }

}
