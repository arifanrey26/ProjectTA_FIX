package com.example.projectta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PasalPelanggaranActivity extends AppCompatActivity {

    PDFView pdf_pasalpelanggaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasal_pelanggaran);

        pdf_pasalpelanggaran = (PDFView) findViewById(R.id.pdfPasalPelanggaran);

        pdf_pasalpelanggaran.fromAsset("Ketentuan_Pelanggaran_Lalu_Lintas.pdf").load();
    }
}