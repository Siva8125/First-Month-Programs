import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		String from[] = {"Hyderabad","Tirupati","Mumbai","Chennai","Pune","Bangalore"};
		String from2[] = {"Hyderabad","Tirupati","Mumbai","Chennai","Pune","Bangalore"};
		Scanner reader = new Scanner(System.in);
		String fromcity = reader.nextLine();
		String tocity = reader.nextLine();
		/*String fromcity;
		String tocity;*/
		if(fromcity.equals(from[0])&&tocity.equals(from2[1])) {
			System.out.println("1500");
		}else if(fromcity.equals(from[0])&&tocity.equals(from2[2])) {
			System.out.println("1501");
			return;
		}else if(fromcity.equals(from[0])&&tocity.equals(from2[3])) {
			System.out.println("1502");
			return;
		}else if(fromcity.equals(from[0])&&tocity.equals(from2[4])) {
			System.out.println("1503");
			return;
		}else if(fromcity.equals(from[0])&&tocity.equals(from2[5])) {
			System.out.println("1504");
			return;
		}else if(fromcity.equals(from[1])&&tocity.equals(from2[0])) {
			System.out.println("1505");
			return;
		}else if(fromcity.equals(from[1])&&tocity.equals(from2[2])) {
			System.out.println("1506");
			return;
		}else if(fromcity.equals(from[1])&&tocity.equals(from2[3])) {
			System.out.println("1507");
			return;
		}else if(fromcity.equals(from[1])&&tocity.equals(from2[4])) {
			System.out.println("1508");
			return;
		}else if(fromcity.equals(from[1])&&tocity.equals(from2[5])) {
			System.out.println("1509");
			return;
		}else if(fromcity.equals(from[2])&&tocity.equals(from2[0])) {
			System.out.println("1510");
			return;
		}else if(fromcity.equals(from[2])&&tocity.equals(from2[1])) {
			System.out.println("1511");
			return;
		}else if(fromcity.equals(from[2])&&tocity.equals(from2[3])) {
			System.out.println("1512");
			return;
		}else if(fromcity.equals(from[2])&&tocity.equals(from2[4])) {
			System.out.println("1513");
			return;
		}else if(fromcity.equals(from[2])&&tocity.equals(from2[5])) {
			System.out.println("1514");
			return;
		}else if(fromcity.equals(from[3])&&tocity.equals(from2[0])) {
			System.out.println("1515");
			return;
		}else if(fromcity.equals(from[3])&&tocity.equals(from2[1])) {
			System.out.println("1516");
			return;
		}else if(fromcity.equals(from[3])&&tocity.equals(from2[2])) {
			System.out.println("1517");
			return;
		}else if(fromcity.equals(from[3])&&tocity.equals(from2[4])) {
			System.out.println("1518");
			return;
		}else if(fromcity.equals(from[3])&&tocity.equals(from2[5])) {
			System.out.println("1519");
			return;
		}else if(fromcity.equals(from[4])&&tocity.equals(from2[0])) {
			System.out.println("1520");
			return;
		}else if(fromcity.equals(from[4])&&tocity.equals(from2[1])) {
			System.out.println("1521");
			return;
		}else if(fromcity.equals(from[4])&&tocity.equals(from2[2])) {
			System.out.println("1522");
			return;
		}else if(fromcity.equals(from[4])&&tocity.equals(from2[3])) {
			System.out.println("1523");
			return;
		}else if(fromcity.equals(from[4])&&tocity.equals(from2[5])) {
			System.out.println("1524");
			return;
		}else if(fromcity.equals(from[5])&&tocity.equals(from2[0])) {
			System.out.println("1525");
			return;
		}else if(fromcity.equals(from[5])&&tocity.equals(from2[1])) {
			System.out.println("1526");
			return;
		}else if(fromcity.equals(from[5])&&tocity.equals(from2[2])) {
			System.out.println("1527");
			return;
		}else if(fromcity.equals(from[5])&&tocity.equals(from2[3])) {
			System.out.println("1528");
			return;
		}else if(fromcity.equals(from[5])&&tocity.equals(from2[4])) {
			System.out.println("1529");
			return;
		}else {
			System.out.println("No Flights Available");
		}
		
		

	}

}
