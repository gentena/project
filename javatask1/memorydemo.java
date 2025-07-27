package javatask1;

public class memorydemo {
		static class MemoryTask extends Thread {
	        private int[] memoryEater;

	        @Override
	        public void run() {
	            memoryEater = new int[10_000_000]; // ~40MB per thread
	            for (int i = 0; i < memoryEater.length; i++) {
	                memoryEater[i] = i;
	            }
	            System.out.println(Thread.currentThread().getName() + " allocated memory!");
	            try {
	                Thread.sleep(10000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int threadCount = 5;
	        System.out.println("Starting threads to allocate memory...");
	        for (int i = 0; i < threadCount; i++) {
	            Thread t = new MemoryTask();
	            t.setName("MemoryThread-" + i);
	            t.start();
	        }
	    }





	}


