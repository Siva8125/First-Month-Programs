package ideas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.Scanner;
import java.util.Map.Entry;

public class Producer extends SuperMarket{
	
	public static void main(String[] args) {
		List<String> items = new ArrayList<String>();
		items.add("rice");
		items.add("dal");
		items.add("milk");
		items.add("bread");
		items.add("butter");
		items.add("cooldrink");
		items.add("bingo");
		items.add("perfume");
		items.add("vegetables");
		items.add("fruits");
        Scanner cap = new Scanner(System.in);
		
		int capacity = cap.nextInt();
		if (capacity<100) {
			System.out.println("no free items");
			return;
		}else if(capacity>=1500) {
			System.out.println("you can pick all items in the SuperMarket");
		
		}else if(capacity<=1500){
			System.out.println("pick items of required capacity ");
			
		}
		
		System.out.println("Items available in market are :");
		
		Iterator i = items.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Producer pd = new Producer();
		pd.produce(items);
		
	}

}
