package com.example.quiz.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quiz.MainActivity;
import com.example.quiz.R;
import com.example.quiz.databinding.ActivityHomePageBinding;
import com.example.quiz.databinding.ActivitySetsBinding;

public class home_page extends AppCompatActivity {
        ActivityHomePageBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityHomePageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        binding.quizCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home_page.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}