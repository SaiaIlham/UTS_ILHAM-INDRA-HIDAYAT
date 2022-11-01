package com.if5a.uts_ilham_indra_hidayat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv_nama,tv_nomor,tv_jalur ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setTitle("UTS_Ilham_Indra_Hidayat");

        tv_nama = findViewById(R.id.tv_nama);
        tv_nomor = findViewById(R.id.tv_nomor);
        tv_jalur = findViewById(R.id.tv_jalur);


        Intent intent = getIntent();
        tv_nama.setText(intent.getStringExtra("xNama"));
        tv_nomor.setText(intent.getStringExtra("xNomor"));
        tv_jalur.setText(intent.getStringExtra("xJalur"));
    }
}