import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) +1;
        System.out.println("Bet you cant guess the number I'm thinking of between 1 and 100!");
        for (int i = 0; i < 100; i++) {
            int userGuess = scanner.nextInt();
            if (userGuess < randomNumber) {
                System.out.println("HAHAHA WRONG! Guess Higher!!!");
            } else if (userGuess > randomNumber) {
                System.out.println("HAHAHA WRONG! Guess Lower!!!");
            } else {
                System.out.println("AHHH You got me! Good Guess!");
                break;
            }
        }
    }
}
