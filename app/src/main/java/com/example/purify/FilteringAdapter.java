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

public class FilteringAdapter extends RecyclerView.Adapter<FilteringVH>{

    private Context acontext;
    private ArrayList<filteringdata> fdata;

    public FilteringAdapter(Context acontext, ArrayList<filteringdata> fdata) {
        this.acontext = acontext;
        this.fdata = fdata;
    }

    @NonNull
    @Override
    public FilteringVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(acontext).inflate(R.layout.filtering_item, parent, false);
        return new FilteringVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilteringVH holder, int position) {
        holder.filterImg.setImageResource(fdata.get(position).getImage());
        holder.filterProcess.setText(fdata.get(position).getProcess());
    }

    @Override
    public int getItemCount() {
        return fdata.size();
    }
}

class FilteringVH extends RecyclerView.ViewHolder {

    ImageView filterImg;
    TextView filterProcess;

    public FilteringVH(@NonNull View itemView) {
        super(itemView);

        filterImg = itemView.findViewById(R.id.filtering_img);
        filterProcess = itemView.findViewById(R.id.filtering_process);
    }
}
