package com.xulei.study.second;

import java.util.Random;

/**
 * Created by Administrator on 2017/6/11.
 */
public class bubbleSort {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random s = new Random();
        for (int i = 0; i <=9; i++) {
            array[i] = s.nextInt(99) + 1;
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                if (array[j] > array[i]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        for (int i = 0; i <= 9; i++) {
            System.out.println(array[i]);
        }


    }
}

