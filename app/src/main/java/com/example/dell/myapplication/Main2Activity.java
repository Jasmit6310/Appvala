package com.example.dell.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button R1C1, R1C2, R1C3, R2C1, R2C2, R2C3, R3C1, R3C2, R3C3 ,RE,BACK;
    String b_11, b_12, b_13, b_21, b_22, b_23, b_31, b_32, b_33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       setID();
        R1C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(Main2Activity.this, friendslist.class);
                Toast.makeText(Main2Activity.this, "Splitting Done", Toast.LENGTH_SHORT).show();
                k.putExtra("number","2");
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                startActivity(k);
            }
        });


    }

    public void setID(){

        R1C1 = (Button) findViewById(R.id.btn_1_1);
        R1C2 = (Button) findViewById(R.id.btn_1_2);
        R1C3 = (Button) findViewById(R.id.btn_1_3);
        R2C1 = (Button) findViewById(R.id.btn_2_1);
        R2C2 = (Button) findViewById(R.id.btn_2_2);
        R2C3 = (Button) findViewById(R.id.btn_2_3);
        R3C1 = (Button) findViewById(R.id.btn_3_1);
        R3C2 = (Button) findViewById(R.id.btn_3_2);
        R3C3 = (Button) findViewById(R.id.btn_3_3);

    }
}
