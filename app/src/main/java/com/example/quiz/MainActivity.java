package com.example.quiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.quiz.Activities.SetsActivity;

public class MainActivity extends AppCompatActivity {
    CardView history,science,mathematics,geography,mobile_dev,operating_system,networking,data_structure,time_work,ssc;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        history=findViewById(R.id.history);
        science=findViewById(R.id.science);
        mathematics=findViewById(R.id.mathematics);
        geography=findViewById(R.id.geography);
        mobile_dev=findViewById(R.id.mobile_dev);
        operating_system=findViewById(R.id.operating_system);
        networking=findViewById(R.id.networking);
        data_structure=findViewById(R.id.data_structure);
        time_work=findViewById(R.id.time_work);
        ssc=findViewById(R.id.ssc);


        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, SetsActivity.class);
                String value="History";
                intent.putExtra("value",value);
                startActivity(intent);

            }
        });

        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SetsActivity.class);
                String value="Science";
                intent.putExtra("value",value);
                startActivity(intent);
            }
        });

        mathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SetsActivity.class);
                String value="Mathematics";
                intent.putExtra("value",value);
                startActivity(intent);
            }
        });

        geography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SetsActivity.class);
                String value="Geography";
                intent.putExtra("value",value);
                startActivity(intent);
            }
        });
        mobile_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SetsActivity.class);
                String value="Mobile_dev";
                intent.putExtra("value",value);
                startActivity(intent);
            }
        });
        operating_system.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SetsActivity.class);
                String value="Operating_system";
                intent.putExtra("value",value);
                startActivity(intent);
            }
        });
        networking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SetsActivity.class);
                String value="Networking";
                intent.putExtra("value",value);
                startActivity(intent);
            }
        });
        data_structure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SetsActivity.class);
                String value="Data_structure";
                intent.putExtra("value",value);
                startActivity(intent);
            }
        });
        time_work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SetsActivity.class);
                String value="Time_work";
                intent.putExtra("value",value);
                startActivity(intent);
            }
        });
        ssc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SetsActivity.class);
                String value="SSC";
                intent.putExtra("value",value);
                startActivity(intent);
            }
        });
    }
}