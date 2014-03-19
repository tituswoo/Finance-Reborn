package com.example.financereborn.database;

import com.example.financereborn.models.User;

/**
 * Trying this out.. a facade to control the local storage and remote storage
 * stuff.
 * 
 * @author Titus Woo
 * 
 */
public class Database implements IDatabase, IStorage {

	@Override
	public boolean save() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean load() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean userExists(User user) {
		// TODO Auto-generated method stub
		return true;
	}

}
