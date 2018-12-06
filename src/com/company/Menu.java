package com.company;

//import java.util.Arrays;
import java.util.Scanner;


public class Menu {
    void information() {
        System.out.println("Now that you have answered all the questions and have seen the possible food ");
        System.out.println("options here on campus you probably want some more information on the establishments.");
        System.out.println("--------------------------------------------------------");

        //array w/ numbers corralating w/ places to eat
        String foodTable[] = {"1 - 2mato", "2 - Starbucks", "3 - Chick-fil-a",
                "4 - Hissho", "5 - Wild Greens", "6 - Mondos", "7 - Pollo",
                "8 - Masala", "9 - Salsaritas", "10 - Einsteins", "11 - Au Bon Pain"};


        //loop for displaying the array
        for (int i = 0; i < foodTable.length; i++)
        {
            System.out.println(foodTable[i]);
        }
            Scanner user = new Scanner(System.in);
            System.out.println("Please type in the number below that correlates with the chart above to get more information:"); //also show which one is which 1= what
            int foodAnswer = user.nextInt();

            //switch statement here that gives certain information on places based on the number the user inputs
            switch (foodAnswer) {
                case 1:
                    System.out.println("2mato");
                    System.out.println("This place is located in Commons on Level 1"); //location is being printed in the food class too
                    System.out.println("Open: Monday - Saturday @ 11 am -11pm" + "\n" + "Sunday @ Noon - 8 pm");
                    System.out.println("Food options include:" );
                    System.out.println("2 slices of pizza with a drink" );
                    System.out.println("Calzone, no drink");
                    System.out.println("Make your own Pasta (protein, pasta noodles, and 3 toppings) with drink");
                    break;
                case 2:
                    System.out.println("Starbucks");
                    System.out.println("NOTE!! Starbucks is a breakfast place, however you can order food during all open hours");
                    System.out.println(" "); //space to make things a little neater
                    System.out.println("This place is located in the University Center");
                    System.out.println("Open: Monday - Thursday @ 7:30 am - 10 pm" + ", Friday 7:30 am-10 pm, & Sunday 2 pm-8 pm ");
                    System.out.println("Food options include:");
                    System.out.println("Oatmeal");
                    System.out.println("Croissant with a basic coffee ");
                    System.out.println("Breakfast sandwiches/wraps (spinach, bacon and cheese, ham and cheese");
                    break;
                case 3:
                    System.out.println("Chick-fil-a");
                    System.out.println("NOTE!! Menu is subject to change based on the time of day");
                    System.out.println(" ");//space to make things easier to read
                    System.out.println("This place is located in the University Center");
                    System.out.println("Open: Monday - Thursday @ 7:30 am - 8 pm" + ", Friday 7:30 am - 4 pm");
                    System.out.println("Food options include:");
                    System.out.println("Chick-fil-la sandwiches and side (fries, fruit, or hash browns) with drink");
                    break;
                case 4:
                    System.out.println("Hissho");
                    System.out.println("This place is located in Commons on Level 2");
                    System.out.println("Open: Monday - Thursday @ 11 am -8pm" +", Friday 11 am- 6 pm,  & Sunday 12pm - 6pm" + "\n");
                    System.out.println("Food options include:" );
                    System.out.println("Sushi");
                    System.out.println("Fried, brown or white rice w/ non-tempura chicken, veggies or tofu");
                    System.out.println("If you want a drink with that...");
                    double HisshoM=6.10; //hissho meal deal
                    double flex = 6.10 + 2; //hissho meal & drink
                    if(flex>HisshoM || flex<HisshoM) //logical operator
                    {
                        System.out.println("\nThe meal above will go over into your flex dollars and make your total " + flex + " which is 2 dollars above the meal plan cost" );
                    }

                    break;
                case 5:
                    System.out.println("Wild Greens");
                    System.out.println("This place is located in Commons on Level 1");
                    System.out.println("Open: Monday - Thursday @ 11am -7pm" + " & Friday 11am - 4pm" + "\n");
                    System.out.println("Food options include:" );
                    System.out.println("Romaine or quinoa" );
                    System.out.println("4 toppings");
                    System.out.println("Chicken, tofu, beans, or tuna salad");
                    System.out.println("Choice of dressing");
                    System.out.println("Choice of pita bread or croutons");
                    break;
                case 6:
                    System.out.println("Mondos");
                    System.out.println("This place is located in Commons on Level 2");
                    System.out.println("Open: Monday - Thursday @ 11am -8pm" + " & Friday 11am - 6pm"+ "\n");
                    System.out.println("Food options include:" );
                    System.out.println("Choice of bread- white, cheese, wheat, oat or flatbread");
                    System.out.println("Choice of protein meat or tuna");
                    System.out.println("Unlimited veggie toppings");
                    System.out.println("Choice of sauce lik mayo, ranch, etc");
                    System.out.println("Choice of chips or fruit");

                    break;
                case 7:
                    System.out.println("Pollo");
                    System.out.println("This place is located in Commons on Level 1");
                    System.out.println("Open: Monday - Thursday @ 11am - 8pm & Friday 11am - 6pm"+ "\n");
                    System.out.println("Food options include:" );
                    System.out.println("4 piece tenders w/ spiked fries or whole fruit");
                    System.out.println("Chicken and waffles no side");
                    System.out.println("Drink [Bottle water/ fountain beverage]");

                    break;
                case 8:
                    System.out.println("Masala");
                    System.out.println("This place is located in Commons on Level 1");
                    System.out.println("Open: Monday - Thursday @ 11am - 7pm & Friday 11am - 2pm" + "\n");
                    System.out.println("Food options include:" );
                    System.out.println("Medium bowl with chicken or veggies and sauce of the day" );
                    System.out.println("Naanwich");
                    System.out.println("5 samosas & chutney");
                    System.out.println("Drink [Bottle water/ fountain beverage]");

                    break;
                case 9:
                    System.out.println("Salsaritas");
                    System.out.println("This place is located in Commons on Level 2");
                    System.out.println("Open: Monday - Thursday @ 11 am -8 pm & Friday 11am - 7pm ");
                    System.out.println("Food options include:" );
                    System.out.println("Two tacos with protein(pork,beef,chicken) or veggie\n" );
                    System.out.println("Quesadilla with protein or veggie\n");
                    System.out.println("Burrito Bowl with protein or veggie\n");
                    System.out.println("Burrito w/protein or veggie");
                    System.out.println("Side of chips or fruit");
                    System.out.println("Drink [Bottle water/ fountain beverage]");

                    break;
                case 10:
                    System.out.println("Einsteins");
                    System.out.println("This place is located in the Library Entrance");
                    System.out.println("Open: Monday - Thursday @ 7:30am - 10pm, Friday 7:30pm - 3pm, Saturday 12pm - 4pm, Sunday 1pm - 8pm" + "\n");
                    System.out.println("Food options include:" );
                    System.out.println("2 bagels with schmear with coffee/tea" );
                    System.out.println("Breakfast egg sandwiches");
                    System.out.println("Crispy chicken sandwich[lunch]");
                    break;
                case 11:
                    System.out.println("Au Bon Pain");
                    System.out.println("This place is located in Commons on Level 1");
                    System.out.println("Open: Monday - Thursday @ 7:30 am - 10pm" + ", Friday 7:30 am - 3pm, Saturday 12pm - 4pm, Sunday 1 - 8pm" + "\n");
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

