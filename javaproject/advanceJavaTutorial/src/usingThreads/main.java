package usingThreads;

public class main extends Thread{

	public static void main(String[] args) throws InterruptedException {
		main thread = new main();
		
		thread.start(); //start() - basically used to start a thread in order to execute its content.
		System.out.println("The code is running outside of the thread");
		System.out.println(Thread.currentThread().getName());
		
		//sleep() - used to pause an execution of the current thread for a specified milliseconds.
		long start = System.currentTimeMillis();
		Thread.sleep(2000);
		
		MyThread thread2 = new MyThread();
		thread2.start();
		System.out.println("thread 2 " + thread2.isAlive());
		
		MyThread thread3 = new MyThread();
		thread3.setDaemon(true); // Daemon Threads - low priority threads that runs in background to perform task such as gargage collections.
		thread3.start();
		System.out.println("thread 3 " + thread3.isAlive());
		
		
		System.out.println(Thread.activeCount());	
		
	}

}
