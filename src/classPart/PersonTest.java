package classPart;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personCho = new Person("조상연", 32);
		personCho.personAddres = "인천광역시 부평구 부영로196";
		personCho.showPersonInfo();
		
		System.out.println("===========================");
		
		Person personLee = new Person("이다경", 32);
		personLee.personAddres = "경기도 부천시";
		personLee.showPersonInfo();
		
	}

}
