
public class Shop {
	private int materials;
	private boolean available = false;

	public synchronized int get() { // to check wheather materials available or not
	while(available == false) {
	try {
	wait();
	}                      // if material not found it will throw an exception
	catch(Exception ie) {

	}
	}
	return materials;

	}

	public synchronized void put(int value) { //to insert materials required if materials are available
	while(available == true) {
	try {
	wait();
	}
	catch(Exception ie) {
	ie.printStackTrace();
	}
	}
	materials = value;
	available = true;
	notifyAll();
	}
	

}
