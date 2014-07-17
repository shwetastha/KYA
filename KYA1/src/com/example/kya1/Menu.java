package com.example.kya1;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Menu extends Activity
{
	String classes[] = {"Learn","Test"};
	String classesLinks[] = {"gridMenu","gridMenu"};
	Button b1,b2,b3;

	//Intent ourIntent = new Intent("com.example.kya1.gridMenu");
	//String word[]={"A","P","P","L","E"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.menu);
		 
		  b1=(Button) findViewById(R.id.learn);
	      b2=(Button) findViewById(R.id.test);
	      b3=(Button) findViewById(R.id.exit);
	      
	      b1.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0)
				{
					// TODO Auto-generated method stub
					Intent i = new Intent(getApplicationContext(),gridMenu.class);
        			
					i.putExtra("section",classes[0]);
					startActivity(i);
					
				}
			});
	      b2.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0)
				{
					// TODO Auto-generated method stub
					Intent i = new Intent(getApplicationContext(),gridMenu.class);
					i.putExtra("section",classes[1]);
					startActivity(i);
					
				}
			});
	      b3.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					finish();
					System.exit(0);
				}
			});
	        
		//setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1 , classes)); 
	
	 
	//@Override
	//protected void onListItemClick(ListView l, View v, int position, long id)
	 //{
		
		//super.onListItemClick(l, v, position, id);
		
		//String cheese = classesLinks[position];
		//String section = ;
		
		
	}

	
	
}
	

