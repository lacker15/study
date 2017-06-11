package com.xulei.study.second;

/**
 * Created by Administrator on 2017/6/11.
 * 第一天学习乘法表
 */
public class fristStudy {
    public static void main(String[] args) {
        outPutTable(12);
    }
    //输出九九乘法表
    private static void outPutTable(Integer num){
        //2个循环表示出表
        for(int i = 1; i <= num; i++){
            //第二个循环
            for(int j = 1; j <= i; j++){
                System.out.print(i + "*" + j + "=" + i * j+ "\t");




            }
            System.out.println();
        }
    }
}
