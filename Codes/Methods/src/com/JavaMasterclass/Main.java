package com.JavaMasterclass;

public class Main {

    // main method
    public static void main(String[] args) { // Here, main is a method

        /*
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Final Score = " + finalScore);
        }
        */

        // In Place of above commented code.
        calculateScore(true, 800, 5, 100);
        System.out.println("Final Score = " +
                calculateScoreV2(true, 800, 5, 100));

        /*
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Another Final Score = " + finalScore);
        }
        */

        // In Place of above commented code.
        calculateScore(true, 10000, 8, 200);
        int highScore = calculateScoreV2(true, 10000, 8, 200);
        System.out.println("Another Final Score = " + highScore);


    // NOTE: A void method can also be known as procedure. (A method
    //       returning nothing is known as void method)
    //       A method generally can also be known as Function.

    // CHALLENGE
        int score1 = 1500, score2 = 900, score3 = 400, score4 = 50;

        int position = calculateHighScorePosition(score1);
        displayHighScorePosition("Ramesh", position);

        position = calculateHighScorePosition(score2);
        displayHighScorePosition("Suresh", position);

        displayHighScorePosition("Ganesh", calculateHighScorePosition(score3));

        displayHighScorePosition("Rupesh", calculateHighScorePosition(score4));

    }


    // calculateScore Method
    public static void calculateScore (boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Final Score = " + finalScore);
        }
    }

    // New version of calculateScore Method
    public static int calculateScoreV2 (boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1; // when gameOver = false;

        // NOTE: '-1' is always used to indicate an error when
        // value is not found or an invalid value.
    }

    // Challenge Method - 1
    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " +
                position + " on the high score table.");
    }

    // Challenge Method - 2
    public static int calculateHighScorePosition (int score){
        if (score >= 1000){
            return 1;
        }
        else if (score >= 500 && score < 1000){ // score < 1000 is not needed here. (See the reason below.)
            // After the first 'if' statement the second one does not need to test for <1000 because
            // any value which is not greater than 1000, will ultimately be greater than 500 and lesser than 1000.
            // We don't have to mention < 1000 in 'else if' code block because mentioning score > 500 is
            // ultimately telling that it will only execute when 500 < score < 1000

            return 2;
        }
        else if (score >= 100 && score < 500){
            return 3;
        }
        else{
            return 4;
        }
        // else part can also be removed as if each and every condition fails still method has
        // to return some 'int' value. So, we directly write
        // return 4;

        /*
        // Efficient code for the calculateHighScorePosition method would be:
        if (score >= 1000){
            return 1;
        }
        else if (score >= 500){
            return 2;
        }
        else if (score >= 100){
            return 3;
        }
        return 4;

        */
    }
}
