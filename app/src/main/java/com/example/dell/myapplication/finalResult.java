package com.example.dell.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class finalResult extends AppCompatActivity {


    private int var_limit;
    private String [] result_arr;
    private TextView [] tv_list;
    private String answer;
    private int [] tv_ids = new int[22];
    private int number;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.result_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.btn_go_to_list: {
                AlertDialog.Builder builder = new AlertDialog.Builder(finalResult.this);
                builder.setCancelable(true);
                builder.setMessage("Are you sure you want to generate a new query?");
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(finalResult.this,first_page.class));
                        finish();
                    }
                });

                AlertDialog alert = builder.create();
                alert.show();
                break;
            }

            case R.id.developer: {
                startActivity(new Intent(getApplicationContext(),devsInfo.class));
                finish();
            }
        }


        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_result);

        String limit;

        Intent neo = getIntent();
        limit = neo.getStringExtra("limits");
        //Toast.makeText(getApplicationContext(),limit,Toast.LENGTH_LONG).show();
            if (limit == null){
                Toast.makeText(getApplicationContext(),"Won't work!",Toast.LENGTH_SHORT).show();
            }
            else {
                number = Integer.parseInt(limit);

                Toast.makeText(this, "the hint is " + number, Toast.LENGTH_SHORT).show();


                result_arr = new String[number];
                tv_list = new TextView[22];
                result_arr = neo.getStringArrayExtra("result_ans");

                setID();


                //for(int i=0;i<number;i++){
                //  Toast.makeText(getApplicationContext(),result_arr[i],Toast.LENGTH_LONG).show();
                //}

                for (int i = 0; i < 21; i++) {
                    tv_list[i].setText("");
                }

                for (int i = 0; i < number; i++) {
                    tv_list[i].setText(result_arr[i]);
                }

               // for(int i=0;i<number;i++){
               //     Toast.makeText(getApplicationContext(),result_arr[i],Toast.LENGTH_SHORT).show();
                //}


//        for(int i=0;i<n;i++){
//            Toast.makeText(getApplicationContext(),result_arr[i],Toast.LENGTH_LONG).show();
//        }

            }
    }

   public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(finalResult.this);
        builder.setCancelable(true);
        builder.setMessage("Are you sure you want to generate a new query?");
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(finalResult.this,first_page.class));
                finish();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
    }

    private void setID(){
        tv_list[0] = findViewById(R.id.tv_0);
        tv_list[1] = findViewById(R.id.tv_1);
        tv_list[2] = findViewById(R.id.tv_2);
        tv_list[3] = findViewById(R.id.tv_3);
        tv_list[4] = findViewById(R.id.tv_4);
        tv_list[5] = findViewById(R.id.tv_5);
        tv_list[6] = findViewById(R.id.tv_6);
        tv_list[7] = findViewById(R.id.tv_7);
        tv_list[8] = findViewById(R.id.tv_8);
        tv_list[9] = findViewById(R.id.tv_9);
        tv_list[10] = findViewById(R.id.tv_10);
        tv_list[11] = findViewById(R.id.tv_11);
        tv_list[12] = findViewById(R.id.tv_12);
        tv_list[13] = findViewById(R.id.tv_13);
        tv_list[14] = findViewById(R.id.tv_14);
        tv_list[15] = findViewById(R.id.tv_15);
        tv_list[16] = findViewById(R.id.tv_16);
        tv_list[17] = findViewById(R.id.tv_17);
        tv_list[18] = findViewById(R.id.tv_18);
        tv_list[19] = findViewById(R.id.tv_19);
        tv_list[20] = findViewById(R.id.tv_20);
    }

}
