package com.example.kya1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class gridMenu extends Activity
{
	/** Called when the activity is first created **/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_menu);
        GridView gv = (GridView) findViewById(R.id.gridView);
        gv.setAdapter(new gridImageAdapter(getApplicationContext()));
        gv.setOnItemClickListener(new OnItemClickListener(){
        	public void onItemClick(AdapterView<?> parentView, View iv, int position,long id){
        		//Toast.makeText(getApplicationContext(), ""+position, Toast.LENGTH_SHORT).show();
        		
        		   
                Intent info = getIntent();
                String cheese =(String) info.getExtras().get("section");

               // Toast ta = Toast.makeText(getApplicationContext(),cheese, Toast.LENGTH_LONG);
        	//	ta.show();
        		
        		if (cheese.equals("Test"))
        		{
        		
        			Intent i = new Intent(getApplicationContext(),Test.class);
        			i.putExtra("id",position);
        			startActivity(i);
        		}
        		else if (cheese.equals("Learn"))
        		{
        			Intent i = new Intent(getApplicationContext(),Learn.class);
        			i.putExtra("id",position);
        			startActivity(i);
        		}
        	}
        });
}
    
    public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Intent openMainActivity = new Intent(getApplicationContext(),Menu.class);
		
		
		startActivity(openMainActivity);
		//this.finish();
	}
}
