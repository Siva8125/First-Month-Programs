package ideas;


public class SchoolFeeStructure extends SchoolAdmission {

	public static void main(String[] args) {
		SchoolFeeStructure fees = new SchoolFeeStructure();
		fees.setId(100);
		fees.setFeestructure(70000);
		fees.setScholarship(35000);
		fees.setFee(35000);
		fees.setRank(1500);
		fees.setName("siva");
		fees.setWhitecard("yes");
		fees.setBranch("civil");
		System.out.println(fees.getId()+"\n"+fees.getFeestructure()+"\n"+fees.getScholarship()+"\n"+fees.getFee()+"\n"+fees.getRank()+"\n"+fees.getName()+"\n"+fees.getWhitecard()+"\n"+fees.getBranch());
		
	}

}
