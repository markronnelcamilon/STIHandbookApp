package com.macvindev.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GradeCalculator extends AppCompatActivity {

    EditText prelimEditText, midtermEditText, pre_finalEditText, finalEditText;
    Button clearButton, calculateButton;
    TextView averageTextView;

    Double prelimDouble, midtermDouble, pre_finalDouble, finalDouble, averageDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_calculator);

        // EditText
        prelimEditText = findViewById(R.id.prelimEditText);
        midtermEditText = findViewById(R.id.midtermEditText);
        pre_finalEditText = findViewById(R.id.prefinalsEditText);
        finalEditText = findViewById(R.id.finalEditText);

        // Buttons
        clearButton = findViewById(R.id.clearButton);
        calculateButton = findViewById(R.id.calculateButton);

        // TextView
        averageTextView = findViewById(R.id.averageTextView);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View v) {
                prelimDouble = Double.parseDouble(prelimEditText.getText().toString());
                midtermDouble = Double.parseDouble(midtermEditText.getText().toString());
                pre_finalDouble =Double.parseDouble(pre_finalEditText.getText().toString());
                finalDouble = Double.parseDouble(finalEditText.getText().toString());

                // Compute Average
                averageDouble = ( prelimDouble * .20 + midtermDouble * .20 + pre_finalDouble * .20 + finalDouble * .40);
                //String.format("%.2f", averageFloat);
                averageTextView.setText((String.format("%.2f", averageDouble)));
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prelimEditText.getText().clear();
                midtermEditText.getText().clear();
                pre_finalEditText.getText().clear();
                finalEditText.getText().clear();
                averageTextView.setText("0.0");
            }
        });

    }
}