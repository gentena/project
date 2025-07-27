package javaoops.task2;




	abstract class Appliance {
		abstract void turnon();
	}
	interface connectable{
		void connect();
		
	}
	class smarttv extends Appliance implements connectable{
		public void turnon() {
			System.out.println("smarttv is on");
		}
		public void connect() {
			System.out.println("smarttv connected to wifi");
		
		}
	}
	public class Appliance1 {
		public static void main(String[] args) {
			smarttv tv =new smarttv();
			tv.turnon();
			tv.connect();
		}
			
		}
	



	
	
