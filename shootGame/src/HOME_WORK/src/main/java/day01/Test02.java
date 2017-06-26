package HOME_WORK.src.main.java.day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuilder  builder = new StringBuilder("大家好");
		builder.append("我是程序员!");
		System.out.println(builder);
   
		builder.insert(5, "优秀的");
	   System.out.println(builder);
	   
	   builder.replace(5,7 ,"牛牛的" );
	   System.out.println(builder);
	   builder.delete(0,3);
	   System.out.println(builder);
				
		
	}
}
