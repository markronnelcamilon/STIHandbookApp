package com.macvindev.stistudenthandbook;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText emailEditText;
    EditText passwordEditText;
    String emailString, passwordString;
    Button goToHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        goToHomeButton = findViewById(R.id.goToHome_Button);


        goToHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                emailString = emailEditText.getText().toString();
                passwordString = passwordEditText.getText().toString();

                if (emailString.equals("markcamilon@gmail.com") && (passwordString.equals("123456")))
                {
                    Intent intentToGoHome = new Intent(MainActivity.this, HomeActivity.class);
                    intentToGoHome.putExtra("email", emailString);
                    startActivity(intentToGoHome);
                }
                else {
                    Toast.makeText(MainActivity.this, "Invalid email address or password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}