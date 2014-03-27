package com.example.financereborn.presenters;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.example.financereborn.R;

import com.example.financereborn.database.Database;
import com.example.financereborn.models.User;
import com.example.financereborn.odp.ObserverActivity;
import com.example.financereborn.views.IRegisterView;

public class RegisterViewPresenter extends ObserverActivity {

	@Override
	public void update(View v) {
		switch (v.getId()) {
		case R.id.register_Button_cancel:
			finishActivity();
			break;
		case R.id.register_Button_register:
			if (!checkRegistration()) {
				new AlertDialog.Builder(super.getSubject())
						.setTitle("Eww")
						.setMessage(
								"Something's not filled out correctly. Please try again.")
						.setNeutralButton("Okay", null).show();
			} else {
				IRegisterView view = (IRegisterView) super.getSubject();
				
				String f = view.getFirstName();
				String l = view.getLastName();
				String username = view.getUsername();
				String pswd = view.getPassword();
				
				if (Database.addUser(new User(f, l, username, pswd))) {
					toast("User registered sucessfully.");
					finishActivity();
				} else {
					toast("ERROR: Failed to register user. Try again.");
				}				
			}
			break;
		}
	}

	private void finishActivity() {
		Activity activity = super.getSubject();
		activity.finish();
	}

	private boolean checkRegistration() {
		boolean passed = true;
		
		IRegisterView view = (IRegisterView) super.getSubject();

		if (view.getUsername().equals(""))
			passed = false;
		if (view.getPassword().equals(""))
			passed = false;
		if (!view.getPassword().equals(view.getConfirmPassword()))
			passed = false;
		if (view.getFirstName().equals(""))
			passed = false;
		if (view.getLastName().equals(""))
			passed = false;

		return passed;
	}
	
	private void toast(String msg) {
		Context context = super.getSubject().getApplicationContext();
		CharSequence text = msg;
		int duration = Toast.LENGTH_SHORT;
		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
	}
}
