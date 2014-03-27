package com.example.financereborn.activities;

import java.util.ArrayList;
import java.util.List;

import com.example.financereborn.R;
import com.example.financereborn.R.layout;
import com.example.financereborn.R.menu;
import com.example.financereborn.database.Database;
import com.example.financereborn.models.Account;
import com.example.financereborn.odp.SubjectActivity;
import com.example.financereborn.presenters.DashboardViewPresenter;
import com.example.financereborn.views.IDashboardView;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
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
		
		listAccounts();
		getActionBar().setTitle("Dashboard");
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
	
	@Override
	public void listAccounts() {
		ArrayList<String> accounts = new ArrayList<String>();
		
		for (Account a : Database.getUser().getAccounts()) {
			accounts.add(a.getName());
		}
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, accounts);
		ListView listView = (ListView) findViewById(R.id.dashboard_ListView_accounts);
		listView.setAdapter(adapter);
	}
}
