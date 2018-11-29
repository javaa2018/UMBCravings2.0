/*
Team Error Terror
Gabi, Tanu, Nina
IS 147 Final Project

 */
package com.company;

public class Main
{
    //

    public static void main(String[] args)
    {


        System.out.println("Please answer the following questions yes or no:");
        System.out.println("--------------------------");
        glutenfree glutenfree= new glutenfree(); //ask why it is red
        glutenfree.gf(); //calling method
        Veggie veggie=new Veggie();
        veggie.veggie();

    }

   /*   Below was one attempt will remove later on

   private static void veggie() { //make it public and put it the veggie class, DELETE this later!!
        //make the yes/no strings global variables so they are accessible everywhere
        //so don't have to keep creating string yes and sting no
        String yes = "yes";
        //String no = "no";
        Scanner user = new Scanner(System.in);
        System.out.println("Are you vegetarian?");
        String vegAnswer = user.nextLine();
        if (vegAnswer.equals(yes)) { //make a international and gluten free string
            System.out.println("Are you a vegan?");
            String veganAnswer = user.nextLine();
            if (veganAnswer.equals(yes)) {
                System.out.println("Here are some vegan options");
            } else {
                System.out.println("Vegetarian options\n");
            }
        } else {
            System.out.println("You can eat pretty much anywhere on campus");
        }
    }
    */

    /*private static void gf() //gluten free string, delete this later so it will only be in the gluten free class
    {
        //make the yes/no strings global variables so they are accessible everywhere
        String yes = "yes";
        //String no = "no";
        Scanner user = new Scanner(System.in);
        System.out.println("Are you gluten free");
        String glutenFreeAnswer = user.nextLine();
        if (glutenFreeAnswer.equals(yes)) { //make a international and gluten free string
            System.out.println("Here are some gluten free options");
        } else {
        System.out.println("Non-gluten free options");
        }
}
*/
}
