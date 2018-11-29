package com.company;

import java.util.Scanner;

/*use random from the math class
put all the food options in an array
make it time dependent, so that there is only certain options based on time
*/
public class RandomFood {
    void random(){
        //make the yes/no strings global variables so they are accessible everywhere
        String yes = "yes".toLowerCase();
        //String no = "no";
        Scanner user = new Scanner(System.in);
        System.out.println("Would you like to randomly select a food option for the current meal period?");
        String randomAnswer = user.nextLine();

        //insert an array here for the random food selection option

        if (randomAnswer.equals(yes))  //if the user choose yes
            System.out.println("You should eat at...\n"); //have this print out if they answer yes

            //have something that will terminate the program if they answer yes
        //have it call the food options class into it so it may give them more information on the food option
        else
            System.out.println("No? Then please continue onto the next question.\n"); //will appear if they chose the option no

    }
}
