package com.example.financereborn.presenters;

import com.example.financereborn.activities.DashboardViewActivity;
import com.example.financereborn.activities.RegisterViewActivity;
import com.example.financereborn.database.Database;
import com.example.financereborn.models.User;
import com.example.financereborn.odp.ObserverActivity;
import com.example.financereborn.views.IWelcomeView;

import com.example.financereborn.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public class WelcomeViewPresenter extends ObserverActivity {

	public WelcomeViewPresenter() {

	}

	@Override
	public void update(View v) {
		switch (v.getId()) {
		case R.id.mainActivity_Button_login:
			Log.w("info", "Yep, the login button got pressed.");
			IWelcomeView view = (IWelcomeView) super.getSubject();
			String pass = view.getPassword();
			String username = view.getUsername();
			if (Database.login(username, pass)) {
				startDashboardActivity();
				finishActivity();
			} else {
				new AlertDialog.Builder(super.getSubject()).setTitle("Eww")
						.setMessage("Bad credentials.")
						.setNeutralButton("Fine", null).show();
			}
			break;
		case R.id.mainActivity_Button_register:
			Log.w("info", "Yep, the register button got pressed.");
			startRegisterActivity();
			break;
		}
	}

	private void startDashboardActivity() {
		Activity activity = super.getSubject();
		Intent intent = new Intent(activity, DashboardViewActivity.class);
		activity.startActivity(intent);
	}

	private void startRegisterActivity() {
		Activity activity = super.getSubject();
		Intent intent = new Intent(activity, RegisterViewActivity.class);
		activity.startActivity(intent);
	}
	
	private void finishActivity() {
		Activity activity = super.getSubject();
		activity.finish();
	}
}
