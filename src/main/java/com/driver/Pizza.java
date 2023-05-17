package com.example.assignment3pizzabilling;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;

    ////////
    public int veg_base_price = 300;
    public int nonveg_base_price = 400;
    public int chese_price = 80 ;
    public static int veg_toppings_price = 70;

    public static int nonveg_toppings_price = 120;

    public int base_price = 0;

    public static int bag_price = 20;

    private boolean opted_extra_chese;
    private boolean opted_extra_toppings;
    private boolean opted_takeaway;

    private int mytopping_price;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.base_price = isVeg ? veg_base_price:nonveg_base_price;
        this.price = isVeg ? veg_base_price:nonveg_base_price;
        this.bill = "";
        this.opted_extra_chese = false;
        this.opted_extra_toppings = false;
        this.opted_takeaway = false;
    }



    public void addExtraCheese(){
        // your code goes here
        if(!opted_extra_chese){
            opted_extra_chese = true;
            this.price += chese_price;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!opted_extra_toppings){
            opted_extra_toppings  = true;
            mytopping_price = isVeg ? veg_toppings_price:nonveg_toppings_price;
            this.price += mytopping_price;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!opted_takeaway){
            opted_takeaway = true;
            this.price += bag_price;
        }
    }

    public int getPrice(){
//        if(opted_extra_chese){
//            this.price += chese_price;
//        }
//        if(opted_extra_toppings){
//            this.price += isVeg ? veg_toppings_price:nonveg_toppings_price;
//        }
//        if(opted_takeaway){
//            this.price += bag_price;
//        }
        return this.price;
    }

    public String getBill(){
        // your code goes here

        bill = "Base Price Of The Pizza: " + this.base_price + "\n";

        if(opted_extra_chese){
            bill = bill + "Extra Cheese Added:  " + this.chese_price + "\n";
        }

        if(opted_extra_toppings){
            bill = bill + "Extra toppings Added:  " + this.mytopping_price + "\n";
        }

        if(opted_takeaway){
            bill  = bill + "Paperbag Added: " + this.bag_price + "\n";
        }

        bill +=  "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
