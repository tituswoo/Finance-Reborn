package com.example.financereborn.activities;

import com.example.financereborn.R;
import com.example.financereborn.R.layout;
import com.example.financereborn.R.menu;
import com.example.financereborn.odp.SubjectActivity;
import com.example.financereborn.presenters.LoginViewPresenter;
import com.example.financereborn.views.ILoginView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LoginViewActivity extends SubjectActivity implements ILoginView {

	LoginViewPresenter presenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_view);

		presenter = new LoginViewPresenter();
		registerObserver(presenter);
		
		getActionBar().setTitle("Login");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_view, menu);
		return true;
	}
}
