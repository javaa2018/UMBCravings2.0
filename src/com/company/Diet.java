package com.company;

public class Diet {
    /*
    //data atribute of employees
    private String phoneNumber; //put default phone number, why is it in grey is it becuase of phone number?
    private Address address; //have default location, something is wrong with address
    private String restaurantName; // restuarant name

    public Diet(String phoneNumber, Address address, restaurantName) {  //constructor w/ no return type same name as class
        phoneNumber = phone;
        //calls program in another file
        this.address = address; //not sure if we are going to put actual address or where it is in commons? Will fill out later
        this.phoneNumber = phoneNumber;
        this.restaurantName = restaurantName;
    }

    public Address getAddress() {
        return phoneNumber;
    }

    public void setAddress(Address address) { //do i have to set address for all of them becuase they are different mightjjust do method overloading
        this.address = address;
    }

    public String getPhone() { //name different?
        return phoneNumber;
    }

    public void setPhone(String value) {
        phoneNumber = value;
    }


    public String getrestaurantName() {
        return restaurantName; //why is the value wrong
    }

    public void setRestaurantName(String value) {
        phoneNumber = value;
    }
}

    public void printDiet() //will print the default place to eat for the diet class or cosntructor overload
    {
        System.out.println(address+restaurantName+phoneNumber); //will print out the address restuarnat name and phone number
        System.out.println();
    }
  */
    /* put this in separate
    public class Address {
        private String houseNumber;
        private String address1;
        private String address2;
        private String city;
        private String state;
        private String zipcode;

        public Address(String houseNum, String address1, String address2,
                       String city, String state, String zip)
        {
            houseNumber = houseNum;
            this.address1 = address1;
            this.address2 = address2;
            this.city = city;
            this.state = state;
            this.zipcode = zip;
        }
        public Address(String houseNum, String address1,
                       String city, String state, String zip)
        {
            houseNumber = houseNum;
            this.address1 = address1;
            this.address2 = "";
            this.city = city;
            this.state = state;
            this.zipcode = zip;
        }

    }

    //have method overloading down here

    //set the time and date
    //don't pull actual date
    //have one default location for the constructor
    //overload with all the different places
    //look at birthday class for this in github!

    //have location, zip..things to do with address and create a bunch of objects based on a certain class
    //call the method through the loop
    //maybe have a while loop
    // employee.java file encapsulation

