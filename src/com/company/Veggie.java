package com.company;
import java.util.Scanner;

public class Veggie {

    void veggie()
    { //make it public and put it the veggie class??

        //make the yes/no strings global variables so they are accessible everywhere
        String yes = "yes".toLowerCase();
        //String no = "no";

        Scanner user = new Scanner(System.in);
        System.out.println("Are you vegetarian?");
        String vegAnswer = user.nextLine();

        if (vegAnswer.equals(yes))
        { //make a international and gluten free string
            System.out.println("Are you a vegan?");
            String veganAnswer = user.nextLine();
            if (veganAnswer.equals(yes))
                System.out.println("Here are some vegan options");
            else
                System.out.println("Vegetarian options\n"); //have string print this out at the very end not sure how to do this!

        } else
            System.out.println("Here are some options");
    }
}






//will have the veggie method and call things from the main class
//want to reference the main and have print statement in the main
//will have if else or switch statement
//maybe also an array?