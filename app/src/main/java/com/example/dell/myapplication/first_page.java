package com.example.dell.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class first_page extends AppCompatActivity {

    Button R2, R3, R4, R5, R6, R7, R8, R9, R10 ;
    String s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setID();

        R2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = R2.getText().toString();
                Intent k=new Intent(FirstPage.this, friendslist.class);
                k.putExtra("number",s);
                Toast.makeText(FirstPage.this, "Split between 2", Toast.LENGTH_SHORT).show();
                startActivity(k);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
        R3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = R3.getText().toString();
                Intent k=new Intent(FirstPage.this, friendslist.class);
                k.putExtra("number",s);
                Toast.makeText(FirstPage.this, "Split between 3", Toast.LENGTH_SHORT).show();
                startActivity(k);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        R4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = R4.getText().toString();
                Intent k=new Intent(FirstPage.this, friendslist.class);
                k.putExtra("number",s);
                Toast.makeText(FirstPage.this, "Split between 4", Toast.LENGTH_SHORT).show();
                startActivity(k);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        R5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = R5.getText().toString();
                Intent k = new Intent(getApplicationContext(),friendslist.class);
                k.putExtra("number",s);
                Toast.makeText(getApplicationContext(),"Split between 5",Toast.LENGTH_SHORT).show();
                startActivity(k);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        R6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = R6.getText().toString();
                Intent k = new Intent(getApplicationContext(),friendslist.class);
                k.putExtra("number",s);
                Toast.makeText(getApplicationContext(),"Split between 6",Toast.LENGTH_SHORT).show();
                startActivity(k);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        R7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = R7.getText().toString();
                Intent k = new Intent(getApplicationContext(),friendslist.class);
                k.putExtra("number",s);
                Toast.makeText(getApplicationContext(),"Split between 7",Toast.LENGTH_SHORT).show();
                startActivity(k);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        R8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = R8.getText().toString();
                Intent k = new Intent(getApplicationContext(),friendslist.class);
                k.putExtra("number",s);
                Toast.makeText(getApplicationContext(),"Split between 8",Toast.LENGTH_SHORT).show();
                startActivity(k);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        R9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = R9.getText().toString();
                Intent k = new Intent(getApplicationContext(),friendslist.class);
                k.putExtra("number",s);
                Toast.makeText(getApplicationContext(),"Split between 9",Toast.LENGTH_SHORT).show();
                startActivity(k);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        R10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = R10.getText().toString();
                Intent k = new Intent(getApplicationContext(),friendslist.class);
                k.putExtra("number",s);
                Toast.makeText(getApplicationContext(),"Split between 10",Toast.LENGTH_SHORT).show();
                startActivity(k);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
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
