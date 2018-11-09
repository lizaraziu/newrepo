package com.company;

public class Ticket {

 private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;

        if(number % 19 == 0){

            System.out.println("You Won!");

        }else{
            System.out.println("No this time :(");
        }
    }



}

