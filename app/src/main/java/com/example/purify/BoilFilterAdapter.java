package com.example.purify;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BoilFilterAdapter extends RecyclerView.Adapter<BoilFilterVH> {

    private Context acontext;
    private ArrayList<boildata> boildata;


    public BoilFilterAdapter(Context acontext, ArrayList<com.example.purify.boildata> boildata) {
        this.acontext = acontext;
        this.boildata = boildata;
    }

    @NonNull
    @Override
    public BoilFilterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(acontext).inflate(R.layout.boil_item, parent, false);
       return new BoilFilterVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BoilFilterVH holder, int position) {
        holder.boilImg.setImageResource(boildata.get(position).getImage());
        holder.boilProcess.setText(boildata.get(position).getProcess());

    }

    @Override
    public int getItemCount() {
        return boildata.size();
    }
}

class BoilFilterVH extends RecyclerView.ViewHolder {

    ImageView boilImg;
    TextView boilProcess;

    public BoilFilterVH(@NonNull View itemView) {
        super(itemView);

        boilImg = itemView.findViewById(R.id.img_boil);
        boilProcess = itemView.findViewById(R.id.process);
    }
}