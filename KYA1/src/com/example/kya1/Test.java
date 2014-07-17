package com.example.kya1;


import java.util.Locale;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Test extends Activity implements TextToSpeech.OnInitListener {
ImageView i;
//Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
Button b[] = new Button[10];
TextView k[] = new TextView[5];

Intent openWrong = new Intent("com.example.kya1.WRONG");
Intent openRight = new Intent("com.example.kya1.RIGHT");

private TextToSpeech tts;

//Bundle extras = getIntent().getExtras();
//String[] word = extras.getStringArray("word1");

//Intent info = getIntent();

//int position =(Integer) info.getExtras().get("id");

public String[] setWord(int position)
{
	//String word[];
	if(position == 0)
	{
		String word[]={"A","P","P","L","E"};
	return word;
	}
	else if(position == 1)
	{
		String word[]={"B","R","E","A","D"};
		return word;
	}
	else if(position == 2) 
	{
		String word[]={"C","A","M","E","L"};
		return word;
	}
	else if(position == 3)
	{
		String word[]={"D","O","N","U","T"};
		return word;
	}
	else if(position == 4) 
	{
		String word[]={"E","A","G","L","E"};
		return word;
	}
	else if(position == 5) 
	{
		String word[]={"F","L","U","T","E"};
		return word;
	}
	else if(position == 6) 
	{
		String word[]={"G","H","O","S","T"};
		return word;
	}
	else if(position == 7) 
	{
		String word[]={"H","O","R","S","E"};
		return word;
	}
	else if(position == 8) 
	{
		String word[]={"I","N","D","I","A"};
		return word;
	}
	else 
	{
		String word[]={"J","O","K","E","R"};
		return word;
	}
}


//String word[]={"A","P","P","L","E"};
int currentLetterIndex=0;

int currentKeyIndex=0;



int count;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        Intent info = getIntent();
        
        tts = new TextToSpeech(this, this);

        final int position =(Integer) info.getExtras().get("id");
         
      
        
        ImageView iv = (ImageView) findViewById(R.id.imageView1);
        iv.setImageResource(gridImageAdapter.imagesObject[position]);
    
        final String word[]=setWord(position);
        String currentLetter=word[currentLetterIndex];  
        //i=(ImageView) findViewById(R.id.imageView1);
        
        
        b[0]=(Button) findViewById(R.id.button1);
        b[1]=(Button) findViewById(R.id.button2);
        b[2]=(Button) findViewById(R.id.button3);
        b[3]=(Button) findViewById(R.id.button4);
        b[4]=(Button) findViewById(R.id.button5);
        b[5]=(Button) findViewById(R.id.button6);
        b[6]=(Button) findViewById(R.id.button7);
        b[7]=(Button) findViewById(R.id.button8);
        b[8]=(Button) findViewById(R.id.button9);
        b[9]=(Button) findViewById(R.id.button10);
        
        
       
        /*for(int i=1; i<=10; i++)
        {
        	String btn = "button"+i;
        	 b[i]=(Button) findViewById(R.id.button1);
        	
        }*/
        
       
        
        k[0] = (TextView) findViewById(R.id.key1);
        k[1] = (TextView) findViewById(R.id.key2);
        k[2] = (TextView) findViewById(R.id.key3);
        k[3] = (TextView) findViewById(R.id.key4);
        k[4] = (TextView) findViewById(R.id.key5);
        
        b[2].setText(word[0]);
        b[7].setText(word[1]);
        b[4].setText(word[2]);
        b[3].setText(word[3]);
        b[8].setText(word[4]);
        
        //Alert Dialog Box Start
        /*AlertDialog.Builder builder = new AlertDialog.Builder(Test.this);
		builder.setMessage("Good Job!! Do you want to repeat this alphabet?");
		builder.setCancelable(false);
		builder.setNegativeButton("No",new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) 
			{
				// TODO Auto-generated method stub
				Test.this.finish();
			}
		});
		
		builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Intent openMainActivity = new Intent("com.example.kya1.Test");
				startActivity(openMainActivity);
			}
		});
		final AlertDialog alert = builder.create();
		*/
		//ALert Dialog Box End
		
        
        Toast t = Toast.makeText(getApplicationContext(),word[currentLetterIndex], Toast.LENGTH_LONG);
		t.show();
        
        /*iv.setOnTouchListener(new OnTouchListener() {
			
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				//Toast t = Toast.makeText(getApplicationContext(), "A FOR ??", Toast.LENGTH_LONG);
				//t.show();
				//t.setGravity(Gravity.BOTTOM, 0, 0);
				return false;
			}
		});*/
        
       final int newPosition=position+1;
        
        
        for(int i=0; i<10;i++)
        {
        	final int h;
        	h=i;
        	 b[h].setOnClickListener(new View.OnClickListener() {
     			
     			public void onClick(View arg0) 
     			{
     				// TODO Auto-generated method stub
     				String text= b[h].getText().toString();
					speakOut(text);
					
     				if(word[currentLetterIndex].equals(b[h].getText()))
     				{
     					k[currentKeyIndex].setText(word[currentLetterIndex]);
     					currentKeyIndex++;
     					currentLetterIndex++;
     				}
     				else
     				{
     						Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
     						t.show();
     						t.setGravity(Gravity.BOTTOM, 0, 0);
     						openWrong.putExtra("id",position);
							startActivity(openWrong);
							
     				}
     				if(currentKeyIndex>4)
     				{
     					Toast t1 = Toast.makeText(getApplicationContext(), "GOOD JOB!!", Toast.LENGTH_LONG);
 						t1.show();
 						t1.setGravity(Gravity.CENTER, 0, 0);
 						String text1;
 						if(position==0)
						{	
							text1="APPLE";
						}
						else if(position==1)
						{
							text1="BREAD";
						}
						else if(position == 2)
						{ 
							text1="CAMEL";
						}
						else if(position == 3)
						{ 
							text1="DONUT";
						}
						else if(position == 4)
						{ 
							text1="EAGLE";
						}
						else if(position == 5)
						{ 
							text1="FLUTE";
						}
						else if(position == 6)
						{ 
							text1="GHOST";
						}
						else if(position == 7)
						{ 
							text1="HORSE";
						}
						else if(position == 8)
						{ 
							text1="INDIA";
						}
						else
						{ 
							text1="JOKER";
						}
						speakOut(text1);
 						openRight.putExtra("id",position);
 						openRight.putExtra("section","Test");

						startActivity(openRight);
 						
 						//Intent i = new Intent(getApplicationContext(),Test.class);
 		        		//i.putExtra("id",newPosition);
 		        		//startActivity(i);
     				}
     			}
     		});
         
        }
        /*
        
        b1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
				
				if(word[currentLetterIndex].equals(b1.getText()))
				{
					k[currentKeyIndex++].setText(word[currentLetterIndex++]);
				}
				else
				{
						Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
						t.show();
						t.setGravity(Gravity.BOTTOM, 0, 0);
				}
			}
		});
    
        b2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
				if(word[currentLetterIndex].equals(b2.getText()))
				{
					k[currentKeyIndex++].setText(word[currentLetterIndex++]);
				}
				else
				{
						Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
						t.show();
						t.setGravity(Gravity.BOTTOM, 0, 0);
				}
			}
		});
        
        b3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				
				if(word[currentLetterIndex].equals(b3.getText()))
				{
					k[currentKeyIndex++].setText(word[currentLetterIndex++]);
				}
				else
				{
						Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
						t.show();
						t.setGravity(Gravity.BOTTOM, 0, 0);
				}
			}
		});
 
        b4.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View arg0) 
		{
			// TODO Auto-generated method stub
			
			if(word[currentLetterIndex].equals(b4.getText()))
			{
				k[currentKeyIndex++].setText(word[currentLetterIndex++]);
			}
			else
			{
					Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
					t.show();
					t.setGravity(Gravity.BOTTOM, 0, 0);
			}
		}
	});
        
        b5.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				if(word[currentLetterIndex].equals(b5.getText()))
				{
					k[currentKeyIndex++].setText(word[currentLetterIndex++]);
				}
				else
				{
						Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
						t.show();
						t.setGravity(Gravity.BOTTOM, 0, 0);
				}
			}
		});
        
        b6.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				
				if(word[currentLetterIndex].equals(b6.getText()))
				{
					k[currentKeyIndex++].setText(word[currentLetterIndex++]);
				}
				else
				{
						Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
						t.show();
						t.setGravity(Gravity.BOTTOM, 0, 0);
				}
			}
		});
        
        
        b7.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				
				if(word[currentLetterIndex].equals(b7.getText()))
				{
					k[currentKeyIndex++].setText(word[currentLetterIndex++]);
				}
				else
				{
						Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
						t.show();
						t.setGravity(Gravity.BOTTOM, 0, 0);
				}
			}
		});
        
        b8.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				
				if(word[currentLetterIndex].equals(b8.getText()))
				{
					k[currentKeyIndex++].setText(word[currentLetterIndex++]);
				}
				else
				{
						Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
						t.show();
						t.setGravity(Gravity.BOTTOM, 0, 0);
				}
			}
		});
        
        b9.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				
				if(word[currentLetterIndex].equals(b9.getText()))
				{
					k[currentKeyIndex++].setText(word[currentLetterIndex++]);
				}
				else
				{
						Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
						t.show();
						t.setGravity(Gravity.BOTTOM, 0, 0);
				}
			}
		});
        
        b10.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
				if(word[currentLetterIndex].equals(b10.getText()))
				{
					k[currentKeyIndex++].setText(word[currentLetterIndex++]);
				}
				else
				{
						Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
						t.show();
						t.setGravity(Gravity.BOTTOM, 0, 0);
				}
			}
		});*/
        
       
        }
   public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Intent openMainActivity = new Intent(getApplicationContext(),gridMenu.class);
		
		openMainActivity.putExtra("section","Test");
		startActivity(openMainActivity);
		//this.finish();
	}
    
   
   @Override
   public void onDestroy() {
       // Don't forget to shutdown tts!
       if (tts != null) {
           tts.stop();
           tts.shutdown();
       }
       super.onDestroy();
   }
   @Override
   public void onInit(int status) {

       if (status == TextToSpeech.SUCCESS) {

           int result = tts.setLanguage(Locale.US);

           if (result == TextToSpeech.LANG_MISSING_DATA
                   || result == TextToSpeech.LANG_NOT_SUPPORTED) {
               Log.e("TTS", "This Language is not supported");
           } else {
               b[1].setEnabled(true);
               speakOut(null);
           }

       } else {
           Log.e("TTS", "Initilization Failed!");
       }

   }

   private void speakOut(String text) {


       tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
   }
  
   
}
