package groot;

public class MemberOuter {
	private int num=30;  
	 class Inner{  
	  void msg(){System.out.println("num is "+num);}  
	 }  
	 public static void main(String args[]){  
	  MemberOuter obj=new MemberOuter();  
	  MemberOuter.Inner in=obj.new Inner();  
	  in.msg();  
	 }  

}
