package com.example.financereborn.presenters;

import com.example.financereborn.R;

import android.app.Activity;
import android.view.View;

import com.example.financereborn.odp.ObserverActivity;

public class LoginViewPresenter extends ObserverActivity {
	@Override
	public void update(View v) {
		switch (v.getId()) {
		case R.id.login_Button_cancel:
			finishActivity();
			break;
		}
	}

	private void finishActivity() {
		Activity activity = super.getSubject();
		activity.finish();
	}
}
