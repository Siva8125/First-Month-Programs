package ideas;

import java.util.Random;
import java.util.Scanner;

public class DoctorAppointmentNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Patient Name: ");
		String Name = s.nextLine();
		Random random = new Random();   
		int op = random.nextInt(100);
		System.out.println("Appointment Number for "+ Name +" is "+op);
		if(op<=25) {
			System.out.println("Your Appointment is fixed on 17-10-2022 between 10:00 am to 1:00 pm");
			return;
		}else if (op>=26&&op<=50) {
			System.out.println("Your Appointment is fixed on 17-10-2022 between 2:00 pm to 5:00 pm");
			return;
		}else {
			System.out.println("Book your Appointment for 18-10-2022");
		}
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Patient Name: ");
		String Name2 = s1.nextLine();
		
		Random random2 = new Random();   
		int op2 = random2.nextInt(50);   
		System.out.println("Appointment Number for "+ Name2 +" is "+op2);
		if(op2<=25) {
			System.out.println("Your Appointment is fixed on 18-10-2022 between 10:00 am to 1:00 pm");
			return;
		}else if (op2>=26&&op2<=50) {
			System.out.println("Your Appointment is fixed on 18-10-2022 between 2:00 pm to 5:00 pm");
			return;
		}else {
			System.out.println("Book your Appointment for 19-10-2022");
		}
		
		
	}

}
