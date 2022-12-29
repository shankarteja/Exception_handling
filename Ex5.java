package ExceptionHandlg_practiceroughf;

public class Ex5 {

	public static void main(String[] args) {
		
		String name="10";
		
		int a=20;
		int b=1;
		int [] num=new int[5];
		
		try {
			int nums=Integer.parseInt(name);
			System.out.println("After conversion :: " +  nums );//* done 
//			
//			int c=a/b;
//			System.out.println(" C = "+ c);//*done
//			
//			System.out.println("length = "+name.length());//*done
//			System.out.println(num[9]);//*
			
		} catch (NullPointerException|ArithmeticException|ArrayIndexOutOfBoundsException ex) {
			System.out.println("client error :" + ex.getMessage());		//*	done
			
		}catch (Exception ex) {
			System.out.println("server error :" + ex.getMessage());//* done 
		}
		
//		finally {
//			int c=10;
//			int d=5;
//			int f=c/d;
//			System.out.println(f);//* print 
//		}
		System.out.println("********************");
		
	}

}
