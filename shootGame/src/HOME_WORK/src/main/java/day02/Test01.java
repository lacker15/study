package HOME_WORK.src.main.java.day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Xiloer
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("请随意输出");
        String  annter = scan.next();
        String match = "[0-9]+";
        String matche = "[0-9 ]+\\.+[0-9]";
        boolean match1 = annter.matches(match);
        if(match1){
            int i = Integer.parseInt(annter);
            System.out.println(i*10);

        }
        boolean matcha = annter.matches(matche);
        if (matcha){
            double b = Double.parseDouble(annter);
            System.out.println(b*5);
        }else {
            System.out.println("不是数字");
        }




    }

}
