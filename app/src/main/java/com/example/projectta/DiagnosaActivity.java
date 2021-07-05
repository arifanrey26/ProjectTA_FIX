package com.example.projectta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.projectta.model.HasilDiagnosa;

import java.util.ArrayList;

public class DiagnosaActivity extends AppCompatActivity {

    CheckBox Check1,
            Check2,
            Check3,
            Check4,
            Check5,
            Check6,
            Check7,
            Check8,
            Check9,
            Check10,
            Check11;

    Button btn_klik_diagnosa;
    TextView tv_letak_kerusakan;
    TextView tv_solusi_kerusakan;

    ArrayList<ArrayList<String>> rules = new ArrayList<>();
    ArrayList<String> jawabanUser = new ArrayList<>();
    ArrayList<HasilDiagnosa> listHasil = new ArrayList<>();

    int count = 0;
    int maxCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);

        Check1 = (CheckBox) findViewById(R.id.checkBox1);
        Check2 = (CheckBox) findViewById(R.id.checkBox2);
        Check3 = (CheckBox) findViewById(R.id.checkBox3);
        Check4 = (CheckBox) findViewById(R.id.checkBox4);
        Check5 = (CheckBox) findViewById(R.id.checkBox5);
        Check6 = (CheckBox) findViewById(R.id.checkBox6);
        Check7 = (CheckBox) findViewById(R.id.checkBox7);
        Check8 = (CheckBox) findViewById(R.id.checkBox8);
        Check9 = (CheckBox) findViewById(R.id.checkBox9);
        Check10 = (CheckBox) findViewById(R.id.checkBox10);
        Check11 = (CheckBox) findViewById(R.id.checkBox11);
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

                setUpRule();
                getPilihanPengguna();

                for (int i = 0; i < rules.size(); i++) { // ulangi tiap penyakit
                    Log.d("TAG", "kerusakan " + i + 1 + " ===============");
                    count = 0;

                    for (int j = 0; j < rules.get(i).size(); j++) { // ulangi tiap gejala pada enyakit

                        for (int k = 0; k < jawabanUser.size(); k++) { // ulangi tiap jawaban

                            Log.d("TAG", "j: " + j + ", k: " + k);
                            String jawaban = jawabanUser.get(k);
                            String gejala = rules.get(i).get(j);

                            Log.d("TAG", "jawaban: " + jawaban + ", gejala dicek: " + gejala);
                            if (jawaban.equals(gejala)) {
                                count++;
                                Log.d("TAG", "jawaban: " + jawaban + " == gejala: " + gejala);

                                if (maxCount < count) {
                                    maxCount = count;
                                }

                                Log.d("TAG", "count: " + count + ", maxCount: " + maxCount);
                            }
                        }

                    }

                }

                for (int i = 0; i < rules.size(); i++) { // ulangi tiap penyakit
                    Log.d("TAG", "kerusakan " + i + 1 + " ===============");
                    count = 0;

                    for (int j = 0; j < rules.get(i).size(); j++) { // ulangi tiap gejala pada enyakit

                        for (int k = 0; k < jawabanUser.size(); k++) { // ulangi tiap jawaban

                            Log.d("TAG", "j: " + j + ", k: " + k);
                            String jawaban = jawabanUser.get(k);
                            String gejala = rules.get(i).get(j);

                            Log.d("TAG", "jawaban: " + jawaban + ", gejala dicek: " + gejala);
                            if (jawaban.equals(gejala)) {
                                count++;
                                Log.d("TAG", "jawaban: " + jawaban + " == gejala: " + gejala);

                                if (maxCount < count) {
                                    maxCount = count;
                                }

                                Log.d("TAG", "count: " + count + ", maxCount: " + maxCount);
                            }
                        }

                    }

                    if (count == maxCount) {
                        switch (i) { // menyimpan tiap hasil diagnosa
                            case 0:
                                listHasil.add(new HasilDiagnosa("BUSI", count, "Ganti dengan yang baru"));
                                break;
                            case 1:
                                listHasil.add(new HasilDiagnosa("CELAH KLEP", count, "Setel Klep, jika masih awam serahkan pada mekanik"));
                                break;
                            case 2:
                                listHasil.add(new HasilDiagnosa("INJECTOR", count, "Dibersihkan karna kotor/Jika Rotak lemah harus ganti baru"));
                                break;
                            case 3:
                                listHasil.add(new HasilDiagnosa("ROLLER", count, "Ganti dengan yang baru"));
                                break;
                            case 4:
                                listHasil.add(new HasilDiagnosa("CVT", count, "Ganti dengan yang baru"));
                                break;
                        }
                    }

                }

                if (maxCount == 0) {
                    tv_letak_kerusakan.setText("Harap pilih gejala terlebih dulu!");
                } else {
                tv_letak_kerusakan.setText("");

                    String hasil = "";

                    // cetak hasil
                    for (int i = 0; i < listHasil.size(); i++) {
                        hasil += listHasil.get(i).toString();
                    }

                    tv_letak_kerusakan.setText(hasil);
                }

//                Log.d("TAG", "j: " + j + ", j: " + j);
//                String jawaban = jawabanUser.get(i);
//                String gejala = rules.get(j).get(j);
//
//                Log.d("TAG", "jawaban: " + jawaban + ", gejala dicek: " + gejala);
//                if (jawaban.equals(gejala)) {
//                    count++;
//                    Log.d("TAG", "jawaban: " + jawaban + " == gejala: " + gejala);
//                }
//
//                if (maxCount < count) {
//                    maxCount = count;
//                }
//
//                Log.d("TAG", "count: " + count + ", maxCount: " + maxCount);

                //Output Kerusakan : a
//                if (Check1.isChecked()){
//                    LetakKerusakan+= "\n BUSI,CELAH KLEP,INJECTOR,ROLLER,CVT";
//                    SolusiKerusakan+= "\nKonsultasikan pada Mekanik/ganti dengan yang baru";
//                }
//                if (Check2.isChecked()){
//                    LetakKerusakan+= "\nBUSI";
//                    SolusiKerusakan+= "\nGanti dengan yang baru";
//                }
//                if (Check3.isChecked()){
//                    LetakKerusakan+= "\nBUSI dan INJECTOR";
//                    SolusiKerusakan+= "\nBusi harus ganti baru dan Injector dibersihkan karna kotor/Rotak lemah harus ganti baru";
//                }
//                if (Check4.isChecked()){
//                    LetakKerusakan+= "\nBUSI";
//                    SolusiKerusakan+= "\nGanti dengan yang baru";
//                }
//                if (Check5.isChecked()){
//                    LetakKerusakan+= "\nCelah Klep";
//                    SolusiKerusakan+= "\nSetel Klep, jika masih awam serahkan pada mekanik";
//                }
//                if (Check6.isChecked()){
//                    LetakKerusakan+= "\nINJECTOR";
//                    SolusiKerusakan+= "\nDibersihkan karna kotor/Rotak lemah harus ganti baru";
//                }
//                if (Check7.isChecked()){
//                    LetakKerusakan+= "\nROLLER";
//                    SolusiKerusakan+= "\nGanti dengan yang baru";
//                }
//                if (Check8.isChecked()){
//                    LetakKerusakan+= "\nROLLER";
//                    SolusiKerusakan+= "\nGanti dengan yang baru";
//                }
//                if (Check9.isChecked()){
//                    LetakKerusakan+= "\nROLLER";
//                    SolusiKerusakan+= "\nGanti dengan yang baru";
//                }
//                if (Check10.isChecked()){
//                    LetakKerusakan+= "\nCVT";
//                    SolusiKerusakan+= "\nGanti dengan yang baru";
//                }
//                if (Check11.isChecked()){
//                    LetakKerusakan+= "\nCVT";
//                    SolusiKerusakan+= "\nGanti dengan yang baru";
//                }
//                if (Check1.isChecked() && Check2.isChecked()){
//                    LetakKerusakan+= "\nBUSI";
//                    SolusiKerusakan+= "\nSetel Klep, lebih baik jika konsultasi terlebih dulu pada mekanik";
//                }
//                if (Check1.isChecked() && Check2.isChecked() && Check3.isChecked()){
//                    LetakKerusakan+= "\nBUSI";
//                    SolusiKerusakan+= "\nGanti dengan yang baru";
//                }
//                if (Check1.isChecked() && Check2.isChecked() && Check3.isChecked() && Check4.isChecked()){
//                    LetakKerusakan+= "\nBUSI";
//                    SolusiKerusakan+= "\nGanti dengan yang baru";
//                }
//                if (Check1.isChecked() && Check5.isChecked()){
//                    LetakKerusakan+= "\nCELAH KLEP";
//                    SolusiKerusakan+= "\nSetel Klep, jika masih awam serahkan pada mekanik";
//                }
//                if (Check1.isChecked() && Check3.isChecked()){
//                    LetakKerusakan+= "\nBUSI,INJECTOR";
//                    SolusiKerusakan+= "\nBusi ganti dengan yang baru, Injector dibersihkan karna kotor/Rotak lemah harus ganti baru";
//                }
//                if (Check1.isChecked() && Check3.isChecked() && Check6.isChecked()){
//                    LetakKerusakan+= "\nINJECTOR";
//                    SolusiKerusakan+= "\nDibersihkan karna kotor/Rotak lemah harus ganti baru";
//                }
//                if (Check1.isChecked() && Check7.isChecked()){
//                    LetakKerusakan+= "\nROLLER";
//                    SolusiKerusakan+= "\nGanti dengan yang baru";
//                }
//                if (Check1.isChecked() && Check7.isChecked() && Check8.isChecked()){
//                    LetakKerusakan+= "\nROLLER";
//                    SolusiKerusakan+= "\nGanti dengan yang baru";
//                }
//                if (Check1.isChecked() && Check7.isChecked() && Check8.isChecked() && Check9.isChecked()){
//                    LetakKerusakan+= "\nROLLER";
//                    SolusiKerusakan+= "\nGanti dengan yang baru";
//                }
//                if (Check1.isChecked() && Check10.isChecked()){
//                    LetakKerusakan+= "\nCVT";
//                    SolusiKerusakan+= "\nGanti dengan yang baru";
//                }
//                if (Check1.isChecked() && Check10.isChecked() && Check11.isChecked()){
//                    LetakKerusakan+= "\nCVT";
//                    SolusiKerusakan+= "\nGanti dengan yang baru";
//                }

                // Tampilan hasil letak keruskan di textView
//                tv_letak_kerusakan.setText(""+LetakKerusakan);
//                tv_solusi_kerusakan.setText(""+SolusiKerusakan);
            }
        });
    }

    private void setUpRule() {
        rules.clear();

        ArrayList<String> busi = new ArrayList<>();
        busi.add("G1");
        busi.add("G2");
        busi.add("G3");
        busi.add("G4");

        ArrayList<String> celahKlep = new ArrayList<>();
        celahKlep.add("G1");
        celahKlep.add("G5");

        ArrayList<String> injector = new ArrayList<>();
        injector.add("G1");
        injector.add("G3");
        injector.add("G6");

        ArrayList<String> roler = new ArrayList<>();
        roler.add("G1");
        roler.add("G7");
        roler.add("G8");
        roler.add("G9");

        ArrayList<String> cvt = new ArrayList<>();
        cvt.add("G1");
        cvt.add("G10");
        cvt.add("G11");

        rules.add(busi);
        rules.add(celahKlep);
        rules.add(injector);
        rules.add(roler);
        rules.add(cvt);

        Log.d("TAG", "setUpRule: " + rules.toString());
    }

    private void getPilihanPengguna() {
        count = 0;
        maxCount = 0;
        listHasil = new ArrayList<>();
        jawabanUser = new ArrayList<>();

        if (Check1.isChecked()) {
            jawabanUser.add("G1");
        }

        if (Check2.isChecked()) {
            jawabanUser.add("G2");
        }
        if (Check3.isChecked()) {
            jawabanUser.add("G3");
        }
        if (Check4.isChecked()) {
            jawabanUser.add("G4");
        }
        if (Check5.isChecked()) {
            jawabanUser.add("G5");
        }
        if (Check6.isChecked()) {
            jawabanUser.add("G6");
        }
        if (Check7.isChecked()) {
            jawabanUser.add("G7");
        }
        if (Check8.isChecked()) {
            jawabanUser.add("G8");
        }
        if (Check9.isChecked()) {
            jawabanUser.add("G9");
        }
        if (Check10.isChecked()) {
            jawabanUser.add("G10");
        }
        if (Check11.isChecked()) {
            jawabanUser.add("G11");
        }

        Log.d("TAG", "getPilihanPengguna: " + jawabanUser.toString());
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String string = "";

        switch (view.getId()) {
            case R.id.checkBox1:
                string = checked ? "Gejala 1 Diseleksi" : "Gejala 1 Tidak Diseleksi";
                break;
            case R.id.checkBox2:
                string = checked ? "Gejala 2 Diseleksi" : "Gejala 2 Tidak Diseleksi";
                break;
            case R.id.checkBox3:
                string = checked ? "Gejala 3 Diseleksi" : "Gejala 3 Tidak Diseleksi";
                break;
            case R.id.checkBox4:
                string = checked ? "Gejala 4 Diseleksi" : "Gejala 4 Tidak Diseleksi";
                break;
            case R.id.checkBox5:
                string = checked ? "Gejala 5 Diseleksi" : "Gejala 5 Tidak Diseleksi";
                break;
            case R.id.checkBox6:
                string = checked ? "Gejala 6 Diseleksi" : "Gejala 6 Tidak Diseleksi";
                break;
            case R.id.checkBox7:
                string = checked ? "Gejala 7 Diseleksi" : "Gejala 7 Tidak Diseleksi";
                break;
            case R.id.checkBox8:
                string = checked ? "Gejala 8 Diseleksi" : "Gejala 8 Tidak Diseleksi";
                break;
            case R.id.checkBox9:
                string = checked ? "Gejala 9 Diseleksi" : "Gejala 9 Tidak Diseleksi";
                break;
            case R.id.checkBox10:
                string = checked ? "Gejala 10 Diseleksi" : "Gejala 10 Tidak Diseleksi";
                break;
            case R.id.checkBox11:
                string = checked ? "Gejala 11 Diseleksi" : "Gejala 11 Tidak Diseleksi";
                break;
        }

        Toast.makeText(getApplicationContext(), string, Toast.LENGTH_SHORT).show();
    }
}