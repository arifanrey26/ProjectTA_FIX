package com.example.projectta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NomorDaruratActivity extends AppCompatActivity {

    Button btnHubungi1, btnHubungi2, btnHubungi3, btnHubungi4, btnHubungi5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nomor_darurat);

        btnHubungi1 = findViewById(R.id.btn_nmrLayananDarurat);
        btnHubungi2 = findViewById(R.id.btn_nmrPolisi);
        btnHubungi3 = findViewById(R.id.btn_nmrAmbulans);
        btnHubungi4 = findViewById(R.id.btn_nmrPemadamKebakaran);
        btnHubungi5 = findViewById(R.id.btn_nmrSAR);

        btnHubungi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor="112";
                Intent memanggil = new Intent(Intent.ACTION_DIAL);
                memanggil.setData(Uri.fromParts("tel", nomor, null));
                startActivity(memanggil);
            }
        });

        btnHubungi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor="110";
                Intent memanggil = new Intent(Intent.ACTION_DIAL);
                memanggil.setData(Uri.fromParts("tel", nomor, null));
                startActivity(memanggil);
            }
        });

        btnHubungi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor="118";
                Intent memanggil = new Intent(Intent.ACTION_DIAL);
                memanggil.setData(Uri.fromParts("tel", nomor, null));
                startActivity(memanggil);
            }
        });

        btnHubungi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor="113";
                Intent memanggil = new Intent(Intent.ACTION_DIAL);
                memanggil.setData(Uri.fromParts("tel", nomor, null));
                startActivity(memanggil);
            }
        });

        btnHubungi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor="115";
                Intent memanggil = new Intent(Intent.ACTION_DIAL);
                memanggil.setData(Uri.fromParts("tel", nomor, null));
                startActivity(memanggil);
            }
        });
    }
}