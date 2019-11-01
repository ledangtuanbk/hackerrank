package com.ldt.java;

/**
 * @author tledang
 */
//public class JavaBigDecimal {
//}
import java.math.BigDecimal;
import java.util.*;
class JavaBigDecimal{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        List<String> lst = Arrays.asList(s).subList(0,n);

        lst.sort((o1, o2) -> {
            BigDecimal value1 = new BigDecimal(o1);
            BigDecimal value2 = new BigDecimal(o2);
            return value2.compareTo(value1);
        });
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
