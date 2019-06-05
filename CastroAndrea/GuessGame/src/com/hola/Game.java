package com.hola;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private static int actualTries = 1;
    private static char[] singleWords;
    private static char[] displayedWord;
    private static List<Character> addressedWords = new ArrayList<>();
    private static List<Character> matchedWords = new ArrayList<>();

    private String movieRow;

    public Game() throws FileNotFoundException {
        ArrayList<String> rows = new ArrayList<>();
        File file = new File("E:\\GuesstheMovie\\src\\movies.txt");
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNext()) {
            String st = fileScanner.nextLine();
            rows.add(st);
        }
        //System.out.println("rows:" + rows);
        movieRow = rows.get(0);
        displayedWord = new char[movieRow.length()];
        //System.out.println("rows:" +movieRow);
    }


    public void replaceInputs(List<Character> addressedWords) {
        String lowerBar = "_";
        String space = " ";
        char[] movieChar = movieRow.toCharArray();
        int m = 0;
        while (m < matchedWords.size()) {
            char letter = addressedWords.get(m);
                        for (int i = 0; i < movieChar.length; i++) {
                if (String.valueOf(letter).toLowerCase().equals(String.valueOf(singleWords[i]).toLowerCase())) {
                    displayedWord[i] = letter;
                    m++;
                    continue;
                } if (String.valueOf(movieChar[i]).equals(" ")) {
                    displayedWord[i] = space.charAt(0);
                } else {
                    displayedWord[i] = lowerBar.charAt(0);
                }
            }
            m++;
        }
    }

    public void displayGame(boolean ifmatch) {
        if (ifmatch) {
            System.out.println("MATCH!!!");
            System.out.println(displayedWord);
            System.out.println(matchedWords);
            System.out.println("Amount of tries: " + actualTries);

        } else {
            System.out.println("Already entered words: " + addressedWords);
            System.out.println("No match. \nAmount of tries: " + actualTries);
            actualTries++;
        }
    }

    public char readCharFromUser() {
        System.out.println("Please enter a word: ");
        Scanner input = new Scanner(System.in);
        String character = input.next();
        return character.charAt(0);
    }

    //Metodo para comparar letra introducida con una palabra del array de palabras
    public boolean match(List<Character> addressedWords) {
        boolean matcher = false;
        singleWords = movieRow.toCharArray();
        int getLast = addressedWords.size();
        char letter = addressedWords.get(getLast - 1);
        if (movieRow.contains(String.valueOf(letter))){
            matchedWords.add(letter);
            matcher = true;
        }
        return matcher;
    }
    public  List<Character> getMatchedWords(){
        return matchedWords;
    }
}
