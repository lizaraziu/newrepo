package com.company;

public class Movie {


    String name;

    int rating;


    public Movie(String name){

        this.name = name;
    }

void like(){

    rating = rating + 1;
}

void printMovie(){

    System.out.println("The Name is: " + name + " and the raing is: " + rating );
}

}

