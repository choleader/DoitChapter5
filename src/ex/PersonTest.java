package ex;

public class PersonTest {

	public static void main(String[] args) {
		
		Person Cho = new Person("조상연");
		Cho.setKoreaScore(100);
		Cho.setMathScore(50);
		Cho.personTotal();
		
		Person Lee = new Person("이다경");
		Lee.setKoreaScore(100);
		Lee.setMathScore(100);
		Lee.personTotal();
		
	}

}
