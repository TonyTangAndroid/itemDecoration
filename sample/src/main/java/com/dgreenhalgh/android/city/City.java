package com.dgreenhalgh.android.city;

import androidx.annotation.DrawableRes;

public class City {


    public final String city;
    @DrawableRes
    public final int drawableId;

    public City(String city, int drawableId) {
        this.city = city;
        this.drawableId = drawableId;
    }
}
