package com.ldt.java;

/**
 * @author tledang
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b([a-zA-Z]+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                String group = m.group();
                String group1 = m.group(1);
                input = input.replaceAll(group,group1);
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}


