package com.company;

public class Stars {

    public static void main(String[] args) {


        String Figures [][];

        Figures = new String[4][4];

        for(int i = 0; i < Figures.length; i++ ){
            for(int j = 0; j < Figures[i].length; j++){

                Figures[i][j] = "*";
            }

        }

        for(int i = 0; i < Figures.length; i++ ){
            for(int j = 0; j < Figures[i].length; j++){
                System.out.print(Figures[i][j]);
            }

            System.out.println();
        }

        System.out.println();



        for(int i = 0; i < Figures.length; i++ ){
            for(int j = 0; j < i+1; j++){
                System.out.print(Figures[i][j]);
            }

            System.out.println();


        }


        System.out.println();



        for(int i = 0; i < Figures.length; i++ ){
            for(int j = 0; j < Figures[i].length-i-1; j++){
                System.out.print(Figures[i][j]);
            }

            System.out.println();


        }

    }

}
