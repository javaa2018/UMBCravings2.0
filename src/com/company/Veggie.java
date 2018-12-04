package com.company;
import java.util.Scanner;

public class Veggie {

    static String yes = "Yes".toLowerCase();

    void veggie()
    {
        //make the yes/no strings global variables so they are accessible everywhere

        //String no = "no";

        Scanner user = new Scanner(System.in);
        System.out.println("Are you vegetarian?");
        String vegAnswer = user.nextLine();

        if (vegAnswer.equals(yes))
        {
            System.out.println("Are you a vegan?");
            String veganAnswer = user.nextLine();
            if (veganAnswer.equals(yes)) //time constraint variable call here .get(time)?? or another if stmt
                System.out.println("Vegan options.\n");
            //options->wild greens w/beans or tofu, oil & vinegar for dressing, 2mato veggie pasta, salsaritas veggie taco, burrito, or bowl
            //mondos veggie sandwitch black bean or unlimited toppings, masala
            else
                System.out.println("Vegetarian options\n"); //have string print this out at the very end
                //wildgreens w/beans or tofu, hissho sushi(imitation crab or avacado)or tofu option, 2mato (veggie pasta, veggie pizza, cheese calzone)
                //mondos, masala
        } else
            System.out.println("Thank you for your input. Please continue to the next question.\n"); //will take user input and show places they can eat
    }
}
