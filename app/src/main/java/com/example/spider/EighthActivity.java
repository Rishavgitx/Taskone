package com.example.spider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class EighthActivity extends AppCompatActivity {
    Spinner sp3;
    Spinner sp4;
    Button b2;
    TextView v2;
    EditText ed2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);
        sp3 = findViewById(R.id.spfrom1);
        sp4 = findViewById(R.id.spto1);
        ed2 = findViewById(R.id.txtamount1);
        b2 =  findViewById(R.id.btn2);
        v2 = findViewById(R.id.textView15);

        String[] from = {"Kelvin(k)"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp3.setAdapter(ad);


        String[] to = {"Fahrenheit(°F)","Celsius(°C)"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp4.setAdapter(ad1);


        b2 = findViewById(R.id.btn2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double tot;

                Double amt = Double.parseDouble(ed2.getText().toString());

                if(sp3.getSelectedItem().toString() == "Kelvin(k)" && sp4.getSelectedItem().toString() == "Fahrenheit(°F)")
                {
                    tot = ((amt-273.15)*9/5)+32;
                    v2.setText(""+tot);
                }
                else if(sp3.getSelectedItem().toString() == "Kelvin(k)" && sp4.getSelectedItem().toString() == "Celsius(°C)")
                {
                    tot = amt-273.15;
                    v2.setText(""+tot);
                }

            }
        });
    }
}


