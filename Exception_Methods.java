package ExceptionHandlg_practiceroughf;

import java.util.Set;

import javax.management.modelmbean.InvalidTargetObjectTypeException;

public class Exception_Methods {

	public static void main(String[] args) {
		//															ArrayIndexOutOfBoundsException  

//				int  a[] =new int[10];
//				System.out.println(a[5]);
//				System.out.println(a[10]);
//				try {
//					System.out.println(a[20]);
//				} catch (ArrayIndexOutOfBoundsException e) {
//					System.out.println(e);
//				}

		//																NullPointerException
//				String str="durga";
		//		System.out.println(str);
		//		System.out.println(str.length());
//				String str1=null;
//				System.out.println(str1.length());
		//																ClassCastException
//		
//						String str=new String("durga");
//						Object o= (Object)str;
//						System.out.println(o);

//						Object o=new Object();
//						String str=(String)o;
//						System.out.println(str);
		
//						Object o=new String ("king");
//						String str= (String)o; 
//						System.out.println(str);
	
//																		NumberFormatException 
		
//				int i=Integer.parseInt("10");
//				System.out.println(i);
//				int i=Integer.parseInt("ten");
//				System.out.println();

		
		
		
//																		IllegalStateException
//			Thread t=new Thread();
//				t.start();
//				t.start();
		
//																		IllegalArgumentException				
							Thread t=new Thread();
					//		t.setPriority(10);
					//		t.setPriority(11);
						t.setPriority(100);
							System.out.println(t);
		
	}
}