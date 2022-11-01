package com.kelompok3.fallhuge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PatientPageActivity extends AppCompatActivity {

    private ImageButton backButton, profilePatient_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_page);

        backButton = findViewById(R.id.back_buttonPatient);
        profilePatient_Button = findViewById(R.id.profilePatientButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(PatientPageActivity.this, MainpageKerabatActivity.class);
                PatientPageActivity.this.startActivity(myIntent);
            }
        });
        profilePatient_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(PatientPageActivity.this, ProfilePatientPageActivity.class);
                PatientPageActivity.this.startActivity(myIntent);
            }
        });
    }

}