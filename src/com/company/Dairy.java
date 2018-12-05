package com.company;

import java.util.Scanner;

public class Dairy {
    static String no="no".toLowerCase();

    void cow() { // foreign/international places to eat on campus

        Scanner user = new Scanner(System.in);
        System.out.println("Can you have dairy?");
        String dairyAnswer = user.nextLine();

        if (dairyAnswer.equals(no)) { //in here have statment that will only show what's open at 11
            System.out.println("Lactose free option -> \nHissho, Mondos, Pollo, Wild Greens, Salsaritas, Chickfila, 2mato, Starbucks .\n");
        }else{
            System.out.println("Thank you for your time.\n"); //have this print out at the end somehow, also if not gluten free
        }
    }
}