package com.company;
import java.util.Scanner;

public class Veggie {

    static String yes = "Yes".toLowerCase();

    void veggie()
    {
        Scanner user = new Scanner(System.in);
        System.out.println("Are you vegetarian?");
        String vegAnswer = user.nextLine();

        if (vegAnswer.equals(yes))
        {
            System.out.println("Are you a vegan?");
            String veganAnswer = user.nextLine();
            if (veganAnswer.equals(yes)) //time constraint variable call here .get(time)?? or another if stmt
                System.out.println("Vegan options->\nWild Greens, Masala, 2mato, Salsaritas, Mondos\n");
            //options->wild greens w/beans or tofu, oil & vinegar for dressing, 2mato veggie pasta, salsaritas veggie taco, burrito, or bowl
            //mondos veggie sandwitch black bean or unlimited toppings, masala
            else
                System.out.println("Vegetarian options->\n Wild Greens, Hissho, 2mato, Mondos, Masala, Starbucks, Au Bon Pain, Einsteins \n"); //have string print this out at the very end
        } else
            System.out.println("Thank you for your input. Please continue to the next question.\n"); //will take user input and show places they can eat
    }
}
