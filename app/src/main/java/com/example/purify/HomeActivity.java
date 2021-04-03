package com.example.purify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    private CardView cardViewFilter;
    private CardView cardViewIrrigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cardViewFilter = findViewById(R.id.filter);
        cardViewFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent filterIntent = new Intent(HomeActivity.this, FilterActivity.class);
                startActivity(filterIntent);
            }
        });

        cardViewIrrigation = findViewById(R.id.irrigation);
        cardViewIrrigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irrigationIntent = new Intent(HomeActivity.this, IrrigationActivity.class);
                startActivity(irrigationIntent);
            }
        });
    }
}