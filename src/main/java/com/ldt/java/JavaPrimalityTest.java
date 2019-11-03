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

public class JavaPrimalityTest {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String n = scanner.nextLine();
            BigInteger value = new BigInteger(n);
//        BigInteger index = new BigInteger(String.valueOf(2));
//        boolean prime = true;
//        if(value.compareTo(new BigInteger(String.valueOf(0L)))==0){
//            prime =false;
//        }
//        if(value.compareTo(new BigInteger(String.valueOf(0L)))==1){
//            prime =false;
//        }
//        value.isProbablePrime(0);
//        while (value.compareTo(index.multiply(index))>=0){
//            if(value.remainder(index).equals(new BigInteger(String.valueOf(0)))){
//                prime = false;
//                break;
//            }
//            index = index.add(BigInteger.valueOf(1));
//        }
            System.out.println(value.isProbablePrime(1) ? "prime" : "not prime");
            if(n==" "){
                break;
            }
        }
        scanner.close();
    }
}

