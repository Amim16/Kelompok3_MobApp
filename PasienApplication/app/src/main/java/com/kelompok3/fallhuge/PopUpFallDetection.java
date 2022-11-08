package com.kelompok3.fallhuge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.ebanx.swipebtn.OnStateChangeListener;
import com.ebanx.swipebtn.SwipeButton;

public class PopUpFallDetection extends AppCompatActivity {

    private ImageButton closeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_fall_detection);

        SwipeButton swipeButton = findViewById(R.id.swipe_button);
        swipeButton.setOnStateChangeListener(new OnStateChangeListener() {
            @Override
            public void onStateChange(boolean active) {
                startActivity(new Intent(PopUpFallDetection.this, MainPagePatientActivity.class));
            }
        });
    }
}