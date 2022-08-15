package com.example.spider;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class SIxthActivity extends AppCompatActivity {
Spinner sp1;
Spinner sp2;
Button b1;
TextView v1;
EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spto);
        ed1 = findViewById(R.id.txtamount);
        b1=  findViewById(R.id.btn1);
        v1 = findViewById(R.id.textView14);

        String[] from = {"Meter(m)"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);


        String[] to = {"Kilometer(km)","Centimeter(cm)","Millimeter(mm)"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);


        b1 = findViewById(R.id.btn1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double tot;

                Double amt = Double.parseDouble(ed1.getText().toString());

                if(sp1.getSelectedItem().toString() == "Meter(m)" && sp2.getSelectedItem().toString() == "Kilometer(km)")
                {
                    tot = amt / 1000.0;
                    v1.setText(""+tot);
                }
                else if(sp1.getSelectedItem().toString() == "Meter(m)" && sp2.getSelectedItem().toString() == "Centimeter(cm)")
                {
                    tot = amt * 100.0;
                    v1.setText(""+tot);
                }
                else if(sp1.getSelectedItem().toString() == "Meter(m)" && sp2.getSelectedItem().toString() == "Millimeter(mm)")
                {
                    tot = amt * 1000.0;
                    v1.setText(""+tot);
                }
            }
        });
    }
}

