package com.company;

/*
*method overloading in here for gluten free places!!
*/


public class Food {
    //put default phone number, why is it in grey is it becuase of phone number?
    private String address; //have default location, is this how to change address changed to string
    private String restaurantName; //modifier
    private String phoneNumber;

    public Food(String restaurantName, String phone, String address)//added string to restaurant name and fixed red for phone
    {  //constructor w/ no return type same name as class
        //calls program in another file
        this.address = address;
        this.phoneNumber = phone;
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phoneNumber; //return statement
    }

    public void setPhone(String value) {
        phoneNumber = value;
    }


    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }


    public void printFood()  //data encapsulation
    //will print the default place to eat for the diet class or constructor overload
    {
        System.out.println("Place name: " + restaurantName + "\t"+ "Address: " + address +"\t"+ "Phone number: " + phoneNumber); //will print out the address restuarnat name and phone number
        System.out.println();
    }
}










