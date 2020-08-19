package multithreadingexamples;

public class ThreadClasExample extends Thread {

	int n;
	
	public ThreadClasExample(int n) {
		this.n = n;
	}
	public void printNumber() {
		for (int i = 1; i<=20;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void printTable() {
		for (int i = 1;i<=10;i++) {
			System.out.println(i*n);
			try {
				ThreadClasExample.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public void run() {
		printTable();
	}
	
	public static void main(String args[]) throws InterruptedException {
		ThreadClasExample t1 = new ThreadClasExample(5);
		ThreadClasExample t2 = new ThreadClasExample(100);
		t1.start();
		t2.start();
	}
}
