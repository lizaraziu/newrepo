package com.company;

public class MoviesController {



   static void likeRandomly(Movie[] movies, int nrOfLikes) {

       for (int i = 0; i < nrOfLikes; i++) {  //

           int min = 0;// idexul filmului cel mai mic si mai jos mai mare

           int max = movies.length - 1;

           int range = (max - min) + 1;


           range = (int) (Math.random() * range  + min);
           if (movies[range] != null) {

               movies[range].like();

           }

       }
   }

        static void print(Movie[] movies){
            for(int i = 0; i < movies.length; i++) {

                movies[i].printMovie();

            }
       }
    }

