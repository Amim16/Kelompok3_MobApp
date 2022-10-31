package com.kelompok3.fallhuge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainpageKerabatActivity extends AppCompatActivity {

    private ImageButton accountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage_kerabat);

        accountButton = findViewById(R.id.account_button);

        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainpageKerabatActivity.this, AccountPageKerabatActivity.class);
                MainpageKerabatActivity.this.startActivity(myIntent);
            }
        });
    }
}