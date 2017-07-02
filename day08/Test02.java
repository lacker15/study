package day08;

import java.io.*;
import java.util.Scanner;

/**
 * 使用异常捕获完成下述操作
 * 将控制台输入的每一行字符串使用缓冲字符输出流PrintWriter
 * 按行以GBK编码写入到文件note.txt中
 * @author Xiloer
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter we =null;
        try {
            FileOutputStream ans = new FileOutputStream("note.txt");
            OutputStreamWriter rng = null;
                rng = new OutputStreamWriter(ans,"GBK");
                we = new PrintWriter(rng,true);
           while(true){
               if(we.equals("buy")){
                   break;
               }
               String omg = scan.next();
               we.println(omg);
           }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            we.close();
            System.out.println();
        }


    }

}
