package hiding;

class BirthDay {
	
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month == 2) {
			if(day < 1 || day >28) {
				System.out.println("��¥ �����Դϴ�. �ٽ� �Է����ּ���.");
			}
		}
		else{this.day = day;}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}

public class BirthDayTest{
	public static void main(String[] args) {
		
		BirthDay BD = new BirthDay();
		BD.setMonth(2);
		BD.setDay(30);
		BD.setYear(2022);
		
//		System.out.println(BD.getYear() + "�� " + BD.getMonth() + "�� " + BD.getDay() + "��");
		
	}
}