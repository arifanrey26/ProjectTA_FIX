package com.example.projectta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GantiOliActivity extends AppCompatActivity {

    EditText bil1;
    EditText bil2;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganti_oli);

        bil1 = (EditText) findViewById(R.id.et_Number1);
        bil2 = (EditText) findViewById(R.id.et_Number2);
        hasil = (TextView) findViewById(R.id.tv_hasilhitung);

        Button hitung = (Button) findViewById(R.id.btn_hitunggantioli);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,c;
                a = Integer.valueOf(bil1.getText().toString());
                b = Integer.valueOf(bil2.getText().toString());
                c = a+b;
                hasil.setText(String.valueOf(c));
            }
        });
    }
}