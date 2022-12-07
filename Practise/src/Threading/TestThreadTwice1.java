package Threading;

public class TestThreadTwice1 extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		TestThreadTwice1 t1 = new TestThreadTwice1();
		t1.start();
		t1.start();
	}
}
/* o/p: for t1 running...
 for t1 again Exception in thread "main" java.lang.IllegalThreadStateException
at java.lang.Thread.start(Thread.java:710)
at Threading.TestThreadTwice1.main(TestThreadTwice1.java:11)*/