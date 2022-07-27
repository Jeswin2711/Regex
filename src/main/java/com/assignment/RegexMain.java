package com.assignment;

import java.util.Scanner;

public class RegexMain
{
    /*
    Main Function to Get the firstName from the User
     */
    public static void main(String[] args) {
        RegexModel regex = new RegexModel();
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
        System.out.println(regex);
    }
}
