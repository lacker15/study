package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流复制myfile.txt文件为myfile_cp.txt
 * @author Xiloer
 *
 */
public class Test01 {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileInputStream fs = new FileInputStream("myfile.txt");
        FileOutputStream ge = new FileOutputStream("mfile-co.txt");
        byte[] gs = new byte[1042*10];
        int len = -1;
        while((len = fs.read(gs))!=-1){
           ge.write(gs,0,  len);

        }
        fs.close();
        ge.close();
        System.out.print("复制完成");
    }


}
