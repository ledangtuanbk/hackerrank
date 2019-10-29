package com.ldt.java;

/**
 * @author tledang
 */
import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        // blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
        String[] splitStr = s.split("[ !,?._'@]");
        int count = 0;
        for (String value : splitStr) {
            if (value.isEmpty()) {
                count++;
            }
        }

        System.out.println(splitStr.length-count);
        for (String value : splitStr) {
            if (value.isEmpty()) {
                continue;
            }
            System.out.println(value);
        }
        scan.close();
    }
}


