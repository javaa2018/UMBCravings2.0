package com.company;

import java.util.Scanner;

public class Menu
{
    void information()

    {
        System.out.println("Now that you have answered all the questions and have seen the possible food ");
        System.out.println("options here on campus you probably want some more information on the establishments.");
        System.out.print("--------------------------------------------------------");
        //insert an array here with numbers and restuarants so 2 rows and 12 columns --> remember array index starts at 0

        Scanner user = new Scanner(System.in);
        System.out.println("Please type in the number below that correlates with the chart above to get more information:"); //also show which one is which 1= what
        int foodAnswer = user.nextInt();

        String foodString;

        //switch statement here that gives certain information on places based on the number the user inputs
        switch (foodAnswer) {
            case 1: foodString = "2mato";
            //insert the meal plan options
                break;
            case 2: foodString = "Starbucks";
            //insert meal options and other details like times
                break;
            case 3: foodString = "Chick-fil-la";
            //insert meal options
                break;
            case 4: foodString = "Hisho";
            //meal plan and times
                break;
            case 5: foodString = "Wild Greens";
                //meal plan and times
                break;
            case 6: foodString = "Mondo";
                //meal plan and times
                break;
            case 7: foodString = "Pollo";
                //meal plan and times
                break;
            case 8: foodString = "Masala";
                //meal plan and times
                break;
            case 9: foodString = "Salsaritas";
                //meal plan and times
                break;
            case 10: foodString = "Einsteins";
                //meal plan and times
                break;
            case 11: foodString = "Au Bon Pain";
                //meal plan and times
                break;
            default: foodString = "Invalid input";
                break;
        }
                System.out.println(foodString);


    }
}
