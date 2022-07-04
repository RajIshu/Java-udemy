package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000 && score > 1000){
            System.out.println("Score is less than 5000 but greater than 1000.");
        }
        else if(score < 1000){
            System.out.println("Score is less than 1000.");
        }
        else {
            System.out.println("You Loose.");
        }


        // Scope
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final Score = " + finalScore);
        }

        // int copyFinalScore = finalScore; // Uncomment it

        // Variable created or declared inside code block can not be used outside the code block.


    // CHALLENGE
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Another Final Score = " + finalScore);
        }

        // Here, we are duplicating the code and that is an issue.
        /* Issues are:
            1. Consuming excess memory.
            2. Increasing number lines in the code.
            3. Readability is decreasing.
            4. Changing things or updating any block of code is very difficult
               and time-consuming.
        */

        // So, the solution is METHODS.
    }
}
