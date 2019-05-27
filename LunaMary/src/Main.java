import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Word word = new Word();
        word.setWords("casa", "hogar", "computadora");
        String palabra = word.select_word();
        word.printWord(palabra);
        word.jugar();


    }
}
