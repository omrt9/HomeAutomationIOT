package com.example.omrt.speechtotext;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class ControlWithText extends Activity {

    ControlWithButton.Background_get bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.controlwithtext);

        RadioButton b1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton b2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton b3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton b4 = (RadioButton) findViewById(R.id.radioButton4);
        RadioButton b5 = (RadioButton) findViewById(R.id.radioButton5);
        RadioButton b6 = (RadioButton) findViewById(R.id.radioButton6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Control();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Control();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Control();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Control();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Control();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Control();

            }
        });
    }

    public void Control()
    {
        bg.execute("1");
    }

}
