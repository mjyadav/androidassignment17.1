package com.example.mrityunjay.androidassignmentsong;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MyService extends Service {// extending serice class
    String tag= "MyService";
    MediaPlayer mp;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(getApplicationContext(), "service created", Toast.LENGTH_LONG).show();// toast
        super.onCreate();
        mp=MediaPlayer.create(getApplicationContext(),R.raw.phir);// mp3 call
    }  public int onStartCommand(Intent intent, int flags, int startId) {// on start
        Toast.makeText(getApplicationContext(), "Start Song", Toast.LENGTH_LONG).show();
        mp.start();
        //mp.setLooping(true);

        return START_STICKY;
    } public  void onPause() {
        mp.pause();


    }




    @Override
    public void onDestroy() {// on destroy

        mp.release();
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"song stop",Toast.LENGTH_LONG).show();
    }
}