package reference;

public class Student {
	
	int studentID;
	String studentName;
	Subject math;
	Subject english;
	
	public Student() {
		math = new Subject("����");
		english = new Subject("����");
		
	}
	
	public Student(String name, int ID) {
		math = new Subject("����");
		english = new Subject("����");
		
		this.studentName = name;
		this.studentID = ID;
	}
	
	public void setEnglish(int score) {
		english.subjectScore = score;
	}
	
	public int getEnglishScore() {
		return english.subjectScore;
	}

	
	public void setMath(int score) {
		math.subjectScore = score;
	}
	
	public int getMathScore() {
		return math.subjectScore;
	}

	public void scoreTotal() {
		
	}
	
	public void showStudentInfo() {
		int total = getMathScore()+getEnglishScore();
		System.out.println(studentName + "���� ������ " + total + "�Դϴ�.");
	}

}
