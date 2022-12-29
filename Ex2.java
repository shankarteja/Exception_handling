package ExceptionHandlg_practiceroughf;

import java.util.Scanner;

import javax.swing.SpinnerNumberModel;

public class Ex2 {

	public static void main(String[] args) {
		//		Scanner sc=new Scanner(System.in);
		//		System.out.println("enter the number 1");
		//		int num1=sc.nextInt();
		//		System.out.println("enter the number 2");
		//		int num2=sc.nextInt();
		//	
		//		int num3=num1/num2;
		//		System.out.println(num3);

//				Scanner sc=new Scanner(System.in);
//				System.out.println("enter the number1"); 
//				int num1=sc.nextInt();
//				System.out.println("enter the number2");
//				int num2=sc.nextInt();
//				int num3=num1/num2;
//				System.out.println(num3);
				
//				by using try @ catch method
				
//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter the age");
//		String str=sc.next();
//		int age=0;
//		try {
//			age=Integer.parseInt(str);
//		} catch (NumberFormatException e) {
//			System.out.println("bad input:" + e );
//		}
//		System.out.println("age = " + age );		
						
				
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the number");
				int a=sc.nextInt();
				System.out.println("enter the second number");
				int b=sc.nextInt();
				
				int c=0;
				try {
					c =a/b;
				} catch (ArithmeticException e) {
					System.out.println("bad input =" + e);
				}
				System.out.println(c);
				

	}

}
