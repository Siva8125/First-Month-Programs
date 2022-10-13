
public class ProducerConsumer {
	public static void main(String[] args) {
		Shop c = new Shop();
		Producer p = new Producer(c,1);
		Consumer co = new Consumer(c, 1);
		p.start();
		co.start();
	}

		
}
