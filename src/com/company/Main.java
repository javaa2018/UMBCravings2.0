/*
Team Error Terror
nsmilek1@umbc.edu
Gabi, Tanu, Nina
IS 147 Final Project
Presentation Dec 6
 */
package com.company;

public class Main{

    public static void main(String[] args)
    {

// below is printing the directions along with a brief description of the program itself
        System.out.println("Welcome to UMBCravings!");
        System.out.println("This program will ask you several questions to help you decide where to eat during the current meal period.");
        System.out.println("Please follow the directions below.");
        System.out.println("Please carefully read the following questions, then answer either yes or no:");
        System.out.println("--------------------------");

 //calling other classes and methods into main method in order to make the code easier to read

        // random food selection generator
        RandomFood randomfood = new RandomFood();
        randomfood.random();

        //gluten free class --> asks the question and gives food options
        glutenfree glutenfree = new glutenfree();
        glutenfree.gf(); //calling method

        //veggie class --> asks the question and gives food options
        Veggie veggie = new Veggie();
        veggie.veggie();

        //international/foreign food class --> asks the question and gives food options
        International international = new International();
        international.foreign();

        //dairy class --> be sure to thank them at the very end for their participation
        Dairy dairy = new Dairy();
        dairy.cow();

        //menu class --> must be at the very end
        Menu menu = new Menu();
        menu.information();

    }


}
