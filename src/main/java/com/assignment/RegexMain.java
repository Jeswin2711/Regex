package com.assignment;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexMain
{
    /*
    Regex Constants
     */
    private static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+([-][A-Za-z0-9]+)?([+][A-Za-z0-9]+)?([.][A-Za-z0-9]+)?[@][a-z0-9]+[.][a-z]{2,3}([.][a-z]{2,3})?$";
    private static final String PHONE_NUMBER_REGEX = "^[0-9]{2}[\\s][1-9][0-9]{9}$";
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[a-zA-Z0-9@$!%*?&]{8,12}$";

    /*
    Main Function to Get the firstName from the User
     */
    public static void main(String[] args) {
        User regex = new User();
        System.out.println("Welcome To Regex Problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String fName = sc.nextLine();
        regex.setFirstName(fName);
        System.out.println("Enter Last Name : ");
        String lName = sc.nextLine();
        regex.setLastName(lName);
        System.out.println("Enter Phone Number : ");
        String phoneNo = sc.nextLine();
        regex.setPhoneNo(phoneNo);
        System.out.println("Enter Email ID : ");
        String email = sc.next();
        regex.setEmailId(email);
        System.out.println("Enter Password : ");
        String pwd = sc.next();
        regex.setPassWord(pwd);
        System.out.println(regex);

        System.out.println("\nChecking Emails\n");
        regex.setMail("abc@yahoo.com");
        regex.setMail("abc-100@yahoo.com");
        regex.setMail("abc.100@yahoo.com");
        regex.setMail("abc111@abc.com");
        regex.setMail("abc-100@abc.net");
        regex.setMail("abc.100@abc.com.au");
        regex.setMail("abc@1.com");
        regex.setMail("abc@gmail.com.com");
        regex.setMail("abc+100@gmail.com");

        /*
        Code to use Lambda Function to validate User Entry
         */
        System.out.println("Checking Inputs Using Lambda Functions");
        IFunctionalInterface obj = a -> Pattern.matches(NAME_REGEX,a);
        IFunctionalInterface obj1 = a -> Pattern.matches(EMAIL_REGEX,a);
        IFunctionalInterface obj2 = a -> Pattern.matches(PHONE_NUMBER_REGEX,a);
        IFunctionalInterface obj3 = a -> Pattern.matches(PASSWORD_REGEX,a);
        if(obj.test(fName).equals(true))System.out.println("First Name is Valid ");else System.out.println("First Name Not Valid");
        if(obj.test(lName).equals(true))System.out.println("Last Name is Valid ");else System.out.println("Last Name Not Valid");
        if(obj1.test(email).equals(true))System.out.println("Email is Valid ");else System.out.println("Email Not Valid");
        if(obj2.test(phoneNo).equals(true))System.out.println("Phone Number is Valid ");else System.out.println("Phone Number Not Valid");
        if(obj3.test(pwd).equals(true))System.out.println("Password is Valid ");else System.out.println("Password Not Valid");

    }
}
