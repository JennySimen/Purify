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

public class WellIrrigAdapter extends RecyclerView.Adapter<WellIrrigVH> {

    private Context wicontext;
    private ArrayList<wellirrdata> wellIrrData;

    public WellIrrigAdapter(Context wicontext, ArrayList<wellirrdata> wellIrrData) {
        this.wicontext = wicontext;
        this.wellIrrData = wellIrrData;
    }

    @NonNull
    @Override
    public WellIrrigVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(wicontext).inflate(R.layout.well_item, parent, false);
        return new WellIrrigVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WellIrrigVH holder, int position) {
        holder.wellirrimg.setImageResource(wellIrrData.get(position).getIrrWellImg());
        holder.wellirrtext.setText(wellIrrData.get(position).getIrrDesc());
    }

    @Override
    public int getItemCount() {
        return wellIrrData.size();
    }
}

class WellIrrigVH extends RecyclerView.ViewHolder {
     ImageView wellirrimg;
     TextView wellirrtext;

    public WellIrrigVH(@NonNull View itemView) {
        super(itemView);

        wellirrimg = itemView.findViewById(R.id.wellimage);
        wellirrtext = itemView.findViewById(R.id.wellprocess);
    }

}
