package com.example.mynilai_herlina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hitungnilai extends AppCompatActivity {

    EditText npresensi, ntugas, nuts, nuas;

    Double  presensi, tugas, uts, uas, nakhir;
    String  grade;
    TextView takhir, nGrade;
    Button btnhitung, btnnext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitungnilai);

        String presensi = getIntent().getExtras().getString("presensi");
        String tugas = getIntent().getExtras().getString("tugas");
        String uts = getIntent().getExtras().getString("uts");
        String uas = getIntent().getExtras().getString("uas");


        npresensi = findViewById(R.id.npresensi);
        npresensi.setText(presensi);

        ntugas = findViewById(R.id.ntugas);
        ntugas.setText(tugas);

        nuts = findViewById(R.id.nuts);
        nuts.setText(uts);

        nuas = findViewById(R.id.nuas);
        nuas.setText(uas);




        takhir = findViewById(R.id.tvhasiluas);
        nGrade = findViewById(R.id.tvgrade);
        btnhitung = findViewById(R.id.btnhitung);
        btnnext = findViewById(R.id.btnnext);


    }


    public void hitung(View view) {
        presensi = Double.parseDouble(npresensi.getText().toString());
        tugas = Double.parseDouble(ntugas.getText().toString());
        uts = Double.parseDouble(nuts.getText().toString());
        uas = Double.parseDouble(nuas.getText().toString());

        nakhir = (presensi * 0.1) + (tugas * 0.3) + (uts * 0.3) + (uas * 0.3);

        if (nakhir >= 90 && nakhir <= 100) {
            grade = "A";
        } else if (nakhir >= 80 && nakhir <= 89) {
            grade = "B";
        } else if (nakhir >= 60 && nakhir <= 69) {
            grade = "C";
        } else {
            grade = "E";
        }

        takhir.setText("" + nakhir);
        nGrade.setText(" " + grade);

        takhir = findViewById(R.id.tvhasiluas);
        nGrade = findViewById(R.id.tvgrade);

        btnnext = findViewById(R.id.btnnext);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hitungnilai.this, tampil.class);
                i.putExtra("akhir", takhir.getText().toString());
                i.putExtra("grade", nGrade.getText().toString());
                startActivity(i);

            }
        });

    }
}