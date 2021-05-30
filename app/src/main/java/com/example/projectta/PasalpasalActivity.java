package com.example.projectta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PasalpasalActivity extends AppCompatActivity {

    Button btn_bukupasal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasalpasal);

        btn_bukupasal = findViewById(R.id.btn_pasal_pasal);

        btn_bukupasal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PasalpasalActivity.this, BukuPasal.class);
                startActivity(intent);
            }
        });
    }
}