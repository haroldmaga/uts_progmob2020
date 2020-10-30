package com.example.uts_progmob;

/*import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;*/

public class DataDosen /*extends AppCompatActivity*/ {

    public String foto;
    public String nidn;
    public String nama;
    public String gelar;
    public String alamat;
    public String email;

    public DataDosen(String nidn, String gelar, String alamat, String email, String foto, String nama){
        this.nidn = nidn;
        this.gelar = gelar;
        this.alamat = alamat;
        this.email = email;
        this.foto = foto;
        this.nama = nama;
    }

/*    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_dosen);
    }*/
}
