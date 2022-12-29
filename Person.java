package ExceptionHandlg_practiceroughf;

public class Person {
	private String name;
	private int age;
	private String city;
	private String usertype;
	public Person(String name, int age, String city, String usertype) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.usertype = usertype;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getUsertype() {
		return usertype;
	}
	
}
