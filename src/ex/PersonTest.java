package ex;

public class PersonTest {

	public static void main(String[] args) {
		
		Person Cho = new Person("����");
		Cho.setKoreaScore(100);
		Cho.setMathScore(50);
		Cho.personTotal();
		
		Person Lee = new Person("�̴ٰ�");
		Lee.setKoreaScore(100);
		Lee.setMathScore(100);
		Lee.personTotal();
		
	}

}
