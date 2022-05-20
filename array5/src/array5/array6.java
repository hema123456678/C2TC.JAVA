package array5;
import java.util.Scanner;

public class array6 {

	public static void main(String[] args) {
		int i,j,size=5, element;
		int[] array = new int[size];
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter 5 elements ");
		for (i=0;i<size;i++)
			array[i] = s1.nextInt();
		
		System.out.println("Enter the element to delete");
		element = s1.nextInt();
		
		for(i=0; i<size; i++)
		{
			if(element==array[i])
			{
				for(j=i; j<(size-1); j++)
					array[j] =array[j+1];
				System.out.println("\ndeleted the element successfully!");
				break;
				
			}
		}
		System.out.println("\n the new array is: ");
		for(i=0; i<(size-1); i++)
			System.out.println(array[i]+" ");

	}

}




	

	


