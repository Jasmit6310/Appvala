package com.example.dell.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstPage extends AppCompatActivity {

    Button R2, R3, R4, R5, R6, R7, R8, R9, R10 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setID();

        R2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(FirstPage.this, after2.class);
                Toast.makeText(FirstPage.this, "Split between 2", Toast.LENGTH_SHORT).show();
                startActivity(k);
                finish();
            }
        });
            R3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k=new Intent(FirstPage.this, after3.class);
                    Toast.makeText(FirstPage.this, "Split between 3", Toast.LENGTH_SHORT).show();
                    startActivity(k);
                    finish();
                }
        });
    }

    public void setID(){

        R2 = (Button) findViewById(R.id.btn_1_1);
        R3 = (Button) findViewById(R.id.btn_1_2);
        R4 = (Button) findViewById(R.id.btn_1_3);
        R5 = (Button) findViewById(R.id.btn_2_1);
        R6 = (Button) findViewById(R.id.btn_2_2);
        R7 = (Button) findViewById(R.id.btn_2_3);
        R8 = (Button) findViewById(R.id.btn_3_1);
        R9 = (Button) findViewById(R.id.btn_3_2);
        R10 = (Button) findViewById(R.id.btn_3_3);

    }
}
