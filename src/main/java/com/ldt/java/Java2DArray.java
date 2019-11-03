package com.ldt.java;

/**
 * @author tledang
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Java2DArray {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int largest =  -64;
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                int total = 0;
                for(int row = 0;row<3;row++){
                    for(int col = 0;col<3;col++){
                        if(row == 1 && (col==0|| col==2)){
                            continue;
                        }
                        total+=arr[i+row][j+col];
                    }
                }
                if(total>largest){
                    largest=total;
                }
            }
        }
        System.out.println(largest);

        scanner.close();
    }
}

