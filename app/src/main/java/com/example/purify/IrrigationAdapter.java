package com.example.purify;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class IrrigationAdapter extends FragmentPagerAdapter {

    private Context irrContext;
    int irrtotalTabs;

    public IrrigationAdapter(Context irrigContext, FragmentManager fm, int irrtotalTabs){
        super(fm);
      irrContext = irrigContext;
       this.irrtotalTabs = irrtotalTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                WellIrrigationFragment wellIrrigationFragment = new WellIrrigationFragment();
                return wellIrrigationFragment;
            case 1:
                StreamIrrigationFragment streamIrrigationFragment = new StreamIrrigationFragment();
                return streamIrrigationFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return irrtotalTabs;
    }

}
