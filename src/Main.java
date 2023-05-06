import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        Random rand = new Random();
        int randNumber = rand.nextInt(100 +1);
        while(true){
            try {
                System.out.println("Pick a number between 1-100!");
                int guessNumber = Integer.parseInt(newScan.next());
                if (guessNumber < randNumber) {
                    System.out.println("Go higher!");
                } else if (guessNumber > randNumber) {
                    System.out.println("Go lower!");
                } else {
                    System.out.println("You win!");
                    System.out.println("Play again? y/n");
                    String answer = newScan.next();
                    if (answer.equals("n")) {
                        break;
                    }
                }
            } catch(NumberFormatException nfe){
                System.out.println("Invalid input. Please try again.");
            }
        }
        newScan.close();
    }
}