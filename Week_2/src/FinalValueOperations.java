import java.util.Scanner;

public class FinalValueOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = 0;

        System.out.print("Enter number of operations: ");
        int numberOfOperations = input.nextInt();

        for (int i = 1; i <= numberOfOperations; i++) {
            System.out.print("Enter operation " + i + ": ");
            String operation = input.next();

            if (operation.contains("+")) {
                x++;
            } else {
                x--;
            }
        }
        System.out.println("Final value of X = " + x);
        input.close();
    }
}