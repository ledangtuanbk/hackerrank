package com.ldt.java;
import java.util.Scanner;

/**
 * @author tledang
 */
public class JavaSubstringComparisons {
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for (int i = 0; i < s.length()-(k-1); i++) {
            String sub = s.substring(i,i+k);
            if(i==0){
                smallest = sub;
                largest = sub   ;
            }
            if(sub.compareTo(smallest)<0){
                smallest = sub;
            }
            if(sub.compareTo(largest)>0){
                largest = sub;
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }
}
