package com.ldt.java;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author tledang
 */


public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
//        String newA = java.util.Arrays.stream(a.toLowerCase().split("")).sorted().collect(java.util.stream.Collectors.joining());
//        String newB = java.util.Arrays.stream(b.toLowerCase().split("")).sorted().collect(java.util.stream.Collectors.joining());
//        return newA.equals(newB);
        char[] arr = a.toCharArray();
        char[] brr = b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        return Arrays.equals(arr,brr);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

