package com.example.financereborn.odp;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.view.View;

/**
 * An object that can be watched by Observers.
 * 
 * @author Titus Woo
 * 
 */

public class SubjectActivity extends Activity implements ISubject {

	private List<IObserver> observers;

	/**
	 * Constructor.
	 */
	public SubjectActivity() {
		observers = new ArrayList<IObserver>();
	}

	/**
	 * Adds an observer to notify when state changes.
	 * 
	 * @param observer
	 */
	@Override
	public void registerObserver(IObserver observer) {
		observers.add(observer);
		observer.bindTo(this);
	}

	/**
	 * Notifies this subject's observers that something happened.
	 */
	public void notifyObservers() {
		for (IObserver observer : observers) {
			observer.update();
		}
	}

	/**
	 * Notifies this subject's observers that something happened, specifically
	 * with a button. Passes in the button's info.
	 */
	public void notifyObservers(View v) {
		for (IObserver observer : observers) {
			observer.update(v);
		}
	}

	/**
	 * Notify all Observers whenever anything is clicked in the GUI.
	 * 
	 * @param view
	 */
	public void btnClicked(View view) {
		notifyObservers(view);
	}

	/**
	 * Removes the specified observer
	 * 
	 * @param observer
	 */
	public void deregisterObserver(IObserver observer) {
		observers.remove(observer);
	}
}
