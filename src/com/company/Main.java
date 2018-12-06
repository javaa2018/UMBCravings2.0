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

        Calendar date = Calendar.getInstance();

// below is printing the directions along with a brief description of the program itself
        System.out.println("Welcome to UMBCravings!\n");
        System.out.println("This program will ask you several questions to help you decide where to eat during the current meal period");
        System.out.println("It is " + date.getTime() + " so the current meal period is dinner from 4:30-8pm");
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

        String a1 = "1000 Hilltop Circle UMBC Commons, Baltimore MD 21250"; //address string

        Food f1 = new Food ("Wild Greens", "443-612-8380",  a1); //food object for gluten free
        Food f2 = new Food ("Au Bon Pain", "443-612-3663", a1);
        System.out.println("\nHere are the locations & phone numbers where you can eat gluten free");
        f1.printFood();
        f2.printFood();

        //object created called subclass
        Subclass s = new Subclass("umbcrd@umbc.edu"); //subclass for nutritionists info to contact, can be moved somewhere else but should be near the end before the thank you
        Subclass n = new Subclass("Nicole Arcilla's", "umbe.umbc.edu");
        s.getEmail(); //method passing argument by value

        System.out.println("Thanks for using UMBCravings hope to see you again soon!");

    }
}





