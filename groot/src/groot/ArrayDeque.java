package groot;

import java.util.Deque;

public class ArrayDeque {

	public static void main(String[] args) {
		Deque<String> deque = (Deque<String>) new ArrayDeque();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		//Traversing elements  
		for (String str : deque) {  
		System.out.println(str);  
		}  
	}

}
