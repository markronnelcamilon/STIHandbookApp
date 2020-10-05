package com.macvindev.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    ImageButton calculatorImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        calculatorImageButton = findViewById(R.id.calculatorImageButton);

        calculatorImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToGradeCalculator = new Intent (HomeActivity.this, GradeCalculator.class);
                startActivity(intentToGradeCalculator);
            }
        });
    }
}