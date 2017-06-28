package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Xiloer
 *
 */
public class Test06 {
    public static void main(String[] args) {
        final File die = new File(".");
        final File[] all = die.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                String name = die.getName();
                return name.startsWith(".");
            }
        });
        for (File tt :all){
            System.out.println(tt.getName());
        }

    }

}
