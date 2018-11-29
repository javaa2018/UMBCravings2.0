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
        int foodAnswer = user.nextInt();

    //switch statement here that gives certain information on places based on the number the user inputs
    }
}
