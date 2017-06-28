package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author Xiloer
 *
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入");
		String name = scan.next();
		copy1(name);
        copy2(name);
	}
	/**
	 * 使用单字节方式复制
	 * @param name 要复制的文件名
	 */
	public static void copy1(String name) throws IOException {
		RandomAccessFile cop = new RandomAccessFile(name,"r");
		RandomAccessFile coo = new RandomAccessFile(name+"_copy","rw");
		int d = -1;
		while ((d =cop.read())!=-1){
		    coo.write(d);
        }
        System.out.println("复制好了");

	}
	/**
	 * 使用字节数组形式复制
	 * @param name 要复制的文件名
	 */
	public static void copy2(String name) throws IOException {
	    RandomAccessFile tt = new RandomAccessFile(name,"r");
	    RandomAccessFile gg = new RandomAccessFile(name+"_copy","rw");
	    byte[] d = new byte[1024*10];
	    int len = -1;
	    while ((len = tt.read(d)) !=-1){
	        gg.write( d, 0,len);
	        System.out.println("复制好");
	        tt.close();
	        gg.close();

        }
		
	}
}
