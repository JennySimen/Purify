package com.example.purify;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FilterFragment  extends Fragment {

    RecyclerView filterRecycler;
    ArrayList<filteringdata> filteringdata;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.filter_frag, container, false);

        filterRecycler = v.findViewById(R.id.filtering_Recycler);
        filterRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        filteringdata = new ArrayList<>();

        filteringdata ob1 = new filteringdata(R.drawable.tbspn, "Put in 1tbsn bleach in 5l of water");
        filteringdata.add(ob1);

        filteringdata ob2 = new filteringdata(R.drawable.bkt, "Mix and allow bucket of water stand for 30mins");
        filteringdata.add(ob2);

        filteringdata ob3 = new filteringdata(R.drawable.drkwtr, "Water is now safe to drink");
        filteringdata.add(ob3);

        filterRecycler.setAdapter(new FilteringAdapter(getContext(),filteringdata));

        return v;
    }
}
