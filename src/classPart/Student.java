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
	
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("�̴ٰ�");
		studentLee.studentID = 100;
		studentLee.grade = 10;
		studentLee.address = "��õ��";
//		System.out.println(studentLee.getStudentName());
		studentLee.studentInfo();
		
		Student studentCho = new Student();
		studentCho.studentName = "����";
		studentCho.studentID = 101;
		studentCho.grade = 10;
		studentCho.address = "��õ������";
//		System.out.println(studentCho.getStudentName());
		studentCho.studentInfo();
		
	}


		

}
