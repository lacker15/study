package day08;

import java.io.*;

/**
 * 使用异常捕获机制完成下述读取操作。
 * 使用缓冲流读取note.txt文件，并将每行字符串输出到控制台上
 * @author Xiloer
 *
 */
public class Test03 {
    public static void main(String[] args) {
        FileInputStream omg = null;
        BufferedReader rng = null;
        try {
            omg = new FileInputStream("note.txt");
            InputStreamReader we = new InputStreamReader(omg);
            rng = new BufferedReader(we);
            String b = null;
            while ((b = rng.readLine())!= null) {
                System.out.println(rng.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                rng.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
