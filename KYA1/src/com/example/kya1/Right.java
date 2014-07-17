package com.example.kya1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Right extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.right);
	
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(2000);
				} catch (InterruptedException e){
					e.printStackTrace();
				}finally{
					
					Intent info = getIntent();
					
					int position =(Integer) info.getExtras().get("id");
					String section =(String) info.getExtras().get("section");
					
					if (position == 9)
					{
						position = -1;
					}
									
					if(section.equals("Learn"))
					{
					Intent openMainActivity = new Intent("com.example.kya1.LEARN");
					openMainActivity.putExtra("id",position+1);
					startActivity(openMainActivity);
					}
					else if(section.equals("Test"))
					{
						Intent openMainActivity = new Intent("com.example.kya1.TEST");
						openMainActivity.putExtra("id",position+1);
						startActivity(openMainActivity);	
					}
					
				}
			}
				

			};
			timer.start();
		
	
	}
}
