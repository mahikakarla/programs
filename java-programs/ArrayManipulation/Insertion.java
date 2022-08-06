import java.util.Scanner;

public class Insertion{

public static void main(String [] args)
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter size of the array: ");
	int size = scanner.nextInt();
	int arr [] = new int [size+1];

	//Asking User to input elements into array
	System.out.println("Enter " +size+ " elements in the array: ");
	for (int i = 0; i < size; i++)
	{
		arr[i] = scanner.nextInt();
	}

	//Printing array elements
	for (int i = 0; i < size; i++)
	{
		System.out.println("Array element " +i+ " is: " +arr[i]);
	}
	
	//Inserting an element into existing array
	System.out.println("Enter position for additional element into this array: ");
	int position = scanner.nextInt();

	for(int i = (size-1); i >= position ; i--)
	{
		arr[i+1] = arr[i];
	}
	System.out.println("Enter additional element into this array: ");
	arr[position] = scanner.nextInt();

		//Printing array elements
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("Array element " +i+ " is: " +arr[i]);
		}		
	scanner.close();
}
}
