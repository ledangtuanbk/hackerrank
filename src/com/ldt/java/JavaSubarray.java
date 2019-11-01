package com.ldt.java;

/**
 * @author tledang
 */
import java.io.*;
import java.util.*;

public class JavaSubarray {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int size = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] values = scanner.nextLine().split(" ");
        int[] numbers = new int[size];

        for(int i = 0;i<size;i++){
            numbers[i]=Integer.parseInt(values[i]);
        }
        int count = 0;
        for (int i = 0;i<size;i++){
            for(int j = i;j<size;j++){
                int temp = 0;
                for(int k=i;k<=j;k++){
                    temp+=numbers[k];
                }
                if(temp<0){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}


