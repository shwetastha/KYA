package com.example.kya1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class gridImageDetail extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid_imagedetail);
		Intent i = getIntent();
		
		int position =(Integer) i.getExtras().get("id");
		
		 ImageView iv = (ImageView) findViewById(R.id.imageView);
		 iv.setImageResource(gridImageAdapter.images[position]);
	}
}
