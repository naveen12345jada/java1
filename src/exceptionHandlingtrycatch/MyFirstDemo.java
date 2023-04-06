package exceptionHandlingtrycatch;
import java.util.Scanner;

public class MyFirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int location=0;
		try {
			System.out.println("enter first no : ");
			int number1=scanner.nextInt();
			System.out.println("Enter Second no: " );
			int number2=scanner.nextInt();
			
			int divide = number1/number2;
			System.out.println("division result : "+divide);
			
//			System.exit(0);
//			array decclaration
			
			int  arr[];
			System.out.println("enter total number of elements in array : ");
			int total =scanner.nextInt();
//			allocation memory 
			arr=new int[total];
			for(int i=0;i<total;i++) {
				System.out.println("Enter "+(i+1)+" element : ");
				arr[i]=scanner.nextInt();
			}
			System.out.println("enter location of array to retrieve value : ");
			location =scanner.nextInt();
			System.out.println("element at "+location +" in an array: "+arr[location]);
			
			System.out.println("Good Bye from Try Block");
			
		}catch(ArithmeticException ex){
			System.out.println("infinity");
			
		}catch (NegativeArraySizeException ex) {
			System.out.println("Size of array cannot be negative!");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("location "+location+" does not exist in an array");
	}finally {
		System.out.println("Hi I am finally block");
	}System.out.println("Good Bye from main");//catch(Exception exception) {
//		System.out.println("Something went wrong , please try again!");
//	}

	}

}
