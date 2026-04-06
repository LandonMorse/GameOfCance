package com.TeamHunter;
import java.util.Random;
public class Dice {
private int sides;

private final int MIN = 1;
Random r = new Random();
	public Dice(int sides) {
		this.sides = sides;
		
	}
	public int getSides() {
		return this.sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	public int rollDice() {
		int result = r.nextInt(MIN, sides + 1);
		return result;
	}
	public int rollDice(int Dice) {
		int value =1;
		return value;
	}
}
