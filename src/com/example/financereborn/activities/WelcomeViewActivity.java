package com.example.financereborn.activities;

import com.example.financereborn.R;
import com.example.financereborn.R.layout;
import com.example.financereborn.R.menu;
import com.example.financereborn.odp.SubjectActivity;
import com.example.financereborn.presenters.WelcomeViewPresenter;
import com.example.financereborn.views.IWelcomeView;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class WelcomeViewActivity extends SubjectActivity implements
		IWelcomeView {

	WelcomeViewPresenter presenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome_view);

		presenter = new WelcomeViewPresenter();
		registerObserver(presenter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public String getUsername() {
		EditText editText = (EditText) findViewById(R.id.welcome_EditText_username);
		return editText.getText().toString();
	}

	@Override
	public String getPassword() {
		EditText editText = (EditText) findViewById(R.id.welcome_EditText_password);
		return editText.getText().toString();
	}
}
