package groot;

public class Stringbuffer {

	public static void main(String[] args) {
		long Starttime=System.currentTimeMillis();		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<100000;i++)
		{
			sb.append("vtalent");
			
		}
		System.out.println("Time taken by StringBuffer:"+(System.currentTimeMillis()-Starttime)+"ms");
		
		// TODO Auto-generated method stub

	}

}
