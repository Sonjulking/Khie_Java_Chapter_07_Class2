package inheritance;

public class Employee extends Person {

	// String name;
	// int age;
	// String job;
	int salary;           // 급여
	
	void getEmployeeInfo() {
		System.out.println("이 름 >>> " + name);
		System.out.println("나 이 >>> " + age);
		System.out.println("직 업 >>> " + job);
		System.out.println("급 여 >>> " + salary);
	}
}
