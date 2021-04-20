package com.example.purify;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BleachFilterAdapter extends RecyclerView.Adapter<BleachFilterVH> {
    private Context aContext;
    private List<Model> models;

    public BleachFilterAdapter(Context aContext, List<Model> models) {
        this.aContext = aContext;
        this.models = models;
    }

    @NonNull
    @Override
    public BleachFilterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(aContext).inflate(R.layout.filter_item, parent, false);
        return new BleachFilterVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BleachFilterVH holder, int position) {
        holder.img.setImageResource(models.get(position).getImage());
        holder.process.setText(models.get(position).getProcess());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}

  class BleachFilterVH extends RecyclerView.ViewHolder {

    ImageView img;
    TextView process;

    public BleachFilterVH(@NonNull View itemView) {
        super(itemView);

        img = itemView.findViewById(R.id.image);
        process = itemView.findViewById(R.id.process);
    }
}