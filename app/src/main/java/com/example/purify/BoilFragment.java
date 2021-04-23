package com.example.purify;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class BoilFragment extends Fragment {

    RecyclerView recyclerViewBoil;
    ArrayList<boildata> boildata;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.boil_frag, container, false);


        recyclerViewBoil = v.findViewById(R.id.boil_Recycler);
        recyclerViewBoil.setLayoutManager(new LinearLayoutManager(getContext()));
        boildata = new ArrayList<>();

        boildata boil1 = new boildata(R.drawable.bkt, "Put in 1tbsn bleach in 5l of water");
       boildata.add(boil1);

        boildata boil2 = new boildata(R.drawable.bkt, "Mix and allow bucket of water stand for 30mins");
        boildata.add(boil2);

        boildata boil3 = new boildata(R.drawable.drkwtr, "Water is now safe to drink");
        boildata.add(boil3);

        recyclerViewBoil.setAdapter(new BoilFilterAdapter(getContext(),boildata));

        return v;
    }
}
