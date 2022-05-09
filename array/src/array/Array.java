package array;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int n,sum = 0;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter number of elements you want in array:");
		n=s1.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the elements of array:");
		for(int i = 0;i < n; i++)
		{ 
			
			a[i]=s1.nextInt();
			sum = sum +a[i];
		}
		System.out.println("Sum:"+sum);
	}
		
		

	}


