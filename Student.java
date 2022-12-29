package ExceptionHandlg_practiceroughf;

public class Student {
	private String name;
	private int age;
	private String college;
	private String userlogin;

	public Student(String name, int age, String college, String userlogin) {
		super();
		this.name = name;
		this.age = age;
		this.college = college;
		this.userlogin = userlogin;

	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCollege() {
		return college;
	}

	public String getUserlogin() {
		return userlogin;
	}

}

