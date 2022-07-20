package demo1;
 import java.sql.*;

import java.util.Scanner;
public class demo1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		final String url="jdbc:mysql://localhost:3306/c2tc";
		final String user="root";
		final String pwd="HEMAgowda@3107";
		int uid;
		String name;
		int checked;
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Select a function");
		System.out.println("1.list students");
		System.out.println("2.delete student");
		System.out.println("3.update student");
		System.out.println("4.add student");
		int choice=sc.nextInt();
		String query;
		Connection connection=DriverManager.getConnection(url,user,pwd);
		
		
		switch(choice) {
		case 1:System.out.println("The list of students is :");
		query="SELECT * FROM c2tc.b1-6;";
		Statement statement=connection.createStatement();
		ResultSet res=statement.executeQuery(query);
		while(res.next())
		{
			System.out.println(res.getInt(1)+": "+ res.getString(2));
		}
			
			break;
		case 2:System.out.println("Enter the uid of the deleting value");
			uid=sc.nextInt();
			query="DELETE FROM c2tc.b1-6 WHERE uid=?;";
			PreparedStatement ps=connection.prepareStatement(query);
			
			ps.setInt(1, uid);
			int count=ps.executeUpdate();
			System.out.println(count+" row(s) affected");

			break;
		case 3:System.out.println("Enter the uid of the student to be updated");
			uid=sc.nextInt();
			query="UPDATE  SET c2tc.b1-6 uid=? ,name=? , WHERE uid=?;";
			PreparedStatement ps1=connection.prepareStatement(query);
			System.out.println("Enter new uid");
			int uidu=sc.nextInt();
			ps1.setInt(1, uidu);
			System.out.println("Enter new name");
			String nameu=sc.next();
			ps1.setString(2, nameu);
			ps1.setInt(3, uid);
			count=ps1.executeUpdate();
			System.out.println(count+" row(s) affected");

				
			break;
		case 4:
			System.out.println("Enter uid");
			uid=sc.nextInt();
			System.out.println("Enter name");
			name=sc.next();
			System.out.println("Enter 1 for checked or 0 for not checked");
			checked=sc.nextInt();
			query="INSERT INTO details VALUES (?,?,?)";
			PreparedStatement pw=connection.prepareStatement(query);
			pw.setInt(1, uid);
			pw.setString(2, name);
			pw.setInt(3,checked);
		
				
			break;
			default:System.out.println("Please choose valid options");
			
		}
	}

}



	

