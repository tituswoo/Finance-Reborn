package com.example.financereborn.models;

import java.util.Calendar;
import java.util.Date;

public class Transaction {
	private String desc;
	private String cat;
	private double amount;
	private Date date;

	public Transaction(double a, String d, String c) {
		this.amount = a;
		desc = d;
		cat = c;
		date = Calendar.getInstance().getTime();
	}

	public String getCategory() {
		return cat;
	}

	public void setCategory(String c) {
		cat = c;
	}

	public String getDescription() {
		return desc;
	}

	public void setDescription(String d) {
		desc = d;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double a) {
		amount = a;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date d) {
		date = d;
	}
}
