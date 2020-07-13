package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class TambahBarangActivity extends AppCompatActivity {
    private EditText etnama;
    private EditText etqty;
    private EditText etdate;
    private EditText etharga;
    private Button btnsimpan;

    private String setNama, setQty, setHarga, setExpdate;

    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_barang);



        etnama = findViewById(R.id.etnama);
        etqty = findViewById(R.id.etqty);
        etdate = findViewById(R.id.etdate);
        etharga = findViewById(R.id.etharga);
        btnsimpan = findViewById(R.id.btnsimpan);
    }
}