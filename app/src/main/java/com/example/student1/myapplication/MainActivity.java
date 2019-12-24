package com.example.student1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv = findViewById(R.id.textView);
        final EditText ed = findViewById(R.id.editText);
        final EditText ed2 = findViewById(R.id.editText);

        Button b = findViewById(R.id.button);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.getText();
                Integer n = Integer.parseInt(String.valueOf(ed.getText()));
                Integer n1 =  Integer.parseInt(String.valueOf(ed2.getText()));
                Integer nobsh = n + n1;

            }

            ;
        };
        b.setOnClickListener(listener);
    }
}