package com.example.financereborn.odp;

import android.view.View;

/**
 * Subjects can be watched by observers.
 * 
 * @author Titus Woo
 * 
 */
public interface ISubject {

	/**
	 * Registers an observer to this subject.
	 * 
	 * @param observer
	 */
	public void registerObserver(IObserver observer);

	/**
	 * Notifies the observers that state has changed.
	 */
	public void notifyObservers();

	/**
	 * Do stuff when the Subject changes state. Specifically, when a button is
	 * pressed.
	 * 
	 * @param v
	 *            the view passes a reference of what was clicked.
	 */
	public void notifyObservers(View v);

	/**
	 * De-registers the observer so that it no longer watches this Subject.
	 * 
	 * @param observer
	 */
	public void deregisterObserver(IObserver observer);
}
