package com.example.ebrahim.allah99name;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;

public class e extends Activity {
    private Button button,button1,button2, Button3, start,pause,stop;
    private SeekBar seekBar;
    private MediaPlayer mediaPlayer;
    Handler handler=new Handler();
    Runnable runnable;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e);

        start=(Button)findViewById(R.id.button1);
        pause=(Button)findViewById(R.id.button2);
        stop=(Button)findViewById(R.id.button3);
        //creating media player
        final MediaPlayer mp=new MediaPlayer();
        try{
            //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
            mp.setDataSource(Environment.getExternalStorageDirectory().getPath()+"/Music/maine.mp3");

            mp.prepare();
        }catch(Exception e){e.printStackTrace();}

        start.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        pause.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });
        stop.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
            }
        });
    }
}