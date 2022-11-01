package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignInPasienActivity extends AppCompatActivity {

    private Button buatakunButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_pasien);

        buatakunButton = findViewById(R.id.buatakunButton);
        buatakunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(SignInPasienActivity.this, MainPagePatientActivity.class);
                SignInPasienActivity.this.startActivity(myIntent);
            }
        });
    }
}