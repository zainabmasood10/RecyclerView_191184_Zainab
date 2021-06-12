package com.example.recylerview_191184_zainab;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    private final LayoutInflater inflater;
    private final ArrayList<String> items;

    public MainAdapter(LayoutInflater inflater, ArrayList<String> items) {
        this.inflater = inflater;
        this.items = items;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MainViewHolder(inflater.inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.MainViewHolder holder, int position) {


        holder.itemNameTextView.setText(items.get(position));
        holder.deleteButton.setOnClickListener(v -> {

            items.remove(position);

            notifyDataSetChanged();
        });
    }

    @Override
    public int getItemCount() {

        return items.size();
    }

    public static class MainViewHolder extends RecyclerView.ViewHolder{
        private final TextView itemNameTextView;
        private final ImageButton deleteButton;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);

            itemNameTextView = itemView.findViewById(R.id.list_item_name);
            deleteButton = itemView.findViewById(R.id.list_item_delete_button);
        }
    }
}