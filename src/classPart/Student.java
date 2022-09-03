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
	
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이다경");
		studentLee.studentID = 100;
		studentLee.grade = 10;
		studentLee.address = "부천시";
//		System.out.println(studentLee.getStudentName());
		studentLee.studentInfo();
		
		Student studentCho = new Student();
		studentCho.studentName = "조상연";
		studentCho.studentID = 101;
		studentCho.grade = 10;
		studentCho.address = "인천광역시";
//		System.out.println(studentCho.getStudentName());
		studentCho.studentInfo();
		
	}


		

}
