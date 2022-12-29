package ExceptionHandlg_practiceroughf;

import java.util.Scanner;

public class CollegeStudentRegistr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the age");
		int age=sc.nextInt();
		System.out.println("enter the collage name");
		String college=sc.next(); 
		System.out.println("enter the userdatatype");
		String usertype=sc.next();

		Student s=new Student(name, age, college, usertype);
		try {
			validitem(s);
			System.out.println("Registrction successfully");

		} catch (BusinessException e) {
//			System.out.println(e.getErorrCode()+"  "+e.getMessage());
		}
	}
	public static void validitem(Student s ) throws BusinessException {
		if(s.getName().length() >12) {
			throw new BusinessException("Error 1", "invlid name");
		}
		if(s.getAge()<18||s.getAge()>25) {
			throw new BusinessException("Error 2","invlid age");
		}
		if(!(s.getCollege().equalsIgnoreCase("Diet")||s.getCollege().equalsIgnoreCase("vignan")||s.getCollege().equalsIgnoreCase("gitam"))){
			throw new BusinessException("error3", "invlid college");
		}
		if(!(s.getUserlogin().equalsIgnoreCase("admin")||s.getUserlogin().equalsIgnoreCase("Faculty") ||s.getUserlogin().equalsIgnoreCase("student"))){
			throw new BusinessException("error4", "invlid usertype");
		}
	}
}