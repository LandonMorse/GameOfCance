package com.TeamHunter;

import java.util.ArrayList;
public class UserManager {
	private static ArrayList<User> users = new ArrayList<User>();
	
	public void addUser(User user1) {
		users.add(user1);
	}
	//public ArrayList<User> getUser(int num){
		//return users.get(num);
	//}
}
