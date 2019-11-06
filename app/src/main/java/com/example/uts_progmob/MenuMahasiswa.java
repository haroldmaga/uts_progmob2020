package com.example.uts_progmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;
import android.widget.Toolbar;

public class MenuMahasiswa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("KRS - Home");
        setContentView(R.layout.activity_menu_mahasiswa);


        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView toolbar_text = (TextView)
                findViewById(R.id.toolbar_text);
        if (toolbar_text != null && toolbar != null) {
            toolbar_text.setText(getTitle());
            setSupportActionBar(toolbar);
        }*/
    }

    public void GoToKrs(View view) {
        Intent intent = new Intent(MenuMahasiswa.this, LihatKrs.class);
        startActivity(intent);
    }

    public void GoToKelas(View view) {
        Intent intent = new Intent(MenuMahasiswa.this, LihatKelas.class);
        startActivity(intent);
    }

    public void GoToDataMhs(View view) {
        Intent intent = new Intent(MenuMahasiswa.this, DataMahasiswa.class);
        startActivity(intent);
    }

    public void GoToLogin(View view) {
        Intent intent = new Intent(MenuMahasiswa.this, LoginScreen.class);
        startActivity(intent);
    }
}
