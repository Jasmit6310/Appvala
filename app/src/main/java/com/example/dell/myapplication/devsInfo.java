package com.example.dell.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class devsInfo extends AppCompatActivity {

    ImageButton jasmit_li , jasmit_gh , jaydeep_li , jaydeep_gh , yash_li, yash_gh, rom_li, rom_gh, rhythm_li, rhythm_gh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devs_info);
        setID();

        jasmit_li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent neo = new Intent();
                neo.setAction(Intent.ACTION_VIEW);
                neo.addCategory(Intent.CATEGORY_BROWSABLE);
                neo.setData(Uri.parse("https://www.linkedin.com/in/jasmit-lathiya-655424166/"));
                startActivity(neo);
            }
        });

        jasmit_gh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent neo = new Intent();
                neo.setAction(Intent.ACTION_VIEW);
                neo.addCategory(Intent.CATEGORY_BROWSABLE);
                neo.setData(Uri.parse("https://github.com/Jasmit6310"));
                startActivity(neo);
            }
        });

        jaydeep_li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent neo = new Intent();
                neo.setAction(Intent.ACTION_VIEW);
                neo.addCategory(Intent.CATEGORY_BROWSABLE);
                neo.setData(Uri.parse(""));
                startActivity(neo);
            }
        });

        jaydeep_gh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent neo = new Intent();
                neo.setAction(Intent.ACTION_VIEW);
                neo.addCategory(Intent.CATEGORY_BROWSABLE);
                neo.setData(Uri.parse("https://github.com/Jaydeepkakadiya19"));
                startActivity(neo);
            }
        });

        yash_li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent neo = new Intent();
                neo.setAction(Intent.ACTION_VIEW);
                neo.addCategory(Intent.CATEGORY_BROWSABLE);
                neo.setData(Uri.parse("https://www.linkedin.com/in/yash-viradiya-ab19ab124/"));
                startActivity(neo);
            }
        });

        yash_gh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent neo = new Intent();
                neo.setAction(Intent.ACTION_VIEW);
                neo.addCategory(Intent.CATEGORY_BROWSABLE);
                neo.setData(Uri.parse("https://github.com/YashViradiya"));
            }
        });

        rom_li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent neo = new Intent();
                neo.setAction(Intent.ACTION_VIEW);
                neo.addCategory(Intent.CATEGORY_BROWSABLE);
                neo.setData(Uri.parse("https://www.linkedin.com/in/rom-patel-742525161/"));
                startActivity(neo);
            }
        });

        rom_gh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent neo = new Intent();
                neo.setAction(Intent.ACTION_VIEW);
                neo.addCategory(Intent.CATEGORY_BROWSABLE);
                neo.setData(Uri.parse("https://github.com/rompatel"));
                startActivity(neo);
            }
        });

        rhythm_li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rhythm = new Intent();
                rhythm.setAction(Intent.ACTION_VIEW);
                rhythm.addCategory(Intent.CATEGORY_BROWSABLE);
                rhythm.setData(Uri.parse("https://www.linkedin.com/in/rhythm-patel-300499/"));
                startActivity(rhythm);
            }
        });

        rhythm_gh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rhythm = new Intent();
                rhythm.setAction(Intent.ACTION_VIEW);
                rhythm.addCategory(Intent.CATEGORY_BROWSABLE);
                rhythm.setData(Uri.parse("https://github.com/rhythm-3099"));
                startActivity(rhythm);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.dev_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.btn_first_page:{
                startActivity(new Intent(getApplicationContext(),first_page.class));
                finish();
            }
        }
        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed(){
        startActivity(new Intent(getApplicationContext(),first_page.class));
        finish();
    }

    private void setID(){

        jasmit_li = findViewById(R.id.jasmit_li);
        jasmit_gh = findViewById(R.id.jasmit_gh);

        jaydeep_li = findViewById(R.id.jaydeep_li);
        jaydeep_gh = findViewById(R.id.jaydeep_gh);

        yash_li = findViewById(R.id.yash_li);
        yash_gh = findViewById(R.id.yash_gh);

        rom_li = findViewById(R.id.rom_li);
        rom_gh = findViewById(R.id.rom_gh);

        rhythm_li = findViewById(R.id.rhythm_li);
        rhythm_gh = findViewById(R.id.rhythm_gh);

    }
}
