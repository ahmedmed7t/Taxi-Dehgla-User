package com.example.crazynet.taxidegeluser.UI.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.crazynet.taxidegeluser.R;
import com.example.crazynet.taxidegeluser.UI.main.MainActivity;
import com.example.crazynet.taxidegeluser.UI.splash2.splash2Activity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ButterKnife.bind(this);

    }


    @OnClick(R.id.splash_container)
    public void tosplash2()
    {
        Intent intent = new Intent(this, splash2Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                tosplash2();
            }
        }, 3000);
    }
}
