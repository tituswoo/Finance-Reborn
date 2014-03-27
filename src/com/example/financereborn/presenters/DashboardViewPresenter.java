package com.example.financereborn.presenters;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.example.financereborn.R;
import com.example.financereborn.activities.CreateNewAccountViewActivity;
import com.example.financereborn.database.Database;
import com.example.financereborn.odp.ObserverActivity;
import com.example.financereborn.views.IDashboardView;

public class DashboardViewPresenter extends ObserverActivity {

	@Override
	public void update() {
		Log.d("info", "Oh yeah, I got in bro.");
		IDashboardView view = (IDashboardView) super.getSubject();
		view.setWelcomeMsg("Welcome, " + Database.getUser().getFirstName() + '.');
	}

	@Override
	public void update(View v) {
		switch (v.getId()) {
		case R.id.dashboard_Button_createNewAccount:
			startCreateNewAccountActivity();
			break;
		}
	}
	
	private void startCreateNewAccountActivity() {
		Activity activity = super.getSubject();
		Intent intent = new Intent(activity, CreateNewAccountViewActivity.class);
		activity.startActivity(intent);
	}
}
