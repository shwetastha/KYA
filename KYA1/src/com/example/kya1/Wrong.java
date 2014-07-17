package com.example.kya1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wrong extends Activity{
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wrong);
		
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(2000);
				} catch (InterruptedException e){
					e.printStackTrace();
				}finally{
					
					
				 //Intent info = getIntent();

				   // final int position =(Integer) info.getExtras().get("id");
					//Intent openMainActivity = new Intent("com.example.kya1.LEARN");
					//openMainActivity.putExtra("id",position);
					//startActivity(openMainActivity);
					finish();
					
				}
			}
		
		};		
		timer.start();
			
		
	
	}
}
