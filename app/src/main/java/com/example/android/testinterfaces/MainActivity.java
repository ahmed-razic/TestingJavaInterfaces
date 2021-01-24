package com.example.android.testinterfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myView = findViewById(R.id.textView);
        MyOnClickListener myListenerObject = new MyOnClickListener();

        myView.setOnClickListener(myListenerObject);

        TextView myView2 = findViewById(R.id.textView2);

        myView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "This is toast 2", Toast.LENGTH_SHORT).show();
            }
        });

        TextView myView3 = findViewById(R.id.textView3);
        myView3.setOnClickListener(v -> Toast.makeText(v.getContext(), "This is toast 3", Toast.LENGTH_SHORT).show());
    }
}