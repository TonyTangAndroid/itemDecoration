package com.dgreenhalgh.android.simpleitemdecorationsample.controller;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dgreenhalgh.android.simpleitemdecorationsample.R;

import java.util.Random;

import androidx.recyclerview.widget.RecyclerView;

public class CityHolder extends RecyclerView.ViewHolder {

    private final Context context;
    private final Random random = new Random();
    private ImageView iv_city;
    private TextView tv_city;

    public CityHolder(Context context, View itemView) {
        super(itemView);
        this.context = context;
        tv_city = itemView.findViewById(R.id.tv_city);
        iv_city = itemView.findViewById(R.id.iv_city);
    }

    public void bind(String city) {
        tv_city.setText(city);
        iv_city.setImageDrawable(context.getResources().getDrawable(drawableId(), null));
    }

    private int drawableId() {
        int value = random.nextInt(4);
        switch (value) {
            case 0:
                return R.drawable.london;
            case 1:
                return R.drawable.newyork;
            case 2:
                return R.drawable.oslo;
            default:
                return R.drawable.paris;
        }
    }
}
