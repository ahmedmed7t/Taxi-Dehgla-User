package com.example.crazynet.taxidegeluser.UI.splash2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.crazynet.taxidegeluser.R;
import com.example.crazynet.taxidegeluser.UI.log_sign.log_or_sign_Activity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class splash2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.login)
    public void toLogin()
    {
        Intent intent = new Intent(this,log_or_sign_Activity.class);
        intent.putExtra("index",1);
        startActivity(intent);
    }

    @OnClick(R.id.signup)
    public void tosignup()
    {
        Intent intent = new Intent(this,log_or_sign_Activity.class);
        intent.putExtra("index",2);
        startActivity(intent);
    }
}
