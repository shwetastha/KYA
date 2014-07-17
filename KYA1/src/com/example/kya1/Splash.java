package com.example.kya1;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(5000);
				} catch (InterruptedException e){
					e.printStackTrace();
				}finally{
					
					Intent openMainActivity = new Intent("com.example.kya1.MENU");
					startActivity(openMainActivity);
					
				}
			}
		};
		timer.start();
		
	
	
	}
}
