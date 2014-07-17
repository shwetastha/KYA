package com.example.kya1;

import java.util.Locale;

import android.content.Intent;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.util.Log;
import android.view.Gravity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Learn extends Activity implements TextToSpeech.OnInitListener {
	ImageView i;
	Button b1,b2,b3,b4,b5,next,prev;
	int count;
	Intent openWrong = new Intent("com.example.kya1.WRONG");
	Intent openRight = new Intent("com.example.kya1.RIGHT");
	
	private TextToSpeech tts;
	
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
	
	int partialPosition;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        
        tts = new TextToSpeech(this, this);
        
        Intent info = getIntent();

        final int position =(Integer) info.getExtras().get("id");
        //Toast ta = Toast.makeText(getApplicationContext(),""+position, Toast.LENGTH_LONG);
    	//ta.show();
    	
    	
    	if(position == 0)
    		partialPosition=position+1;
    	else if (position == 1) 
    		partialPosition= position+6;
    	else if(position == 2)
    		partialPosition= 13;
    	else if(position == 3)
    		partialPosition= 19;
    	else if(position == 4)
    		partialPosition= 25;
    	else if(position == 5)
    		partialPosition= 31;
    	else if(position == 6)
    		partialPosition= 37;
    	else if(position == 7)
    		partialPosition= 43;
    	else if(position == 8)
    		partialPosition= 49;
    	else 
    		partialPosition= 55;
    	
    	
        
       final String word[]=setWord(position);
        
        i=(ImageView) findViewById(R.id.imageView1);
        
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.lastButton);
        next=(Button) findViewById(R.id.button6);
        prev=(Button) findViewById(R.id.button7);
        
        
        b1.setText(word[0]);
        b2.setText(word[1]);
        b3.setText(word[2]);
        b4.setText(word[3]);
        b5.setText(word[4]);
        
        if(position==0)
        {
        i.setImageResource(gridImageAdapter.imagesObjectPartial[0]);
        }
        else if(position==1)
        {
        i.setImageResource(gridImageAdapter.imagesObjectPartial[6]);
        }
        else if(position==2)
        {
        i.setImageResource(gridImageAdapter.imagesObjectPartial[12]);
        }
        else if(position==3)
        {
        i.setImageResource(gridImageAdapter.imagesObjectPartial[18]);
        }
        else if(position==4)
        {
        i.setImageResource(gridImageAdapter.imagesObjectPartial[24]);
        }
        else if(position==5)
        {
        i.setImageResource(gridImageAdapter.imagesObjectPartial[30]);
        }
        else if(position==6)
        {
        i.setImageResource(gridImageAdapter.imagesObjectPartial[36]);
        }
        else if(position==7)
        {
        i.setImageResource(gridImageAdapter.imagesObjectPartial[42]);
        }
        else if(position==8)
        {
        i.setImageResource(gridImageAdapter.imagesObjectPartial[48]);
        }
        else
        	i.setImageResource(gridImageAdapter.imagesObjectPartial[54]);
        
        	
        
        next.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				
				int newPosition = 0;
				// TODO Auto-generated method stub
				if (position == 9)
				{
					newPosition = -1;
				}
				else 
					newPosition=position+1;
				
				Intent openMainActivity = new Intent("com.example.kya1.LEARN");
				openMainActivity.putExtra("id",newPosition);
				startActivity(openMainActivity);
			}
		});
        
        prev.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int newPosition = 0;
				// TODO Auto-generated method stub
				if (position == 0)
				{
					newPosition = 9;
				}
				else 
					newPosition=position-1;
				
				Intent openMainActivity = new Intent("com.example.kya1.LEARN");
				openMainActivity.putExtra("id",newPosition);
				startActivity(openMainActivity);
			}
		});
        
      /*  i.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast t = Toast.makeText(getApplicationContext(), "A FOR ??", Toast.LENGTH_LONG);
				t.show();
				t.setGravity(Gravity.BOTTOM, 0, 0);
			}
		});*/
				b1.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						
						// MediaPlayer mp = MediaPlayer.create(Learn.this, R.raw.a);
						// mp.start();
						String text= b1.getText().toString();
						if(text.equals("A"))
							text="aey";
						speakOut(text);
						if(count == 0){
						
							i.setImageResource(gridImageAdapter.imagesObjectPartial[partialPosition++]);
						count++;
						}
						else{
							
							
							
							Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
							t.show();
							t.setGravity(Gravity.BOTTOM, 0, 0);
							openWrong.putExtra("id",position);
							startActivity(openWrong);
							
							
						}
						
					}
				});
				b2.setOnClickListener(new View.OnClickListener() {
					
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						String text= b2.getText().toString();
						speakOut(text);
						if(count == 1){
												
							
							i.setImageResource(gridImageAdapter.imagesObjectPartial[partialPosition++]);
							count++;
							}
							else{
							
							
								Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
								t.show();
								t.setGravity(Gravity.BOTTOM, 0, 0);
								openWrong.putExtra("id",position);
								startActivity(openWrong);
								
							}
							
					}
				});
				b3.setOnClickListener(new View.OnClickListener() {
					
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						String text= b3.getText().toString();
						speakOut(text);
						
						if(count == 2){
							i.setImageResource(gridImageAdapter.imagesObjectPartial[partialPosition++]);
							count++;
							}
							else{
								
								
								Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
								t.show();
								t.setGravity(Gravity.BOTTOM, 0, 0);
								openWrong.putExtra("id",position);
								startActivity(openWrong);
							}
					}
				});
				b4.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						String text= b4.getText().toString();
						speakOut(text);
						
						if(count == 3){
							i.setImageResource(gridImageAdapter.imagesObjectPartial[partialPosition++]);
							count++;	
						}
							else{
								
								Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
								t.show();
								t.setGravity(Gravity.BOTTOM, 0, 0);
								openWrong.putExtra("id",position);
								startActivity(openWrong);
							}
					}
				});
b5.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						String text= b5.getText().toString();
						speakOut(text);
						
						if(count == 4){
							i.setImageResource(gridImageAdapter.imagesObjectPartial[partialPosition]);
							count++;
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
							openRight.putExtra("section","Learn");
							startActivity(openRight);
							
						}
							else{
								
								Toast t = Toast.makeText(getApplicationContext(), "WRONG ONE!!!", Toast.LENGTH_LONG);
								t.show();
								t.setGravity(Gravity.BOTTOM, 0, 0);
								openWrong.putExtra("id",position);
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
		Intent openMainActivity = new Intent(getApplicationContext(),gridMenu.class);
		
		openMainActivity.putExtra("section","Learn");
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
                b1.setEnabled(true);
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