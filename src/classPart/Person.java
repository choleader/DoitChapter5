package classPart;

public class Person {
	
	String personName;
	int personAge;
	String personAddres;
	
	public Person(String name, int age){
		this.personName = name;
		this.personAge = age;
		
	}
	
	public void showPersonInfo() {
		System.out.println("이름 : " + personName + '\n' +
							"나이 : " + personAge  + '\n' +
							"주소 : " + personAddres);
	}

}
