package ex;

public class Subject {
	String subjectName;
	int subjectScore;
	
	public Subject(String name) {
		this.subjectName = name;
	}

	public void setSubjectName(String name) {
		this.subjectName = name;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectScore(int score) {
		this.subjectScore = score;
	}
	
	public int getSubjectScore() {
		return subjectScore;
	}
}