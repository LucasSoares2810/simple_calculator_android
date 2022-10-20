package com.pucpr.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText num1editText;
    EditText num2editText;
    EditText resulteditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1editText = findViewById(R.id.num1editText);
        num2editText = findViewById(R.id.num2editText);
        resulteditText = findViewById(R.id.resulteditText);
    }

    public void plusButtonOnClick(View view){
        float num1 = Integer.parseInt(num1editText.getText().toString());
        float num2 = Integer.parseInt(num2editText.getText().toString());

        resulteditText.setText(String.valueOf(num1+num2));
    }

    public void minusButtonOnClick(View view){
        float num1 = Integer.parseInt(num1editText.getText().toString());
        float num2 = Integer.parseInt(num2editText.getText().toString());

        resulteditText.setText(String.valueOf(num1-num2));
    }

    public void multiplyButtonOnClick(View view){
        float num1 = Integer.parseInt(num1editText.getText().toString());
        float num2 = Integer.parseInt(num2editText.getText().toString());

        resulteditText.setText(String.valueOf(num1*num2));
    }

    public void divideButtonOnClick(View view){
        float num1 = Integer.parseInt(num1editText.getText().toString());
        float num2 = Integer.parseInt(num2editText.getText().toString());

        resulteditText.setText(String.valueOf(num1/num2));
    }


}