package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView result;
        EditText edtweight;
        EditText edthfoot;
        EditText edthinch;
        Button btncalculate;

        result = findViewById(R.id.result);
        edtweight = findViewById(R.id.edtweight);
        edthfoot = findViewById(R.id.edthfoot);
        edthinch = findViewById(R.id.edtinch);
        btncalculate = findViewById(R.id.btncalculate);

        btncalculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int weight =Integer.parseInt (edtweight.getText().toString());
                int feet = Integer.parseInt(edthfoot.getText().toString());
                int inch = Integer.parseInt(edthinch.getText().toString());

                int totalinch = feet*12+inch;
                double totalcm = totalinch*2.53;
                double totalm = totalcm/100;

                double bmi = weight/(totalm*totalm);

                if(bmi>25) {
                    result.setText("You're Overweight");
                }
                else if(bmi<18){
                    result.setText("You're UnderWeight");
                }
                else{
                    result.setText("You're Healthy");
                }

            }
        });





    }
}