package day08;

import java.io.*;

/**
 * 对myfile.txt文件进行复制操作，要求使用异常捕获
 * 机制对流的异常进行捕获和处理，finally中
 * 要将流关闭
 * @author Xiloer
 *
 */
public class Test01 {
    public static void main(String[] args) {


        FileOutputStream we = null;
        BufferedInputStream edg = null;
        BufferedOutputStream dj = null;
        FileInputStream omg = null;
        try {
            we = new FileOutputStream("myfile-cp.txt");
            omg = new FileInputStream("myfile.txt");
            edg = new BufferedInputStream(omg);

            dj = new BufferedOutputStream(we);
            int t = -1 ;
            while((t= edg.read())!=-1) {
                dj.write(t);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("输出完成");
            try {
                edg.close();
                dj.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

}
