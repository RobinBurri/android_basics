package com.example.basics;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        android.widget.TextView helloTxt = findViewById(R.id.helloTxt);
        helloTxt.setText("Hello, Samsung!");
    }
}
