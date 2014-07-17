package com.example.kya1;

import android.content.Intent;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class B extends Activity 
{
	ImageView i;
	Button b1,b2,b3,b4,b5,next,prev;
	int count;
	Intent openWrong = new Intent("com.example.kya1.WRONG");
	Intent openRight = new Intent("com.example.kya1.RIGHT");
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b);
        
        
		
        
        i=(ImageView) findViewById(R.id.imageView1);
        
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        next=(Button) findViewById(R.id.button6);
        prev=(Button) findViewById(R.id.button7);
        
        next.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent openB = new Intent("com.example.kya1.B");
				startActivity(openB);
			}
		});
        
        prev.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent openB = new Intent("com.example.kya1.B");
				startActivity(openB);
			}
		});
        
        i.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast t = Toast.makeText(getApplicationContext(), "B FOR ??", Toast.LENGTH_LONG);
				t.show();
				t.setGravity(Gravity.BOTTOM, 0, 0);
			}
		});
				b1.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						if(count == 0){
						
							i.setImageDrawable(getResources().getDrawable(R.drawable.b1));
						count++;
						}
						else{
							
							
							
							Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
							t.show();
							t.setGravity(Gravity.BOTTOM, 0, 0);
							startActivity(openWrong);
							
							
						}
						
					}
				});
				b2.setOnClickListener(new View.OnClickListener() {
					
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						if(count == 1){
												
							
							i.setImageDrawable(getResources().getDrawable(R.drawable.b2));
							count++;
							}
							else{
							
							
								Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
								t.show();
								t.setGravity(Gravity.BOTTOM, 0, 0);
								startActivity(openWrong);
								
							}
							
					}
				});
				b3.setOnClickListener(new View.OnClickListener() {
					
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						if(count == 2){
							i.setImageDrawable(getResources().getDrawable(R.drawable.b3));
							count++;
							}
							else{
								
								
								Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
								t.show();
								t.setGravity(Gravity.BOTTOM, 0, 0);
								startActivity(openWrong);
							}
					}
				});
				b4.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						
						if(count == 3){
							i.setImageDrawable(getResources().getDrawable(R.drawable.b4));
							count++;	
						}
							else{
								
								Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
								t.show();
								t.setGravity(Gravity.BOTTOM, 0, 0);
								startActivity(openWrong);
							}
					}
				});
b5.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						
						if(count == 4){
							i.setImageDrawable(getResources().getDrawable(R.drawable.b5));
							count++;	
							startActivity(openRight);
							
						}
							else{
								
								Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
								t.show();
								t.setGravity(Gravity.BOTTOM, 0, 0);
								startActivity(openWrong);
							}
					}
				});
				/*b5.setOnClickListener(new View.OnClickListener() {
					
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						if(count == 4){
							Toast t1 = Toast.makeText(getApplicationContext(), "COMPLETED!!!", Toast.LENGTH_LONG);
							t1.show();
							t1.setGravity(Gravity.BOTTOM, 0, 0);
							i.setImageDrawable(getResources().getDrawable(R.drawable.apple));
							
							count++;
							
							startActivity(openRight);
							
						}
							else{
								
								Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
								t.show();
								t.setGravity(Gravity.BOTTOM, 0, 0);
								startActivity(openWrong);
							} 
					}
				});*/
        
    }
    public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Intent openMainActivity = new Intent("com.example.kya1.MENU");
		startActivity(openMainActivity);
		this.finish();
	}

   
}