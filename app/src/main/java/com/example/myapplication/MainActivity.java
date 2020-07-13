package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etusername;
    private EditText etpass;
    private Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etusername = findViewById(R.id.etusername);
        etpass = findViewById(R.id.etpass);
        btnlogin = findViewById(R.id.btnlogin);

        DBHelper dbHelper = new DBHelper(getBaseContext());

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    private void login() {
        if (etpass.length() < 8 || etpass.length() > 15) {
            Toast.makeText(this, "Panjang Password tidak boleh kurang dari 8 karakter", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(intent);
        }
    }
}