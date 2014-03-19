package com.example.financereborn.models;

public interface IUser {
	public String getFirstName();

	public String getLastName();

	public String getUsername();

	public String getUid();

	public String getPassword();

	public boolean setFirstName(String newFirstName);

	public boolean setLastName(String newLastName);

	public boolean setPassword(String newPassword);
}
