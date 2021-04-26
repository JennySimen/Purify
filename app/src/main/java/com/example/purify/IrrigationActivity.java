package com.example.purify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class IrrigationActivity extends AppCompatActivity {

    TabLayout irrigTablayout;
    ViewPager irrigViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irrigation);

        irrigTablayout = (TabLayout) findViewById(R.id.irrigTabs);
        irrigViewPager = (ViewPager)findViewById(R.id.irrigViewPager);

        irrigTablayout.addTab(irrigTablayout.newTab().setText("Well"));
        irrigTablayout.addTab(irrigTablayout.newTab().setText("Stream"));
        irrigTablayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final IrrigationAdapter irradapter = new IrrigationAdapter(this,getSupportFragmentManager(), irrigTablayout.getTabCount());
        irrigViewPager.setAdapter(irradapter);

       irrigViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(irrigTablayout));

        irrigTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                irrigViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}