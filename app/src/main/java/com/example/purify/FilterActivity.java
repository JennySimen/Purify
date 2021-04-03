package com.example.purify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FilterActivity extends AppCompatActivity {

    private CardView cardViewWell, cardViewStream, cardViewTank;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        cardViewWell = findViewById(R.id.well);
        cardViewWell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent wellIntent = new Intent(FilterActivity.this, WellFilterActivity.class);
            startActivity(wellIntent);
            }
        });
    }
}