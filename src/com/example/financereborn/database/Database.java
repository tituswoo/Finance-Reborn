package com.example.financereborn.database;

import android.util.Log;

import com.example.financereborn.models.Account;
import com.example.financereborn.models.User;

/**
 * A singleton/facade to control the local storage and remote storage
 * stuff.
 * 
 * @author Titus Woo
 * 
 */
public class Database {

	private static Database instance = null;
	private static User user = new User("Titus", "Woo", "twoo", "pass");

	/*private Database() {
		// Do nothing
		getInstance();
	}

	public static Database getInstance() {
		if (instance == null) {
			synchronized (Database.class) {
				if (instance == null) {
					instance = new Database();
					user = new User("John", "Doe", "John", "jdoe", "pass123");
					load();
				}	
			}			
		}

		return instance;
	}*/
	
	public static User getUser() {
		return user;
	}

	public static boolean save() {
		if (hasInternetConnection()) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean load() {
		if (hasInternetConnection()) {
			return false;
		} else {
			return true;
		}
	}

	public void refresh() {
		// TODO Auto-generated method stub

	}

	public static boolean addUser(User u) {
		if (hasInternetConnection()) {
			return false;
		} else {
			if (!userExists(u.getUsername())) {
				user = u;
				return true;
			} else {
				return false;
			}
		}
	}
	
	public static boolean addAccount(Account a) {
		if (hasInternetConnection()) {
			return false;
		} else {
			return user.getAccounts().add(a);
		}
	}

	public static boolean removeUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean login(String username, String pass) {
		if (username == null || pass == null) {
			return false;
		}
		
		if (hasInternetConnection()) {
			return false;
		} else {
			if (user.getUsername().equals(username)
					&& user.getPassword().equals(pass)) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static boolean userExists(String username) {
		if (hasInternetConnection()) {
			return false;
		} else {
			if (user.getUsername().equals(username)) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static boolean hasInternetConnection() {
		return false;
	}

}
