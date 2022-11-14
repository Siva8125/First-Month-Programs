import java.util.Scanner;

public class Ticketprice {
public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter distance travelled: ");
        int dist = in.nextInt();
        
        int fare = 0;
        
        if (dist <= 0)
            fare = 0;
        else if (dist <= 10)
            fare = 80;
        else if (dist <= 20)
            fare = 80 + (dist - 10) * 6;
        else if (dist <= 30)
            fare = 80 + 60 + (dist - 20) * 5;
        else if (dist > 30)
            fare = 80 + 60 + 50 + (dist - 30) * 4;
            
        System.out.println("Fare = " + fare);
    }

}
