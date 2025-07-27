package javaexceptionstask3;


interface RemoteControl1
{
	abstract void turnOn();
	default void batteryStatus()
	{
		System.out.println("Battery status: 30%");
	}
	
	static void info() {
        System.out.println("Provides basic remote operations.");
    }
}

class TV1 implements RemoteControl1
{
	public void turnOn()
	{
		System.out.println("TV turned On...");
	}
	
}


	
		
		

//Main class to demonstrate usage

 public class sample3 {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV1 t1 = new TV1();
		t1.turnOn();
		t1.batteryStatus();
		RemoteControl1.info();

	}

}
		

