package exceptionHandlingtrycatch;

public class Ageofaperson {
	private int age;
	public int getage(){
		return age;
		
	}
	public void setage(int age ) throws AgeException{
		if (age<18) {
			this.age=age;
			throw new AgeException("the age is not less than 18");
			
		}
		
	}
	public void anotherNewage(int age ) {
		try{
            if (age<18)
			throw new AgeException("the age is not less than 18");
			this.age=age;
				
		}
		catch(AgeException ex) {
			System.out.println("please enter age greater than 18");
		}
		
		
	}

}
