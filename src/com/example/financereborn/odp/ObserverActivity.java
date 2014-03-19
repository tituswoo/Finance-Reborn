package com.example.financereborn.odp;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * An object that can observer Subjects.
 * 
 * @author Titus Woo
 * 
 */

public class ObserverActivity extends Activity implements IObserver {
	private Activity view;

	public ObserverActivity() {
		view = new SubjectActivity();
	}

	/**
	 * Returns the Subject this Observer is bound to.
	 * 
	 * @return
	 */
	public Activity getSubject() {
		return view;
	}

	@Override
	public void update() {
		Log.w("info", view.toString() + " changed state.");
	}

	@Override
	public void update(View v) {
		Button b = (Button) v;
		Log.w("info", b.getText().toString() + " was clicked.");
	}

	@Override
	public void bindTo(Activity subject) {
		view = subject;
	}
}
