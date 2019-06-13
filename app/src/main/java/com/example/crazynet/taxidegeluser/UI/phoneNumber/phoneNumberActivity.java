package com.example.crazynet.taxidegeluser.UI.phoneNumber;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.crazynet.taxidegeluser.R;
import com.example.crazynet.taxidegeluser.UI.log_sign.log_or_sign_Activity;
import com.example.crazynet.taxidegeluser.UI.verifyNumber.confirmCodeActivity;
import com.example.crazynet.taxidegeluser.model.adapters.spinnerAdapter;
import com.example.crazynet.taxidegeluser.model.models.country;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class phoneNumberActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);
        ButterKnife.bind(this);

        final TextView code = findViewById(R.id.ph_code);

        final ArrayList<country> arrayList = new ArrayList<country>();

        arrayList.add(new country(R.mipmap.iraq,03));
        arrayList.add(new country(R.mipmap.egy,02));
        arrayList.add(new country(R.mipmap.italy,04));
        arrayList.add(new country(R.mipmap.morooc,06));
        arrayList.add(new country(R.mipmap.saud,07));


        Spinner spinner = (Spinner) findViewById(R.id.ph_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        spinnerAdapter adapter = new spinnerAdapter(this,arrayList);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                code.setText("+"+String.valueOf(arrayList.get(position).getCode()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @OnClick(R.id.backNumber)
    public void tosign()
    {
        Intent intent = new Intent(this,log_or_sign_Activity.class);
        intent.putExtra("index",2);
        startActivity(intent);
    }

    @OnClick(R.id.next)
    public void toconfirm()
    {
        Intent intent = new Intent(this,confirmCodeActivity.class);
        startActivity(intent);
    }
}
