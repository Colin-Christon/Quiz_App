package com.example.quiz;

import static com.example.quiz.R.id.history;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import com.example.quiz.Activities.SetsActivity;

public class MainActivity extends AppCompatActivity {
    CardView history,science;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        history=findViewById(R.id.history);
        science=findViewById(R.id.science);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, SetsActivity.class);
                String value="History";
                intent.putExtra("science",value);
                startActivity(intent);


            }
        });

        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SetsActivity.class);
                String value="Science";
                intent.putExtra("science",value);
                startActivity(intent);
            }
        });

    }
}