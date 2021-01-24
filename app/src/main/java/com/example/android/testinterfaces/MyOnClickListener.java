package com.example.android.testinterfaces;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Toast;

public class MyOnClickListener  implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Toast toast = Toast.makeText(v.getContext(), "Toast 1: Created myOnClickListenerObject", Toast.LENGTH_LONG);
        toast.show();
    }
}
