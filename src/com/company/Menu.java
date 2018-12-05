package com.company;

//import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    void information() {
        System.out.println("Now that you have answered all the questions and have seen the possible food ");
        System.out.println("options here on campus you probably want some more information on the establishments.");
        System.out.println("--------------------------------------------------------");

        //array w/ numbers corralating w/ places to eat
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

            //switch statement here that gives certain information on places based on the number the user inputs
            switch (foodAnswer) {
                case 1:
                    System.out.println("2mato");
                    //insert meal options and other details like times
                    System.out.println("This place is located in Commons on Level 1");
                    System.out.println("Open: Monday - Saturday @ 11 am -11pm" + "\n" + "Sunday @ Noon - 8 pm");
                    System.out.println("Food options include:" );
                    System.out.println("2 slices of pizza with a drink" );
                    System.out.println("Calzone, no drink");
                    System.out.println("Make your own Pasta (protein, pasta noddles, and 3 toppings) with drink");
                    break;
                case 2:
                    System.out.println("Starbucks");

                    //insert meal options and other details like times
                    System.out.println("NOTE!! Starbucks is a breakfast place, however you can order food during all open hours");
                    System.out.println(" "); //space to make things a little neater
                    System.out.println("This place is located in the University Center");
                    System.out.println("Open: Monday - Saturday @ 7:30 am - 10 pm");
                    System.out.println("Food options include:");
                    System.out.println("Oatmeal");
                    System.out.println("Croissant with a basic coffee ");
                    System.out.println("Breakfast sandwiches/wraps (spinach, bacon and cheese, ham and cheese");
                    break;
                case 3:
                    System.out.println("Chick-fil-a");
                    //insert meal options
                    System.out.println("NOTE!! Menu is subject to change based on the time of day");
                    System.out.println(" ");//space to make things easier to read
                    System.out.println("This place is located in the University Center");
                    System.out.println("Open: Monday - Saturday @ 7:30 am - 8 pm");
                    System.out.println("Food options include:");
                    System.out.println("Chick-fil-la sandwiches and side (fries, fruit, or hash browns) with drink");
                    break;
                case 4:
                    System.out.println("Hissho");
                    //meal plan and times
                    System.out.println("This place is located in Commons on Level 2");
                    System.out.println("Open: Monday - Saturday @ 11 am -8pm" + "\n");
                    System.out.println("Food options include:" );
                    System.out.println("" );
                    System.out.println("");
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Wild Greens");
                    //meal plan and times
                    System.out.println("This place is located in Commons on Level 1");
                    System.out.println("Open: Monday - Saturday @ 11 am -7pm" + "\n");
                    System.out.println("Food options include:" );
                    System.out.println("" );
                    System.out.println("");
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Mondos");
                    //meal plan and times
                    System.out.println("This place is located in Commons on Level 2");
                    System.out.println("Open: Monday - Saturday @ 11 am -8pm" + "\n");
                    System.out.println("Food options include:" );
                    System.out.println("" );
                    System.out.println("");
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Pollo");
                    //meal plan and times
                    System.out.println("This place is located in Commons on Level 1");
                    System.out.println("Open: Monday - Saturday @ 11 am -8pm" + "\n");
                    System.out.println("Food options include:" );
                    System.out.println("" );
                    System.out.println("");
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("Masala");
                    //meal plan and times
                    System.out.println("This place is located in Commons on Level 1");
                    System.out.println("Open: Monday - Saturday @ 11 am -7pm" + "\n");
                    System.out.println("Food options include:" );
                    System.out.println("" );
                    System.out.println("");
                    System.out.println("");
                    break;
                case 9:
                    System.out.println("Salsaritas");
                    //meal plan and times
                    System.out.println("This place is located in Commons on Level 2");
                    System.out.println("Open: Monday - Saturday @ 11 am -8pm" + "\n" + "Sunday");
                    System.out.println("Food options include:" );
                    System.out.println("" );
                    System.out.println("");
                    System.out.println("");
                    break;
                case 10:
                    System.out.println("Einsteins");
                    //meal plan and times
                    System.out.println("This place is located in the Library Entrance");
                    System.out.println("Open: Monday - Saturday @ 7:30 am -10pm" + "\n");
                    System.out.println("Food options include:" );
                    System.out.println("" );
                    System.out.println("");
                    System.out.println("");
                    break;
                case 11:
                    System.out.println("Au Bon Pain");
                    //meal plan and times
                    System.out.println("This place is located in Commons on Level 1");
                    System.out.println("Open: Monday - Saturday @ 7:30 am -6pm" + "\n");
                    System.out.println("Food options include:" );
                    System.out.println("" );
                    System.out.println("");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }


        }

    }

