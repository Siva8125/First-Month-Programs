package ideas;


public class WinningProbability {
	static float WinningProbability(String[] players,int arraylen,String winner) {
		float count = 0;
		for (int i = 0; i < arraylen; i++)
		if (players[i] == winner)
		count++;
		return count/ arraylen;
	}
    
	public static void main(String[] args) {
		String players[] = {"siva","phani","raju","subbu","adhi","balu" };
		
	    String winner = "siva";
	    int arraylen = players.length;
	    double presentwinner = WinningProbability(players, arraylen, winner);
	    double win = (double)Math.round(presentwinner * 100) / 100;
	    System.out.println("Probability of a player winning is: " + win);
		
	}

}
