package com.ldt.java;

/**
 * @author tledang
 */
import java.io.*;
        import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int len = A.length();
        /* Enter your code here. Print output to STDOUT. */
        boolean palidrom = true;
        for(int i = 0;i<len/2;i++){
            if(A.charAt(i)!=A.charAt(len - 1 -i)){
                palidrom=false;
                break;
            }
        }
        System.out.println(palidrom?"Yes":"No");
    }
}




