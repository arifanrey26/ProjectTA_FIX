package com.example.projectta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BukuPasal extends AppCompatActivity {

    PDFView btn_bukupasal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku_pasal);

        btn_bukupasal = (PDFView) findViewById(R.id.pdfBukuPasal);

        btn_bukupasal.fromAsset("uu_no_22_tahun_2009.pdf").load();
    }
}