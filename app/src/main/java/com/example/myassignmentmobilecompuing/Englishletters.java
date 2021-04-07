package com.example.myassignmentmobilecompuing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.SeekBar;
import android.widget.VideoView;

public class Englishletters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_englishletters);
        /* videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.lettersound);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

         */


    }

    public void buttoncalled(View view) {
       VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.a);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

    }

    public void button2called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.b);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button3called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.c);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button4called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.d);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button5called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.e);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button6called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.f);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button7called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.g);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button8called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.h);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button9called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.i);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button10called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.j);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void buttonc11alled(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.k);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button12called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.l);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button13called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.m);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button14called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.n);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button15called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.o);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button16called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.p);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button17called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.q);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button18called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.r);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button19called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.s);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button20called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.t);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button21called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.u);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button22called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.v);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button23called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.w);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button24called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.x);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

    }

    public void button25called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.y);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void button26called(View view) {
        VideoView videoView  = findViewById(R.id.videoview);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.z);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }




}