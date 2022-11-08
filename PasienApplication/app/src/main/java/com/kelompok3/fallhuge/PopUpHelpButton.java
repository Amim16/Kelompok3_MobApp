package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.ebanx.swipebtn.OnStateChangeListener;
import com.ebanx.swipebtn.SwipeButton;

public class PopUpHelpButton extends AppCompatActivity {

    private ImageButton cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_help_button);
        getSupportActionBar().hide();

        SwipeButton swipeButton = findViewById(R.id.swipe_button);
        swipeButton.setOnStateChangeListener(new OnStateChangeListener() {
            @Override
            public void onStateChange(boolean active) {
                startActivity(new Intent(PopUpHelpButton.this, MainPagePatientActivity.class));
            }
        });
    }
}