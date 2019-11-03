package com.ldt.java;

/**
 * @author tledang
 */
import java.util.*;

public class JavaHashset {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> hashSet = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String key = pair_left[i];
            String value = pair_right[i];
            hashSet.add(key+"AND"+value);
            System.out.println(hashSet.size());
        }

    }
}
