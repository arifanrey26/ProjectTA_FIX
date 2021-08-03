package com.example.projectta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class PerawatanActivity extends AppCompatActivity {

    private Button btn_gantioli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perawatan);

        btn_gantioli = findViewById(R.id.btn_penggantianoli);

        btn_gantioli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PerawatanActivity.this, GantiOliActivity.class);
                startActivity(intent);
            }
        });

    }
}