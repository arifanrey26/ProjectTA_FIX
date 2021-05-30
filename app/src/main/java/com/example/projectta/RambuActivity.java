package com.example.projectta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RambuActivity extends AppCompatActivity {

    Button btn_bukurambu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rambu);

        btn_bukurambu = findViewById(R.id.btn_rambu);

        btn_bukurambu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(RambuActivity.this, BukuRambu.class);
                startActivity(intent);
            }
        });
    }
}