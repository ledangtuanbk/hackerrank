package com.ldt.java;

import java.util.*;

/**
 * @author tledang
 */
public class JavaStack {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            Stack<Character> stacks = new Stack<>();
            boolean result = true;
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                    stacks.push(input.charAt(i));
                } else {
                    if (!stacks.empty() ){
                        Character peek = stacks.pop();
                        if(currentChar==')' && peek=='('){
                            continue;
                        }
                        if(currentChar=='}' && peek=='{'){
                            continue;
                        }
                        if(currentChar==']' && peek=='['){
                            continue;
                        }
                        result = false;
                        break;
                    }else {
                        result = false;
                        break;
                    }
                }
            }
            if(!stacks.isEmpty()){
                result = false;
            }
            System.out.println(result);
        }

    }
}
