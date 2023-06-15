package com.example.quiz;

import static com.example.quiz.R.id.history;
import static com.example.quiz.R.id.mathematics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import com.example.quiz.Activities.SetsActivity;

public class MainActivity extends AppCompatActivity {
    CardView history,science,mathematics,geography;
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

    }
}