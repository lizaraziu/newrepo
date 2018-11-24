package com.company;

import java.util.Scanner;

public class InputController {
    public static Triangles createTriangle() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter triangle ");

        System.out.print("Enter side1: ");
        double side1 = scaner.nextDouble();

        System.out.print("Enter side2: ");
        double side2 = scaner.nextDouble();

        System.out.print("Enter side3: ");
        double side3 = scaner.nextDouble();

        return new Triangles(side1, side2, side3);

    }

    public static Patrat creatPatrat(){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter square ");

        System.out.println("Enter side: ");
        double side = scaner.nextDouble();
        return new Patrat(side);
    }

    public static Cercale creatCercale(){

        Scanner c = new Scanner(System.in);
        System.out.println("Enter cercale ");

        System.out.println("Enter raza ");

        double r = c.nextDouble();

        return new Cercale(r);
    }
}
