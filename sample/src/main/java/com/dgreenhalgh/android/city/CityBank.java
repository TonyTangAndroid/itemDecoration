package com.dgreenhalgh.android.city;

import com.dgreenhalgh.android.simpleitemdecorationsample.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.DrawableRes;

public class CityBank {

    public static List<City> getSampleData() {
        List<City> list = new ArrayList<>();
        list.add(new City("Paul", city(list)));
        list.add(new City("David", city(list)));
        list.add(new City("Kristin", city(list)));
        list.add(new City("Chris", city(list)));
        list.add(new City("Josh", city(list)));
        list.add(new City("Andrew", city(list)));
        list.add(new City("Brian", city(list)));
        list.add(new City("Matt", city(list)));
        list.add(new City("Bill", city(list)));
        list.add(new City("Jason", city(list)));
        list.add(new City("Bolot", city(list)));
        list.add(new City("Sean", city(list)));
        list.add(new City("Ryan", city(list)));
        list.add(new City("Aaron", city(list)));
        return list;
    }

    @DrawableRes
    private static int city(List<City> list) {
        int value = list.size() % 4;
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
