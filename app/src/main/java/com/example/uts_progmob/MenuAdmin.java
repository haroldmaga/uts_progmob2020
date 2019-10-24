package com.example.uts_progmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_admin);
    }

    public void GoToKrsA(View view) {
        Intent intent = new Intent(MenuAdmin.this, LihatKrs.class);
        startActivity(intent);
    }

    public void GoToKelasA(View view) {
        Intent intent = new Intent(MenuAdmin.this, LihatKelas.class);
        startActivity(intent);
    }


    public void GotoMatkulA(View view) {
        Intent intent = new Intent(MenuAdmin.this, LihatMatkul.class);
        startActivity(intent);
    }


    public void GotoMhs(View view) {
        Intent intent = new Intent(MenuAdmin.this, LihatDosen.class);
        startActivity(intent);
    }
}
