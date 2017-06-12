package com.xulei.study.second;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/11.
 */
public class towAddition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入结果");
        int score = 0;
        for(int i = 0 ; i < 10 ; i++){
            int a =(int)(Math.random()*100);
            int b = (int)(Math.random()*100);
            int resule =  a  +  b ;
            System.out.println("(" + i + "). " + a + " + " + b + " = ?");
                     System.out.print("请输入答案（输入-1退出）： ");

                int answer = scan.nextInt();

            if(answer == -1){
                System.out.println("GO");
                break;
            }else if(answer != resule){
                System.out.println("bed");
                score+=0;

            }else{
                System.out.println("nice");
                score+=10;
            }

        }
        System.out.println("成绩"+score);


    }
}
