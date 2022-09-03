package classPart;

import java.util.Scanner;

public class Function {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum = add(num1, num2);
		int sub = subtraction(num1, num2);
		int muti = multiplication(num1, num2);
		double divi = division(num1, num2);
		
		
		System.out.println(num1 + "+" + num2 + "=" + sum);
		System.out.println(num1 + "-" + num2 + "=" + sub);
		System.out.println(num1 + "*" + num2 + "=" + muti);
		System.out.println(num1 + "/" + num2 + "=" + divi);
		
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static int subtraction(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int multiplication(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static double division(double n1, double n2) {
		double result = n1 / n2;
		return result;
	}

}
