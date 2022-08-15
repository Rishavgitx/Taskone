package com.example.spider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FifthActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        Button button11 = findViewById(R.id.twelfth_act_btn);
        Button button12 = findViewById(R.id.thirteen_act_btn);


        button11.setOnClickListener(this);
        button12.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.twelfth_act_btn:
                Toast.makeText(this, "Automatic", Toast.LENGTH_LONG).show();
                Intent i = new Intent(FifthActivity.this,TwelfthActivity.class);
                startActivity(i);
                break;
            case R.id.thirteen_act_btn:
                Toast.makeText(this, "Manual", Toast.LENGTH_LONG).show();
                Intent j = new Intent(FifthActivity.this, ThirteenActivity.class);
                startActivity(j);
                break;


        }
}}