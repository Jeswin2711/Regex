package com.assignment;

/*
RegexModel class acts as a Encapsulated class with getter and setter
 */
public class RegexModel
{
    private String firstName;
    private String lastName;
    private String emailId;
    private String phoneNo;
    private String passWord;
    private String mail;

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        if(Validator.isValidPassword(passWord))
        {
            this.passWord = passWord;
        }
        else System.out.println("Enter Valid Password");
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        if(Validator.isValidPhoneNo(phoneNo))
        {
            this.phoneNo = phoneNo;
        }
        else System.out.println("Enter Valid Phone Number");

    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        if(Validator.isValidEmail(emailId))
        {
            this.emailId = emailId;
        }
        else System.out.println("Enter Valid Email Id");
    }

    public void setLastName(String lastName) {
        if(Validator.isValidLastName(firstName))
        {
            this.lastName = lastName;
        }
        else System.out.println("Enter Valid Name");;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(Validator.isValidFirstName(firstName))
        {
            this.firstName = firstName;
        }
        else System.out.println("Enter Valid Name");
    }

    /*
    Setter method to check the Hardcoded mailIds are Valid or not
     */
    public void setMail(String mail) {
        if(Validator.isValidEmail(mail))
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
