package com.anusha.combined;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Song extends AppCompatActivity {
    Button b1,b2;
 //MediaPlayer track1,track2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        b1 = findViewById(R.id.songb1);
        b2 = findViewById(R.id.songb2);
        final MediaPlayer track1 = new MediaPlayer().create(Song.this, R.raw.soft_music);
         final MediaPlayer track2 = new MediaPlayer().create(Song.this, R.raw.nudge);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (track2.isPlaying()) {
                    track2.stop();
                } else {
                    track1.start();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (track1.isPlaying()) {
                    track1.stop();
                } else {
                    track2.start();
                }
            }
        });
    }
    }

