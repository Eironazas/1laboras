package com.example.a1laboras;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    @SuppressLint("SetTextI18n")
    public void buttonClick(View v)
    {
        TextView tv = findViewById(R.id.textView);
        tv.setText("Welcome to android");
    }
}
