package com.example.gabi2.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
    Button Ok;
    Bundle Bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ok = (Button) findViewById(R.id.start);

        Ok = (Button)findViewById(R.id.start);
        Bundle = new Bundle();

        Ok.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start:
                Intent intent = new Intent(this, RecebeIntent.class);
                Bundle extras = new Bundle();
                startActivity(intent);
                break;
        }
    }