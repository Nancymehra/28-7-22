import java.util.Scanner;
public class duplicateelements
{

public static void main(String args[])
{
													//creating scanner object named scan
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int size = scan.nextInt();
	
														//creating an array object
	int arr[] = new int[size];
	System.out.println("Enter "+size+" elements :");
	
														//loop for storing user input element in array
	for (int i=0;i<size;i++)
	{
		arr[i] = scan.nextInt();
	}
	System.out.println("RESULT");
	duplicateElement(size,arr); 						//calling duplicateElement method
	scan.close();
}

														//creating a method to find duplicate element
public static void duplicateElement(int size,int arr[])
{	
	int duplicate=0;
														//loop for traversing the array
	for(int i=0;i<size;i++)
	{
		for(int j= i+1;j<size;j++)
		{
																		//to find duplicate element by comparing two elements.
			if(arr[i]==arr[j])
			{
				System.out.println(arr[j]+" is the duplicate element.");
				duplicate++;			
			}
		}
	}
	System.out.println("No of duplicate element : "+duplicate);
}
}