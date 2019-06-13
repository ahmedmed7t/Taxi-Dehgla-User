package com.example.crazynet.taxidegeluser.UI.verifyNumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.crazynet.taxidegeluser.R;
import com.example.crazynet.taxidegeluser.UI.phoneNumber.phoneNumberActivity;
import com.example.crazynet.taxidegeluser.UI.welcomeRegister.welcomeActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class confirmCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_code);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.backConfirm)
    public void backtoNumber()
    {
        Intent intent = new Intent(this,phoneNumberActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_apply)
    public void towelcome(){
        Intent intent = new Intent(this,welcomeActivity.class);
        startActivity(intent);
    }
}
