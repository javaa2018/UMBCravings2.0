package com.company;

import java.util.Scanner;

public class glutenfree
{
    //do i need a main in this?
    void gf() //gluten free string
    {
        //make the yes/no strings global variables so they are accessible everywhere
        String yes = "yes";
        //String no = "no";

        Scanner user = new Scanner(System.in);
        System.out.println("Are you gluten free?");
        String glutenFreeAnswer = user.nextLine();

        if (glutenFreeAnswer.equals(yes))  //make a international and gluten free string
            System.out.println("Here are some gluten free options\n"); //have this print out at the end of questions
        else
            System.out.println("Non-gluten free options\n"); //have this print out at the end somehow, also if not gluten free
        //will show non gluten free options


    }

}

