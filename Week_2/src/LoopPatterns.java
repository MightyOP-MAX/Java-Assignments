import java.util.Scanner;

public class LoopPatterns {

    static void patternA(int size) {

        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternC(int size) {

        for (int row = 1; row <= size; row++) {
            for (int number = 1; number <= row; number++) {
                System.out.print(number + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = input.nextInt();

        if (size < 1) {
            System.out.println("Invalid size.");
            return;
        }
        System.out.println("\nPattern A:");
        patternA(size);

        System.out.println("\nPattern C:");
        patternC(size);

        input.close();
    }
}