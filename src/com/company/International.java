package com.company;

import java.util.Scanner;

public class International {

    void foreign() { // foreign/international places to eat on campus

        //make the yes/no strings global variables so they are accessible everywhere
        String yes = "yes";
        //String no = "no";

        Scanner user = new Scanner(System.in);
        System.out.println("Do you like foreign food?");
        String internationalAnswer = user.nextLine();

        if (internationalAnswer.equals(yes))  //make a international and gluten free string
            System.out.println("Here are some international food options on campus\n"); //have this print out at the end of questions
        else
            System.out.println("Thank you for your input\n"); //have this print out at the end somehow, also if not gluten free
        //will show non gluten free options
    }
}
