package javaexceptionstask3;
// custom exception
class InvalidAccountException extends Exception{
	public InvalidAccountException(String message) {
		super(message);
	}
}
//account class
class Account{
	private double balance;
	public Account(double balance) {
		this.balance=balance;
	}
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("deposited:"+amount);
	}
	public void withdraw(double amount)throws InvalidAccountException{
		if(balance-amount<0) {
			throw new InvalidAccountException("insufficient balance. Transaction denied:");
		}else {
			balance-=amount;
			System.out.println("withdrawn:"+amount);
		}
	}
	public double getbalance() {
		return balance;
	}
}
public class Sample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account(1000.0);
		try {
			account.withdraw(1500.0);
			
			}catch(InvalidAccountException e){
				System.out.println("error:"+getMessage());
			
				System.out.println("current balance:"+account.getbalance());
		}

	}

	private static String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}

	
