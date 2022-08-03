package com.assignment;

/*
User class acts as a Encapsulated class with getter and setter
 */
public class User
{
    private String firstName;
    private String lastName;
    private String emailId;
    private String phoneNo;
    private String passWord;

    public String getPassWord() {
        return passWord;
    }

    Validator validator = new Validator();
    public void setPassWord(String passWord) {
        /*
        Using Exception Handling when the entered Password is Invalid
         */
        try {
            if(validator.isValidPassword(passWord))
            {
                this.passWord = passWord;
            }
            else throw new RegexException("Password Invalid");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        /*
        Using Exception Handling when the entered Phone Number is Invalid
         */
        try {
            if(validator.isValidPhoneNo(phoneNo))
            {
                this.phoneNo = phoneNo;
            }
            else throw new RegexException("Phone Number Invalid");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        /*
        Using Exception Handling when the entered Email Id is Invalid
         */
        try {
            if(validator.isValidEmail(emailId))
            {
                this.emailId = emailId;
            }
            else throw new RegexException("Email Id Invalid");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setLastName(String lastName) {
        /*
        Using Exception Handling when the entered Last Name is Invalid
         */
        try {
            if(validator.isValidLastName(lastName))
            {
                this.lastName = lastName;
            }
            else throw new RegexException("Last Name Invalid");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        /*
        Using Exception Handling when the entered First Name is Invalid
         */
        try {
            if(validator.isValidFirstName(firstName))
            {
                this.firstName = firstName;
            }
            else throw new RegexException("First Name Invalid");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /*
    Setter method to check the Hardcoded mailIds are Valid or not
     */
    public void setMail(String mail) {
        if(validator.isValidEmail(mail))
        {
            System.out.println(mail + " is Valid Email");
        }
        else System.out.println(mail + " is not a Valid Email");

    }

    @Override
    public String toString() {
        return "User {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
