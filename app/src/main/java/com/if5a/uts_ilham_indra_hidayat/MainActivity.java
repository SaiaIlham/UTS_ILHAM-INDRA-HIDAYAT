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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_daftar;
    EditText et_nama_lengkap, et_nomor_pendaftaran;
    Spinner sp_jalur_pendaftaran;
    CheckBox cbx_konfirmasi_daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("UTS Ilham Indra Hidayat");
        btn_daftar = findViewById(R.id.btn_daftar);
        et_nama_lengkap = findViewById(R.id.et_nama_lengkap);
        et_nomor_pendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        sp_jalur_pendaftaran = findViewById(R.id.sp_jalur_pendaftaran);
        cbx_konfirmasi_daftar = findViewById(R.id.cbx_konfirmasi_daftar);

        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namalengkap,nomorpendaftaran,jalurpendaftaran;

                namalengkap = et_nama_lengkap.getText().toString();
                nomorpendaftaran = et_nomor_pendaftaran.getText().toString();
                jalurpendaftaran = sp_jalur_pendaftaran.getSelectedItem().toString();

                    if (namalengkap.trim().equals("")){
                        et_nama_lengkap.setError("Nama Harus Diisi");
                    }
                    else if (nomorpendaftaran.trim().equals("")){
                        et_nomor_pendaftaran.setError("Nomor Pendaftaran Harus Diisi");
                    }
                    else if(!cbx_konfirmasi_daftar.isChecked()){
                        Toast.makeText(MainActivity.this,"Checkbox Harus Diisi",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                        intent.putExtra( "xNama", namalengkap);
                        intent.putExtra("xNomor",nomorpendaftaran);
                        intent.putExtra("xJalur",jalurpendaftaran);
                        startActivity(intent);
                    }

            }
        });
    }
}