package com.example.financereborn.presenters;

import android.util.Log;
import android.view.View;

import com.example.financereborn.odp.ObserverActivity;
import com.example.financereborn.views.IDashboardView;

public class DashboardViewPresenter extends ObserverActivity {

	@Override
	public void update() {
		Log.d("info", "Oh yeah, I got in bro.");
		IDashboardView view = (IDashboardView) super.getSubject();
		view.setWelcomeMsg("DUDE THIS ROCKS!");
	}

	@Override
	public void update(View v) {

	}
}
