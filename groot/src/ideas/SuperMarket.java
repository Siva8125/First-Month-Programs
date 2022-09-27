package ideas;

public class SuperMarket {
	private int password;
		
	public int getPassword() {
		return password;
	}
	
	public void setPassword(int password) {
		this.password = password;
	}

	public static void main(String[] args) {
		SuperMarket accesspassword = new SuperMarket();
		
		accesspassword.setPassword(812568);
		
		System.out.println(accesspassword.getPassword());
		
		System.out.println("Enter into Market");
		
		int MinPrice = 1500;
				
	}

	

}
