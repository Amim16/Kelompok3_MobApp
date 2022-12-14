package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class SignInPasienActivity extends AppCompatActivity {

    private Button buatakunButton;
    private TextView masukDisini;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_sign_in_pasien);

        buatakunButton = findViewById(R.id.buatakunButton);
        buatakunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(SignInPasienActivity.this, MainPagePatientActivity.class);
                SignInPasienActivity.this.startActivity(myIntent);
            }
        });

        masukDisini = findViewById(R.id.MasukDisini);
        masukDisini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(SignInPasienActivity.this, LogInActivity.class);
                SignInPasienActivity.this.startActivity(myIntent);
            }
        });
    }
}