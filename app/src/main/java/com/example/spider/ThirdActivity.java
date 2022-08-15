package com.example.spider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button button7 = findViewById(R.id.eight_act_btn);
        Button button8 = findViewById(R.id.ninth_act_btn);


        button7.setOnClickListener(this);
        button8.setOnClickListener(this);

    }




    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.eight_act_btn:
                Toast.makeText(this, "Automatic", Toast.LENGTH_LONG).show();
                Intent i = new Intent(ThirdActivity.this, EighthActivity.class);
                startActivity(i);
                break;
            case R.id.ninth_act_btn:
                Toast.makeText(this, "Manual", Toast.LENGTH_LONG).show();
                Intent j = new Intent(ThirdActivity.this, NinthActivity.class);
                startActivity(j);
                break;
        }

    }}