package com.example.projectta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class PasalpasalActivity extends AppCompatActivity {

    PDFView pdf_pasalpasal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasalpasal);

        pdf_pasalpasal = (PDFView) findViewById(R.id.pdfPasal);

        pdf_pasalpasal.fromAsset("uu_no_22_tahun_2009.pdf").load();
    }
}