import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your firstname: ");
        final String firstname = userInput.nextLine();

        System.out.print("Enter your age: ");
        final int age = userInput.nextInt();

        for (int index = 1; index <= age; index++) {
            if (index == 16) continue;
            System.out.println("Happy Birthday " + firstname + ", year " + index);
        }
    }
}
