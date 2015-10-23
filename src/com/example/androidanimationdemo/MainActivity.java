package com.example.androidanimationdemo;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	Button clockWise;
	Button slide;
	Button move;
	Button fade;
	Button blink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        clockWise=(Button)findViewById(R.id.clockwise);
        clockWise.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				clockwise(v);
			}
		});
        
        move=(Button)findViewById(R.id.move);
        move.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				move(v);
			}
		});
        
        fade=(Button)findViewById(R.id.fade);
        fade.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				fade(v);
			}
		});
        
        blink=(Button)findViewById(R.id.blink);
        blink.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				blink(v);
			}
		});
        
        slide=(Button)findViewById(R.id.slide);
        slide.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				slide(v);
			}
		});
    }
    
    public void clockwise(View view){
    	ImageView imageView=(ImageView)findViewById(R.id.imageView1);
    	Animation animation=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
    	imageView.startAnimation(animation);
    }
    
    public void slide(View view){
    	ImageView imageView=(ImageView)findViewById(R.id.imageView1);
    	Animation animation=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
    	imageView.startAnimation(animation);
    }
    
    public void fade(View view){
    	ImageView imageView=(ImageView)findViewById(R.id.imageView1);
    	Animation animation=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
    	imageView.startAnimation(animation);
    }
    
    public void move(View view){
    	ImageView imageView=(ImageView)findViewById(R.id.imageView1);
    	Animation animation=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
    	imageView.startAnimation(animation);
    }
    
    public void blink(View view){
    	ImageView imageView=(ImageView)findViewById(R.id.imageView1);
    	Animation animation=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
    	imageView.startAnimation(animation);
    }
}
