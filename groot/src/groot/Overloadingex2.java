package groot;

public class Overloadingex2 {
	public void m2(Object o)
	{
		System.out.println("Object version");
	}
	public void m2(String s)
	{
		System.out.println("String version");
	}
	
	

	public static void main(String[] args) {
		Overloadingex2 t = new Overloadingex2();
		t.m2(new Object());
		t.m2("durga");
		t.m2(null);
		// TODO Auto-generated method stub

	}

}
