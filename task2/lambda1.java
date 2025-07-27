package javaoops.task2;
//@ functional interface
interface MathOperation{
	int operate(int a, int b);
}


public class lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation add = (a,b)->a+b;
		MathOperation sub= (a,b)->a-b;
		MathOperation mul = (a,b)->a*b;
		System.out.println("add:"+ add.operate(10,5));
		System.out.println("sub:"+ sub.operate(10,5));
		System.out.println("mul:"+ mul.operate(10,5));
		

	}

}
