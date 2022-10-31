package com.if5a.uts_ilham_indra_hidayat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button btndaftar;
    EditText etNamalengkap, etnomorpendaftaran;
    String nomorpendaftaran, namalengkap;
    Spinner spjalurpendaftaran;
    CheckBox cbxkonfirmasidaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("UTS Ilham Indra Hidayat");
        btndaftar = findViewById(R.id.btn_daftar);
        etNamalengkap = findViewById(R.id.et_nama_lengkap);
        etnomorpendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        spjalurpendaftaran = findViewById(R.id.sp_jalur_pendaftaran);
        cbxkonfirmasidaftar = findViewById(R.id.cbx_konfirmasi_daftar);

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namalengkap = etNamalengkap.getText().toString();
                nomorpendaftaran = etnomorpendaftaran.getText().toString();

                    if (namalengkap.trim().equals("")){
                        etNamalengkap.setError("Nama Harus Diisi");
                    }
                    else if (nomorpendaftaran.trim().equals("")){
                        etnomorpendaftaran.setError("Nomor Pendaftaran Harus Diisi");
                    }
                    else {
                        Intent daftar = new Intent(MainActivity.this,SecondActivity.class);
                        daftar.putExtra( "xNama", namalengkap);
                        startActivity(daftar);
                    }

            }
        });
    }
}