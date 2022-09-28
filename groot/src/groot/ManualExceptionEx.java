package groot;

public class ManualExceptionEx {

	public static void main(String[] args) {
		System.out.println("Hello");
	      NullPointerException nullPointer = new NullPointerException();
	      throw nullPointer;
	      //System.out.println("How are you");
	}

}
