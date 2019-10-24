package com.example.uts_progmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuMahasiswa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_mahasiswa);
    }

    public void GoToKrs(View view) {
        Intent intent = new Intent(MenuMahasiswa.this, LihatKrs.class);
        startActivity(intent);
    }

    public void GoToKelas(View view) {
        Intent intent = new Intent(MenuMahasiswa.this, LihatKelas.class);
        startActivity(intent);
    }
}
