package com.example.spider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class TenthActivity extends AppCompatActivity {
    Spinner sp5;
    Spinner sp6;
    Button b3;
    TextView v3;
    EditText ed3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        sp5 = findViewById(R.id.spfrom2);
        sp6 = findViewById(R.id.spto2);
        ed3 = findViewById(R.id.txtamount2);
        b3=  findViewById(R.id.btn3);
        v3 = findViewById(R.id.textView16);

        String[] from = {"Kilogram(kg)"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp5.setAdapter(ad);


        String[] to = {"gram(g)","ton(t)","Ounce(oz)"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp6.setAdapter(ad1);


        b3 = findViewById(R.id.btn3);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double tot;

                Double amt = Double.parseDouble(ed3.getText().toString());

                if(sp5.getSelectedItem().toString() == "Kilogram(kg)" && sp6.getSelectedItem().toString() == "gram(g)")
                {
                    tot = amt * 1000.0;
                    v3.setText(""+tot);
                }
                else if(sp5.getSelectedItem().toString() == "Kilogram(kg)" && sp6.getSelectedItem().toString() == "ton(t)")
                {
                    tot = amt / 1000.0;
                    v3.setText(""+tot);
                }
                else if(sp5.getSelectedItem().toString() == "Kilogram(kg)" && sp6.getSelectedItem().toString() == "Ounce(oz)")
                {
                    tot = amt * 35.274;
                    v3.setText(""+tot);
                }
            }
        });
    }
}


