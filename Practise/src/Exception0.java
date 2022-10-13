import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exception0 {

	public Exception0(int i, String string) {
		
	}

	public static void main(String[] args) {
		try{    
			      
			  Sivaji s1 =new Sivaji(118,"siva");    
			     
			  FileOutputStream sout=new FileOutputStream("s.txt");    
			  ObjectOutputStream out=new ObjectOutputStream(sout);    
			  out.writeObject(s1);    
			  out.flush();    
			      
			  out.close();    
			  System.out.println("success");    
			  }catch(Exception e){System.out.println(e);}    
		 	 }    

}
