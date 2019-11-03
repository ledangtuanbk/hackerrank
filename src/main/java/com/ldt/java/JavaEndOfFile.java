package com.ldt.java;

import java.util.Scanner;

/**
 * @author tledang
 */
public class JavaEndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            count++;
            System.out.println(count + " " + str);
        }
    }
}
