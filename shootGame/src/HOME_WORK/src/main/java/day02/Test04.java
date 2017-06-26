package HOME_WORK.src.main.java.day02;
/**
 * 将字符串"123abc456def789ghi"中的英文部分替换为"#char#"
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        String c = "123abc456def789ghi";
        String g = "[a-zA-Z]+";
        c = c.replaceAll(g,"#char#");
     System.out.println(c);
    }

}
