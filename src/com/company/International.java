package com.company;

import java.util.Scanner;

public class International {
    static String yes = "Yes".toLowerCase(); //check to see if made it global do i have to repeat?

    void foreign() { // foreign/international places to eat on campus
    //have private methods in here somewhere
        // String no = "no"; do we need a no here?? i don't think we do

        Scanner user = new Scanner(System.in);
        System.out.println("Do you like foreign food?");
        String internationalAnswer = user.nextLine();

        if (internationalAnswer.equals(yes)) { //use logical operators to create new conditional boolean, also use time for constraints depending on the time
            System.out.println("Thank you for your input. Please continue to the next question.\n"); //have this print out at the end of questions
        }else {
            System.out.println("Thank you for your input. Please continue with the following questions,\n"); //have this print out at the end somehow, also if not gluten free
            //will show non gluten free options
        }
    }
}
