package com.example.financereborn.models;

import java.util.ArrayList;
import java.util.List;

public class Transactions {
	private List<Transaction> transactions;

	public Transactions() {
		transactions = new ArrayList<Transaction>();
	}

	public List<Transaction> find(double amount) {
		List<Transaction> list = new ArrayList<Transaction>();
		
		for (Transaction t : transactions) {
			if (t.getAmount() == amount) {
				list.add(t);
			}
		}
		
		return list;
	}

	public boolean add(Transaction t) {
		return transactions.add(t);
	}

	public boolean remove(Transaction t) {
		return transactions.remove(t);
	}
}
