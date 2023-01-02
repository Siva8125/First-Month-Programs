package groot;

import java.util.HashMap;
import java.util.Set;

public class HashMapLiveEx {
	public static void main(String[] args) {
		HashMap<String, Double> groceryItems = new HashMap<String, Double>();
        // Shopping Cart Java HashMap PUT, GET and REMOVE
		// add grocery Items to Shopping cart

		groceryItems.put("Tomatoes", 10.50);
		groceryItems.put("Onions", 4.50);
		groceryItems.put("Potatoes", 20.00);
		groceryItems.put("Canola Oil", 7.00);
		System.out.println("\n" + groceryItems);

		// getting value for the given key from hashmap

		System.out.println("\nPrice of Potatoes: " + groceryItems.get("Potatoes"));
		System.out.println("\nIs HashMap empty? " + groceryItems.isEmpty());

		groceryItems.remove("Potatoes");

		System.out.println("\n" + groceryItems);
		System.out.println("\nSize of the HashMap: " + groceryItems.size());
		
		//Looping through Shopping Cart Java HashMap
		//once you bought all the groceries, At the Billing counter you need to price each items
		HashMap<String, Double> groceryItems2 = new HashMap<String, Double>();

		// add grocery Items to Shopping cart
           
		groceryItems2.put("Tomatoes", 10.50);
		groceryItems2.put("Onions", 4.50);
		groceryItems2.put("Potatoes", 20.00);
		groceryItems2.put("Canola Oil", 7.00);
		System.out.println("\n" + groceryItems2);

		// Iterating through HashMap Items

		System.out.println("\nReterive Each Items Names from our Grocery List of Items \n");

		Set<String> groceryItemNames = groceryItems2.keySet();
		for (String eachItem : groceryItemNames) {

			System.out.println(eachItem);

		}
		
//suppos if you wantto quickly verify whetherShopping cart has the item or not then youwill need to use containsKey method.
		HashMap<String, Double> groceryItems3 = new HashMap<String, Double>();

		// add grocery Items to Shopping cart

		groceryItems3.put("Tomatoes", 10.50);
		groceryItems3.put("Onions", 4.50);
		groceryItems3.put("Potatoes", 20.00);
		groceryItems3.put("Canola Oil", 7.00);
		System.out.println("\n" + groceryItems3);

		// Iterating through HashMap Items

		System.out.println("\nSearching Grocery List of Items keys or Names \n");

		if (groceryItems3.containsKey("Canola Oil")) {

			System.out.println("The shoppingCart contains key Canola Oil");

		} else {

			System.out.println("The shoppingCart does not contains key Canola Oil");

		}

		if (groceryItems3.containsKey("JackFruit")) {

			System.out.println("The shoppingCart contains key JackFruit");

		} else {

			System.out.println("The shoppingCart does not contains key JackFruit");

		}
		
		//you know only the price of the items, you can retrieve the name of the items using containsValue method
		
		HashMap<String, Double> groceryItems4 = new HashMap<String, Double>();

		// add grocery Items to Shopping cart

		groceryItems4.put("Tomatoes", 10.50);
		groceryItems4.put("Onions", 4.50);
		groceryItems4.put("Potatoes", 20.00);
		groceryItems4.put("Canola Oil", 7.00);
		System.out.println("\n" + groceryItems4);

		// searching Items Price using containsValue

		System.out.println("\nSearching Grocery List of Items keys or Names \n");

		if (groceryItems4.containsValue(7.00)) {

			System.out.println("The shoppingCart contains Canola Oil of Value is 7.00");

		} else {

			System.out.println("The shoppingCart does not contains value of Canola Oil");

		}

		if (groceryItems4.containsValue(4.50)) {

			System.out.println("The shoppingCart contains value of Onions is 4.50");

		} else {

			System.out.println("The shoppingCart does not contains value of Onions");

		}
	}

}
