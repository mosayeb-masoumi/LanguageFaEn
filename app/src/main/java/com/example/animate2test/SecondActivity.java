package com.example.animate2test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Language.updateResources(getApplicationContext(),Cache.getString("language"));
        setContentView(R.layout.activity_second);

    }
}
