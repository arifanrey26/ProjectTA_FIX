package com.example.projectta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class RambuActivity extends AppCompatActivity {

    PDFView pdf_rambu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rambu);

        pdf_rambu = (PDFView) findViewById(R.id.pdfRambu);

        pdf_rambu.fromAsset("rambu-rambu.pdf").load();
    }
}