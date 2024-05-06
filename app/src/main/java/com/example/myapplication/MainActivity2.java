package com.example.myapplication;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent intent = getIntent();

        Zodiac selectedZodiac = (Zodiac) intent.getSerializableExtra("selected_zodiac");

        String zodiacName = selectedZodiac.getName();
        int zodiacImageResource = selectedZodiac.getImageResource();
        String zodiacDetails = selectedZodiac.getDetails();

        ImageView zodiacImageView = findViewById(R.id.imzodiacinfo);
        zodiacImageView.setImageResource(zodiacImageResource);

        TextView zodiacNameTextView = findViewById(R.id.zodiacinfo);
        zodiacNameTextView.setText(zodiacName);

        TextView zodiacDetailsTextView = findViewById(R.id.detailzodiacinfo);
        zodiacDetailsTextView.setText(zodiacDetails);
    }
}