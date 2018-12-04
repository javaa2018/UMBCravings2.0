/*
Team Error Terror
nsmilek1@umbc.edu
watson7@umbc.edu
tdave1@umbc.edu

Gabi, Tanu, Nina
IS 147 Final Project

Presentation Dec 6

 */
package com.company;

import java.util.Calendar; //calendar

public class Main {

    public static void main(String[] args) {

        //prints out date and time, need to put constricitons of time in the loops
        Calendar date = Calendar.getInstance(); //see if can have in separate time class instead of in main, might need in main though b/c gets angry
        date.set(Calendar.HOUR_OF_DAY, 11); //11 pm
        date.set(Calendar.MINUTE, 00);
        date.set(Calendar.SECOND, 0);

// below is printing the directions along with a brief description of the program itself
        System.out.println("Welcome to UMBCravings!\n");
        System.out.println("This program will ask you several questions to help you decide where to eat during the current meal period");
        System.out.println("It is " + date.getTime() + " so the current meal period is lunch from 11-4pm");
        System.out.println("Please follow the directions below."); //can we delete this?
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

        Subclass s = new Subclass("umbcrd@umbc.edu"); //subclass for nutritionists info to contact, can be moved somewhere else but should be near the end before the thank you
        //object
        s.getEmail(); //method passing argument by value
    }
}





