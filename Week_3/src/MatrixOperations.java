import java.util.Scanner;
public class MatrixOperations {

static int[] rowSums(int[][] Arr) {
    int[] sums = new int[Arr.length];
    
    for (int i = 0; i < Arr.length; i++) 
{
    for (int j = 0; j < Arr[i].length; j++) {
        sums[i] += Arr[i][j];
    }
}
        return sums;
    }

static int[] columnSums(int[][] Arr){
    int[] sums = new int[Arr.length];
    int columns = Arr[0].length;
    for (int i = 0; i < Arr.length; i++) 
{
    for (int j = 0; j < columns; j++) {
        sums[j] += Arr[i][j];
    }
}
        return sums;
}

static int[][] add(int[][] first, int[][] second){
int rows = first.length;
int columns = first[0].length;
int[][] result= new int[rows][columns];
for(int i = 0; i < rows; i++)
{
    for(int j = 0; j < columns;j++)
    {
     result[i][j]=first[i][j]+ second[i][j];
    }
}
    return result;
}

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter Number of Rows:");
        int rows = input.nextInt();
        
        System.out.println("Enter Number of Columns:");
        int cols = input.nextInt();
        
        int[][] arr = new int[rows][cols];
        
        System.out.println("Enter Elements of Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = input.nextInt();
            }
        }
 input.close();
}
}