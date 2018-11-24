package com.company;

public class Ticket {

 private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


       public boolean isLucky(){
        return (number % 19 ) == 0;


    }
}




