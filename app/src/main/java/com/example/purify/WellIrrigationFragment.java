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

public class WellIrrigationFragment extends Fragment {

    RecyclerView wellIrrRecycler;
    ArrayList<wellirrdata> wellirrdata;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.well_irrigation_frag, container, false);

        wellIrrRecycler = v.findViewById(R.id.wellIrigrRecycler);
        wellIrrRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        wellirrdata = new ArrayList<>();

        wellirrdata wellirrdata1 = new wellirrdata(R.drawable.well_pump2, "Build a well close to the farm");
        wellirrdata.add(wellirrdata1);

        wellirrdata wellirrdata2 = new wellirrdata(R.drawable.well_pump, "Put the pump into the dug well");
        wellirrdata.add(wellirrdata2);

        wellirrdata wellirrdata3 = new wellirrdata(R.drawable.well_irr2, "Dig furrows in farm to allow water pass");
        wellirrdata.add(wellirrdata3);

        wellirrdata wellirrdata4 = new wellirrdata(R.drawable.well_irrig3, "Open the pump to let water out");
        wellirrdata.add(wellirrdata4);

        wellIrrRecycler.setAdapter(new WellIrrigAdapter(getContext(),wellirrdata));

        return v;
    }
}
