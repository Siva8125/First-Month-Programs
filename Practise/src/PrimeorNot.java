
public class PrimeorNot {
	public static void main(String[] args) {

	    int n = 11;
	    int count = 0;
	     if (n <= 1)
		    count++;
	    for (int i = 2; i <= n / 2; i++) {
	      
	      if (n % i == 0) {
	        count++;
	      }
	    }

	    if ( count > 0)
	      System. out.println("The number is not prime");
	    else
	      System. out.println("The number is prime");
	  }

}
//if there occur more than two factors the number is not prime. Basically divide the number by all the natural numbers less than or equal to it, if it is completely divisible by any number except 1 or itself, it is not prime.