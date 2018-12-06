package com.company;

public class Subclass extends Nutritionist //extends the nutrionist class with all of her info
{
    Subclass(String email) //subclass of nutrionist class
    {
         super (email); //calls CONSTRUCTOR of the superclass nutrionist w/ this keyword & passes email
    }

    public Subclass(String name, String email) { //method overloading of constructors

        super(name,email);
    }
}
