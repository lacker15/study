package main.java.day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 * @author Xiloer
 *
 */
public class Test05 {
    public static void main(String[] args) {
        List<Integer> ss = new ArrayList<Integer>();
        for(int i = 0 ; i  < 10 ; i++){
          ss.add(i);

    }
    System.out.println(ss);
        Integer[] gg = ss.toArray(new Integer[ss.size()]) ;
        for(Integer str :gg){
            System.out.println(str);
        }




    }

}
