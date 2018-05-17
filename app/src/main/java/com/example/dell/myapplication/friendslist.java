package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class friendslist extends AppCompatActivity {

    EditText[] names = new EditText[10];
    EditText[] amounts = new EditText[10];
    CheckBox[] paid = new CheckBox[10];
    String[] username = new String[10];
    int[] amo=new int[10];
    Button go;
    String amo_str;
    int num_of_enables,total_amount,temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendslist);
        setID();
        num_of_enables=Integer.parseInt(getIntent().getStringExtra("number"));

        for(int i = num_of_enables ; i<10 ; i++){
            names[i].setEnabled(false);
            paid[i].setEnabled(false);
            amounts[i].setEnabled(false);
        }

        for(int i=0;i<num_of_enables;i++)
            amounts[i].setEnabled(false);

        paid[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(paid[0].isChecked()){
                    amounts[0].setEnabled(true);
                }
                else
                    amounts[0].setEnabled(false);
            }
        });

        paid[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(paid[1].isChecked()){
                    amounts[1].setEnabled(true);
                }
                else
                    amounts[1].setEnabled(false);
            }
        });

        paid[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(paid[2].isChecked()){
                    amounts[2].setEnabled(true);
                }
                else
                    amounts[2].setEnabled(false);
            }
        });

        paid[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(paid[3].isChecked()){
                    amounts[3].setEnabled(true);
                }
                else
                    amounts[3].setEnabled(false);
            }
        });

        paid[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(paid[4].isChecked()){
                    amounts[4].setEnabled(true);
                }
                else
                    amounts[4].setEnabled(false);
            }
        });

        paid[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(paid[5].isChecked()){
                    amounts[5].setEnabled(true);
                }
                else
                    amounts[5].setEnabled(false);
            }
        });

        paid[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(paid[6].isChecked()){
                    amounts[6].setEnabled(true);
                }
                else
                    amounts[6].setEnabled(false);
            }
        });

        paid[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(paid[7].isChecked()){
                    amounts[7].setEnabled(true);
                }
                else
                    amounts[7].setEnabled(false);
            }
        });

        paid[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(paid[8].isChecked()){
                    amounts[8].setEnabled(true);
                }
                else
                    amounts[8].setEnabled(false);
            }
        });

        paid[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(paid[9].isChecked()){
                    amounts[9].setEnabled(true);
                }
                else
                    amounts[9].setEnabled(false);
            }
        });


        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for(int i=0;i<num_of_enables;i++)
                {
                    amo_str=amounts[i].getText().toString();
                    temp=Integer.parseInt(amo_str);

                    amo[i]=temp;
                    total_amount+=amo[i];
                }
                Toast.makeText(friendslist.this,"total amount "+total_amount,Toast.LENGTH_SHORT).show();



            }
        });


        /*go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<num_of_enables;i++){
                    username[i].
                }
                if(!check_for_no_name())
                    Toast.makeText(getApplicationContext(),"Enter the names of all the users!", Toast.LENGTH_SHORT).show();
            }
        });*/

    }

    public void setID(){
        // Names of the friends
        names[0] = findViewById(R.id.name_1);
        names[1] = findViewById(R.id.name_2);
        names[2] = findViewById(R.id.name_3);
        names[3] = findViewById(R.id.name_4);
        names[4] = findViewById(R.id.name_5);
        names[5] = findViewById(R.id.name_6);
        names[6] = findViewById(R.id.name_7);
        names[7] = findViewById(R.id.name_8);
        names[8] = findViewById(R.id.name_9);
        names[9] = findViewById(R.id.name_10);

        // Amount paid by the friends
        amounts[0] = findViewById(R.id.amount_1);
        amounts[1] = findViewById(R.id.amount_2);
        amounts[2] = findViewById(R.id.amount_3);
        amounts[3] = findViewById(R.id.amount_4);
        amounts[4] = findViewById(R.id.amount_5);
        amounts[5] = findViewById(R.id.amount_6);
        amounts[6] = findViewById(R.id.amount_7);
        amounts[7] = findViewById(R.id.amount_8);
        amounts[8] = findViewById(R.id.amount_9);
        amounts[9] = findViewById(R.id.amount_10);

        // Checkboxes for the amount paid

        paid[0] = findViewById(R.id.checkbox_1);
        paid[1] = findViewById(R.id.checkbox_2);
        paid[2] = findViewById(R.id.checkbox_3);
        paid[3] = findViewById(R.id.checkbox_4);
        paid[4] = findViewById(R.id.checkbox_5);
        paid[5] = findViewById(R.id.checkbox_6);
        paid[6] = findViewById(R.id.checkbox_7);
        paid[7] = findViewById(R.id.checkbox_8);
        paid[8] = findViewById(R.id.checkbox_9);
        paid[9] = findViewById(R.id.checkbox_10);

        //go button

        go = findViewById(R.id.btn_go);
    }

    // Checks if the user has entered the name or not!
    //public boolean check_for_no_name(){

    //}
}
