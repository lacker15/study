package HOME_WORK.src.main.java.day02;

import java.util.Arrays;

/**
 * 将字符串123,456,789,012根据","拆分，并输出拆分后的每一项
 * @author Xiloer
 *
 */
public class Test02 {
    public static void main(String[] args) {
        String i = "123,456,012";
        String[] e =  i.split(",");
      for (int b = 0 ; b< e.length;b++ ){
          System.out.println(e[b]);
      }
    }


}
