package com.example.uts_progmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import static android.content.pm.PackageManager.PERMISSION_GRANTED;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class TambahDosenActiviti extends AppCompatActivity {
    private EditText txtNama, txtNidn, txtAlamat, txtGelar, txtemail, txtFoto;
    private ImageView imgDosen;
    private ProgressDialog progressDialog;
    private static final int GALLERY_REQUEST_CODE = 58;
    private static final int FILE_ACCCES_REQUEST_CODE = 58;
    private String stringImg = "";
    private Boolean IsUpdate = false;
    private String IdDosen ="";
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_dosen_activiti);

        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.READ_EXTERNAL_STORAGE) != PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.READ_EXTERNAL_STORAGE
            }, FILE_ACCCES_REQUEST_CODE);

        }

        txtNama = findViewById(R.id.editTextNama);
        txtNidn = findViewById(R.id.editTextNidn);
        txtAlamat = findViewById(R.id.editTextAlamat);
        txtGelar = findViewById(R.id.editTextGelar);
        txtemail = findViewById(R.id.editTextEmail);
        txtFoto = findViewById(R.id.editTextFoto);
        imgDosen = findViewById(R.id.imgDosen);


        final Button btnUpload = findViewById(R.id.btnUploadFoto);
        btnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");

                String[] mimeTypes = ("");
                intent.putExtra(intent.EXTRA_MIME_TYPES, mimeTypes);

                startActivityForResult(intent, GALLERY_REQUEST_CODE);
            }
        });
        Button btnSimpan = (Button) findViewById(R.id.btnSimpan);

    }
}




