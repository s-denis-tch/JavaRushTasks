package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] strs = new String[10];
        int[] vect = new int[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i= 0 ;i<strs.length; i++) {
            strs[i] = br.readLine();
        }

        for (int i = 0;i<strs.length; i++) {
            vect[i] = strs[i].length();
        }

        for (int i = 0;i<vect.length; i++) {
            System.out.println(vect[i]);
        }
    }
}