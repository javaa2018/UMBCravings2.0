/*
Team Error Terror
Gabi, Tanu, Nina
IS 147 Final Project

 */
package com.company;

public class Main
{
    //

    public static void main(String[] args)
    {

// below is printing the directions along with a brief description of the program itself
        System.out.println("Welcome to UMBCravings!");
        System.out.println("This program will ask you several questions to help you decide where to eat during the current meal period.");
        System.out.println("Please follow the directions below.");
        System.out.println("Please carefully read the following questions, then answer either yes or no:");
        System.out.println("--------------------------");

 //calling other classes and methods into main method in order to make the code easier to read
        glutenfree glutenfree= new glutenfree();
        glutenfree.gf(); //calling method
        Veggie veggie=new Veggie();
        veggie.veggie();

    }


}
