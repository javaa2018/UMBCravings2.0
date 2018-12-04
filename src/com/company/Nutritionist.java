package com.company;
/*
*Super class
 */
class Nutritionist
{
    String email; //string var for email

    Nutritionist(String email)
    {

        this.email=email; //referes to email object from within a constructor
    }

    public void getEmail()
    { //getter for email
        System.out.println("\nHere's UMBC's nutritionist, Nicole Arcilla's email if you want to learn more: " +email);
    }
}

