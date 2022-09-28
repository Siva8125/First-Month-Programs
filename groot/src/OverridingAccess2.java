
public class OverridingAccess2 extends OverridingAccess{
	public void msg() {
		System.out.println("Hello siva");
	}

	public static void main(String[] args) {
		OverridingAccess2 o = new OverridingAccess2();
		o.msg();
		
	}

}
