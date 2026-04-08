package com.TeamHunter;

import java.util.ArrayList;
public class UserManager {
	private static ArrayList<User> users = new ArrayList<User>();
	
	public static void addUser(User user1) {
		users.add(user1);
	}
	public static User userSet() {
		return users.get(0);
	}
	//public ArrayList<User> getUser(int num){
		//return users.get(num);
	//}
}
