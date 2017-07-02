package day07;

import java.io.*;

/**
 * 使用字符流复制当前程序的源文件到当前项目根目录下。
 * @author Xiloer
 *
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("src/day07/Test05.java");
        InputStreamReader vv = new InputStreamReader(file);
        FileOutputStream bb = new FileOutputStream("copy");
        OutputStreamWriter nn = new OutputStreamWriter(bb);
        int len = -1;
        while((len = vv.read())!=-1){
            nn.write(len);
        }
        nn.close();
        vv.close();
        System.out.println("复制好了");
    }

}
