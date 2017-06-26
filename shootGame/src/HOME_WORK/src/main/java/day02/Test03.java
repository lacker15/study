package HOME_WORK.src.main.java.day02;

import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Xiloer
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输出ip地址");
        String i = scan.next();

        String e = "[0-9]+\\.+[0-9]+\\.+[0-9]+\\.[0-9]+";
        boolean match = i.matches(e);
        if(match) {
            String[]  x = i.split("\\.");
            for(int v = 0 ; v < x.length ; v++){
                System.out.println(x[v]);
            }

        }
        else{
            System.out.println("滚蛋");
        }

    }


}
