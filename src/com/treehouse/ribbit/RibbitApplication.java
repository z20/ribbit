package com.treehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() {
		  super.onCreate();
		  Parse.initialize(this, "rLwYz0zpi7BDkFffR1Zppod63a8rg24eBfjgJDZH", "ktwR0SjfJwv43tTOHFQZDGdK2jZSZ5k8vUNhUsic");
		  
		  ParseObject testObject = new ParseObject("TestObject");
		  testObject.put("foo", "bar");
		  testObject.saveInBackground();
		}

}
