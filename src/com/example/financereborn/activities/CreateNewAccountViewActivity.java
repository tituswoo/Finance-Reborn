package com.example.financereborn.activities;

import com.example.financereborn.R;
import com.example.financereborn.R.layout;
import com.example.financereborn.R.menu;
import com.example.financereborn.odp.SubjectActivity;
import com.example.financereborn.presenters.CreateNewAccountViewPresenter;
import com.example.financereborn.views.ICreateNewAccountView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class CreateNewAccountViewActivity extends SubjectActivity implements ICreateNewAccountView {

	CreateNewAccountViewPresenter presenter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_new_account_view);
		
		presenter = new CreateNewAccountViewPresenter();
		registerObserver(presenter);
		notifyObservers();
		
		getActionBar().setTitle("New Account");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.create_new_account_view, menu);
		return true;
	}

	@Override
	public String getAccountName() {
		TextView textView = (TextView) findViewById(R.id.create_new_account_EditText_accountName);
		return textView.getText().toString();
	}

	@Override
	public String getAccountDesc() {
		TextView textView = (TextView) findViewById(R.id.create_new_account_EditText_accountDesc);
		return textView.getText().toString();
	}

}
