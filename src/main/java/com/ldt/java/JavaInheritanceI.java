package main.java.com.ldt.java;

/**
 * @author tledang
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.in;

class Animal{
    void walk()
    {
        System.out.println("I am walking");
    }
}
class Bird extends Animal
{
    void fly()
    {
        System.out.println("I am flying");
    }

    void sing(){
        System.out.println("I am singing");
    }
}

public class JavaInheritanceI {

    public static void main(String args[]){
        BufferedReader br=new BufferedReader(new InputStreamReader(in));
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}
