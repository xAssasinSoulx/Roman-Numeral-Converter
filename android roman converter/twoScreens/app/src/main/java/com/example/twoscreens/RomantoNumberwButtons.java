package com.example.twoscreens;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RomantoNumberwButtons extends AppCompatActivity {

    RomanToNumber tonumber = new RomanToNumber();
    NumberToRoman toroman = new NumberToRoman();

    Button I;
    Button V;
    Button X;
    Button L;
    Button C;
    Button D;
    Button M;
    Button convert;
    Button erase;
    Button home;
    Button add;
    Button clear;
    Button equal;
    Button decimal;
    TextView result;
    TextView input;
    String first;
    String second;
    int number1;
    int number2;
    int resultt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romanto_numberw_buttons);

        setupUIViews();

        I.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "I");
            }
        });

        V.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "V");
            }
        });

        X.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "X");
            }
        });

        L.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "L");
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "C");
            }
        });

        D.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "D");
            }
        });

        M.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "M");
            }
        });

        convert.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                first = (input.getText().toString()).toUpperCase();

                int numberfull = tonumber.romanToDecimal(first);

                if (numberfull >=4000){
                    String error = "The number cannot exceed 4000. Try again";
                    result.setText(error);
                    input.setText(null);
                    first = null;
                }else{
                    result.setText("You are converting: " + first + " " + "Number version is: " + numberfull + "");
                    input.setText("");
                    first = null;
                }

            }
        });

        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().length() > 0){
                    CharSequence name = input.getText().toString();
                    input.setText(name.subSequence(0, name.length() - 1));
                }
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tohome = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(tohome);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(null);
                input.setText(null);
                first = null;
                second = null;
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                first = input.getText().toString();
                result.setText(first + " + ");
                input.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                second = input.getText().toString();

                int number1 = tonumber.romanToDecimal(first);
                int number2 = tonumber.romanToDecimal(second);
                int resultt = number1 + number2;
                String finalsum = toroman.intToRoman(resultt);
                if (resultt >=4000){
                    String error = "The number can not exceed 4000, try again";
                    result.setText(error);
                    input.setText(null);
                } else{
                    result.setText(first + " + " + second + "= " + finalsum + " which is: " + number1 + " + " + number2 + "=" + resultt);
                    input.setText(null);
                    first = null;
                    second = null;
                }
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toDecimal = new Intent(getApplicationContext(), NumbertoRomanwButtons.class);
                startActivity(toDecimal);
            }
        });
    }

    public void setupUIViews(){

        I = findViewById(R.id.btnnI);
        V = findViewById(R.id.btnnV);
        X = findViewById(R.id.btnnX);
        L = findViewById(R.id.btnnL);
        C = findViewById(R.id.btnnC);
        D = findViewById(R.id.btnnD);
        M = findViewById(R.id.btnnM);
        convert = findViewById(R.id.btnnConvert);
        erase = findViewById(R.id.btnnErase);
        home = findViewById(R.id.btnnHome);
        input = findViewById(R.id.input);
        result = findViewById(R.id.resultt);
        add = findViewById(R.id.btnnadd);
        equal = findViewById(R.id.btnnequal);
        clear = findViewById(R.id.btnnclear);
        decimal = findViewById(R.id.btnnDecimal);
    }
}
