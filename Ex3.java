package ExceptionHandlg_practiceroughf;

public class Ex3 {

	public static void main(String[] args) {

		String name ="15";
		int num1=20;
		int num2=0;
		int num[]=new int [10];

		try {
			int nam=Integer.parseInt(name);
			System.out.println("num :" + name);
			int num3=num1/num2;
			System.out.println(num3);

			System.out.println(name.length());
			System.out.println(num[1]);

		} catch (NullPointerException e) {
			System.out.println(e + "second");
		} catch (ArithmeticException ee) {
			System.out.println(ee + "three");
		} catch(ArrayIndexOutOfBoundsException eee) {
			System.out.println( eee +"three");
		} catch (Exception ex) {
			System.out.println(ex + "first");
		}


	}

}
