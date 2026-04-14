package com.TeamHunter;

import java.util.Random;
import java.util.random.*;
import java.util.Scanner;
public class Slots {
	private int num1;
	private int num2;
	private int num3;
	
	public void setSlots1(int num) {
		this.num1 = num;
	}
	public int getSlots1() {
		return this.num1;
	}
	public void setSlots2(int num) {
		this.num2 = num;
	}
	public int getSlots2() {
		return this.num2;
	}
	public void setSlots3(int num) {
		this.num3 = num;
	}
	public int getSlots3() {
		return this.num3;
	}
	public void randomNum() {
		Random random = new Random();
		this.num1 = random.nextInt(16);
		this.num2 = random.nextInt(16);
		this.num3 = random.nextInt(16);
	}
	public void spin(int num1 , int num2, int num3) {
		System.out.println("current Amount "+"$" + UserManager.userSet().getWallet());
		Scanner scan = new Scanner(System.in);
		double j = scan.nextDouble();
		
		UserManager.userSet().makebet( j);
		System.out.println("$" + UserManager.userSet().getWallet());
		if (num1 == num2 || num1 == num3 || num2 == num3) {
			UserManager.userSet().addfunds(j * 1.5);
		}
		if (num1 == num2 && num2 == num3 && num1 == num3) {
			UserManager.userSet().addfunds(j * 2);
		}
		if (UserManager.userSet().getWallet() <= 0 ) {
			System.exit(0);
		}
		System.out.println("$" + UserManager.userSet().getWallet());
		for (int i = 1; i <=3;i++) {
			if (i == 1) {
				if (num1 == 0) {
					System.out.println("🎲");
				}
				if (num1 == 1) {
					System.out.println("🛡️");
				}
				if (num1 == 2) {
					System.out.println("❤️");
				}
				if (num1 == 3) {
					System.out.println("7️");
				}
				if (num1 == 4) {
					System.out.println("🔔");
				}
				if (num1 == 5 ) {
					System.out.println("🍒");
				}
				if (num1 == 6 ) {
					System.out.println("💎");
				}
				if (num1 == 7 ) {
					System.out.println("7");
				}
				if (num1 == 8 ) {
					System.out.println("🍋");
				}
				if (num1 == 9 ) {
					System.out.println("⭐");
				}
				if (num1 == 10 ) {
					System.out.println("🔔");
				}
				if (num1 == 11 ) {
					System.out.println("🎲");
				}
				if (num1 == 12 ) {
					System.out.println("❤️");
				}
				if (num1 == 13 ) {
					System.out.println("🍒");
				}
				if (num1 == 14 ) {
					System.out.println("🍋");
				}
				if (num1 == 15 ) {
					System.out.println("⭐");
				}
			}
			if (i == 2) {
				if (num2 == 0) {
					System.out.println("🎲");
				}
				if (num2 == 1) {
					System.out.println("🛡️");
				}
				if (num2 == 2) {
					System.out.println("❤️");
				}
				if (num2 == 3) {
					System.out.println("7️");
				}
				if (num2 == 4) {
					System.out.println("🔔");
				}
				if (num2 == 5 ) {
					System.out.println("🍒");
				}
				if (num2 == 6 ) {
					System.out.println("💎");
				}
				if (num2 == 7 ) {
					System.out.println("7");
				}
				if (num2 == 8 ) {
					System.out.println("🍋");
				}
				if (num2 == 9 ) {
					System.out.println("⭐");
				}
				if (num2 == 10 ) {
					System.out.println("🔔");
				}
				if (num2 == 11 ) {
					System.out.println("🎲");
				}
				if (num2 == 12 ) {
					System.out.println("❤️");
				}
				if (num2 == 13 ) {
					System.out.println("🍒");
				}
				if (num2 == 14 ) {
					System.out.println("🍋");
				}
				if (num2 == 15 ) {
					System.out.println("⭐");
				}
			}
			if (i == 3) {
				if (num3 == 0) {
					System.out.println("🎲");
				}
				if (num3 == 1) {
					System.out.println("🛡️");
				}
				if (num3 == 2) {
					System.out.println("❤️");
				}
				if (num3 == 3) {
					System.out.println("7️");
				}
				if (num3 == 4) {
					System.out.println("🔔");
				}
				if (num3 == 5 ) {
					System.out.println("🍒");
				}
				if (num3 == 6 ) {
					System.out.println("💎");
				}
				if (num3 == 7 ) {
					System.out.println("7");
				}
				if (num3 == 8 ) {
					System.out.println("🍋");
				}
				if (num3 == 9 ) {
					System.out.println("⭐");
				}
				if (num3 == 10 ) {
					System.out.println("🔔");
				}
				if (num3 == 11 ) {
					System.out.println("🎲");
				}
				if (num3 == 12 ) {
					System.out.println("❤️");
				}
				if (num3 == 13 ) {
					System.out.println("🍒");
				}
				if (num3 == 14 ) {
					System.out.println("🍋");
				}
				if (num3 == 15 ) {
					System.out.println("⭐");
				}
			}
		}
		
	}
	public Slots() {
		randomNum();
		spin(this.num1,this.num2,this.num3);
	}
public static void betSlots(double bet) {
		
		try {
			
		UserManager.userSet().makebet(bet);
			
		} catch (Exception e){
			System.out.println(" not valid number ");
		}
}
public void slotsFuncDone() {
	Scanner scan = new Scanner(System.in);
	System.out.println("give your name: ");
	String name = scan.nextLine();
	System.out.println("give Your age: ");
	
	int age = scan.nextInt();
	User user = new User(name,age,100);
	UserManager.addUser(user);
	while (true) {
		System.out.println("amount to bet: ");
//	Slots.betSlots(scan.nextDouble());
	Slots slots = new Slots();
}
	

	
}
}
