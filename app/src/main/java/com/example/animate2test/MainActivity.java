package com.example.animate2test;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button btnFA,btnEN,btnnext;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFA=findViewById(R.id.btnFA);
        btnEN=findViewById(R.id.btnEN);
        btnnext=findViewById(R.id.btnnext);

        btnFA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String language = "fa";
                Cache.setString("language",language);
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });


        btnEN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String language = "en";
                Cache.setString("language",language);

                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });


        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
    }

}
