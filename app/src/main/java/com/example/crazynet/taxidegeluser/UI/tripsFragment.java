package com.example.crazynet.taxidegeluser.UI;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.crazynet.taxidegeluser.R;
import com.example.crazynet.taxidegeluser.model.adapters.tripRecyclerAdapter;
import com.example.crazynet.taxidegeluser.model.models.testTrip;

import java.util.ArrayList;


public class tripsFragment extends Fragment {
    public static int i = 1;
    public ConstraintLayout extra;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public tripsFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static tripsFragment newInstance(String param1, String param2) {
        tripsFragment fragment = new tripsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         View v = inflater.inflate(R.layout.fragment_trips, container, false);
         extra = v.findViewById(R.id.cons_extra);

        ArrayList<testTrip> arrayList = new ArrayList<testTrip>();
        arrayList.add(new testTrip("frooooom","toooo","Audi","blue","ACDE","paolo","4.5","$48","17/17/17"));
        arrayList.add(new testTrip("frooooom","toooo","Audi","blue","ACDE","paolo","4.5","$48","17/17/17"));
        arrayList.add(new testTrip("frooooom","toooo","Audi","blue","ACDE","paolo","4.5","$48","17/17/17"));
        arrayList.add(new testTrip("frooooom","toooo","Audi","blue","ACDE","paolo","4.5","$48","17/17/17"));
        arrayList.add(new testTrip("frooooom","toooo","Audi","blue","ACDE","paolo","4.5","$48","17/17/17"));

        RecyclerView recyclerView = v.findViewById(R.id.recyclerTrip);
        recyclerView.setLayoutManager(new LinearLayoutManager(v.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new tripRecyclerAdapter(arrayList));



        return v;
    }


}
