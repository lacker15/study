package HOME_WORK.src.main.java.day02;

import java.util.Scanner;

/**
 * 实现文件重命名。
 * 要求用户输入一个文件名称，例如:abc.jpg
 * 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 * @author Xiloer
 *
 */
public class Test05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("输入一波");
		String djb = scan.next();
    //dfa.jpg
		String jb = "[a-zA-Z0-9]+\\.jpg     ";
		System.out.println(jb);

		boolean match = djb.matches(jb.trim());
		if(match){
			String[] l = djb.split("\\.");
			long qq = System.currentTimeMillis();
			System.out.println(qq+"."+l[1]);
		}
		else{
			System.out.println("woc");
		}
	}
}
