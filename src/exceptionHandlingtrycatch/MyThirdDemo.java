package exceptionHandlingtrycatch;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class MyThirdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter file name: ");
		String filename=sc.next();
		
		try {
			FileInputStream fs = new FileInputStream(filename);
			System.out.println("file opened");
		}catch(FileNotFoundException e) {
			System.out.println("file "+ filename +" doesn't exists ");
		}
		
			
		

	}

}
