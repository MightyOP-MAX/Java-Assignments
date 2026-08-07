import java.util.Scanner;

public class File_1 { 

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("GIVE LENGTH");
        int l= input.nextInt();

        System.out.println("GIVE BREADTH");
        int b= input.nextInt();

        int a= l*b;

    System.out.println("Area is " + a);

    
    }
}