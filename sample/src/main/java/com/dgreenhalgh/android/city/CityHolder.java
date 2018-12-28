package com.dgreenhalgh.android.city;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dgreenhalgh.android.simpleitemdecorationsample.R;

import androidx.recyclerview.widget.RecyclerView;

public class CityHolder extends RecyclerView.ViewHolder {

    private final Context context;
    private ImageView iv_city;
    private TextView tv_city;

    public CityHolder(Context context, View itemView) {
        super(itemView);
        this.context = context;
        tv_city = itemView.findViewById(R.id.tv_city);
        iv_city = itemView.findViewById(R.id.iv_city);
    }

    public void bind(City city) {
        iv_city.setImageDrawable(context.getResources().getDrawable(city.drawableId, null));
        tv_city.setText(city.city);
    }
}
