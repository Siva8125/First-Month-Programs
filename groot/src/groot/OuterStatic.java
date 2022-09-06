package groot;

public class OuterStatic {
	private static int i;
	public void function() {
		System.out.println("Outer class"+i);
	}
	static class Inner{
		float f;
		public void function() {
			OuterStatic o = new OuterStatic();
			System.out.println("Inner class"+(f+o.i));
		}
	}

	public static void main(String[] args) {
		OuterStatic o = new OuterStatic();
		o.i=10;
		o.function();
		OuterStatic.Inner in = new OuterStatic.Inner();
		in.f = 1.5f;
		in.function();
		
	}

}
