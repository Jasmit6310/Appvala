package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class friendslist extends AppCompatActivity {

    EditText[] names = new EditText[10];
    EditText[] amounts = new EditText[10];
    CheckBox[] paid = new CheckBox[10];
    int num_of_enables;

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

    }

}
