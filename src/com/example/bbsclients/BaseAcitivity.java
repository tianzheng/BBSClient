package com.example.bbsclients;

import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public abstract class BaseAcitivity extends Activity {
	ProgressDialog dialog;
    HttpUtils  httpUtils;
    Gson gson;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 透明状态栏
		getWindow()
				.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		// 透明底部导航栏
		getWindow().addFlags(
				WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

		requestWindowFeature(Window.FEATURE_NO_TITLE);// 去掉标题栏

		httpUtils=new HttpUtils();
		dialog = new ProgressDialog(BaseAcitivity.this);
		gson=new Gson();
		dialog.setTitle("请求数据");
		dialog.setMessage("客官莫急,莫小二正在努力寻找数据");
	}
	
	protected abstract void findView();
	protected abstract void initData();
	protected abstract void setListen();
}
