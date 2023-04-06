package exceptionHandlingtrycatch;
import java.util.Scanner;
public class MySecondDemo {
	static void divide(int no1,int no2) {
		int result=no1/ no2;
		System.out.println("Division Result : "+result);
		System.out.println("Good Bye from try Block");
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Enter First No : ");
		int number1=scanner.nextInt();
		System.out.println("Enter Second No : ");
		int number2=scanner.nextInt();
		divide(number1, number2);
		}
		catch(ArithmeticException ex) {
			System.out.println("Infinity");
		}
		System.out.println("Good Bye from main");

	}

}
