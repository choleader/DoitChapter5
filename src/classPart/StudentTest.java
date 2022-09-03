package classPart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이다경");
		studentLee.studentID = 100;
		studentLee.grade = 10;
		studentLee.address = "부천시";
//		System.out.println(studentLee.getStudentName());
		studentLee.studentInfo();
		
		System.out.println(" ");
		
		Student studentCho = new Student();
		studentCho.studentName = "조상연";
		studentCho.studentID = 101;
		studentCho.grade = 10;
		studentCho.address = "인천광역시";
//		System.out.println(studentCho.getStudentName());
		studentCho.studentInfo();
		
		System.out.println(studentCho);
		System.out.println(studentLee);	
	}

}
