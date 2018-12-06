package com.company;
/*
*Super class for nutrionist information
 */
abstract class Nutritionist
{
    String email; //string var for email
    String name;

    Nutritionist(String email)
    {

        this.email=email; //this keyword refers to email object from within a constructor
    }

    Nutritionist(String name, String email){

        this.email = email;
        this.name = name;

    }

    public void getEmail()
    { //getter for email
        System.out.println("\nHere's UMBC's nutritionist, email if you want to learn more: " +email);
    }
}

