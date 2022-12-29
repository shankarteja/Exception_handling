package ExceptionHandlg_practiceroughf;

import java.util.Scanner;

public class TestPersonRegistrion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the age");
		int age =sc.nextInt();
		System.out.println("enter the city");
		String city= sc.next();
		System.out.println("enter the user data type");
		String userdata=sc.next();	

		Person p=new Person(name, age, city, userdata);

		try {
			validate(p);
			System.out.println("Registration success");
		} catch (BusinessException e) {
			System.out.println(e.getErorrCode()+"   "+e.getMessage()); 

		}

	}
	public static void validate(Person p) throws BusinessException {
		if(p.getAge()<18||p.getAge()>60) {
			BusinessException b =new BusinessException("Error1", "invlidage");
			throw b;
		}

		if(!(p.getCity().equals("hyderbad")) || p.getCity().equals("bangalore") || p.getCity().equals("pune")){
			throw new BusinessException("ERRO3","unsupported city");
		}

		if(!(p.getUsertype().equals("admin") || p.getUsertype().equals("client")|| p.getUsertype().equals("agent"))){
			throw new BusinessException("ERRO4","unsupported usertype");
		}


		if(p.getName().length()>12) {
			throw new BusinessException("ERRO2","name is invlid ");
		}
	}
}
