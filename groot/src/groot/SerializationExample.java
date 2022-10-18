package groot;
import java.io.FileOutputStream;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;

public class SerializationExample {

	public static void main(String[] args) {
		try
		{
			Student s = new Student(21,"siva");
			FileOutputStream fos = new FileOutputStream("t.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			oos.flush();
			oos.close();
			System.out.println("success");
		}catch(Exception e) {
			System.out.println(e);
			
		}try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("t.txt"));
			Student s = (Student)ois.readObject();
			System.out.println(s.id+" "+s.name);
			ois.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		
		
		
	}

}
