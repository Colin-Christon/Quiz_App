package com.example.quiz.Activities;

import static java.util.Collection.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;

import com.example.quiz.Category.Data_structure;
import com.example.quiz.Category.Geography;
import com.example.quiz.Category.History;
import com.example.quiz.Category.Mathematics;
import com.example.quiz.Category.Mobile_dev;
import com.example.quiz.Category.Networking;
import com.example.quiz.Category.Operating_system;
import com.example.quiz.Category.SSC;
import com.example.quiz.Category.Time_work;
import com.example.quiz.Models.QuestionModel;
import com.example.quiz.Category.Science;
import com.example.quiz.R;
import com.example.quiz.databinding.ActivityQuestionBinding;
import java.util.Collections;

import java.util.ArrayList;

    public class QuestionActivity extends AppCompatActivity {

        ArrayList<QuestionModel> list1=new ArrayList<>();
        private int count=0;
        private int position=0;
        private int score=0;
        CountDownTimer timer;
        ActivityQuestionBinding binding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding=ActivityQuestionBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());

                getSupportActionBar().hide();

                resetTimer();
                timer.start();

            String setName=getIntent().getStringExtra("set");
            String name=getIntent().getStringExtra("name");
            if(name.equals("History"))
            {
                History();
            }
            else if(name.equals("Science"))
            {
                Science();
            }
            else if(name.equals("Geography"))
            {
                Geography();
            }
            else if(name.equals("Mathematics"))
            {
                Mathematics();
            }
            else if(name.equals("Data_structure"))
            {
                 Data_structure();
            }
            else if(name.equals("Networking"))
            {
                Networking();
            }
            else if(name.equals("Mobile_dev"))
            {
                Mobile_dev();
            }
            else if(name.equals("Operating_system"))
            {
                Operating_system();
            }
            else if(name.equals("Time_work"))
            {
                Time_work();
            }
            else if(name.equals("SSC"))
            {
                SSC();
            }

            for(int i=0;i<4;i++) {
                binding.optionContainer.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        checkAnswer((Button) view);
                    }
                });
            }
            Collections.shuffle(list1);
            playAnimation(binding.question,0,list1.get(position).getQuestion());

            binding.btnNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(timer!=null){
                        timer.cancel();
                    }
                    timer.start();
                    binding.btnNext.setEnabled(false);
                    binding.btnNext.setAlpha((float) 0.6);
                    enableOption(true);
                    position ++;

                    if(position ==list1.size()){
                        Intent intent=new Intent(QuestionActivity.this,ScoreActivity.class);
                        intent.putExtra("score",score);
                        intent.putExtra("total",list1.size());
                        startActivity(intent);
                        finish();
                        return;
                    }


                    count=0;
                    playAnimation(binding.question,0,list1.get(position).getQuestion());
                }
            });
        }



        private void  History() {
            String setName=getIntent().getStringExtra("set");
            final History hist=new History();
            list1=hist.history(setName);
        }

        private void Science(){
            String setName=getIntent().getStringExtra("set");
            final Science sci=new Science();
            list1=sci.science(setName);
        }

        private void Mathematics(){
            String setName=getIntent().getStringExtra("set");
            final Mathematics math=new Mathematics();
            list1=math.mathematics(setName);
        }

        private void Geography(){
            String setName=getIntent().getStringExtra("set");
            final Geography geo=new Geography();
            list1=geo.geography(setName);
        }

        private void Mobile_dev(){
            String setName=getIntent().getStringExtra("set");
            final Mobile_dev mob=new Mobile_dev();
            list1=mob.mobile_dev(setName);
        }
        private void Operating_system(){
            String setName=getIntent().getStringExtra("set");
            final Operating_system ope=new Operating_system();
            list1=ope.operating_system(setName);
        }
        private void Networking(){
            String setName=getIntent().getStringExtra("set");
            final Networking net=new Networking();
            list1=net.networking(setName);
        }
        private void Data_structure(){
            String setName=getIntent().getStringExtra("set");
            final Data_structure dat=new Data_structure();
            list1=dat.data_structure(setName);
        }
        private void Time_work(){
            String setName=getIntent().getStringExtra("set");
            final Time_work time=new Time_work();
            list1=time.time_work(setName);
        }
        private void SSC(){
            String setName=getIntent().getStringExtra("set");
            final SSC ss=new SSC();
            list1=ss.ssc(setName);
        }

        private void resetTimer() {

            timer=new CountDownTimer(30000,1000) {
                @Override
                public void onTick(long l) {

                    binding.timer.setText(String.valueOf(l/1000));
                }

                @Override
                public void onFinish() {
                    try {
                        Dialog dialog = new Dialog(QuestionActivity.this);
                        dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
                        dialog.setContentView(R.layout.timeout_dialog);
                        dialog.findViewById(R.id.tryAgain).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                Intent intent = new Intent(QuestionActivity.this, SetsActivity.class);
                                startActivity(intent);
                                finish();

                            }
                        });

                        dialog.show();
                    }
                    catch (Exception e){
                        System.out.println("Error has been happend "+e);
                    }

                }
            };
        }

        private void playAnimation(View view, int value, String data) {

            view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500).setStartDelay(100)
                    .setInterpolator(new DecelerateInterpolator()).setListener(new Animator.AnimatorListener() {
                        @Override
                        public void onAnimationStart(@NonNull Animator animator) {

                            if(value ==0 && count<4){
                                String option = "";
                                if(count ==0){
                                    option =list1.get(position).getOptionA();
                                }
                                else if(count==1){
                                    option=list1.get(position).getOptionB();
                                }

                                else if(count==2){
                                    option=list1.get(position).getOptionC();
                                }
                                else if(count==3){
                                    option=list1.get(position).getOptionD();
                                }

                                playAnimation(binding.optionContainer.getChildAt(count),0,option);
                                count ++;

                            }

                        }
                        @Override
                        public void onAnimationEnd(@NonNull Animator animator) {

                            if(value==0){

                                try {
                                    ((TextView) view).setText(data);
                                    binding.totalQuestion.setText(String.format("%d/%d", position + 1, list1.size()));

                                }catch(Exception e){
                                    ((Button)view).setText(data);

                                }
                                view.setTag(data);
                                playAnimation(view,1,data);

                            }

                        }
                        @Override
                        public void onAnimationCancel(@NonNull Animator animator) {

                        }

                        @Override
                        public void onAnimationRepeat(@NonNull Animator animator) {

                        }
                    });

        }

        private void enableOption(boolean enable) {

            for (int i = 0; i < 4; i++) {
                binding.optionContainer.getChildAt(i).setEnabled(enable);

                if (enable) {
                    binding.optionContainer.getChildAt(i).setBackgroundResource(R.drawable.btn_opt);
                }

            }


        }



        private void checkAnswer(Button selectedOption) {

            if(timer!=null){
                timer.cancel();
            }


            binding.btnNext.setEnabled(true);
            binding.btnShare.setAlpha(1);

            if(selectedOption.getText().toString().equals(list1.get(position).getCorrectAnswer())){
                score ++;
                selectedOption.setBackgroundResource(R.drawable.right_answ);
            }
            else{
                selectedOption.setBackgroundResource(R.drawable.wrong_answ);
                Button correctOption =(Button) binding.optionContainer.findViewWithTag(list1.get(position).getCorrectAnswer());
                correctOption.setBackgroundResource(R.drawable.right_answ);
            }
        }


    }