package groot;

public class BankTest {

	public static void main(String[] args) {
		Bank1 b1 = new Bank1();
		Bank2 b2 = new Bank2();
		Bank3 b3 = new Bank3();
		System.out.println("Bank1 interest : "+b1.getRateofInterest());
		System.out.println("Bank2 interest : "+b2.getRateofInterest());
		System.out.println("Bank3 interest : "+b3.getRateofInterest());
	}

}
