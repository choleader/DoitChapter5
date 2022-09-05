package ex;

public class Person {
	
	String personName;
	Subject math;
	Subject korea;
	
	public Person(String name) {
		this.personName = name;
		math = new Subject("����");
		korea = new Subject("����");
	}

	public void setMathScore(int score) {
		math.subjectScore = score;
	}
	
	public int getMathScore() {
		return math.subjectScore;
	}
	
	public void setKoreaScore(int score) {
		korea.subjectScore = score;
	}
	
	public int getKoreaScore() {
		return korea.subjectScore;
	}
	
	public void personTotal() {
		int total = getKoreaScore() + getMathScore();
		System.out.println(personName + "���� ������ " + total+ "���Դϴ�.");
	}
}
