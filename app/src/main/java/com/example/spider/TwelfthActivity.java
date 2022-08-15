package com.example.spider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class TwelfthActivity extends AppCompatActivity {
    Spinner sp7;
    Spinner sp8;
    Button b4;
    TextView v4;
    EditText ed4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelfth);
        sp7 = findViewById(R.id.spfrom3);
        sp8 = findViewById(R.id.spto3);
        ed4 = findViewById(R.id.txtamount3);
        b4=  findViewById(R.id.btn4);
        v4 = findViewById(R.id.textView17);

        String[] from = {"meter/second(m/s)"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp7.setAdapter(ad);


        String[] to = {"kilometer/hour(km/h)","foot/second(ft/s)"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp8.setAdapter(ad1);


        b4 = findViewById(R.id.btn4);


        b4.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {

                Double tot;

                Double amt = Double.parseDouble(ed4.getText().toString());

                if(sp7.getSelectedItem().toString() == "meter/second(m/s)" && sp8.getSelectedItem().toString() == "kilometer/hour(km/h)")
                {
                    tot = amt * 3.6;
                    v4.setText(""+tot);
                }

                else if(sp7.getSelectedItem().toString() == "meter/second(m/s)" && sp8.getSelectedItem().toString() == "foot/second(ft/s)")
                {
                    tot = amt * 3.281;
                    v4.setText(""+tot);

                }


            }

        });
    }
}


