package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to the Guessing Number Game...!");

//       Computer has generated a random value between 1 and 100
        int computerInput = (int)(Math.random()*100);

        System.out.println("Rules and Conditions:");
        System.out.println("1. You have only 11 attempts to guess the number.");
        System.out.println("2. You will get 100 points, if you guess the number in the first attempt itself.");
        System.out.println("3. From the second attempt onwards, the score will be deducted by 10 points for each subsequent attempt.");
        System.out.println("\nNow, Lets start the game.");

        int attempts = 11;
        int score = 0;

//       User input
        System.out.println("Guess the number between 1 and 100: ");
        int userInput;

        while((userInput = sc.nextInt())!=computerInput && attempts>1){

           if(userInput>0 && userInput<100){

               if(userInput < computerInput){
                   System.out.println("The number is less than the random number.");
               }else{
                   System.out.println("The number is greater than the random number.");
               }
           }else{
               System.out.println("Oops...!\nGuess the number between 1 and 100.");
           }

            attempts--;
            System.out.println("Remaining attempts: " + attempts);

        }

        if(attempts>1){
            System.out.println("\nHurrah! You have won the Game!!!");
        }else{
            System.out.println("\nOops..!\nYou have no remaining attempts.\nYou lost the game...!\nBetter luck next time!");
        }

        System.out.println("Total attempts: " + (11-attempts));

        score = attempts*10;
        System.out.println("Score: " + score );

        System.out.println("\nThanks for playing the guessing number game.");
    }
}
