package com.company;
/*
*Super class for nutrionist information
 */
class Nutritionist
{
    String email; //string var for email

    Nutritionist(String email)
    {

        this.email=email; //this keyword refere to email object from within a constructor
    }

    public void getEmail() //getter
    { //getter for email
        System.out.println("\nHere's UMBC's nutritionist, Nicole Arcilla's email if you want to learn more: " +email);
    }
}

