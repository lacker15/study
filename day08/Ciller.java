package TCP;
//客户端

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/5.
 */
public class Ciller {
    private Socket sockte;

   public Ciller(){
       System.out.println("客户端正在连接");
       try {
           sockte = new Socket("localhost",9060);
       } catch (IOException e) {
           e.printStackTrace();
       }
       System.out.println("客户端已连接");


    }
    public  void start(){
        try {
            SilerHander siler = new  SilerHander();
            Thread t = new Thread(siler);
            t.start();
            OutputStream tt = sockte.getOutputStream();
            OutputStreamWriter ss = new OutputStreamWriter(tt,"GBK");
            PrintWriter ff = new PrintWriter(ss,true);
            Scanner scan = new Scanner(System.in);
            while(true) {
                String aa = scan.nextLine();
                ff.println(aa);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        Ciller ciller = new Ciller();
        ciller.start();
    }
    class SilerHander implements Runnable{
        public void run(){
            try {
                BufferedReader ll = new BufferedReader(
                        new InputStreamReader(
                                sockte.getInputStream()
                        )
                );
                String yy = null;
                while ((yy = ll.readLine())!=null){
                    System.out.println(yy);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
