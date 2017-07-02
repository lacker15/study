package day07;

import day03.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 读取当前项目根目录下所有后缀为.obj的文件，将这些Emp对象读取出来
 * 并存入到一个List集合中，然后按照员工工资从多到少的顺序依次输出员工信息
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File tt = new File(".");
        List<Emp> rr = file(tt);
        Collections.sort(rr, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                int i = o1.getSalary() - o2.getSalary();
                if (i > 0){
                    return 1;
                }
                if(i < 0){
                    return -1 ;
                }
                return 0 ;
            }
        });
        for( Emp pp : rr ){
            System.out.println(pp);
        }

    }
    public static List<Emp> file (File die) throws IOException, ClassNotFoundException {
        List<Emp> list = new ArrayList<Emp>();
        File[] sbu = die.listFiles(new FileFilter() {

            public boolean accept(File pathname) {
                String name = pathname.getName();
                return name.endsWith(".obj");
            }
        });
        for(File ee :sbu){
            Emp zz = readeemp(ee);
            list.add(zz);
        }
        return list;

    }
    public  static Emp readeemp(File files) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(files);
        ObjectInputStream bbc = new ObjectInputStream(file);
        Emp ff = (Emp) bbc.readObject();
        return ff;
    }
}
