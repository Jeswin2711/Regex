package com.assignment;

/*
RegexModel class acts as a Encapsulated class with getter and setter
 */
public class RegexModel
{
    private String firstName;
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(Validator.isValidFirstName(firstName))
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
        else System.out.println("Enter Valid Name");;
    }

    @Override
    public String toString() {
        return "User {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
