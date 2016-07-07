package com.example.bbsclients;

public class ConstantValue {

	public final static String SERVER_IP="http://192.168.1.1:8080/";
	
	
	public static String getLoginUrl(String ... data){
		
		String url=SERVER_IP+"login?name="+data[0]+"&password="+data[1];
		return url;
	}
	
}
