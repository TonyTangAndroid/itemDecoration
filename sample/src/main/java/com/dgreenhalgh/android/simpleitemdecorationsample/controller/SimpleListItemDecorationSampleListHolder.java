package com.dgreenhalgh.android.simpleitemdecorationsample.controller;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class SimpleListItemDecorationSampleListHolder extends RecyclerView.ViewHolder {

    private TextView mTextView;

    public SimpleListItemDecorationSampleListHolder(View itemView) {
        super(itemView);

        mTextView = (TextView) itemView;
    }

    public void bind(String sampleText) {
        mTextView.setText(sampleText);
    }
}
