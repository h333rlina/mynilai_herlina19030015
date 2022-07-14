package com.example.mynilai_herlina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class isidata extends AppCompatActivity {
    EditText nim, nama, presensi, tugas, uts, uas;
    Button btnsubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isidata);

        nim = findViewById(R.id.snim);
        nama = findViewById(R.id.snama);
        presensi = findViewById(R.id.spresensi);
        tugas = findViewById(R.id.stugas);
        uts = findViewById(R.id.suts);
        uas = findViewById(R.id.suas);

        btnsubmit= findViewById(R.id.btnsubmit);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(isidata.this, hitungnilai.class);
                i.putExtra( "presensi", presensi.getText().toString());
                i.putExtra("tugas", tugas.getText().toString());
                i.putExtra("uts", uts.getText().toString());
                i.putExtra("uas", uas.getText().toString());
                startActivity(i);

                Intent intent = new Intent(isidata.this , tampil.class);
                i.putExtra("nama", nama.getText().toString());
                i.putExtra("nim", nama.getText().toString());
                startActivity(i);


            }
        });

    }


}