package com.macvindev.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button goToHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToHomeButton = findViewById(R.id.goToHome_Button);

        goToHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToGoHome = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intentToGoHome);
            }
        });
    }
}