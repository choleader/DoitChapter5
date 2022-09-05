package classPart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void studentInfo(){
		System.out.println("이름 : " + studentName + '\n' + 
							"학년 : " + grade +'\n' + 
							"학번 : " + studentID +'\n' +
							"주소 : " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
		

		

}
