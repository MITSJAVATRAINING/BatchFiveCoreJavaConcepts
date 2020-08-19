package multithreadingexamples;

class MyThread {
	public void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * n);
		}
	}
}

class Thread1 extends Thread {

	MyThread t;

	public Thread1(MyThread t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);

	}

}

class Thread2 extends Thread {
	MyThread t;

	public Thread2(MyThread t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class TestSynchronization {
	public static void main(String args[]) {
		MyThread obj = new MyThread();
		
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		t1.start();
		t2.start();
	}
}