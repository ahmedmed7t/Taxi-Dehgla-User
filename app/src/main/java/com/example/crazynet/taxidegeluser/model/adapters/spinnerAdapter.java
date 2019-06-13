package com.example.crazynet.taxidegeluser.model.adapters;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.crazynet.taxidegeluser.R;
import com.example.crazynet.taxidegeluser.model.models.country;

import java.util.ArrayList;

/**
 * Created by Medhat on 12/10/2018.
 */

public class spinnerAdapter extends ArrayAdapter<country>{

    ArrayList<country> countries ;

    public spinnerAdapter(@NonNull Context context,  ArrayList<country> arrayList) {
        super(context, 0,arrayList);
        countries = arrayList;
    }

    public View getCustomView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
       convertView = LayoutInflater.from(getContext()).inflate(R.layout.spinner_item ,parent,false);
        ImageView flag = convertView.findViewById(R.id.flag);
        flag.setImageResource(countries.get(position).getFlag());

        return convertView;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position,convertView,parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getCustomView(position,convertView,parent);
    }

}
