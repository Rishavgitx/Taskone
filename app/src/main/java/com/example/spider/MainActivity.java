package com.example.spider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.second_act_btn);
        Button button2 = findViewById(R.id.third_act_btn);
        Button button3 = findViewById(R.id.fourth_act_btn);
        Button button4 = findViewById(R.id.fifth_act_btn);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
     switch (v.getId()){
         case R.id.second_act_btn:
             Toast.makeText(this,"Length Converter",Toast.LENGTH_LONG).show();
             Intent i = new Intent(MainActivity.this,SecondActivity.class);
             startActivity(i);
             break;
         case R.id.third_act_btn:
             Toast.makeText(this,"Temprature Converter",Toast.LENGTH_LONG).show();
             Intent j = new Intent(MainActivity.this,ThirdActivity.class);
             startActivity(j);
             break;
         case R.id.fourth_act_btn:
             Toast.makeText(this,"Weight Converter",Toast.LENGTH_LONG).show();
             Intent k = new Intent(MainActivity.this,FourthActivity.class);
             startActivity(k);
             break;
         case R.id.fifth_act_btn:
             Toast.makeText(this,"Speed Converter",Toast.LENGTH_LONG).show();
             Intent l = new Intent(MainActivity.this,FifthActivity.class);
             startActivity(l);
             break;
     }


    }
}











