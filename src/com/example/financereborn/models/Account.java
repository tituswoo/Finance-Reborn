package com.example.financereborn.models;

public class Account {
	private String name;
	private String desc;
	private Transactions transactions;

	public Account(String n, String d) {
		name = n;
		desc = d;
		transactions = new Transactions();
	}

	public String getDesc() {
		return desc;
	}

	public String getName() {
		return name;
	}

	public Transactions getTransactions() {
		return transactions;
	}

	public void setDesc(String d) {
		desc = d;
	}

	public void setName(String n) {
		name = n;
	}
}
