package com.example.basics;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        TextView helloTxt = findViewById(R.id.helloTxt);
        EditText nameInput = findViewById(R.id.nameTxt);
        if (nameInput.getText().toString().isEmpty()) {
            helloTxt.setText("Hello, Android!!!");
            return;
        }
        helloTxt.setText("Hello, " + nameInput.getText().toString() + "!");
        nameInput.setText("");
    }
}
