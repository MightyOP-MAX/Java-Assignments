import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Year:  ");
        int year = input.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println("This is Leap Year");
        else
            System.out.println("Not a Leap Year");

        input.close();
    }
}
