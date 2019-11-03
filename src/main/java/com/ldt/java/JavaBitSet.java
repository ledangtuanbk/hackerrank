package com.ldt.java;

import java.io.*;
import java.util.*;

public class JavaBitSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String op = sc.next();
            int param1 = sc.nextInt();
            int param2 = sc.nextInt();

            switch (op) {
                case "AND":
                    if (param1 == 1) {
                        b1.and(b2);
                    } else {
                        b2.and(b1);
                    }
                    break;
                case "OR":
                    if (param1 == 1) {
                        b1.or(b2);
                    } else {
                        b2.or(b1);
                    }
                    break;
                case "XOR":
                    if (param1 == 1) {
                        b1.xor(b2);
                    } else {
                        b2.xor(b1);
                    }
                    break;
                case "FLIP":
                    if (param1 == 1) {
                        b1.flip(param2);
                    } else {
                        b2.flip(param2);
                    }
                    break;
                case "SET":
                    if (param1 == 1) {
                        b1.set(param2);
                    } else {
                        b2.set(param2);
                    }
                    break;
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }

    }
}

