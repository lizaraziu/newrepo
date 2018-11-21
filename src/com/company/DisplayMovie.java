package com.company;

import javafx.scene.transform.MatrixType;

public class DisplayMovie {

    public static void main(String[] args) {

            Movie movie1 = new Movie("The Godfather");
            Movie movie2 = new Movie("Avengers");
            Movie movie3 = new Movie("Shark");
            Movie movie4 = new Movie("Yes Man");
            Movie movie5 = new Movie("Gladiator");

            Movie[] movies = {movie1, movie2, movie3, movie4, movie5};

            MoviesController.likeRandomly(movies, 15);
            MoviesController.print(movies);

        }
    }

