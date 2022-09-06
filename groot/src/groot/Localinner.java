package groot;

public class Localinner {
	public int i;
	public int function() {
		class Local{
			int in;
			public int function() {
				System.out.println("local class method");
				return in+5;
			}
		}
		Local l = new Local();
		l.in = 10;
		return l.function();
	}

	public static void main(String[] args) {
		Localinner li = new Localinner();
		li.i=li.function();
		System.out.println(li.i);
		
	}

}
