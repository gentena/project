package javatask1;
import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		do {
			System.out.println("enter positive number(-1 to stop):");
			num =sc.nextInt();
			
		}while (num !=-1);

	}

}
