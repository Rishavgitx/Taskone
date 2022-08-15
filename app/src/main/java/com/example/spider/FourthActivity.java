package com.example.spider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Button button9 = findViewById(R.id.tenth_act_btn);
        Button button10 = findViewById(R.id.elevent_act_btn);


        button9.setOnClickListener(this);
        button10.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.tenth_act_btn:
                Toast.makeText(this, "Automatic", Toast.LENGTH_LONG).show();
                Intent i = new Intent(FourthActivity.this,TenthActivity.class);
                startActivity(i);
                break;
            case R.id.elevent_act_btn:
                Toast.makeText(this, "Manual", Toast.LENGTH_LONG).show();
                Intent j = new Intent(FourthActivity.this, EleventhActivity.class);
                startActivity(j);
                break;

    }
}
}