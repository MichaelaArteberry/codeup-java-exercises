import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNum = scanner.nextInt();
        System.out.println("You entered: --> \"" + userNum + "\" <--");

        System.out.print("Enter three words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.println(firstWord + "\n" + secondWord + "\n" + thirdWord);

        System.out.print("Enter a sentence: ");
        scanner.nextLine();
        String userSentence = scanner.nextLine();
        System.out.println(userSentence);

        // Calculate the perimeter and area of game room
        System.out.print("Enter the length of the room: ");
        int length = scanner.nextInt();
        System.out.print("Enter the width of the room: ");
        int width = scanner.nextInt();
        System.out.print("Enter the height of the room: ");
        int height = scanner.nextInt();
        int area = length * width;
        int perimeter = (2 * length) + (2 * width);
        int volume = length * width * height;
        System.out.printf("The area of the room is %d%n", area);
        System.out.printf("The perimeter of the room is %d%n", perimeter);
        System.out.printf("The volume of the room is %d%n", volume);
    }

}
