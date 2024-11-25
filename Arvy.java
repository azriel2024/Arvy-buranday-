import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
       
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

       int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = value;
                value++;
            }
        }

        System.out.println("Generated 2D Array is; ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               
                System.out.print(array[i][j] + " ");
            }
            System.out.println();  
        }

       
        scanner.close();
    }
}