package javaontap.Lab6String.regex;

import java.util.regex.Pattern;

public class CheckCCCD {
    public static void main(String[] args) {
        String id_cccd1 = "024205002270";
        String id_cccd2 = "02420500227a";
        String regexid = "\\d";
        String password1 = "123456";
        String password2 = "12345";
        String regexpwd = "\\d";
        String email1 = "abc@gmail.com";
        String email2 = "abc#gmailcom";
        String regexEmail = "\\w+@\\w+\\.com";
        boolean valid = Pattern.matches(regexid, id_cccd1);
        boolean valid1 = Pattern.matches(regexid, id_cccd2);
        boolean valid2 = Pattern.matches(regexpwd, password1);
        boolean valid3 = Pattern.matches(regexpwd, password2);
        boolean valid4 = Pattern.matches(regexEmail, email1);
        boolean valid5 = Pattern.matches(regexEmail, email2);

    }
}
