package com.example.crazynet.taxidegeluser.model.adapters;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.crazynet.taxidegeluser.R;
import com.example.crazynet.taxidegeluser.model.models.testTrip;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by Medhat on 16/10/2018.
 */

public class tripRecyclerAdapter extends RecyclerView.Adapter<tripRecyclerAdapter.viewholder> {

    ArrayList<testTrip> arrayList;

    public tripRecyclerAdapter(ArrayList<testTrip> arrayList) {
        this.arrayList = arrayList;
    }

    public class viewholder extends RecyclerView.ViewHolder{
        TextView date, to, from, tripNo, driverName, driverReate, price;
        TextView car, carColor;
        ConstraintLayout extralayout , main;

        public viewholder(View itemView ) {
            super(itemView);

            date = itemView.findViewById(R.id.date);
            to = itemView.findViewById(R.id.name_to);
            from = itemView.findViewById(R.id.name_from);
            tripNo = itemView.findViewById(R.id.name_trip_no);
            driverName = itemView.findViewById(R.id.driver_name);
            driverReate = itemView.findViewById(R.id.driver_rate);
            price = itemView.findViewById(R.id.price);
            car = itemView.findViewById(R.id.car_model);
            carColor = itemView.findViewById(R.id.car_color);
            extralayout = itemView.findViewById(R.id.cons_extra);
            main = itemView.findViewById(R.id.cons_main);
            main.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(extralayout.getVisibility() == View.GONE) {
                        extralayout.setVisibility(View.VISIBLE);
                    }
                    else{
                        extralayout.setVisibility(View.GONE);
                    }
                }
            });

        }
    }


    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.trip_item, parent, false);
        return new viewholder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        testTrip item = arrayList.get(position);

        holder.from.setText(item.getFrom());
        holder.to.setText(item.getTo());
        holder.date.setText(item.getDate());
        holder.tripNo.setText(item.getTripNo());
        holder.driverName.setText(item.getDriverName());
        holder.driverReate.setText(item.getDriverRate());
        holder.price.setText(item.getPrice());
        holder.car.setText(item.getCar());
        holder.carColor.setText(item.getCarColor());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
