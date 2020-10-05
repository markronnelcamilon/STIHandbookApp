package com.macvindev.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GradeCalculator extends AppCompatActivity {

    EditText prelimEditText, midtermEditText, pre_finalEditText, finalEditText;
    Button clearButton, calculateButton;
    TextView averageTextView;

    Double prelimFloat, midtermFloat, pre_finalFloat, finalFloat, averageFloat;

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
            @Override
            public void onClick(View v) {
                prelimFloat = Double.parseDouble(prelimEditText.getText().toString());
                midtermFloat = Double.parseDouble(midtermEditText.getText().toString());
                pre_finalFloat =Double.parseDouble(pre_finalEditText.getText().toString());
                finalFloat = Double.parseDouble(finalEditText.getText().toString());

                // Compute Average
                averageFloat = ( prelimFloat * .20 + midtermFloat * .20 + pre_finalFloat * .20 + finalFloat * .40);

                averageTextView.setText(averageFloat.toString());
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