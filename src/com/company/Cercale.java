package com.company;

public class Cercale {


    public double r;

    public Cercale( double r){

        this.r = r;
    }
   double  getPerimetru(){

       return 2*Math.PI*r;
   }

    double getArea() {

        return Math.PI*r*r;



    }
}
