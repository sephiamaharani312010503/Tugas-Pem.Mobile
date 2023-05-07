package com.employe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity  {

    ImageView img_data, img_reward, img_report, back;
    TextView txt_data, txt_reward, txt_report;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        back = findViewById(R.id.img_back_menu);


        img_data = findViewById(R.id.img_storage);

        img_reward = findViewById(R.id.img_reward);

        img_report = findViewById(R.id.img_report);

        txt_data = findViewById(R.id.txt_data);

        txt_reward = findViewById(R.id.txt_reward);

        txt_report = findViewById(R.id.txt_report);


        back.setOnClickListener(V -> {
            Intent intent = new Intent(MenuActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

        txt_data.setOnClickListener(V -> getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new DataFragment()).commit());

        txt_report.setOnClickListener(V -> getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new ReportFragment()).commit());

        txt_reward.setOnClickListener(V -> getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new RewardFragment()).commit());

        img_data.setOnClickListener(V -> getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new DataFragment()).commit());

        img_report.setOnClickListener(V -> getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new ReportFragment()).commit());

        img_reward.setOnClickListener(V -> getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new RewardFragment()).commit());
    }


}