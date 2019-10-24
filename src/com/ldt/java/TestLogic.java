package com.ldt.java;

/**
 * @author tledang
 */
public class TestLogic {
    public static void main(String[] args) {
        checkDouble();
    }

    private static void checkDouble(){
        double varDouble = 9223372036854775807d;
        double varDouble2 = 9223372036854775808d;
        double varDouble3 = 9223372036854775809d;
        double varDouble4 = 92233720368547758101d;
        long varLong =     9223372036854775807l;

//        System.out.println((long) varDouble);
//        System.out.println(varLong < varDouble);
        System.out.println(varLong == varDouble);
        System.out.println(varLong == varDouble2);
        System.out.println(varLong == varDouble3);
        System.out.println(varLong == varDouble4);
    }
}
