package Threading;

public class TestDaemonThread2 extends Thread {
	public void run() {
		System.out.println("Name: " + Thread.currentThread().getName());
		System.out.println("Daemon: " + Thread.currentThread().isDaemon());
	}

	public static void main(String[] args) {
		TestDaemonThread2 t1 = new TestDaemonThread2();
		TestDaemonThread2 t2 = new TestDaemonThread2();
		t1.start();
		t1.setDaemon(true);// will throw exception here
		t2.start();
	}
}
//
//Note:If you want to make user thread as Daemon,it must not be started otherwise it will throw IllegalThreadStateException.
/*Exception in thread "main" Name: Thread-0
Daemon: false
java.lang.IllegalThreadStateException
	at java.lang.Thread.setDaemon(Thread.java:1364)
	at Threading.TestDaemonThread2.main(TestDaemonThread2.java:13)*/