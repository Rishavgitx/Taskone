package com.example.spider;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button5 = findViewById(R.id.sixth_act_btn);
        Button button6 = findViewById(R.id.seventh_act_btn);


        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

    }


@Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sixth_act_btn:
                Toast.makeText(this, "Automatic", Toast.LENGTH_LONG).show();
                Intent a = new Intent(SecondActivity.this, SIxthActivity.class);
                startActivity(a);
                break;
            case R.id.seventh_act_btn:
                Toast.makeText(this, "Manual", Toast.LENGTH_LONG).show();
                Intent b = new Intent(SecondActivity.this, SeventhActivity.class);
                startActivity(b);
                break;
        }
    }
}