package com.macvindev.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SuggestionBox extends AppCompatActivity {
    EditText suggestionEditText;
    Button sendButton;
    String suggestionString;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference suggestionRef = database.getReference("suggestion");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion_box);

        suggestionEditText = findViewById(R.id.suggestionEditText);
        sendButton = findViewById(R.id.sendButton);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suggestionString = suggestionEditText.getText().toString();
                suggestionRef.push().setValue(suggestionString);
                Toast.makeText(SuggestionBox.this, "Your suggestion " + suggestionString + " has been sent", Toast.LENGTH_LONG).show();
            }
        });
    }
}