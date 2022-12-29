package ExceptionHandlg_practiceroughf;

import java.sql.SQLException;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		System.out.println("enter the main method");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first number");
		int a=sc.nextInt();
		
		System.out.println("enter the second number");
		int b=sc.nextInt();
		int c =0;

		try {
			c=m2(a,b);
		} catch (SQLException e) {
			
			System.out.println(" enter the proper input ");
		}
		System.out.println("input");

	}
	public static int m2(int a, int b) throws SQLException {
		System.out.println("m2 method started");
		int v1=m3(a,b);
		System.out.println("m2 method ended");
		return v1;
	}
	public static int m3(int a, int b) throws SQLException {
		System.out.println("m3 method started");
		int v2=m4(a,b);
		return v2;
	}
	public static int m4(int a,int b) throws SQLException {
		System.out.println("m4 method started");
		if(b==0) {
			SQLException s=new SQLException("Num2 cannot be zero");
			throw s;
		}
		System.out.println("m4 ended");
		return a/b;
	}




}
