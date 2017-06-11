package com.xulei.study.second;

import java.util.Random;

/**
 * Created by Administrator on 2017/6/11.
 * 求数组最大值
 */
public class arrayMaxiMum {

    public static void main(String[] args) {

        //构造含有十个元素的数组
        int array[]  = new int[10];
        //随机给十个元素赋值
        Random s = new Random();
        //遍历十个数
        for(int i= 0;i<array.length;i++) {

            array[i] = s.nextInt(99) + 1;


            System.out.print(" \t" + array[i]);
        }
        System.out.println();
        int max = array[0];
        for(int i=1; i<array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("最大值是：" + max);




//

    }











}
