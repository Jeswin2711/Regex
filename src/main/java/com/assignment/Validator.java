package com.assignment;

import java.util.regex.Pattern;


/*
Validator class to validate the given Strings are Matching the Requirements
 */
public class Validator
{
    static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";
    static final String EMAIL_REGEX = "^[A-Za-z0-9]+([-][A-Za-z0-9]+)?([+][A-Za-z0-9]+)?([.][A-Za-z0-9]+)?[@][a-z0-9]+[.][a-z]{2,3}([.][a-z]{2,3})?$";
    static final String PHONE_NUMBER_REGEX = "^[0-9]{2}[\\s][1-9][0-9]{9}$";
    static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[a-zA-Z0-9@$!%*?&]{8,12}$";
    /*
    ?=.* - means at least
     */

    /*
    Using Lambda Function to Reduce Code Usability
     */
    IFunctionalInterface obj = (a,b)-> Pattern.matches(a,b);


    /*
    isValidName function to return the User entered First Name string Matches the Regex or not
     */
    public  boolean isValidFirstName(String fName)
    {
        return obj.test(NAME_REGEX,fName);
    }

    /*
    isValidName function to return the User entered Last Name string Matches the Regex or not
     */

    public  boolean isValidLastName(String lName)
    {
        return obj.test(NAME_REGEX,lName);
    }

    /*
    isValidEmail function to return the User Entered Valid email ID or Not
     */

    public  boolean isValidEmail(String email)
    {
        return obj.test(EMAIL_REGEX,email);
    }

    /*
    isValidPhoneNo function to return the User entered Last Name string Matches the Regex or not
     */

    public  boolean isValidPhoneNo(String phoneNo)
    {
        return obj.test(PHONE_NUMBER_REGEX,phoneNo);
    }

    /*
    isValidPassword function to return the User entered Last Name string Matches the Regex or not
     */

    public  boolean isValidPassword(String passWord) {
        return obj.test(PASSWORD_REGEX, passWord);
    }
}
