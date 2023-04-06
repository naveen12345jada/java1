package exceptionHandlingtrycatch;
import java.util.Scanner;
public class MainAgeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter age : ");
		int age=sc.nextInt();
		
     Ageofaperson ag=new Ageofaperson();
     try {
    	 ag.setage(age);
    	 if(age<18) {
    		 System.out.println("person is eligible for voting ");
    	 }
     }catch(AgeException ex) {
    	 ex.printStackTrace();
    	 System.out.println("as person age is "+age+" so not eligible for voting ");
     }
 System.out.println("age of a person is "+age);
 ag.anotherNewage(age);
	}
	

}
