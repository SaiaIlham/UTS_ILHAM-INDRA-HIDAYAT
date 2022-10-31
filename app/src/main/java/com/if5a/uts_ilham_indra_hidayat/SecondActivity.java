package com.if5a.uts_ilham_indra_hidayat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText tvnama,tvnomor ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setTitle("UTS_Ilham_Indra_Hidayat");

        tvnama = findViewById(R.id.tvnama);
        tvnomor = findViewById(R.id.tvnomor);

        Intent terima = getIntent();
        String yNama = terima.getStringExtra( "xNama");
        String yNomor = terima.getStringExtra( "xNomor");
        tvnama.setText(yNama);
        tvnomor.setText(yNomor);
    }
}