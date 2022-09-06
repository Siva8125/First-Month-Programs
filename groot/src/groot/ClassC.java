package groot;

public class ClassC extends ClassP{
	public void marry()
	{
		System.out.println("katrina");
	}

	public static void main(String[] args) {
		ClassP p=new ClassP();
		p.marry();
		ClassC c=new ClassC();
		c.marry();
		ClassP p1=new ClassC();
		p1.marry();
		
		
		// TODO Auto-generated method stub

	}

}
