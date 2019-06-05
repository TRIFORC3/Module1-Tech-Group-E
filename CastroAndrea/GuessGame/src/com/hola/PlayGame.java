package com.hola;

import com.hola.Game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class PlayGame {


    private static int actualTries = 1;
    private static List<Character> addressedWords = new ArrayList<>();




        public static void main(String[] args) throws IOException {
           Game game = new Game();
            int totalTries = 10;
            while (actualTries <= totalTries) {
                char letter;
                boolean matcher;
                letter = game.readCharFromUser();
                //System.out.println(letter);
                addressedWords.add(letter);
                matcher = game.match(addressedWords);
                //System.out.println(matcher);
                game.replaceInputs(game.getMatchedWords());
                game.displayGame(matcher);
            }
            System.out.println("End com.hola.Game...");
        }
}

