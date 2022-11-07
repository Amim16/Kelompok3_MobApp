package com.kelompok3.fallhuge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.kelompok3.fallhuge.databinding.ActivityMainpageKerabatBinding;

public class MainpageKerabatActivity extends AppCompatActivity {

    private ActivityMainpageKerabatBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainpageKerabatBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainpageKerabatActivity.this, AccountPageKerabatActivity.class);
                MainpageKerabatActivity.this.startActivity(myIntent);
            }
        });
        binding.notifButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainpageKerabatActivity.this, RiwayatNotifikasiActivity.class);
                MainpageKerabatActivity.this.startActivity(myIntent);
            }
        });
        binding.firstaidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainpageKerabatActivity.this, FirstAidActivity.class);
                MainpageKerabatActivity.this.startActivity(myIntent);
            }
        });
        binding.patientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainpageKerabatActivity.this, PatientPageActivity.class);
                MainpageKerabatActivity.this.startActivity(myIntent);
            }
        });
        binding.locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainpageKerabatActivity.this, KerabatLocationActivity.class);
                MainpageKerabatActivity.this.startActivity(myIntent);
            }
        });
    }
}