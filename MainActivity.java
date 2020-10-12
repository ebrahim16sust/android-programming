package com.example.ebrahim.allah99name;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button,button1,button2 ;
    private Intent intent;
    private TextView textView;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= (Button) findViewById(R.id.button);
        button1= (Button) findViewById(R.id.button1);
        button2= (Button) findViewById(R.id.button2);

        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View ebrahim) {
        if(ebrahim.getId()==R.id.button){
            intent=new Intent(MainActivity.this, click.class);
            startActivity(intent);
            Toast toast = Toast.makeText(getApplicationContext(),
                    "may allah grant you jannah",
                    Toast.LENGTH_SHORT);
            toast.show();
        }
        if(ebrahim.getId()==R.id.button1){
            intent=new Intent(MainActivity.this,e.class);
            startActivity(intent);
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Read and try to memorize it",
                    Toast.LENGTH_LONG);
            toast.show();
        }

        if(ebrahim.getId()==R.id.button2){
            intent=new Intent(MainActivity.this,my.class);
            startActivity(intent);
        }
    }
}