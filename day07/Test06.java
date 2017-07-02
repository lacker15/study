package day07;

import java.io.*;
import java.util.Scanner;

/**
 * 记事本功能，首先要求用户输入一个文件名，并将该文件创建出来，
 * 然后通过控制台输入的每一行字符串都按行写入到该文件中，并
 * 使用GBK编码保存。当输入的字符串为"exit"时退出程序。
 * @author Xiloer
 *
 */
public class Test06 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入文件名");
        String name = scan.next();
        FileOutputStream we = new FileOutputStream(name);
        OutputStreamWriter edg = new OutputStreamWriter(we,"GBK");
        PrintWriter  omg = new PrintWriter(edg);
        System.out.println("内容输入");

        while(true){
            String oo = scan.next();
            if ("exit".equals(oo)){
               break;

            }
            omg.println(oo);
        }
        omg.close();








    }


}
