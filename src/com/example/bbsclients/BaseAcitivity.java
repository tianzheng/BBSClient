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
		// ͸��״̬��
		getWindow()
				.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		// ͸���ײ�������
		getWindow().addFlags(
				WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

		requestWindowFeature(Window.FEATURE_NO_TITLE);// ȥ��������

		httpUtils=new HttpUtils();
		dialog = new ProgressDialog(BaseAcitivity.this);
		gson=new Gson();
		dialog.setTitle("��������");
		dialog.setMessage("�͹�Ī��,ĪС������Ŭ��Ѱ������");
	}
	
	protected abstract void findView();
	protected abstract void initData();
	protected abstract void setListen();
}
