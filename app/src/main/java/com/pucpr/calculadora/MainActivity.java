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

    protected float getNumFromEditText(int id){
        String aux;
        if(id == 1){
            aux = num1editText.getText().toString();
        }else {
            aux = num2editText.getText().toString();
        }
        return Float.parseFloat(aux);
    }

    public void plusButtonOnClick(View v){
        float num1 = getNumFromEditText(1);
        float num2 = getNumFromEditText(2);

        float result = num1 + num2;

        resulteditText.setText(String.valueOf(result));
    }
}