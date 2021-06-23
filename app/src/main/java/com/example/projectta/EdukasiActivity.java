package com.example.projectta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;


public class EdukasiActivity extends AppCompatActivity {

    VideoView videoView;
    Button putarvideo;
    MediaController mediaController;

    Button btn_Bookpdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edukasi);

        videoView = (VideoView)findViewById(R.id.videoView);
        putarvideo = (Button)findViewById(R.id.btn_PutarVideo);
        mediaController = new MediaController(this);

        btn_Bookpdf = (Button)findViewById(R.id.btn_PslPelanggaran);

        btn_Bookpdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EdukasiActivity.this,PasalPelanggaranActivity.class);
                startActivity(intent);
            }
        });
    }

    public void PutarVideo(View view){
        Uri uri = Uri.parse("android.resource://" + getPackageName()+"/" +R.raw.video);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();
    }
}