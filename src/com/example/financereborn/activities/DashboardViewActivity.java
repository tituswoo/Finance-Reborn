package com.example.financereborn.activities;

import com.example.financereborn.R;
import com.example.financereborn.R.layout;
import com.example.financereborn.R.menu;
import com.example.financereborn.odp.SubjectActivity;
import com.example.financereborn.presenters.DashboardViewPresenter;
import com.example.financereborn.views.IDashboardView;

import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class DashboardViewActivity extends SubjectActivity implements
		IDashboardView {

	DashboardViewPresenter presenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dashboard_view);

		presenter = new DashboardViewPresenter();
		registerObserver(presenter);
		notifyObservers();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dashboard_view, menu);
		return true;
	}

	@Override
	public void setWelcomeMsg(String msg) {
		TextView textView = (TextView) findViewById(R.id.dashboard_TextEdit_welcomeMsg);
		textView.setText(msg);
	}

	@Override
	public String getWelcomeMsg() {
		TextView textView = (TextView) findViewById(R.id.dashboard_TextEdit_welcomeMsg);
		return textView.getText().toString();
	}

}
