package com.example.financereborn.database;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import com.example.financereborn.models.Account;
import com.example.financereborn.models.User;
import com.google.gson.Gson;

/**
 * A singleton/facade to control the local storage and remote storage stuff.
 * 
 * @author Titus Woo
 * 
 */
public class Database {

	private static Database instance = null;
	private static User user = new User("Titus", "Woo", "twoo", "pass");
	private static String FILENAME = "userData.json";

	/*
	 * private Database() { // Do nothing getInstance(); }
	 * 
	 * public static Database getInstance() { if (instance == null) {
	 * synchronized (Database.class) { if (instance == null) { instance = new
	 * Database(); user = new User("John", "Doe", "John", "jdoe", "pass123");
	 * load(); } } }
	 * 
	 * return instance; }
	 */

	public static User getUser() {
		return user;
	}

	public static boolean save() {
		if (hasInternetConnection()) {
			return false;
		} else {
			return saveLocally();
		}
	}

	private static boolean saveLocally() {

		PrintWriter writer = null;
		// try {
		// This code is from Bob Waters:
		/*
		 * We are storing our text file in the downloads directory, so use the
		 * environment to get that directory.
		 */

		// final File file = new File(
		// Environment
		// .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
		// FILENAME);
		// file.getParentFile().mkdirs();
		/*
		 * We make a new printwriter so that we can use println to print out the
		 * text.
		 */
		// writer = new PrintWriter(new FileWriter(file));
		// FileOutputStream fout = new FileOutputStream(file.toString());
		// //Log.d("info","string rep: " + file.toString());
		// PrintWriter writer1 = new PrintWriter(file);

		// using google json library
		// Gson gSon = new Gson();
		// String json = gSon.toJson(user);

		/*
		 * Scanner scanner = new Scanner(json); while (scanner.hasNextLine()) {
		 * writer1.prin(scanner.nextLine()); } scanner.close();
		 */

		/*
		 * Now use the gson library to convert the model to a string Then write
		 * that string out
		 */
		// writer1.println(gSon.toJson(user));
		// writer1.close();
		// Log.d("info", "wrote json: " + gSon.toJson(user));
		// } catch (IOException e) {
		// Log.e("error", "IO problem writing the json");
		// } finally {
		// if (writer != null) {
		// writer.close();
		// }
		// }

		// try {
		/*
		 * Gson gSon = new Gson(); String json = gSon.toJson(user);
		 * 
		 * FileOutputStream fOut = new FileOutputStream("userData.json");
		 * OutputStreamWriter osw = new OutputStreamWriter(fOut);
		 * osw.write(json); osw.flush(); osw.close(); //BufferedWriter out = new
		 * BufferedWriter(new FileWriter("test.txt"));
		 * //Log.d("custom_io","OH YEAH!"); Log.e("custom_io","DONE DEAL!");
		 */

		// FileOutputStream fos =
		// getApplicationContext().openFileOutput("userData.json",
		// Context.MODE_PRIVATE);
		// } catch (IOException e) {
		// TODO Auto-generated catch block
		// Log.e("error", "IO ERROR.");
		// }

		return true;
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
				save();
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
			boolean success = user.getAccounts().add(a);
			save();
			return success;
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
