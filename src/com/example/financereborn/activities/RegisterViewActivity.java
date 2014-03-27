package com.example.financereborn.activities;

import com.example.financereborn.R;
import com.example.financereborn.R.layout;
import com.example.financereborn.R.menu;
import com.example.financereborn.odp.SubjectActivity;
import com.example.financereborn.presenters.RegisterViewPresenter;
import com.example.financereborn.views.IRegisterView;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.EditText;

public class RegisterViewActivity extends SubjectActivity implements IRegisterView {

	RegisterViewPresenter presenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register_view);

		
		presenter = new RegisterViewPresenter();
		registerObserver(presenter);
		
		getActionBar().setTitle("Register");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register_view, menu);
		return true;
	}

	@Override
	public String getFirstName() {
		EditText firstName = (EditText) findViewById(R.id.register_EditText_firstName);
		return firstName.getText().toString();
	}

	@Override
	public String getLastName() {
		EditText lastName = (EditText) findViewById(R.id.register_EditText_lastName);
		return lastName.getText().toString();
	}

	@Override
	public String getUsername() {
		EditText username = (EditText) findViewById(R.id.register_EditText_username);
		return username.getText().toString();
	}

	@Override
	public String getPassword() {
		EditText password = (EditText) findViewById(R.id.register_EditText_pass);
		return password.getText().toString();
	}

	@Override
	public String getConfirmPassword() {
		EditText confirmPass = (EditText) findViewById(R.id.register_EditText_confirmPass);
		return confirmPass.getText().toString();
	}

}
