package com.company;

import java.util.Scanner;

public class glutenfree
{
    static String yes = "Yes".toLowerCase(); //check to see if made it global do i have to repeat?

    void gf() //gluten free string
    {
        //make the yes/no strings global variables so they are accessible everywhere
        //String no = "no";

        Scanner user = new Scanner(System.in);
        System.out.println("Are you gluten free?");
        String glutenFreeAnswer = user.nextLine();

        if (glutenFreeAnswer.equals(yes)) {
            System.out.println("Gluten free inputs.\n"); //have this print out at the end of questions, is it going to show just gluten free options or gluten free at end+ everyting else
        }else {
            System.out.println("Thank you for your input. Please continue to the next question.\n"); //have this print out at the end somehow, also if not gluten free


        }
    }

}

