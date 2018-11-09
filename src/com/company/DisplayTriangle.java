package com.company;

public class DisplayTriangle {

    public static void main(String[] args) {
        Triangles triangle = InputController.createTriangle();

        OutputController.printAreaAndPerimeter(triangle);

        Patrat patrat = InputController.creatPatrat();
        OutputController.printAreaAndPerimeter(patrat);

        Cercale circle = InputController.creatCercale();
        OutputController.printAreaAndPerimeter(circle);



    }
}
