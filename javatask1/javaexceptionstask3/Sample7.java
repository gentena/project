package javaexceptionstask3;
import java.util.Scanner;



//throw and throw

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
}
}
public class Sample7{
	static void validate(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Age must be 18 or above..");
		}else {
			System.out.println("age is valid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter you age");
		int age=scanner.nextInt();
		scanner.close();
		
		try {
			validate(17);
			
		}catch(InvalidAgeException e) {
       System.out.println("error:"+e.getMessage());
	}

	}
}
