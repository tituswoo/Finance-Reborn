package com.example.financereborn.activities;

import com.example.financereborn.R;
import com.example.financereborn.R.layout;
import com.example.financereborn.R.menu;
import com.example.financereborn.odp.SubjectActivity;
import com.example.financereborn.presenters.RegisterViewPresenter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class RegisterViewActivity extends SubjectActivity {

	RegisterViewPresenter presenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register_view);

		presenter = new RegisterViewPresenter();
		registerObserver(presenter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register_view, menu);
		return true;
	}

}
