package groot;

public class Overloadingex1 {
	public void m1(){
		System.out.println("no-arg");
	}
	public void m1(int i) {
		System.out.println("int-arg");
	}
	public void m1(double d){
		System.out.println("double-arg");
	}
	
	

	public static void main(String[] args) {
		Overloadingex1 t = new Overloadingex1();
		t.m1();
		t.m1(10.5);
		t.m1(10.5);
		

	}

}
