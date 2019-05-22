import java.util.Scanner;

public class GuessNumber {
    public static void main(String[]args){
        int randonNumber = (int) (Math.random()*100) +1;
        boolean hasWon = false;

        System.out.println("I have randomly chosen between 1 and 100 ");
        System.out.print("Try to guess it. ");

        Scanner scanner = new Scanner(System.in);
        for (int i=10; i>0; i --){
            System.out.print("You have "+i+" guess(es) left. Chose again: ");
            int guess = scanner.nextInt();

            if (randonNumber < guess) {
                System.out.print("It is smaller than "+ guess +",");
            }

            if (randonNumber > guess) {
                System.out.print("It is greater than "+ guess +",");
            }

            if (randonNumber == guess) {
                hasWon = true;
                break;
            }
        }
        if (hasWon){
            System.out.print("CORRECT... YOU WIN!!");
        }
        else {
            System.out.print("GAME OVER... YOU LOSE!!");
            System.out.print("The number was: " + randonNumber);
        }

    }
}
