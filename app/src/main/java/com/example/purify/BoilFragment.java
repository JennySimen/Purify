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

        boildata boil1 = new boildata(R.drawable.bkt, "Measure the water to boil");
       boildata.add(boil1);

        boildata boil2 = new boildata(R.drawable.pot2, "Boil the water for up t0 30mins");
        boildata.add(boil2);

        boildata boil3 = new boildata(R.drawable.pot3, "Allow water to cool");
        boildata.add(boil3);

        boildata boil4 = new boildata(R.drawable.drkwtr, "Save water in containers");
        boildata.add(boil4);

        recyclerViewBoil.setAdapter(new BoilFilterAdapter(getContext(),boildata));

        return v;
    }
}
