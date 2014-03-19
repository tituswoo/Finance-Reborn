package com.example.financereborn.database;

/**
 * Interface ensures storage have basic, required methods to operate properly.
 * 
 * @author Titus Woo
 * 
 */
public interface IStorage {
	/**
	 * Saves to storage.
	 * 
	 * @return
	 */
	public boolean save();

	/**
	 * Loads from storage.
	 * 
	 * @return
	 */
	public boolean load();

	/**
	 * Refreshes the storage.
	 */
	public void refresh();
}
