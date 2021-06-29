package com.example.myapplication;

import android.media.MediaPlayer;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    ImageButton image1, image2, image3, image4;
    Button stopbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.coin);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.piano);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.drop);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.instru);
        mp1.setLooping(true);
        mp2.setLooping(true);
        mp3.setLooping(true);
        mp4.setLooping(true);
        image1 = (ImageButton) findViewById(R.id.image1);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
                if (!mp1.isPlaying()) {
                    if (mp2.isPlaying())
                        mp2.pause();
                    if (mp3.isPlaying()) {
                        mp3.pause();
                    }
                    if (mp4.isPlaying()) {
                        mp4.pause();
                    }
                    mp1.start();
                } else {
                    mp1.pause();
                }


            }
        });
        image2 = (ImageButton) findViewById(R.id.image2);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
                if (!mp2.isPlaying()) {
                    if (mp1.isPlaying())
                        mp1.pause();
                    if (mp3.isPlaying())
                        mp3.pause();
                    if (mp4.isPlaying())
                        mp4.pause();
                    mp2.start();
                } else {
                    mp2.pause();
                }
            }
        });
        image3 = (ImageButton) findViewById(R.id.image3);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_SHORT).show();
                if (!mp3.isPlaying()) {
                    if (mp2.isPlaying())
                        mp2.pause();
                    if (mp1.isPlaying())
                        mp1.pause();
                    if (mp4.isPlaying())
                        mp4.pause();
                    mp3.start();
                } else {
                    mp3.pause();
                }
            }
        });
        image4 = (ImageButton) findViewById(R.id.image4);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "4", Toast.LENGTH_SHORT).show();
                if (!mp4.isPlaying()) {
                    if (mp2.isPlaying())
                        mp2.pause();
                    if (mp3.isPlaying())
                        mp3.pause();
                    if (mp1.isPlaying())
                        mp1.pause();
                    mp4.start();
                } else {
                    mp4.pause();
                }
            }
        });
        stopbtn = (Button) findViewById(R.id.stop);
        stopbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp2.isPlaying())
                    mp2.pause();
                if (mp3.isPlaying())
                    mp3.pause();
                if (mp1.isPlaying())
                    mp1.pause();
                if (mp4.isPlaying())
                    mp4.pause();
            }
        });
    }
}
