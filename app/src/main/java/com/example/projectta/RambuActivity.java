package com.example.projectta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class RambuActivity extends AppCompatActivity {

    private Button btn_rmblrg, btn_rmbprgtn, btn_rmbptnj, btn_rmbprt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rambu);

        btn_rmblrg = findViewById(R.id.btn_jenislrg);
        btn_rmbprgtn = findViewById(R.id.btn_jenisprgtn);
        btn_rmbptnj = findViewById(R.id.btn_jenisptnj);
        btn_rmbprt = findViewById(R.id.btn_jenisprt);

        btn_rmblrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RambuActivity.this, RambuLaranganActivity.class);
                startActivity(intent);
            }
        });

        btn_rmbprgtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RambuActivity.this, RambuPeringatanActivity.class);
                startActivity(intent);
            }
        });

        btn_rmbptnj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RambuActivity.this, RambuPetunjukActivity.class);
                startActivity(intent);
            }
        });

        btn_rmbprt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RambuActivity.this, RambuPerintahActivity.class);
                startActivity(intent);
            }
        });

    }
}