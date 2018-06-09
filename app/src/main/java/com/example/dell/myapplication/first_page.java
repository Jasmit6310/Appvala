package com.example.dell.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class first_page extends AppCompatActivity {

    Button R2, R3, R4, R5, R6, R7, R8, R9, R10 ;
    String s;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.first_menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.btn_quit) {
            AlertDialog.Builder builder = new AlertDialog.Builder(first_page.this);
            builder.setCancelable(true);
            builder.setMessage("Are you sure you want to quit?");
            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //startActivity(new Intent(finalResult.this,first_page.class));
                    finish();
                }
            });

            AlertDialog alert = builder.create();
            alert.show();
            return true;
        }
//
//        if (id == R.id.settings) {
//            Toast.makeText(this, "Setting", Toast.LENGTH_LONG).show();
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }




//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//       switch (item.getItemId()){
//
//           case R.id.devId: {
//               Toast.makeText(getApplicationContext(),"Dev",Toast.LENGTH_LONG).show();
//               break;
//               //go_to_new_activity();
//           }
//
//           case R.id.exit_btn: {
//               Toast.makeText(getApplicationContext(),"Quit",Toast.LENGTH_LONG).show();
//               go_to_new_activity();
//               break;
//               }
//
//            default: return super.onOptionsItemSelected(item);
//       }
//
//
//
//        return true;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        setID();

        R2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = R2.getText().toString();
                Intent k=new Intent(first_page.this, friendslist.class);
                k.putExtra("number",s);
                //int swr = Integer.parseInt(s);
                //Toast.makeText(getApplicationContext(),"the number is " + s,Toast.LENGTH_SHORT).show();
                //Toast.makeText(first_page.this, "Split between 2", Toast.LENGTH_SHORT).show();
                startActivity(k);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
            }
        });
        R3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = R3.getText().toString();
                Intent k=new Intent(first_page.this, friendslist.class);
                k.putExtra("number",s);
                //Toast.makeText(first_page.this, "Split between 3", Toast.LENGTH_SHORT).show();
                startActivity(k);
                finish();
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        R4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = R4.getText().toString();
                Intent k=new Intent(first_page.this, friendslist.class);
                k.putExtra("number",s);
                //Toast.makeText(first_page.this, "Split between 4", Toast.LENGTH_SHORT).show();
                startActivity(k);
                finish();
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        R5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = R5.getText().toString();
                Intent k = new Intent(getApplicationContext(),friendslist.class);
                k.putExtra("number",s);
                //Toast.makeText(getApplicationContext(),"Split between 5",Toast.LENGTH_SHORT).show();
                startActivity(k);
                finish();
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        R6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = R6.getText().toString();
                Intent k = new Intent(getApplicationContext(),friendslist.class);
                k.putExtra("number",s);
                //Toast.makeText(getApplicationContext(),"Split between 6",Toast.LENGTH_SHORT).show();
                startActivity(k);
                finish();
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        R7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = R7.getText().toString();
                Intent k = new Intent(getApplicationContext(),friendslist.class);
                k.putExtra("number",s);
                //Toast.makeText(getApplicationContext(),"Split between 7",Toast.LENGTH_SHORT).show();
                startActivity(k);
                finish();
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        R8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = R8.getText().toString();
                Intent k = new Intent(getApplicationContext(),friendslist.class);
                k.putExtra("number",s);
                //Toast.makeText(getApplicationContext(),"Split between 8",Toast.LENGTH_SHORT).show();
                startActivity(k);
                finish();
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        R9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = R9.getText().toString();
                Intent k = new Intent(getApplicationContext(),friendslist.class);
                k.putExtra("number",s);
                //Toast.makeText(getApplicationContext(),"Split between 9",Toast.LENGTH_SHORT).show();
                startActivity(k);
                finish();
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        R10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = R10.getText().toString();
                Intent k = new Intent(getApplicationContext(),friendslist.class);
                k.putExtra("number",s);
                //Toast.makeText(getApplicationContext(),"Split between 10",Toast.LENGTH_SHORT).show();
                startActivity(k);
                finish();
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(first_page.this);
        builder.setCancelable(true);
        builder.setMessage("Are you sure you want to quit?");
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
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
//
//    public void go_to_new_activity(){
//        startActivity(new Intent(first_page.this,final_result.class));
//        finish();
//    }
}
