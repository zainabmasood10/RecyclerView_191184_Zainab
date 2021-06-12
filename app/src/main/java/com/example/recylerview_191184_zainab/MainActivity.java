package com.example.recylerview_191184_zainab;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new MainAdapter(getLayoutInflater(),getItems()));
    }

    private ArrayList<String> getItems() {

        ArrayList<String> items = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            items.add("Item "+(i+1));
        }
        return items;
    }
}