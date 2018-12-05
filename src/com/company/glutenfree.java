package com.company;

import java.util.Scanner;

public class glutenfree
{
    static String yes = "Yes".toLowerCase(); //do I have to repeat string?

    void gf() //gluten free method, use this for method overloading
    {
        Scanner user = new Scanner(System.in);
        System.out.println("Are you gluten free?");
        String glutenFreeAnswer = user.nextLine();

        if (glutenFreeAnswer.equals(yes)) {
            System.out.println("Gluten free options-> \nWild Greens, Salsaritas, Hissho, Au Bon Pan\n"); //can edit later if need be
        }else {
            System.out.println("Thank you for your input. Please continue to the next question.\n"); //have this print out at the end somehow, also if not gluten free

        }
    }

}

