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
		System.out.println("�̸� : " + personName + '\n' +
							"���� : " + personAge  + '\n' +
							"�ּ� : " + personAddres);
	}

}
