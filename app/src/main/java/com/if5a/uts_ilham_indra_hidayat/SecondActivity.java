package com.if5a.uts_ilham_indra_hidayat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText tv_nama,tv_nomor ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setTitle("UTS_Ilham_Indra_Hidayat");

        tv_nama = findViewById(R.id.tv_nama);
        tv_nomor = findViewById(R.id.tv_nomor);

        Intent terima = getIntent();
        String yNama = terima.getStringExtra( "xNama");
        String yNomor = terima.getStringExtra( "xNomor");
        tv_nama.setText(yNama);
        tv_nomor.setText(yNomor);
    }
}