package com.assignment;

import java.util.regex.Pattern;


/*
Validator class to validate the given Strings are Matching the Requirements
 */
public class Validator
{

    private static final String nameRegex = "^[A-Z][a-z]{2,}$";
    private static final String emailRegex = "^[A-Za-z0-9]+([-][A-Za-z0-9]+)?([.][A-Za-z0-9]+)?[@][a-z]+[.][a-z]{2,3}([.][a-z]{2,3})?$";
    private static final String phoneRegex = "^[0-9]{2}[\\s][1-9][0-9]{9}$";

    /*
    isValidName function to return the User entered First Name string Matches the Regex or not
     */

    public static boolean isValidFirstName(String fName)
    {
        return Pattern.matches(nameRegex,fName);
    }

    /*
    isValidName function to return the User entered Last Name string Matches the Regex or not
     */

    public static boolean isValidLastName(String lName)
    {
        return Pattern.matches(nameRegex,lName);
    }

    /*
    isValidEmail function to return the User Entered Valid email ID or Not
     */

    public static boolean isValidEmail(String email)
    {
        return Pattern.matches(emailRegex,email);
    }

    /*
    isValidPhoneNo function to return the User entered Last Name string Matches the Regex or not
     */

    public static boolean isValidPhoneNo(String phoneNo) { return Pattern.matches(phoneRegex,phoneNo);}
}
