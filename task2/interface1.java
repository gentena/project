package javaoops.task2;
interface logger{
	default void loginfo() {
		System.out.println("default info log");
	}
	static void logError() {
		System.out.println("static Error log");
		
	}
}
class applogger implements logger{

	public void logError() {
		// TODO Auto-generated method stub
		
	}}


public class interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		applogger logger =new applogger();
		logger.loginfo();
		logger.logError();
	}

}
