package com.TeamHunter;
import java.util.Random;
import java.util.Scanner;
public class Roulette {
	public static int roulette() {
	int[] numberWheel = {6,3,1,9,4,2,3,3,1,4,7,4,2,5,8,5,6,1,6,10,7,4,7,8,8,5,9,9,2,6,10,20};//size 32
	int loop = 0;
	while(loop == 0){
		Random rand = new Random();
		Scanner userChoiceNum = new Scanner(System.in);
		System.out.println(numberWheel);
		try {
			System.out.println("select a number: ");
			if(!userChoiceNum.hasNextInt()) {
				System.out.println("invalid input. Please use numbers only.");
			}
			int userNum = userChoiceNum.nextInt();
		}
		catch(Exception e) {
			System.out.println("An Error has occured: "+ e.getMessage());
		}
		finally {
			userChoiceNum.close();
		}
		int max = numberWheel.length;
		int min = 1;
		int randomInt = rand.nextInt((max - min)+1)+min;
		int i = randomInt -= 1;
		for(int number: numberWheel) {
			if(i == number) {
				return number;
		}
		}
		
		loop +=1;
		}
	return 0;
	}
}
