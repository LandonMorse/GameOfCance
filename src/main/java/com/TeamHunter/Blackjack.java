package com.TeamHunter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class Blackjack {

	static int money = 100; 

    public static void menu() {
        try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			    System.out.println("\n===== BLACKJACK MENU =====");
			    System.out.println("1. Play Blackjack");
			    System.out.println("2. View Rules");
			    System.out.println("3. Check Balance");
			    System.out.println("4. Quit");
			    System.out.print("Choose an option: ");

			    String choice = scanner.nextLine();

			    switch (choice) {
			        case "1":
			            playBlackjack();
			            break;

			        case "2":
			            showRules();
			            break;

			        case "3":
			            System.out.println("Your current balance: $" + money);
			            break;

			        case "4":
			            System.out.println("Thanks for playing!");
			            return;

			        default:
			            System.out.println("Invalid choice.");
			    }
			}
		}
    }

	private static void showRules() {
		System.out.println("Number cards (2–10) → face value, Face cards (J, Q, K) → 10, Ace or A 1 or 11");
		System.out.println("on the player turn you start with two cards and you have to try to get to 21 "
				+ "so you can hit witch means you get another card if you stand you are ending your turn and if you go over 21 you bust");
		
		
		
		
	}
	
	
	private static int calculateHandValue(List<String> hand) {
	    int value = 0;
	    int aces = 0;
	    int change = 0;
	    for (int i = 0 ; i < hand.size(); i++) {
	    	
	    	String a1 = hand.get(i).substring(0, 1);
	    	
	        //String rank = hand(0, hand.size() - 1); // remove suit

	        switch (a1) {
	            case "A":
	                aces++;
	                value = value + 11;
	                break;
	            case "K":
	            	value += 10;
	            	break;
	            case "Q":
	            	value += 10;
	            	break;
	            case "J":
	                value += 10;
	                break;
	            case "2":
	            	value += 2;
	            	break;
	            case "3":
	            	value += 3;
	            	break;
	            case "4":
	            	value += 4;
	            	break;
	            case "5":
	            	value += 5;
	            	break;
	            case "6":
	            	value += 6;
	            	break;
	            case "7":
	            	value += 7;
	            	break;
	            case "8":
	            	value += 8;
	            	break;
	            case "9":
	            	value += 9;
	            	break;
	            case "T":
	            	value += 10;
	            	break;
	            	
	        }
	    }

	    // Adjust Aces from 11 → 1 if needed
	    while (value > 21 && aces > 0) {
	        value -= 10;
	        aces--;
	    }

	    return value;
	}
	
	

	private static void playBlackjack() {
		 Scanner scanner = new Scanner(System.in);
		 
		 
		 if (money <= 0) {
		        System.out.println("You have no money left!");
		        return;
		    }
		  System.out.println("You have $" + money);
		    System.out.print("Enter your bet: ");
		   
		    double bet;
		    try {
		        bet = scanner.nextDouble();
		        scanner.nextLine(); // FIX: clear buffer
		    } catch (Exception e) {
		        System.out.println("Invalid bet.");
		        return;
		    }

		    if (bet > money || bet <= 0) {
		        System.out.println("Invalid bet amount.");
		        return;
		    }
		    Stack<String> stack = new Stack<>();
		    Cards deck = new Cards();
		    for (String card : deck.getDeck()) {
		        stack.push(card);
		    }

		    // Deal initial hands
		    List<String> playerHand = new ArrayList<>();
		    List<String> dealerHand = new ArrayList<>();

		    playerHand.add(stack.pop());
		    playerHand.add(stack.pop());

		    dealerHand.add(stack.pop());
		    dealerHand.add(stack.pop());

		    System.out.println("Your hand: " + playerHand + " (" + calculateHandValue(playerHand) + ")");
		    System.out.println("Dealer shows: " + dealerHand.get(0));
		    
		    while (true) {
		        System.out.print("Hit or Stand: ");
		        String choice = scanner.next();

		        if (choice.equalsIgnoreCase("hit")) {
		            playerHand.add(stack.pop());
		            int value = calculateHandValue(playerHand);

		            System.out.println("Your hand: " + playerHand + " (" + value + ")");

		            if (value == 21) {
		                System.out.println("You hit 21!");
		                break;
		            }

		            if (value > 21) {
		                System.out.println("Bust!");
		                break;
		            }

		        } else if (choice.equalsIgnoreCase("stand")) {
		            break;

		        } else {
		            System.out.println("Invalid choice.");
		        }
		    }
		    System.out.println("\nDealer's turn...");
		    int dealerValue = calculateHandValue(dealerHand);
		    System.out.println("Dealer hand: " + dealerHand + " (" + dealerValue + ")");

		    // Dealer hits until 17+
		    while (dealerValue < 17) {
		        dealerHand.add(stack.pop());
		        dealerValue = calculateHandValue(dealerHand);
		        System.out.println("Dealer hits: " + dealerHand + " (" + dealerValue + ")");
		    }
		   
		   

		    // Final values
		    int playerValue1 = calculateHandValue(playerHand);
		   


		    System.out.println("\nFinal Hands:");
		    System.out.println("Your hand: " + playerHand + " (" + playerValue1 + ")");
		    System.out.println("Dealer hand: " + dealerHand + " (" + dealerValue + ")");

		    if (playerValue1 > 21) {
		        System.out.println("Bust! Dealer wins.");
		        money -= bet;
		    } else if (dealerValue > 21) {
		        System.out.println("Dealer busts. You win!");
		        money += bet;
		    } else if (playerValue1 > dealerValue) {
		        System.out.println("You win!");
		        money += bet;
		    } else if (playerValue1 == dealerValue) {
		        System.out.println("Push.");
		    } else {
		        System.out.println("Dealer wins.");
		        money -= bet;
		    }




	}
}



