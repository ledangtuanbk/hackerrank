package com.ldt.java;

/**
 * @author tledang
 */
import java.io.*;
import java.util.*;

public class JavaArraylist {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = scanner.nextInt();
        ArrayList<Integer[]> data = new ArrayList<>();
        for(int i = 0; i < size; i++){
            int count = scanner.nextInt();
            Integer[] arr = new Integer[count];
            for(int j = 0;j<count;j++){
                arr[j]=scanner.nextInt();
            }
            data.add(arr);
        }
        int numResult = scanner.nextInt();
        for(int i = 0;i<numResult;i++){
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            Integer[] arr = data.get(row-1);
            if(col>arr.length){
                System.out.println("ERROR!");
            }else{
                System.out.println(arr[col-1]);
            }
        }
    }
}


