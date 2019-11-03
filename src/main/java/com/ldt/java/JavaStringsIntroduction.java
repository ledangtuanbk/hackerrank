package com.ldt.java;

/**
 * @author tledang
 */

import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        String newA = String.valueOf(A.charAt(0)).toUpperCase() + A.substring(1);
        String newB = String.valueOf(B.charAt(0)).toUpperCase() + B.substring(1);
        System.out.println(newA+ " " +newB);

    }
}