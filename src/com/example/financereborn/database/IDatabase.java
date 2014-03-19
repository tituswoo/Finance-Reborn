package com.example.financereborn.database;

import com.example.financereborn.models.User;

public interface IDatabase {
	public boolean addUser(User user);

	public boolean removeUser(User user);

	public boolean userExists(User user);

}
