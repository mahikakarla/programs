import java.util.Scanner;

public class TwoDimensionalScanner {
    
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input row-count of the multi-dimensional array: " );
        int rows = scanner.nextInt();
        System.out.println("Input column-count of the multi-dimensional array: " );
        int columns = scanner.nextInt();
        //Array declaration
        int [][] array = new int [rows][columns];

        //Inserting elements
        System.out.println("Enter " +rows*columns+ " elements: ");
        for(int i = 0 ; i < rows ; i++)
            for(int j=0; j<columns ; j++)
            {
                array[i][j]=scanner.nextInt();
            }

        //Printing elements
        for(int i = 0 ; i < rows ; i++)
        {
            System.out.println("\nArray:  "+(i+1));
            for(int j=0; j<columns ; j++)
            {
                System.out.println("Element:  " +array[i][j]);
            }
        }

        scanner.close();
    }
}
