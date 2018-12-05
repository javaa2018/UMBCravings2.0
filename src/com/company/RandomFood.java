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
            String[] names = { "2mato", "Starbucks", "Chick Fil La", "Hissho", "Wild Greens", "Mondos",
                    "Pollo", "Masala", "Salsaritas", "Einsteins", "Au Bon Pain"};
            String name = names[(int) (Math.random() * names.length)];
            System.out.println("You should eat at " + name + "\n"); //have this print out if they answer yes
            //menu class --> only if they answer yes because they still need to pull the information
            Menu menu = new Menu();
            menu.information();

            //object created subclass --> if they answer yes the program takes on a different route but this information still needs to be presented
            Subclass s = new Subclass("umbcrd@umbc.edu"); //subclass for nutritionists info to contact, can be moved somewhere else but should be near the end before the thank you
            s.getEmail(); //method passing argument by value

            // have something that will terminate the program if they answer yes
            System.exit(0);
        }

        //have it call the food options class into it so it may give them more information on the food option
        else
            System.out.println("No? Then please continue onto the next question.\n"); //will appear if they chose the option no

    }
}
