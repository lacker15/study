package day07;

import java.io.*;

/**
 * 使用缓冲流复制myfile.txt文件为myfile_cp2.txt
 * @author Xiloer
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        FileInputStream gg = new FileInputStream("myfile.txt");
        BufferedInputStream ggs = new BufferedInputStream(gg);
        FileOutputStream ff = new FileOutputStream("myfile_cp2.txt");
        BufferedOutputStream ffs = new BufferedOutputStream(ff);
        int c = -1;
        while((c=ggs.read())!=-1){
            ffs.write(c);
        }
        ffs.close();
        ggs.close();
        System.out.print("复制好了");

    }


}
