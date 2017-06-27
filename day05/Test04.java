package day05;

import java.util.*;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99,数学:98,英语:97,物理:96,化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Xiloer
 *
 */
public class Test04 {

    public static void main(String[] args) {
        Map<String,Integer > map = new HashMap<String, Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入： 科目 ， 成绩");
        String ans = scan.next();
        String[] cut = ans.split(",");//[“语文:99” ,“数学:98” ,“英语:97” ,'物理:96" ,"化学:95"]
        for (String str : cut){
            //System.out.println(str);
            String[] cc = str.split(":");
            System.out.println(Arrays.toString(cc));
            map.put(cc[0],Integer.parseInt(cc[1]));
        }
        System.out.println(map);
        map.put("化学",96);
        map.remove("英语");

        //*然后遍历该Map分别按照遍历key，Entry，value
       //*的形式输出该Map信息。
        Set<String> keyset = map.keySet();
        for(String ff : keyset){
            System.out.println(ff);
        }
        Set<Map.Entry<String,Integer>> cc = map.entrySet();
        for (Map.Entry<String,Integer> tt : cc ){
            System.out.println(tt);
        }
        Collection<Integer> vv = map.values();
        for (Integer crv  : vv){
            System.out.println(crv);
        }



    }

}
