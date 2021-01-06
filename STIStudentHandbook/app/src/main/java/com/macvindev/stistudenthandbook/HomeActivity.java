package com.macvindev.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {

    ImageButton calculatorImageButton;
    ImageButton historyImageButton;
    ImageButton stiHymnImageButton;
    ImageButton stiWebsiteImageButton;
    ImageButton stiAdImageButton;
    ImageButton qrCodeGeneratorImageButton;
    ImageButton suggestionBoxImageButton;

    Button logoutButton;

    TextView emailTextView;
    TextView nameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nameTextView = findViewById(R.id.nameTextView);
        emailTextView = findViewById(R.id.emailTextView);

        GoogleSignInAccount signInAccount = GoogleSignIn.getLastSignedInAccount(this);
        if (signInAccount != null){
           nameTextView.setText(signInAccount.getDisplayName());
           emailTextView.setText(signInAccount.getEmail());
        }


        logoutButton = findViewById(R.id.logoutButton);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intentToMainActivity = new Intent (HomeActivity.this, MainActivity.class);
                startActivity(intentToMainActivity);
                Toast.makeText(HomeActivity.this, "Successfully logged out!", Toast.LENGTH_SHORT).show();
            }
        });



        calculatorImageButton = findViewById(R.id.calculatorImageButton);
        historyImageButton = findViewById(R.id.historyImageButton);
        stiHymnImageButton = findViewById(R.id.stiHymnImageButton);
        stiWebsiteImageButton = findViewById(R.id.stiWebsiteImageButton);
        stiAdImageButton = findViewById(R.id.stiAdImageButton);
        qrCodeGeneratorImageButton = findViewById(R.id.qrCodeGeneratorButton);
        suggestionBoxImageButton = findViewById(R.id.suggestionBoxButton);






        calculatorImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToGradeCalculator = new Intent (HomeActivity.this, GradeCalculator.class);
                startActivity(intentToGradeCalculator);
            }
        });

        historyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToHistory = new Intent (HomeActivity.this, HistoryActivity.class);
                startActivity(intentToHistory);
            }
        });

        stiHymnImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToSTIHymn = new Intent (HomeActivity.this, STIHymnActivity.class);
                startActivity(intentToSTIHymn);
            }
        });

        stiWebsiteImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.sti.edu/";
                Intent intentToSTIWebsite = new Intent(Intent.ACTION_VIEW);
                intentToSTIWebsite.setData(Uri.parse(url));
                startActivity(intentToSTIWebsite);
            }
        });
        stiAdImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToSTIVideo = new Intent (HomeActivity.this, VideoActivity.class);
                startActivity(intentToSTIVideo);
            }
        });

        qrCodeGeneratorImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToQRCodeGenerator = new Intent (HomeActivity.this, QRGenerator.class);
                startActivity(intentToQRCodeGenerator);
            }
        });
        suggestionBoxImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToSuggestionBox = new Intent (HomeActivity.this, SuggestionBox.class);
                startActivity(intentToSuggestionBox);
            }
        });
    }
}