package ideas;

import java.util.Scanner;


public class SchoolAdmission {
	private int id,rank;
	private long feestructure,scholarship,fee;
	private String name,whitecard,branch;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(long feestructure) {
		this.feestructure = feestructure;
	}

	public long getScholarship() {
		return scholarship;
	}

	public void setScholarship(long scholarship) {
		this.scholarship = scholarship;
	}

	public long getFee() {
		return fee;
	}

	public void setFee(long fee) {
		this.fee = fee;
	}

	

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWhitecard() {
		return whitecard;
	}

	public void setWhitecard(String whitecard) {
		this.whitecard = whitecard;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	



	public static void main(String[] args) {
		SchoolFeeStructure fees = new SchoolFeeStructure();
		System.out.println("Enter Rank of Student :");
		Scanner num = new Scanner(System.in);
		String abc = num.nextLine();
		fees.setId(100);
		int num1=num.nextInt();
		fees.setFeestructure(70000);
		fees.setScholarship(35000);
		fees.setFee(35000);
		fees.setRank(1500);
		fees.setName("siva");
		fees.setWhitecard("yes");
		fees.setBranch("civil");
		
		if(num1>10000) {
			System.out.println("Fee Structure is :"+fees.getFeestructure());
		}else if(num1<=10000) {
			System.out.println("Fee Structure with Scholarship is :"+fees.getScholarship());
			return;
		}else if(num1>40000){
			System.out.println("Consult College Management");
			return;
		}else {
			System.out.println("No Admission");
		}
		
		System.out.println(fees.getId()+"\n"+fees.getFeestructure()+"\n"+fees.getScholarship()+"\n"+fees.getFee()+"\n"+fees.getRank()+"\n"+fees.getName()+"\n"+fees.getWhitecard()+"\n"+fees.getBranch());
		
		
		
		
		
	}	

}
