package classPart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void studentInfo(){
		System.out.println("�̸� : " + studentName + '\n' + 
							"�г� : " + grade +'\n' + 
							"�й� : " + studentID +'\n' +
							"�ּ� : " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
		

		

}
