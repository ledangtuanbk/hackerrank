package com.ldt.java;

import java.util.Scanner;

/**
 * @author tledang
 */
public class JavaDatatypes {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        double varByte = Math.pow(2, 7);
        double varShort = Math.pow(2, 15);
        double varInt = Math.pow(2, 31);
        double varLong = Math.pow(2, 63);

        System.out.println(varByte == 128);
        System.out.println(varShort == 32768);
        System.out.println(varInt == 2147483648l);
        System.out.println(varLong-1 == 9223372036854775807l);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= varByte * -1 && x <= varByte - 1) System.out.println("* byte");
                if (x >= varShort * -1 && x <= varShort - 1) System.out.println("* short");
                if (x >= varInt * -1 && x <= varInt - 1) System.out.println("* int");
                if (x >= varLong * -1 && x <= varLong - 1) System.out.println("* long");
                //Complete the code
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
