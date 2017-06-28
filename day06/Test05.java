package day06;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
 * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
 * 在该目录中继续创建若干级目录和文件。
 * @author Xiloer
 *
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入");
        String san = scan.next();
        File ff = new File(san);
        delete(ff);
        System.out.println("删除结束");

    }
    public static void delete( File ff ){
        if(ff.exists()){
            File[] cc = ff.listFiles();
            for (File rr :cc){
                delete(ff);
            }
        }
        ff.delete();

    }
}
