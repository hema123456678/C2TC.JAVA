package recursion;
import java.util.Scanner;

public class recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int number = 123456,reverse = 0;
		while(number !=0)
		{
			int remainder = number % 10;
			reverse = reverse *10+ remainder;
			number = number/10;
		}
		System.out.println("The reverse of the given number is:" +reverse);
		

	}

}
