import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        int j = 5;
        while (j <= 15) {
            System.out.println(j + " ");
            j++;
        }

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);
//
//        long k = 2;
//        do {
//            System.out.println(k);
//            k *= k;
//        } while (k < 1000000);

        for (int l = 1; l <= 100; l++) {
            if (l % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (l % 5 == 0) {
                System.out.println("Buzz");
            } else if (l % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(l);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to go up to? Enter Here: ");
        int userNum = scanner.nextInt();
        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int m = 1; m <= userNum; m++) {
            System.out.printf("%-7d|%-9d|%-6d%n", m, (m * m), (m * m) * m);
        } System.out.print("Would you like to continue? [Y/N] ");
        String userResponse = scanner.next();
         if (userResponse.equalsIgnoreCase("y")) {
            System.out.print("What is the next number you would like to go up to? Enter Here: "); //Could I have refactored this?
            int userNum2 = scanner.nextInt();
            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int m = 1; m <= userNum2; m++) {
                System.out.printf("%-7d|%-9d|%-6d%n", m, (m * m), (m * m) * m);
            }
        } else {
            System.out.println("Thank goodness, I was getting tired of printing tables.");
        }

         System.out.println("Please enter a numerical grade from 0 to 100: ");
            int userGrade = scanner.nextInt();
            if (userGrade >= 88) {
                System.out.println("Your grade is an A!");
            } else if (userGrade >= 80) {
                System.out.println("Your grade is a B!");
            } else if (userGrade >= 67) {
                System.out.println("Your grade is a C!");
            } else if (userGrade >= 60) {
                System.out.println("Your grade is a D!");
            } else {
                System.out.println("Your grade is an F!");
            }
    }
}
