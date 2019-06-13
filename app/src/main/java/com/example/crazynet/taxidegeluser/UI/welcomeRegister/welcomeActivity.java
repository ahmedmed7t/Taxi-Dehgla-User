package com.example.crazynet.taxidegeluser.UI.welcomeRegister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.crazynet.taxidegeluser.R;
import com.example.crazynet.taxidegeluser.UI.main.MainActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class welcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
    }
      // from welcome to hom Activity
    @OnClick(R.id.btn_to_main)
    public void tomain(){
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    }

}
