package com.example.financereborn.models;

import java.util.ArrayList;
import java.util.List;

import com.example.financereborn.models.Account;

public class Accounts {
	private List<Account> accounts;

	public Accounts() {
		accounts = new ArrayList<Account>();
		accounts.add(new Account("account 1", "description for 1"));
		accounts.add(new Account("account dos", "description for dos"));
		accounts.add(new Account("account 3", "description for 3rd account"));
	}

	public boolean add(Account a) {
		if (a != null) {
			accounts.add(a);
			return true;
		} else {
			return false;
		}
	}

	public boolean remove(Account a) {
		return accounts.remove(a);
	}

	public List<Account> getAccounts() {
		return accounts;
	}
}
