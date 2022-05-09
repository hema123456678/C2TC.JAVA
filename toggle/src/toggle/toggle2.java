package toggle;
import java.util.Scanner;


public class toggle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s2 = new Scanner(System.in);
		System.out .println("Enter a String:");
		String s = s2.nextLine();
		String s1 = "";
		for(int i = 0; i < s.length(); i++)
		{
			if (Character.isUpperCase(s.charAt(i)))
				s1=s1+Character.toLowerCase(s.charAt(i));
			else
				s1=s1+Character.toUpperCase(s.charAt(i));
				
		}
		System.out.println("Toggle String is :"+s1);
		
	}

}
