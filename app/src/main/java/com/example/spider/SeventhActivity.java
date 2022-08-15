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

public class SeventhActivity extends AppCompatActivity {

    Spinner sp9;
    Spinner sp10;
    Button b5;
    TextView t1;
    EditText ed5;
    EditText ed6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        sp9 = findViewById(R.id.spfrom4);
        sp10 = findViewById(R.id.spto4);
        ed5 = findViewById(R.id.txtamount4);
        ed6 = findViewById(R.id.txtamount5);
        b5 = findViewById(R.id.btn5);
        t1 = findViewById(R.id.result1);

        String[] from = {"meter(m)"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
        sp9.setAdapter(ad);


        String[] to = {"Kilometer(km)", "Centimeter(cm)", "Millimeter(mm)"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, to);
        sp10.setAdapter(ad1);

        b5 = findViewById(R.id.btn5);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double amt = Double.parseDouble(ed5.getText().toString());
                Double amt1 = Double.parseDouble(ed6.getText().toString());

                if (sp9.getSelectedItem().toString() == "Metre(m)" && sp10.getSelectedItem().toString() == "Kilometre(km)") {
                    if (amt1 == amt / 1000) {
                        t1.setText("" + "Correct");
                    } else {
                        t1.setText("" + "Incorrect");
                    }
                } else if (sp9.getSelectedItem().toString() == "Metre(m)" && sp10.getSelectedItem().toString() == "Centimetre(cm)") {
                    if (amt1 == amt * 100) {
                        t1.setText("" + "Correct");
                    } else {
                        t1.setText("" + "Incorrect");
                    }
                } else if (sp9.getSelectedItem().toString() == "Metre(m)" && sp10.getSelectedItem().toString() == "Millimetre(mm)") {
                    if (amt1 == amt * 1000) {
                        t1.setText("" + "Correct");
                    } else {
                        t1.setText("" + "Incorrect");
                    }
                }
            }
        });


    }

}

