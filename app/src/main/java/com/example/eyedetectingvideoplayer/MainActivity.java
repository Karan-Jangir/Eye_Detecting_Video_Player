package com.example.eyedetectingvideoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.pd.lookatme.LookAtMe;

public class MainActivity extends AppCompatActivity {
    private LookAtMe lookAtMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        lookAtMe = findViewById(R.id.lookme);
        lookAtMe.init(this);
       lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.gfg_video));
         //lookAtMe.setVideoPath("https://www.youtube.com/watch?v=W8We0tKTmQ0");

        lookAtMe.start();
        lookAtMe.setLookMe();

    }
}