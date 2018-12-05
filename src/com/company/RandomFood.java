package com.company;

import java.util.Scanner;

/*use random from the math class
put all the food options in an array
make it time dependent, so that there is only certain options based on time
*/
public class RandomFood {

    static String yes="Yes".toLowerCase(); //static variable

    void random(){
        //make the yes/ strings global variables so they are accessible everywhere

        Scanner user = new Scanner(System.in);
        System.out.println("Would you like to randomly select a food option for the current meal period?");
        String randomAnswer = user.nextLine();

        //call array foodTable[]or switch statement not sure

        if (randomAnswer.equals(yes)) {
            System.out.println("You should eat at...\n"); //have this print out if they answer yes
            // have something that will terminate the program if they answer yes
            System.exit(0);
        }

        //have it call the food options class into it so it may give them more information on the food option
        else
            System.out.println("No? Then please continue onto the next question.\n"); //will appear if they chose the option no

    }
}
