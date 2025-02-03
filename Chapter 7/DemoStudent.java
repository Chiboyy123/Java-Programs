	class Student{
	String name = "John";
	int age = 20;
	String gender = "Male";
	int StudentID = 101;
	
	public void study(){
		System.out.printf("Student ID is %d%n" + StudentID);
		System.out.println("Student name is " + name);
		System.out.println("Student age is " + age);
		System.out.println("I am learning Java");
	}
}

	class DemoStudent{
	public static void main(String[] args){
		Student student = new Student();
		Student.study();
	}
}
		