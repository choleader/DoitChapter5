package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student Cho = new Student("����", 100);
		Cho.setEnglish(100);
		Cho.setMath(90);
		
		Student Lee = new Student("�̴ٰ�", 101);
		Lee.setEnglish(90);
		Lee.setMath(100);
		
		Cho.showStudentInfo();
		Lee.showStudentInfo();
	}

}
