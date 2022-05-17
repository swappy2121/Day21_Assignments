package com.Bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistrationUC12 {
    static Scanner scanner = new Scanner(System.in);

    public static void firstName() {
        System.out.println("Enter the first name: ");
        String name = scanner.next();
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match = pattern.matcher(name);
        try {
            if (match.matches()) {
                System.out.println("Name is valid.");
            } else {
                throw new CustomException("Invalid Name");
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }


    public static void lastName() {

        System.out.println("Enter the last name: ");
        String name = scanner.next();
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match = pattern.matcher(name);
        try {
            if (match.matches()) {
                System.out.println("Name is valid.");
            } else {
                throw new CustomException("Invalid Name");
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    public static void email() {

        System.out.println("Enter the email: ");
        String mail = scanner.next();
        Pattern pattern = Pattern.compile("^[a-zA-Z]+[.][A-Za-z]+@[a-zA-Z]+[.]+[a-zA-Z]{2}+[.][A-Za-z]{2}+$");
        Matcher match = pattern.matcher(mail);
        try {
            if (match.matches()) {
                System.out.println("email is valid.");
            } else {
                throw new CustomException("Invalid email");
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    public static void mobileNumber() {
        System.out.println("Enter the mobile number with country code: ");
        String mobNo = scanner.next();
        Pattern pattern = Pattern.compile("^[0-9]{2}\s[0-9]{10}$");
        Matcher match = pattern.matcher(mobNo);
        try {
            if (match.matches()) {
                System.out.println("Mobile Number is valid.");
            } else {
                throw new CustomException("Invalid Mobile Number");
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    public static void ruleOne() {
        System.out.println("Enter characters for first rule: ");
        String one = scanner.next();
        Pattern pattern = Pattern.compile("^[a-zA-Z]{8,}$");
        Matcher match = pattern.matcher(one);
        try {
            if (match.matches()) {
                System.out.println("First Rule is valid.");
            } else {
                throw new CustomException("Invalid First Rule");
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }


    public static void ruleTwo() {
        System.out.println("Enter characters for second rule: ");
        String two = scanner.next();
        Pattern pattern = Pattern.compile("^[a-zA-Z]{1,}[a-zA-Z]{7,}$");
        Matcher match = pattern.matcher(two);
        try {
            if (match.matches()) {
                System.out.println("Second Rule is valid.");
            } else {
                throw new CustomException("Invalid Second Rule");
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }


    public static void ruleThird() {
        System.out.println("Enter value for third rule: ");
        String third = scanner.next();
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{1,}[a-zA-Z0-9]{7,}$");
        Matcher match = pattern.matcher(third);
        try {
            if (match.matches()) {
                System.out.println("Third Rule is valid.");
            } else {
                throw new CustomException("Invalid Third Rule");
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    public static void ruleFourth() {
        System.out.println("Enter value for fourth rule: ");
        String fourth = scanner.next();
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9@$!%*#?&]{1,}[a-zA-Z0-9@$!%*#?&]{7,}$");
        Matcher match = pattern.matcher(fourth);
        try {
            if (match.matches()) {
                System.out.println("Fourth Rule is valid.");
            } else {
                throw new CustomException("Invalid Fourth Rule");
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Custom Exceptions");
        firstName();
        lastName();
        email();
        mobileNumber();
        ruleOne();
        ruleTwo();
        ruleThird();
        ruleFourth();
    }
}
