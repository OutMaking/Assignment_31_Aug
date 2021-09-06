class Student {
	private int rollNo,studentAge;
	private String studentFirstName,studentLastName;

	public Student(String studentFirstName,String studentLastName,int rollNo, int studentAge) {
	    this.studentFirstName = studentFirstName;
	    this.studentLastName = studentLastName;
		this.rollNo = rollNo;
		this.studentAge = studentAge;                             
		
	}
	
	@Override
	public String toString() {
		return String.format("First Name : " + studentFirstName +" , Last Name : "+studentLastName+" , Roll Number : "+rollNo + " , Age : "+studentAge);
	}
}

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student("Abhay","Shrivastav",1342,17);
		
		System.out.println(s1);
	}
}