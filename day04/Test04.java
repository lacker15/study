package main.java.day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < 10;i++){
                list.add(i);
        }
        System.out.println(list);
        List<Integer> sub  =  list.subList(3,7);
        System.out.println(sub);
        for (Integer i = 0 ; i < sub.size();i++){
            int unm = sub.get(i);
            sub.set(i,unm*10);
            System.out.println(unm);

        }
        System.out.println(list);
         list.subList(7,10).clear();
        System.out.println(list);
    }




}
