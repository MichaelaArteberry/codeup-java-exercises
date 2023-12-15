import java.util.Scanner;
public class MethodsExercises {
    // 1. First part of exercise
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    // 2. Second part of exercise
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("You entered a valid number!");
            return userInput;
        } else {
            System.out.println("Please enter a valid number!");
            return getInteger(min, max);
        }
    }

    // 3. Third part of exercise
    public static int factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter another number between 1 and 10: ");
        int userInput2 = scanner.nextInt();
        int fact =1;
        int i = 0;
        if (i <= userInput2) {
            i++;
            fact = fact * i;
            System.out.println("The factorial of " + userInput2 + " is " + fact);
            return fact;
        } else {
            System.out.println("Please enter a valid number!");
             return factorial();
        }

    }

    // 4. Fourth part of exercise
    public static int diceRoll() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of sides for a pair of dice: ");
        int userInput3 = scanner.nextInt();
        int dice1 = (int) (Math.random() * userInput3) + 1;
        int dice2 = (int) (Math.random() * userInput3) + 1;
        int diceTotal = dice1 + dice2;
        System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of " + diceTotal);
        return diceTotal;
    }

    //Returning the first exercise to the 'console'
    public static void main(String[] args) {
        // 1. First part of exercise
        System.out.println(addition(5, 2));
        System.out.println(subtraction(5, 2));
        System.out.println(multiplication(5, 2));
        System.out.println(division(5, 2));
        System.out.println(modulus(5, 2));

        // 2. Second part of exercise
        System.out.println(getInteger(1, 10));

        // 3. Third part of exercise
        factorial();

        // 4. Fourth part of exercise
        diceRoll();
    }
}
