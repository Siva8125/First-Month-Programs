package groot;

public class Stringbuilder {

	public static void main(String[] args) {
		long Starttime=System.currentTimeMillis();
		StringBuilder sb2=new StringBuilder();
		for(int i=0;i<100000;i++)
		{
			sb2.append("vtalent");
							
		}
		System.out.println("Time taken by StringBuilder:"+(System.currentTimeMillis()-Starttime)+"ms");
						
		// TODO Auto-generated method stub

	}

}
