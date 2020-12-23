package com.example.twoscreens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button numbertoRoman = (Button)findViewById(R.id.numbertoroman);
        Button romantoNumber = (Button)findViewById(R.id.romantonumber);


        numbertoRoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbertoRomanIntent = new Intent(getApplicationContext(), NumbertoRomanwButtons.class);
                startActivity(numbertoRomanIntent);
            }
        });

        romantoNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent romantuNumberIntent = new Intent(getApplicationContext(), RomantoNumberwButtons.class);
                startActivity(romantuNumberIntent);
            }
        });

    }
}
