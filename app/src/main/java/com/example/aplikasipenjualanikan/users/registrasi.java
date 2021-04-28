package com.example.aplikasipenjualanikan.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aplikasipenjualanikan.R;
import com.example.aplikasipenjualanikan.admin.homeadmin;
import com.ornach.nobobutton.NoboButton;

public class registrasi extends AppCompatActivity {

    Button btnnregistrasi;
    NoboButton btnnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        getSupportActionBar().hide();

        btnnregistrasi = (Button) findViewById(R.id.registrasibtnn);
        btnnlogin = (NoboButton) findViewById(R.id.loginbtnn);

        btnnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(registrasi.this, homeadmin.class);
                startActivity(i);
                finish();
            }
        });

        btnnregistrasi.setOnClickListener((v) -> {
            Intent i = new Intent(registrasi.this,registrasi.class);
            startActivity(i);
            finish();
        });
    }
}