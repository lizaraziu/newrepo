package com.company;

public class OutputController {

    public static void printAreaAndPerimeter(Triangles triangle) {

        System.out.println("Perimetrul triunghiului este:");
        System.out.println(triangle.getPerimetru());

        System.out.println("Aria triunghiului este:");
        System.out.println(triangle.getArea());

    }

    public static void printAreaAndPerimeter(Patrat patrat){

        System.out.println("Perimetrul triunghiului este:");
        System.out.println(patrat.getPerimetru());

        System.out.println("Aria triunghiului este:");
        System.out.println(patrat.getArea());
    }

    public static void printAreaAndPerimeter(Cercale cercale){

        System.out.println("Perimetrul triunghiului este:");
        System.out.println(cercale.getPerimetru());

        System.out.println("Aria triunghiului este:");
        System.out.println(cercale.getArea());
    }

}