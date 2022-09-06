package ideas;

import java.util.Scanner;

public class Odi1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String wheather = reader.nextLine();
		if(wheather.equals("good")) {
			System.out.println("Match will start at 9:00 AM");
						
		}else if(wheather.equals("bad")){
			System.out.println("Match delayed due to bad wheather and will start after the rain stops");
			return;
		}else if(wheather.equals("worst")) {
			System.out.println("Match Cancelled due to worst wheather since three hours");
			return;
			
		}else {
			System.out.println("Match Postphoned");
						
		}
				
				System.out.println("Welcome to VTalent ODI series 2022, India vs England");
		System.out.println("Match consists of 50 Overs");
		System.out.println("Enter India first innings scores :");
		System.out.println("Enter India second innings scores :");
		System.out.println("Enter England first innings scores :");
		System.out.println("Enter England second innings scores :");
		int india1 = reader.nextInt();
		int india2 = reader.nextInt();
		int england1 = reader.nextInt();
		int england2 = reader.nextInt();
		
		if((india1+india2)>(england1+england2)) {
			System.out.println("India won the VTalent ODI series 2022");
		}else if((india1+india2)<(england1+england2)) {
			System.out.println("England won the VTalent ODI series 2022");
		}else {
			System.out.println("Match Drawn");
		}
		
	}

}
