package com.TeamHunter;

import java.util.Scanner;

public class User {
private String name;
private int age;
private double wallet;
public void setName(String name) {
	if (name == null) {
		throw new SecurityException("name not found please enter corect name ");
	} else {
	this.name = name;
	}
}
public String getName() {
	return this.name;
}

public void setAge(int age) {
	if (age >= 6) {
		this.age = age;
	} else {
		throw new SecurityException("you are to young to be gampling ");
	}
	
}
public int getAge() {
	return this.age;
}

public void setWallet(double wallet) {
	if (wallet == 0 ) {
		throw new SecurityException("you have no funds ");
	}
	this.wallet = wallet;
}
public double getWallet() {
	return this.wallet;
}

public void makebet(double bet) {
	try {
		if (bet <= this.wallet) {
			this.wallet -= bet;
		} else {
			System.out.println("noy enghouf moeny ");
		}
		
	} catch(Exception e) {
	System.out.print("make your bet");
	}
	
	
}
public void addfunds(double wallet) {
	try {
		this.wallet += wallet;
	} catch(Exception e) {
		System.out.print("invalid amount");
	}
	
}

public User( String name , int age, double funds) {
	setName(name);
	setAge(age);
	setWallet(funds);
}



}
