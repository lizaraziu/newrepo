package com.company;

public class Triangles {

        public double side1;
        public double side2;
        public double side3;


        public Triangles(double side1, double side2, double side3){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;

        }

        void print (){
            System.out.println("Triangle");
            System.out.println(side1 + ", " + side2 + ", " + side3);
        }

        double getPerimetru(){
            return (side1 + side2 + side3);
        }

        public double getArea() {
            double p = getPerimetru()/ 2;
            double area = Math.sqrt(p*(p-side1) * (p-side2) * (p-side3));

            return area;
        }
    }