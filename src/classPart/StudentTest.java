package classPart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("�̴ٰ�");
		studentLee.studentID = 100;
		studentLee.grade = 10;
		studentLee.address = "��õ��";
//		System.out.println(studentLee.getStudentName());
		studentLee.studentInfo();
		
		System.out.println(" ");
		
		Student studentCho = new Student();
		studentCho.studentName = "����";
		studentCho.studentID = 101;
		studentCho.grade = 10;
		studentCho.address = "��õ������";
//		System.out.println(studentCho.getStudentName());
		studentCho.studentInfo();
		
		System.out.println(studentCho);
		System.out.println(studentLee);	
	}

}
