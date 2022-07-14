package com.example.mynilai_herlina;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;


public class tampil extends AppCompatActivity {

    EditText enim, enama, nakhir, gnilai;
    Spinner tvmk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);


        enim = findViewById(R.id.enim);
        enama = findViewById(R.id.enama);
        nakhir= findViewById(R.id.eakhir);
        gnilai = findViewById(R.id.egrade);

        String akhir = getIntent().getExtras().getString("akhir");
        String grade = getIntent().getExtras().getString("grade");
        String nim = getIntent().getExtras().getString("snim");
        String nama = getIntent().getExtras().getString("snama");


        nakhir.findViewById(R.id.eakhir);
        nakhir.setText(akhir);

        gnilai.findViewById(R.id.egrade);
        gnilai.setText(grade);


        enim.findViewById(R.id.enim);
        enim.setText(nim);

        enama.findViewById(R.id.enama);
        enama.setText(nama);





    }
}