package com.example.financereborn.models;

/**
 * User contains all basic information about a single user.
 * 
 * @author Titus Woo
 * 
 */
public class User implements IUser {
	private String firstName;
	private String lastName;
	private String username;
	private String uid;
	private String password;

	public User(String f, String l, String uName, String uId, String p) {
		firstName = f;
		lastName = l;
		username = uName;
		uid = uId;
		password = p;
	}

	public User(String uName, String p) {
		this("John", "Doe", uName, "1", p);
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public String getUid() {
		return uid;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public boolean setFirstName(String newFirstName) {
		if (isAlpha(newFirstName)) {
			firstName = newFirstName.trim();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean setLastName(String newLastName) {
		if (isAlpha(newLastName)) {
			lastName = newLastName.trim();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean setPassword(String newPassword) {
		password = newPassword;
		return true;
	}

	// Check to see if the text contains just letters:
	private boolean isAlpha(String text) {
		return text.matches("[a-zA-Z]+");
	}
}
