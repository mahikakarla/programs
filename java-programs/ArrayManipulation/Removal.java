import java.util.*;

public class Removal{

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
	
	//Removing an element from existing array
	System.out.println("Enter element to be removed from this array: ");
	int element = scanner.nextInt();
	int index = -1;

	//Finding array elements
	for (int i = 0; i < arr.length && index == -1; i++)
	{
		if (element == arr[i]) {
			index = i;
		}
		System.out.println("Array element " +i+ " is: " +arr[i]);
	}

	for(int i = index ; i < arr.length-1 ; i++)
	{
		arr[i] = arr[i+1];
	}
	//Printing array elements
	System.out.println("Array after removing the specified element is: " +Arrays.toString(arr));
	scanner.close();
}
}
