package com;
import java.util.Random;
import java.util.random.*;
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
		num1 = random.nextInt(16);
		num2 = random.nextInt(16);
		num3 = random.nextInt(16);
	}
	public void spin() {
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
					
				}
			}
		}
		
	}
}
