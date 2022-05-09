package evenodd;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number");
		int number=s1.nextInt();
		if((number&1)==1)
			System.out.println(number+"is odd");
		else
			System.out.println(number+"is even");
		s1.close();

	}

}
