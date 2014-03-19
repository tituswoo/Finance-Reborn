package com.example.financereborn.odp;

import android.app.Activity;
import android.view.View;

/**
 * An Obserer watches a Subject for changes in state.
 * 
 * @author Titus Woo
 * 
 */
public interface IObserver {

	/**
	 * Do stuff when Subject changes state. This is general; it's up to this
	 * Observer to figure out what happened and what to do with it.
	 */
	public void update();

	/**
	 * Do stuff when the Subject changes state. Specifically, when a button is
	 * pressed.
	 * 
	 * @param v
	 *            the view passes a reference of what was clicked.
	 */
	public void update(View v);

	/**
	 * Gives the Observer access to the Subject.
	 * 
	 * @param subject
	 */
	public void bindTo(Activity subject);
}
