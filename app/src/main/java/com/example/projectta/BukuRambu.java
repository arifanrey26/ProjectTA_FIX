package com.example.projectta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BukuRambu extends AppCompatActivity {

    PDFView btn_bukurambu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku_rambu);

        btn_bukurambu = (PDFView) findViewById(R.id.pdfBukuRambu);

        btn_bukurambu.fromAsset("rambu-rambu.pdf").load();

    }
}