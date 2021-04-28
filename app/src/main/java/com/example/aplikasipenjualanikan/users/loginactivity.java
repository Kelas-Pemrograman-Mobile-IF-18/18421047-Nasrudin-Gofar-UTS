
package com.example.aplikasipenjualanikan.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aplikasipenjualanikan.R;
import com.example.aplikasipenjualanikan.admin.homeadmin;
import com.ornach.nobobutton.NoboButton;

public class loginactivity extends AppCompatActivity {

    Button btnregistrasi;
    NoboButton btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);

        getSupportActionBar().hide();

        btnregistrasi = (Button) findViewById(R.id.registrasibtn);
        btnlogin = (NoboButton) findViewById(R.id.loginbtn);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(loginactivity.this, homeadmin.class);
                startActivity(i);
                finish();
            }
        });

        btnregistrasi.setOnClickListener((v) -> {
            Intent i = new Intent(loginactivity.this,registrasi.class);
            startActivity(i);
            finish();
        });
    }
}