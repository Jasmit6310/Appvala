package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;


public class after2 extends AppCompatActivity {

    Button s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after2);

        s2 = (Button) findViewById(R.id.split2);

        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1 = (EditText) findViewById(R.id.amount);
                
                TextView t1 = (TextView) findViewById(R.id.textview);
                int k=Integer.parseInt(e1.getText().toString());
                float fs=0;
                fs=(float)k/2;
                t1.setText(Float.toString(fs));
            }
        });

    }
}
