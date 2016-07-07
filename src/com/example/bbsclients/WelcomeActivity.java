package com.example.bbsclients;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class WelcomeActivity extends BaseAcitivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Òþ²ØÐéÄâ°´Å¥
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
			getWindow().getDecorView().setSystemUiVisibility(
					View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
		}
		setContentView(R.layout.activity_welcome);
	}

	@Override
	protected void onResume() {
		super.onResume();
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				toIntent();
			}
		}, 5000);
	}

	/**
	 * Ìø×ªÒ³Ãæ
	 */
	private void toIntent() {
		Intent intent = new Intent();
		intent.setClass(WelcomeActivity.this, ClientActivity.class);
		startActivity(intent);
	}

	@Override
	protected void findView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void setListen() {
		// TODO Auto-generated method stub
		
	}

}
