package com.savytskyy.Lesson6.RegExBasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "127.0.0.1\n" +
                "\n" + " www " +
                "10.128.17.14\n" +
                "\n" + "HelloWorld" +
                "10.130.24.1";

        String ipPattern = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";

        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
