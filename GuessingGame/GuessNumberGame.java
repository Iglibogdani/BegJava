package com.projects;


import javax.swing.*;

public class GuessNumberGame {
    public static void main(String[] args) {
        int correctNumber = (int) (Math.random()*100 + 1);
        int userAnswer = 0;
        System.out.println("The correct guess would be " + correctNumber);
        int counter = 1;

        while (userAnswer != correctNumber)
        {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, correctNumber, counter));
            counter++;
        }
    }

    public static String determineGuess(int userAnswer, int correctNumber, int counter){
        if (userAnswer <=0 || userAnswer >100) {
            return "Your guess is invalid";
        }
        else if (userAnswer == correctNumber ){
            return "Correct!\nTotal Guesses: " + counter;
        }
        else if (userAnswer > correctNumber) {
            return "Your guess is too high, try again.\nTry Number: " + counter;
        }
        else if (userAnswer < correctNumber) {
            return "Your guess is too low, try again.\nTry Number: " + counter;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + counter;
        }
    }
}