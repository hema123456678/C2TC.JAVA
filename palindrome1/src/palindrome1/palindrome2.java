package palindrome1;
import java.util.Scanner;

public class palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s1.nextInt();
		int r,sum=0;
		int temp=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("The entered number"+temp+"is a palindrome");
		else
			System.out.println("The entered number"+temp+"is not a palindrome");
	}

}
