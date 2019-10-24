package com.ldt.java;

import java.util.Scanner;

/**
 * @author tledang
 */
public class JavaStaticInitializerBlock {
    static boolean flag = false;

    private static  int B = 0;

    private static  int H = 0;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if(B>0 && H>0){
            flag = true;
        }else {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }

    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

