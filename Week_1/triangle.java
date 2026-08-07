import java.util.Scanner;

public class triangle {

    public static void Area(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("give length");
        int l = input.nextInt();

        System.out.println("give breadth");
        int b = input.nextInt();


        System.out.println("Area is" + (0.5*l*b));
    }
    public static void Perimeter(int s1, int s2, int s3) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("perimeter is" + s1+s2+s3);
    }

    int choice = input.nextInt();

if(choice==1)
{
System.out.println(Perimeter);
}

else
{
System.out.println(Perimeter);
}

}

