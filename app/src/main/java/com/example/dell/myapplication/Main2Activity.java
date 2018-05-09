package com.example.dell.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button sd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sd = (Button) findViewById(R.id.btn_2);

        sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(Main2Activity.this, MainActivity.class);
                Toast.makeText(Main2Activity.this, "Spliting Done", Toast.LENGTH_SHORT).show();

                startActivity(k);
                finish();
            }
        });
    }
}
