package com.ldt.java;

/**
 * @author tledang
 */
//public class TagContentExtractor {
//}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
////        int testCases = 1;
//        while (testCases > 0) {
//            String line = in.nextLine();
////            String line = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
//
//            //Write your code here
//            Stack<String> stacks = new Stack<>();
//            char[] chars = line.toCharArray();
//
//            boolean end = false;
//            boolean inTag = false;
//            StringBuilder tag = new StringBuilder();
//            StringBuilder content = new StringBuilder();
//            boolean valid = false;
//            for (int i = 0;i<chars.length;i++) {
//                char c = chars[i];
//                if (c == '<') {
//                    inTag = true;
//                }else  if(c == '/'){
//                    end = true;
//                }
//                else if (c == '>') {
//                    // end start tag
//                    if (!end) {
//                        stacks.push(tag.toString());
//                    }
//                    // end close tag
//                    else {
//                        if (tag.toString().equals(stacks.peek())) {
//                            if(!content.toString().isEmpty() && !tag.toString().isEmpty()){
////                                result.add(content.toString());
//                                System.out.println(content.toString());
//                                valid = true;
//                            }
//                        }
//                    }
//                    end = false;
//                    inTag = false;
//                    tag = new StringBuilder();
//                    content = new StringBuilder();
//                } else {
//                    if(inTag){
//                        tag.append(c);
//                    }else {
//                        content.append(c);
//                    }
//                }
//            }
//            testCases--;
//            if(!valid){
//                System.out.println("None");
//            }
//        }
//    }

    public static void main(String[] args){

//        String pattern = "(([a])([b]([c])))";
//        String pattern = "<([^>]+)>([^<>]+)(</\\1>)";
//        Pattern r = Pattern.compile(pattern);
//
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//        while(testCases > 0){
//            String line = in.nextLine();
//
//            Matcher m = r.matcher(line);
//            boolean findMatch = true;
//            while(m.find( )){
//                System.out.println(m.group(2));
//                findMatch = false;
//            }
//            if(findMatch) {
//                System.out.println("None");
//            }
//            testCases--;
//        }

        String pattern = "<([^>]+)>([^<>]+)</\\1>";
        String line = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par><aab>dasdf</aab>";
        Pattern r = Pattern.compile(pattern);
        Matcher matcher = r.matcher(line);
        while (matcher.find()){
            int groupCount = matcher.groupCount();
            for (int i = 0; i <= groupCount; i++) {
                System.out.println(matcher.group(i));
            }
        }
    }
}




