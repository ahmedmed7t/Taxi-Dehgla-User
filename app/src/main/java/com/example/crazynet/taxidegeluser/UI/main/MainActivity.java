package com.example.crazynet.taxidegeluser.UI.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.crazynet.taxidegeluser.R;
import com.example.crazynet.taxidegeluser.UI.splash.splashActivity;
import com.example.crazynet.taxidegeluser.UI.tripsFragment;

public class MainActivity extends AppCompatActivity {

    public static int in = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // hey

        FrameLayout frameLayout = findViewById(R.id.cont);

        getSupportFragmentManager().beginTransaction().replace(R.id.cont,new tripsFragment()).commit();

    }
}
