package javaontap.Lab6String.regex;

import java.util.regex.Pattern;

public class Checkemail {
    public static void main(String[] args) {
        String email = "abc@gmail.com";
        String regex = "\\w+@\\w+\\.\\w+";

        boolean isvalid = Pattern.matches(regex, email);
        System.out.println("Email hợp lệ " + isvalid);
    }
}
