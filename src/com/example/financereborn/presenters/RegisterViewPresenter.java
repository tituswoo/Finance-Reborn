package com.example.financereborn.presenters;

import android.app.Activity;
import android.view.View;
import com.example.financereborn.R;

import com.example.financereborn.odp.ObserverActivity;

public class RegisterViewPresenter extends ObserverActivity {
	@Override
	public void update(View v) {
		switch (v.getId()) {
		case R.id.register_Button_cancel:
			finishActivity();
			break;
		case R.id.register_Button_register:

			break;
		}
	}

	private void finishActivity() {
		Activity activity = super.getSubject();
		activity.finish();
	}
}
