package com.kelompok3.fallhuge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kelompok3.fallhuge.adapter.PatientAdapter;

public class PatientPageActivity extends AppCompatActivity {

    private ImageButton backButton, profilePatient_Button;
    protected RecyclerView mRecyclerView;
    protected PatientAdapter mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;
    protected String[] patientList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_page);

        // Setup recyclerView
        mRecyclerView = findViewById(R.id.rv_patient_list);

        patientList = new String[]{"ghiyats", "udin", "asep", "johny"};

        mAdapter = new PatientAdapter(patientList);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);

        backButton = findViewById(R.id.back_buttonPatient);
//        profilePatient_Button = findViewById(R.id.profilePatientButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(PatientPageActivity.this, MainpageKerabatActivity.class);
                PatientPageActivity.this.startActivity(myIntent);
            }
        });
//        profilePatient_Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent myIntent = new Intent(PatientPageActivity.this, ProfilePatientPageActivity.class);
//                PatientPageActivity.this.startActivity(myIntent);
//            }
//        });
    }

}