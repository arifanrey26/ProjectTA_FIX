package com.example.projectta.model;

public class HasilDiagnosa {
    String namaPenyakit;
    int count;
    String solusi;

    public HasilDiagnosa(String namaPenyakit, int count, String solusi) {
        this.namaPenyakit = namaPenyakit;
        this.count = count;
        this.solusi = solusi;
    }

    public String getSolusi() {
        return solusi;
    }

    public void setSolusi(String solusi) {
        this.solusi = solusi;
    }

    public String getNamaPenyakit() {
        return namaPenyakit;
    }

    public void setNamaPenyakit(String namaPenyakit) {
        this.namaPenyakit = namaPenyakit;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "\n\nNama Kerusakan = " + namaPenyakit +
                "\n  Solusi = " + solusi + "";
    }
}
