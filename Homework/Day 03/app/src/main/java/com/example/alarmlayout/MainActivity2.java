package com.example.alarmlayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    ImageView imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Mappings();

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

//        actionBar.setDisplayShowHomeEnabled(true);
//        actionBar.setLogo(R.drawable.setting_alarm);
//        actionBar.setDisplayUseLogoEnabled(true);
//        actionBar.setTitle(" Today");
    }

    private void Mappings() {
        imgBack = (ImageView) findViewById(R.id.imgBack);
    }
}