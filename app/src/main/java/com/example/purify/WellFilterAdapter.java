package com.example.purify;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WellFilterAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public WellFilterAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                BleachFragment bleachFragment = new BleachFragment();
                return bleachFragment;
            case 1:
                BoilFragment boilFragment = new BoilFragment();
                return boilFragment;
            case 2:
                FilterFragment filterFragment = new FilterFragment();
                return filterFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
