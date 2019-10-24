package com.example.uts_progmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.uts_progmob.Adapter.DataKrsAdapter;
import com.example.uts_progmob.Model.DataKrs;

import java.util.ArrayList;

public class LihatKrs extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DataKrsAdapter dataKrsAdapter;
    private ArrayList<DataKrs> dataKrsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_krs);

        addData();

        recyclerView = findViewById(R.id.rvKrs);
        dataKrsAdapter = new DataKrsAdapter(dataKrsArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(LihatKrs.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(dataKrsAdapter);
    }

    private void addData(){
        dataKrsArrayList = new ArrayList<>();
        dataKrsArrayList.add(new DataKrs("SI0123-Progmob", "2", "Rabu", "3", "Argo Wibowo", "40"));
    }
}
