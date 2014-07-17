package com.example.kya1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class gridImageAdapter extends BaseAdapter
{
	public static int[] images = 
	{
		R.drawable.a, R.drawable.b,
		R.drawable.c, R.drawable.d,R.drawable.e,R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j
	};
	
	public static int[] imagesObject = 
		{
			R.drawable.apple, R.drawable.b5,
			R.drawable.c5,R.drawable.d5,R.drawable.e5,R.drawable.f5,R.drawable.g5,R.drawable.h5,R.drawable.i5,R.drawable.j5
		};
	
	public static int[] imagesObjectPartial = 
		{
			R.drawable.a0,R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.apple,
			R.drawable.b0,R.drawable.b1,R.drawable.b2,R.drawable.b3,R.drawable.b4,R.drawable.b5,
			R.drawable.c0,R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5,
			R.drawable.d0,R.drawable.d1,R.drawable.d2,R.drawable.d3,R.drawable.d4,R.drawable.d5,
			R.drawable.e0,R.drawable.e1,R.drawable.e2,R.drawable.e3,R.drawable.e4,R.drawable.e5,
			R.drawable.f0,R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5,
			R.drawable.g0,R.drawable.g1,R.drawable.g2,R.drawable.g3,R.drawable.g4,R.drawable.g5,
			R.drawable.h0,R.drawable.h1,R.drawable.h2,R.drawable.h3,R.drawable.h4,R.drawable.h5,
			R.drawable.i0,R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,
			R.drawable.j0,R.drawable.j1,R.drawable.j2,R.drawable.j3,R.drawable.j4,R.drawable.j5
		};
	
	public static String word[][]={{"A","P","P","L","E"},{"B","R","E","A","D"}};

private Context context;
public gridImageAdapter(Context applicationContext) {
	context=applicationContext;
}


public int getCount() {
	// number of data elements to be displayed
	return images.length;
}


public Object getItem(int arg0) {
	// TODO Auto-generated method stub
	return null;
}


public long getItemId(int arg0) {
	// TODO Auto-generated method stub
	return 0;
}


public View getView(int position, View convertView, ViewGroup parent) {
	// TODO Auto-generated method stub
	ImageView iv;
	if(convertView!=null){
		iv=(ImageView) convertView;
		
	}
	else
	{
		iv=new ImageView(context);
		iv.setLayoutParams(new GridView.LayoutParams(50,50));
		iv.setScaleType(ScaleType.CENTER_CROP);
		iv.setPadding(8,8,8,8);
		
	}
	iv.setImageResource(images[position]);
	return iv;
}

}
