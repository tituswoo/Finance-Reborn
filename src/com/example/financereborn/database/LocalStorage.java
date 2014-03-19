package com.example.financereborn.database;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import android.os.Environment;
import android.util.Log;

import com.google.gson.Gson;

public class LocalStorage implements IStorage {

	Object object;
	String json;

	Gson gson = new Gson();

	public LocalStorage(Object obj) {
		object = obj;
		refresh();
	}

	@Override
	public void refresh() {
		json = gson.toJson(object);
		Log.d("json", json);
	}

	@Override
	public boolean save() {
		refresh();
		/*
		 * File file = new File(
		 * Environment.getExternalStoragePublicDirectory(Environment
		 * .DIRECTORY_DOWNLOADS), FILENAME + JSON_SUFFIX); StringBuffer buff =
		 * new StringBuffer(); BufferedReader reader = null; try { reader = new
		 * BufferedReader(new FileReader(file)); String s = reader.readLine();
		 * 
		 * while (s != null) { buff.append(s); s = reader.readLine(); } } catch
		 * (FileNotFoundException e) { Log.e("Error",
		 * "IO error when reading JSON file."); return false; } finally { if
		 * (reader != null) { reader.close(); } }
		 */

		return true;
	}

	@Override
	public boolean load() {
		// TODO Auto-generated method stub
		return false;
	}
}
