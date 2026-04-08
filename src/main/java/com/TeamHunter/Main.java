package com.TeamHunter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("give your name: ");
		String name = scan.nextLine();
		System.out.println("give Your age: ");
		int age = scan.nextInt();
		
		User user = new User(name,age,100);
		UserManager.addUser(user);
		while (true) {
			System.out.println("amount to bet: ");
//		Slots.betSlots(scan.nextDouble());
		Slots slots = new Slots();
		}
		
//		
//		Dice d6 = new Dice(6);
//		Dice d8 = new Dice(8);
//		System.out.println(d6.rollDice());
//		System.out.println(d8.rollDice());
	}

}
