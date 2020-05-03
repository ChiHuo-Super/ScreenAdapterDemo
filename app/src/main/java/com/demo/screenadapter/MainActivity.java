package com.demo.screenadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScreenAdapter.setCustomDensity(this,getApplication());
        setContentView(R.layout.activity_main);
    }

}
