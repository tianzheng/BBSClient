package com.example.bbsclients;

import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest.HttpMethod;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseAcitivity {
	EditText inputName, inputPassword;
	Button login;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		findView();
		initData();
		setListen();
	}

	@Override
	protected void findView() {
		inputName = (EditText) findViewById(R.id.name);
		inputPassword = (EditText) findViewById(R.id.password);
		login = (Button) findViewById(R.id.login);
	}

	@Override
	protected void initData() {

	}

	@Override
	protected void setListen() {
		login.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String name = inputName.getText().toString();
				String password = inputPassword.getText().toString();
				if ("".equals(name) && "".equals(password)) {
					Toast.makeText(LoginActivity.this, "用户名和密码不能为空",
							Toast.LENGTH_SHORT).show();
				} else {
					loadData(name,password);
				}

			}
		});

	}

	private void loadData(String ...data){
		String url=ConstantValue.getLoginUrl(data);
		httpUtils.send(HttpMethod.GET, url, new RequestCallBack<String>() {

			@Override
			public void onFailure(HttpException arg0, String arg1) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onSuccess(ResponseInfo<String> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
}
