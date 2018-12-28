package com.dgreenhalgh.android.simpleitemdecorationsample.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dgreenhalgh.android.simpleitemdecorationsample.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CityAdapter extends RecyclerView.Adapter<CityHolder> {

    private final Context context;
    private List<String> mSampleStringList;

    public CityAdapter(List<String> sampleStringList, Context context) {
        mSampleStringList = sampleStringList;
        this.context = context;
    }

    @NonNull
    @Override
    public CityHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_city, parent, false);
        return new CityHolder(context, view);
    }

    @Override
    public void onBindViewHolder(@NonNull CityHolder holder, int position) {
        holder.bind(mSampleStringList.get(position));
    }

    @Override
    public int getItemCount() {
        return mSampleStringList.size();
    }
}
