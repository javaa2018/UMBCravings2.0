package com.company;
import java.util.Scanner;

public class Veggie {

    static String yes = "Yes".toLowerCase();

    void veggie()
    {
        //make the yes/no strings global variables so they are accessible everywhere

        //String no = "no";

        Scanner user = new Scanner(System.in);
        System.out.println("Are you vegetarian?");
        String vegAnswer = user.nextLine();

        if (vegAnswer.equals(yes))
        {
            System.out.println("Are you a vegan?");
            String veganAnswer = user.nextLine();
            if (veganAnswer.equals(yes))
                System.out.println("Vegan options.\n"); //not sure if we're printing out the vegan options here or at the very end
            else
                System.out.println("Vegetarian options\n"); //have string print this out at the very end

        } else
            System.out.println("Thank you for your input. Please continue to the next question.\n"); //will take user input and show places they can eat
    }
}
