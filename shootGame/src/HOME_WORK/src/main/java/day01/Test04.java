package HOME_WORK.src.main.java.day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in); 
		System.out.println("请输入email");
		 String  email = scan.next();
		 
		String email1 = "[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
			 boolean match= email.matches(email1);
				 System.out.println(match);
		  if(match){
			    int stat  =  email.indexOf("@");
			  System.out.println(email.substring(0,stat));
			 return ;
		  }
		  System.out.println("犊子");
		
		
	}
}
