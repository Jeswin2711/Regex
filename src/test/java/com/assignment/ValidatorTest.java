package com.assignment;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Validator Test Class is Used for Testing.
It helps us to hardcode the input and the expected Result
if it matches the test case is Passed Successfully
 */
class ValidatorTest
{
    /*
    Test for Check First Name is Valid
     */
    Validator validator = new Validator();
    @Test
    public void givenFirstNameWhenCheckReturnValidOrNot()
    {
        boolean result = validator.isValidFirstName("Jeswin");
        Assertions.assertEquals(result,true);
    }
    /*
    Test for Check Last Name is Valid
     */
    @Test
    public void givenLastNameWhenCheckReturnValidOrNot()
    {
        boolean result = validator.isValidLastName("Jaison");
        Assertions.assertEquals(result,true);
    }
    /*
    Test for Check Email is Valid
     */
    @Test
    public void givenEmailWhenCheckReturnValidOrNot()
    {
        boolean result = validator.isValidEmail("jeswin2711@gmail.com");
        Assertions.assertEquals(result,true);
    }
    /*
    Test for Check Phone Number is Valid
     */
    @Test
    public void givenPhoneNumberWhenCheckReturnValidOrNot()
    {
        boolean result = validator.isValidPhoneNo("91 6379984919");
        Assertions.assertEquals(result,true);
    }
    /*
    Test for Check Password is Valid
     */
    @Test
    public void givenPasswordWhenCheckReturnValidOrNot()
    {
        boolean result = validator.isValidPassword("Jeswin@2711");
        Assertions.assertEquals(result,true);
    }
}