package com.example.lesson1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
EditText editText1;
Button button;
TextView text;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.login);
        button = findViewById(R.id.voiti);
        text = findViewById(R.id.pokazat);
        button.setOnClickListener(v -> {
            String txt = editText1.getText().toString();
            text.setText(txt);
        });



        }
}
