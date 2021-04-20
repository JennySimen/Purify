package com.example.purify;

import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class BleachFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Model> Model;

        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.bleach_frag, container, false);

            recyclerView = v.findViewById(R.id.filterRecycler);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            Model = new ArrayList<>();

            Model ob1 = new Model(R.drawable.tbspn, "Put in 1tbsn bleach in 5l of water");
            Model.add(ob1);

            Model ob2 = new Model(R.drawable.bkt, "Mix and allow bucket of water stand for 30mins");
            Model.add(ob2);

            Model ob3 = new Model(R.drawable.drkwtr, "Water is now safe to drink");
            Model.add(ob3);

            recyclerView.setAdapter(new BleachFilterAdapter(getContext(),Model));

            return v;
        }
    }

