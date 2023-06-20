package com.example.quiz.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.quiz.Adapters.SetAdapter;
import com.example.quiz.MainActivity;
import com.example.quiz.Models.setModel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quiz.R;
import com.example.quiz.databinding.ActivitySetsBinding;

import java.util.ArrayList;

public class SetsActivity extends AppCompatActivity {
    ActivitySetsBinding binding;
    ArrayList<setModel>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySetsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
//        binding.category.setText("Science");
        String category1=getIntent().getStringExtra("value");
        binding.category.setText(category1);
        list=new ArrayList<>();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        binding.setsRecy.setLayoutManager(linearLayoutManager);
        list.add(new setModel("SET-1",category1));
        list.add(new setModel("SET-2",category1));
        list.add(new setModel("SET-3" ,category1));
        list.add(new setModel("SET-4" ,category1));
        list.add(new setModel("SET-5",category1));
        list.add(new setModel("SET-6",category1));
        list.add(new setModel("SET-7",category1));
        list.add(new setModel("SET-8",category1));
        list.add(new setModel("SET-9",category1));
        list.add(new setModel("SET-10",category1));

        SetAdapter adapter=new SetAdapter(this,list);
        binding.setsRecy.setAdapter(adapter);

        binding.backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SetsActivity.this , MainActivity.class);
                startActivity(intent);
            }
        });
    }
}