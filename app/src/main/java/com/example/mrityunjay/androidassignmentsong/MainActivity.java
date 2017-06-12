package com.example.mrityunjay.androidassignmentsong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button play,pause,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=(Button)findViewById(R.id.play);// find id

        play.setOnClickListener(new View.OnClickListener() {// on clicc
            @Override
            public void onClick(View v) {
                Intent start= new Intent(MainActivity.this,MyService.class);// intent
                startService(start);//srvice start

            }
        });

        stop=(Button)findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {// on click
            @Override
            public void onClick(View v) {
                Intent stop =new Intent(MainActivity.this,MyService.class);
                stopService(stop);// service stop

            }
        });
    }
}