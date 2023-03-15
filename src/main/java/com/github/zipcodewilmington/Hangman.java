package com.github.zipcodewilmington;

import java.util.Scanner;
import java.util.Random;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
//Jacob Ciaffi
public class Hangman {
    static Scanner scanner = new Scanner(System.in);
    private String word = wordToGuess();

    static String wordToGuess() {
        String newGuess = "";
        String[] wordOptions = {"zip", "pump", "elbow", "bubble"};
        Random rand = new Random();
        int int_rand = rand.nextInt(wordOptions.length - 1);
        newGuess = wordOptions[int_rand];

        return newGuess;
    }
    static String Main(){
        String userInput = scanner.nextLine();
        return  userInput;
    }
}
