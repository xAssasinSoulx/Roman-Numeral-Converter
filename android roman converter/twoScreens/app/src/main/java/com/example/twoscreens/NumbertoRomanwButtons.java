package com.example.twoscreens;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NumbertoRomanwButtons extends AppCompatActivity {


    NumberToRoman toroman = new NumberToRoman();

    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button backspace;
    Button convert ;
    Button home;
    Button add;
    Button equal;
    Button clear;
    Button roman;
    TextView result;
    TextView info;
    int val1;
    int val2;
    int val3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatorwithbutton);


        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (info.getText().length() > 0){
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length() - 1));
                }
            }
        });

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(info.getText().toString());

                if (num >= 4000){
                    String maxNum = "You can't enter number greater than 4000, try again";
                    result.setText(maxNum);
                    info.setText("");
                } else {
                    String resultt = toroman.intToRoman(num);
                    String resultw = ("Your number is: " + num + " " + "and the Roman version is: ");
                    result.setText(resultw + resultt);
                    info.setText("");
                }
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(home);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                val1 = Integer.parseInt(info.getText().toString());
                result.setText(val1 + "+");
                info.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                val2 = Integer.parseInt(info.getText().toString());
                val3 = val1 + val2;

                if (val3 >=4000){
                    String error = "You can't enter number greater than 4000, please try again";
                    result.setText(error);
                    info.setText(null);

                } else{
                    String finalnum = toroman.intToRoman(val3);
                    result.setText(result.getText().toString() + val2 + "=" + finalnum + " which is: " + val3);
                    info.setText(null);
                    val1 = 0;
                    val2 = 0;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(null);
                info.setText(null);
                val1 = 0;
                val2 = 0;
            }
        });

        roman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toRoman = new Intent(getApplicationContext(), RomantoNumberwButtons.class);
                startActivity(toRoman);
            }
        });
    }

    private void setupUIViews(){
        zero = findViewById(R.id.btn0);
        one = findViewById(R.id.btn1);
        two = findViewById(R.id.btn2);
        three = findViewById(R.id.btn3);
        four = findViewById(R.id.btn4);
        five = findViewById(R.id.btn5);
        six = findViewById(R.id.btn6);
        seven = findViewById(R.id.btn7);
        eight = findViewById(R.id.btn8);
        nine = findViewById(R.id.btn9);
        result = findViewById(R.id.result);
        info = findViewById(R.id.control);
        add = findViewById(R.id.btnadd);
        equal = findViewById(R.id.btnequal);
        backspace = findViewById(R.id.btnerase);
        clear = findViewById(R.id.btnclear);
        convert = findViewById(R.id.btnconvert);
        home = findViewById(R.id.btnHome);
        roman = findViewById(R.id.btnRoman);
    }
}
