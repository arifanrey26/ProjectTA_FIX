package com.example.projectta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class DiagnosaActivity extends AppCompatActivity {

    CheckBox Check1,
            Check2,
            Check3,
            Check4,
            Check5,
            Check6,
            Check7;

    Button btn_klik_diagnosa;
    TextView tv_letak_kerusakan;
    TextView tv_solusi_kerusakan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);

        Check1 = (CheckBox) findViewById(R.id.checkBox);
        Check2 = (CheckBox) findViewById(R.id.checkBox2);
        Check3 = (CheckBox) findViewById(R.id.checkBox3);
        Check4 = (CheckBox) findViewById(R.id.checkBox4);
        Check5 = (CheckBox) findViewById(R.id.checkBox5);
        Check6 = (CheckBox) findViewById(R.id.checkBox6);
        Check7 = (CheckBox) findViewById(R.id.checkBox7);

        btn_klik_diagnosa = (Button) findViewById(R.id.btn_klikdiagnosa);
        tv_letak_kerusakan = (TextView) findViewById(R.id.tv_letakkerusakan);
        tv_solusi_kerusakan = (TextView) findViewById(R.id.tv_solusikerusakan);

        tv_letak_kerusakan.setText("");
        tv_solusi_kerusakan.setText("");

        btn_klik_diagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String LetakKerusakan = "Letak Kerusakan pada : ";
                String SolusiKerusakan = "Solusinya yaitu : ";

                //Output Kerusakan : a
                if (Check1.isChecked() && Check2.isChecked() && Check3.isChecked()){
                    LetakKerusakan+= "\nBUSI";
                    SolusiKerusakan+= "\nMengganti Busi Dengan Yang Baru";

                }
                if (Check4.isChecked() && Check5.isChecked() && Check6.isChecked() && Check7.isChecked()){
                    LetakKerusakan+= "\nCVT";
                    SolusiKerusakan+= "\nPerbaiki Pada Mekanik/Ahlinya";
                }

                // Tampilan hasil letak keruskan di textView
                tv_letak_kerusakan.setText(""+LetakKerusakan);
                tv_solusi_kerusakan.setText(""+SolusiKerusakan);
            }
        });
    }

        public void onCheckboxClicked (View view) {
            boolean checked = ((CheckBox) view).isChecked();
            String string="";

            switch (view.getId()) {
                case R.id.checkBox:
                    string = checked?"Gejala 1 Diseleksi":"Gejala 1 Tidak Diseleksi";
                    break;
                case R.id.checkBox2:
                    string = checked?"Gejala 2 Diseleksi":"Gejala 2 Tidak Diseleksi";
                    break;
                case R.id.checkBox3:
                    string = checked?"Gejala 3 Diseleksi":"Gejala 3 Tidak Diseleksi";
                    break;
                case R.id.checkBox4:
                    string = checked?"Gejala 4 Diseleksi":"Gejala 4 Tidak Diseleksi";
                    break;
                case R.id.checkBox5:
                    string = checked?"Gejala 5 Diseleksi":"Gejala 5 Tidak Diseleksi";
                    break;
                case R.id.checkBox6:
                    string = checked?"Gejala 6 Diseleksi":"Gejala 6 Tidak Diseleksi";
                    break;
                case R.id.checkBox7:
                    string = checked?"Gejala 7 Diseleksi":"Gejala 7 Tidak Diseleksi";
                    break;
            }

                Toast.makeText(getApplicationContext(), string, Toast.LENGTH_SHORT).show();
        }
}