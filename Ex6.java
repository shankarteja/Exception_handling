package ExceptionHandlg_practiceroughf;

import java.time.zone.ZoneOffsetTransitionRule;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		//		Scanner sc=new Scanner(System.in);
		//		System.out.println("enter the first number ");
		//		int a=sc.nextInt();
		//		System.out.println("enter the second number");
		//		int b=sc.nextInt();
		//		int input=0;
		//		try {
		//			input=getresult(a,b);
		//		} catch (ArithmeticException e) {
		//			System.out.println("please enter the proper input ");
		//		}
		//		
		//		System.out.println(input);
		//		
		//	}
		//	public static int getresult(int a,int b) {
		//		if (2==0) {
		//			ArithmeticException ae=new ArithmeticException("number 2 cannot be zero");
		//			throw ae;
		//		}
		//		return a/b;
		//			
		//		}

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		int input=0;

		try {
			input=getresult(a,b);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(input);
	}
	public static int getresult(int a, int b) {
		if (2==0) {
			ArithmeticException ae=new ArithmeticException();
			throw ae;

		}
		return a/b;
	}
}