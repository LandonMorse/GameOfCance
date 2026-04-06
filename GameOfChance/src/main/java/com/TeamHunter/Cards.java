package com.TeamHunter;
import java.util.Random;
import java.util.ArrayList; 
public class Cards {
	private static ArrayList<String> deck = new ArrayList<String>();
	private static char[] card = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A' };
	private static String[] suit = {" ♠"," ♥"," ♦"," ♣"};
	
	public Cards() {
	
	Random rand = new Random();
	boolean[][] used = new boolean[13][4];
	int count = 0;

	while (count < 52) {
	    int r = rand.nextInt(13);
	    int s = rand.nextInt(4);

	    if (!used[r][s]) {
	        used[r][s] = true;
	       deck.add(card[r] + suit[s]);
	        count++;
	    }
		
		
	
	
	
	//int randomCards = rand.nextInt(13);
	//String randomSuits = suit[rand.nextInt(suit.length)];
	
	//System.out.println(card[randomCards]);
	//System.out.println(randomSuits);
	
}
	
	
	
	//System.out.println(deck);
	}
	public ArrayList<String> getDeck(){
		return this.deck;
	}
	
}
	

