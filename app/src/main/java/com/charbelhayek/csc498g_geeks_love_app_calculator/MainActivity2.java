package com.charbelhayek.csc498g_geeks_love_app_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void back(View v){
        openActivity1();
    }
    public void openActivity1(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}