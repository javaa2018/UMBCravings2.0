package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    void information() {
        System.out.println("Now that you have answered all the questions and have seen the possible food ");
        System.out.println("options here on campus you probably want some more information on the establishments.");
        System.out.println("--------------------------------------------------------");

        //insert an array here with numbers and restuarants so 2 rows and 12 columns --> remember array index starts at 0
        String foodTable[] = {"1 - 2mato", "2 - Starbucks", "3 - Chick Fil La",
                "4 - Hissho", "5 - Wild Greens", "6 - Mondos", "7 - Pollo",
                "8 - Masala", "9 - Salsaritas", "10 - Einsteins", "11 - Au Bon Pain"};


        //loop for displaying the array
        for (int i = 0; i < foodTable.length; i++){
            System.out.println(foodTable[i]);
    }


            Scanner user = new Scanner(System.in);
            System.out.println("Please type in the number below that correlates with the chart above to get more information:"); //also show which one is which 1= what
            int foodAnswer = user.nextInt();


            String foodString;

            //switch statement here that gives certain information on places based on the number the user inputs
            switch (foodAnswer) {
                case 1:
                    foodString = "2mato";
                    //insert the meal plan options
                    break;
                case 2:
                    foodString = "Starbucks";
                    //insert meal options and other details like times
                    break;
                case 3:
                    foodString = "Chick-fil-a";
                    //insert meal options
                    break;
                case 4:
                    foodString = "Hissho";
                    //meal plan and times
                    break;
                case 5:
                    foodString = "Wild Greens";
                    //meal plan and times
                    break;
                case 6:
                    foodString = "Mondos";
                    //meal plan and times
                    break;
                case 7:
                    foodString = "Pollo";
                    //meal plan and times
                    break;
                case 8:
                    foodString = "Masala";
                    //meal plan and times
                    break;
                case 9:
                    foodString = "Salsaritas";
                    //meal plan and times
                    break;
                case 10:
                    foodString = "Einsteins";
                    //meal plan and times
                    break;
                case 11:
                    foodString = "Au Bon Pain";
                    //meal plan and times
                    break;
                default:
                    foodString = "Invalid input";
                    break;
            }
            System.out.println(foodString);

        }

    }

