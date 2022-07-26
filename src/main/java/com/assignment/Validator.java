package com.assignment;

import java.util.regex.Pattern;


/*
Validator class to validate the given Strings are Matching the Requirements
 */
public class Validator
{
    /*
    isValidName function to returns the User entered First Name string Matches the Regex or not
     */
    public static boolean isValidFirstName(String name)
    {
        String regex = "^[A-Z][a-z]{2,}$";
        if (Pattern.matches(regex,name))
        {
            return true;
        }
        else return false;
    }

    /*
    isValidName function to returns the User entered Last Name string Matches the Regex or not
     */

    public static boolean isValidLastName(String name)
    {
        String regex = "^[A-Z][a-z]{2,}$";
        if (Pattern.matches(regex,name))
        {
            return true;
        }
        else return false;
    }
}
