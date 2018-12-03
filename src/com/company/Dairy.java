package com.company;

import java.util.Scanner;

public class Dairy {
    static String no="no".toLowerCase();

    void cow() { // foreign/international places to eat on campus

        //make the yes/no strings global variables so they are accessible everywhere

        Scanner user = new Scanner(System.in);
        System.out.println("Can you have dairy?");
        String dairyAnswer = user.nextLine();

        if (dairyAnswer.equals(no)) {
            System.out.println("Here are some food options that do not have dairy in it.\n"); //have this print out at the end of questions
            System.out.println("Thank you for your time.");
        }else{
            System.out.println("Thank you for your time.\n"); //have this print out at the end somehow, also if not gluten free
        }
    }
}