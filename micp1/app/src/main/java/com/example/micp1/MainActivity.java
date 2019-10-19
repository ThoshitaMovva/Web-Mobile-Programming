package com.example.micp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class homeActivity extends AppCompatActivity {
    Button logOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        logOut = findViewById(R.id.btnLogOut);

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reDirectToLoginPage();
            }


        });
    }

    public void reDirectToLoginPage() {
        Intent redirect = new Intent(homeActivity.this, MainActivity.class);
        startActivity(redirect);
    }
}