package com.example.financereborn.presenters;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.financereborn.R;
import com.example.financereborn.database.Database;
import com.example.financereborn.models.Account;
import com.example.financereborn.odp.ObserverActivity;
import com.example.financereborn.views.ICreateNewAccountView;
import com.example.financereborn.views.IDashboardView;

public class CreateNewAccountViewPresenter extends ObserverActivity {
	@Override
	public void update() {
		Log.d("info", "Oh yeah, I got in bro.");
	}

	@Override
	public void update(View v) {
		switch (v.getId()) {
		case R.id.create_new_account_Button_cancel:
			finishActivity();
			break;
		case R.id.create_new_account_Button_addAccount:
			if (checkAccountInfo()) {
				ICreateNewAccountView view = (ICreateNewAccountView) super.getSubject();
				Database.addAccount(new Account(view.getAccountName(), view.getAccountDesc()));
				toast("Account create sucessfully.");
				finishActivity();
			} else {
				toast("Something isn't right. Try again.");
			}
			break;
		}
	}

	private boolean checkAccountInfo() {
		boolean passed = true;
		ICreateNewAccountView view = (ICreateNewAccountView) super.getSubject();

		if (view.getAccountName().equals("")
				|| view.getAccountDesc().equals("")) {
			passed = false;
		}

		return passed;
	}

	private void finishActivity() {
		Activity activity = super.getSubject();
		activity.finish();
	}

	private void toast(String msg) {
		Context context = super.getSubject().getApplicationContext();
		CharSequence text = msg;
		int duration = Toast.LENGTH_SHORT;
		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
	}
}
