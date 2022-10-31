package com.kelompok3.fallhuge;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class MainPagePatientActivity extends AppCompatActivity {

    private ImageButton pesanButton, kerabatButton, accountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page_patient);
        getSupportActionBar().hide();

        pesanButton = findViewById(R.id.pesanButton);
        pesanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainPagePatientActivity.this, MessagePageActivity.class);
                MainPagePatientActivity.this.startActivity(myIntent);
            }
        });

        kerabatButton = findViewById(R.id.kerabatButton);
        kerabatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainPagePatientActivity.this, KerabatPatientPageActivity.class);
                MainPagePatientActivity.this.startActivity(myIntent);
            }
        });

        accountButton = findViewById(R.id.accountButton);
        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainPagePatientActivity.this, AccountPatientPageActivity.class);
                MainPagePatientActivity.this.startActivity(myIntent);
            }
        });
    }
}