package classPart;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personCho = new Person("����", 32);
		personCho.personAddres = "��õ������ ���� �ο���196";
		personCho.showPersonInfo();
		
		System.out.println("===========================");
		
		Person personLee = new Person("�̴ٰ�", 32);
		personLee.personAddres = "��⵵ ��õ��";
		personLee.showPersonInfo();
		
	}

}
