package com.company;

import java.util.Scanner;

public class Menu
{
    void instructions

    {
        System.out.println("Now that you have answered all the questions and have seen the possible food ");
        System.out.println("options here on campus you probably want some more information on the establishments.");
        System.out.print("--------------------------------------------------------");
        //insert an array here with numbers and restuarants so 2 rows and 12 columns --> remember array index starts at 0

        Scanner user = new Scanner(System.in);
        System.out.println("Please type in the number below that correlates with the chart above to get more information:");
        String foodAnswer = user.nextLine();
        String foodString;
        switch (foodAnswer) {
            case 1:
                foodString = "2mato";
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            default: foodString = "Invalid input";
                break;
        }
                System.out.println(foodString);

    //switch statement here that gives certain information on places based on the number the user inputs
    }
}
