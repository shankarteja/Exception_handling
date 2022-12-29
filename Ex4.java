package ExceptionHandlg_practiceroughf;

public class Ex4 {

	public static void main(String[] args) {
		String str="rama loves sitha ";
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println(e);
		}


	}

}
