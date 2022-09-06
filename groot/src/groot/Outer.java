package groot;

public class Outer {
	private int i;
	public void function() {
		System.out.println("Outer class"+i);
	}
	class Inner{
		float f ;
		public void function() {
			System.out.println("Inner class"+(f+i));
		}
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		o.i=5;
		o.function();
		Outer.Inner in = o.new Inner();
		in.f=1.5f;
		in.function();
		
		
	}

}
