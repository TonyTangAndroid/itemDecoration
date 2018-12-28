package com.dgreenhalgh.android.simpleitemdecorationsample.controller;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.dgreenhalgh.android.simpleitemdecoration.grid.GridDividerItemDecoration;
import com.dgreenhalgh.android.simpleitemdecorationsample.R;
import com.dgreenhalgh.android.simpleitemdecorationsample.model.SampleDataBank;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CityActivity extends AppCompatActivity {

    private static final int NUM_COLUMNS = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        initRecyclerView();
    }

    private void initRecyclerView() {
        RecyclerView recycler_view = findViewById(R.id.recycler_view);
        List<String> sampleStringList = SampleDataBank.getSampleData();
        Drawable dividerDrawable = ContextCompat.getDrawable(this, R.drawable.divider_sample);
        GridDividerItemDecoration dividerItemDecoration = new GridDividerItemDecoration(dividerDrawable, dividerDrawable, NUM_COLUMNS);
        recycler_view.addItemDecoration(dividerItemDecoration);
        recycler_view.setLayoutManager(new GridLayoutManager(this, NUM_COLUMNS));
        recycler_view.setAdapter(new CityAdapter(sampleStringList, this));
    }
}
