package com.example.quiz.Category;

import com.example.quiz.Models.QuestionModel;

import java.util.ArrayList;

public class Time_work {

    ArrayList<QuestionModel> list=new ArrayList<>();

    public ArrayList<QuestionModel> time_work(String setName){
        if(setName.equals("SET-1")){
            setOne();
        }
        else if (setName.equals("SET-2")) {
            setTwo();
        }
        else if (setName.equals("SET-3")) {
            setThree();
        }
        else if (setName.equals("SET-4")) {
            setFour();
        }
        else if (setName.equals("SET-5")) {
            setFive();
        }
        else if (setName.equals("SET-6")) {
            setSix();
        }
        else if (setName.equals("SET-7")) {
            setSeven();
        }
        else if (setName.equals("SET-8")) {
            setEight();
        }
        else if (setName.equals("SET-9")) {
            setNine();
        }
        else if (setName.equals("SET-10")) {
            setTen();
        }
        return list;
    }

    private void setOne(){
        list.add(new QuestionModel("A can complete a work in 10 days, and B can complete the same work in 15 days. How long will it take if they work together?", "7 days", "8 days", "9 days", "10 days", "7 days"));
        list.add(new QuestionModel("If 5 men can complete a work in 12 days, how many days will it take for 3 men to complete the same work?", "15 days", "18 days", "20 days", "25 days", "20 days"));
        list.add(new QuestionModel("A can complete a work in 8 days and B can complete the same work in 12 days. In how many days can they complete the work if they work together?", "3 days", "4 days", "5 days", "6 days", "4 days"));
        list.add(new QuestionModel("If 6 men can complete a work in 9 days, how many days will it take for 12 men to complete the same work?", "2 days", "3 days", "4 days", "6 days", "3 days"));
        list.add(new QuestionModel("A can complete a work in 20 days and B can complete the same work in 30 days. In how many days can they complete the work if they work together?", "8 days", "10 days", "12 days", "15 days", "12 days"));
        list.add(new QuestionModel("If 8 men can complete a work in 12 days, how many men are required to complete the same work in 6 days?", "16 men", "18 men", "20 men", "24 men", "16 men"));
        list.add(new QuestionModel("A can complete a work in 16 days and B can complete the same work in 24 days. In how many days can they complete the work if they work together?", "6 days", "8 days", "10 days", "12 days", "8 days"));
        list.add(new QuestionModel("If 10 men can complete a work in 15 days, how many days will it take for 20 men to complete the same work?", "5 days", "6 days", "7 days", "8 days", "6 days"));
        list.add(new QuestionModel("A can complete a work in 12 days and B can complete the same work in 18 days. In how many days can they complete the work if they work together?", "7 days", "8 days", "9 days", "10 days", "7 days"));
        list.add(new QuestionModel("If 4 men can complete a work in 10 days, how many days will it take for 6 men to complete the same work?", "4 days", "5 days", "6 days", "7 days", "5 days"));

    }

    private void setTwo(){
        list.add(new QuestionModel("A can complete a work in 14 days, and B can complete the same work in 21 days. How long will it take if they work together?", "6 days", "7 days", "8 days", "9 days", "7 days"));
        list.add(new QuestionModel("If 7 men can complete a work in 18 days, how many days will it take for 5 men to complete the same work?", "22 days",  "28 days", "30 days","25 days", "25 days"));
        list.add(new QuestionModel("A can complete a work in 9 days and B can complete the same work in 12 days. In how many days can they complete the work if they work together?", "4 days", "4.5 days", "5 days", "5.5 days", "4.5 days"));
        list.add(new QuestionModel("If 4 men can complete a work in 10 days, how many men are required to complete the same work in 5 days?", "8 men", "10 men", "12 men", "16 men", "8 men"));
        list.add(new QuestionModel("A can complete a work in 18 days and B can complete the same work in 24 days. In how many days can they complete the work if they work together?", "9 days", "10 days", "11 days", "12 days", "9 days"));
        list.add(new QuestionModel("If 12 men can complete a work in 15 days, how many days will it take for 18 men to complete the same work?", "6 days", "7 days", "8 days", "9 days", "6 days"));
        list.add(new QuestionModel("A can complete a work in 16 days and B can complete the same work in 20 days. In how many days can they complete the work if they work together?", "8 days", "9 days", "10 days", "11 days", "9 days"));
        list.add(new QuestionModel("If 9 men can complete a work in 12 days, how many days will it take for 15 men to complete the same work?", "7 days","6 days",  "8 days", "9 days", "7 days"));
        list.add(new QuestionModel("A can complete a work in 21 days and B can complete the same work in 28 days. In how many days can they complete the work if they work together?", "10 days", "11 days", "12 days", "14 days", "10 days"));
        list.add(new QuestionModel("If 6 men can complete a work in 16 days, how many men are required to complete the same work in 8 days?", "12 men", "14 men", "16 men", "18 men", "16 men"));

    }

    private void setThree(){
        list.add(new QuestionModel("A can complete a work in 11 days, and B can complete the same work in 22 days. How long will it take if they work together?", "6.5 days", "7 days", "7.5 days", "8 days", "7.5 days"));
        list.add(new QuestionModel("If 8 men can complete a work in 20 days, how many days will it take for 12 men to complete the same work?", "12.5 days", "15 days", "17.5 days", "20 days", "15 days"));
        list.add(new QuestionModel("A can complete a work in 10 days and B can complete the same work in 15 days. In how many days can they complete the work if they work together?", "5.5 days", "6 days", "6.5 days", "7 days", "6.5 days"));
        list.add(new QuestionModel("If 5 men can complete a work in 16 days, how many days will it take for 10 men to complete the same work?", "8 days", "8.5 days", "9 days", "9.5 days", "8 days"));
        list.add(new QuestionModel("A can complete a work in 14 days and B can complete the same work in 21 days. In how many days can they complete the work if they work together?", "7.5 days", "8 days", "8.5 days", "9 days", "8 days"));
        list.add(new QuestionModel("If 9 men can complete a work in 15 days, how many days will it take for 12 men to complete the same work?", "10 days", "11 days", "12 days", "13 days", "10 days"));
        list.add(new QuestionModel("A can complete a work in 12 days and B can complete the same work in 18 days. In how many days can they complete the work if they work together?", "7.2 days", "7.6 days", "8 days", "8.4 days", "7.2 days"));
        list.add(new QuestionModel("If 6 men can complete a work in 14 days, how many men are required to complete the same work in 7 days?", "12 men", "14 men", "16 men", "18 men", "14 men"));
        list.add(new QuestionModel("A can complete a work in 15 days and B can complete the same work in 20 days. In how many days can they complete the work if they work together?", "8.4 days", "9 days", "9.6 days", "10 days", "9 days"));
        list.add(new QuestionModel("If 10 men can complete a work in 18 days, how many days will it take for 15 men to complete the same work?", "10.8 days", "11.2 days", "11.6 days", "12 days", "11.2 days"));


    }

    private void setFour(){
        list.add(new QuestionModel("A can complete a work in 9 days, and B can complete the same work in 12 days. How long will it take if they work together?", "4.8 days", "5 days", "5.2 days", "5.4 days", "5 days"));
        list.add(new QuestionModel("If 7 men can complete a work in 16 days, how many days will it take for 5 men to complete the same work?", "22.4 days", "24 days", "26 days", "28 days", "22.4 days"));
        list.add(new QuestionModel("A can complete a work in 11 days and B can complete the same work in 22 days. In how many days can they complete the work if they work together?", "7.4 days", "7.6 days", "7.8 days", "8 days", "7.6 days"));
        list.add(new QuestionModel("If 4 men can complete a work in 18 days, how many days will it take for 6 men to complete the same work?", "12 days", "12.5 days", "13 days", "13.5 days", "12 days"));
        list.add(new QuestionModel("A can complete a work in 13 days and B can complete the same work in 26 days. In how many days can they complete the work if they work together?", "8.7 days", "8.8 days", "8.9 days", "9 days", "8.8 days"));
        list.add(new QuestionModel("If 6 men can complete a work in 15 days, how many days will it take for 12 men to complete the same work?", "7.5 days", "7.8 days", "8 days", "8.2 days", "7.5 days"));
        list.add(new QuestionModel("A can complete a work in 10 days and B can complete the same work in 20 days. In how many days can they complete the work if they work together?", "6.7 days", "6.8 days", "6.9 days", "7 days", "6.8 days"));
        list.add(new QuestionModel("If 8 men can complete a work in 24 days, how many days will it take for 12 men to complete the same work?", "12.8 days", "13.2 days", "13.6 days", "14 days", "13.2 days"));
        list.add(new QuestionModel("A can complete a work in 14 days and B can complete the same work in 28 days. In how many days can they complete the work if they work together?", "9.3 days", "9.5 days", "9.7 days", "10 days", "9.5 days"));
        list.add(new QuestionModel("If 5 men can complete a work in 20 days, how many days will it take for 10 men to complete the same work?", "10 days", "10.4 days", "10.8 days", "11.2 days", "10 days"));

    }
    private void setFive(){
        list.add(new QuestionModel("A can complete a work in 12 days, and B can complete the same work in 24 days. How long will it take if they work together?", "8 days", "8.2 days", "8.4 days", "8.6 days", "8 days"));
        list.add(new QuestionModel("If 6 men can complete a work in 16 days, how many days will it take for 8 men to complete the same work?", "12 days", "12.4 days", "12.8 days", "13.2 days", "12 days"));
        list.add(new QuestionModel("A can complete a work in 16 days and B can complete the same work in 32 days. In how many days can they complete the work if they work together?",  "10.4 days","10 days", "10.8 days", "11.2 days", "10 days"));
        list.add(new QuestionModel("If 9 men can complete a work in 15 days, how many days will it take for 6 men to complete the same work?", "22.5 days", "23 days", "23.5 days", "24 days", "23.5 days"));
        list.add(new QuestionModel("A can complete a work in 15 days and B can complete the same work in 30 days. In how many days can they complete the work if they work together?", "10 days", "10.5 days", "11 days", "11.5 days", "10.5 days"));
        list.add(new QuestionModel("If 7 men can complete a work in 18 days, how many days will it take for 12 men to complete the same work?", "10.5 days",  "11.5 days", "12 days","11 days", "11 days"));
        list.add(new QuestionModel("A can complete a work in 13 days and B can complete the same work in 26 days. In how many days can they complete the work if they work together?", "8.2 days", "8.4 days", "8.6 days", "8.8 days", "8.4 days"));
        list.add(new QuestionModel("If 5 men can complete a work in 12 days, how many days will it take for 10 men to complete the same work?", "6 days", "6.2 days", "6.4 days", "6.6 days", "6.2 days"));
        list.add(new QuestionModel("A can complete a work in 10 days and B can complete the same work in 15 days. In how many days can they complete the work if they work together?", "5.5 days", "5.6 days", "5.7 days", "5.8 days", "5.6 days"));
        list.add(new QuestionModel("If 8 men can complete a work in 20 days, how many days will it take for 12 men to complete the same work?", "13.3 days",  "13.9 days", "13.6 days","14.2 days", "13.6 days"));

    }
    private void setSix(){
        list.add(new QuestionModel("A can complete a work in 14 days, and B can complete the same work in 21 days. How long will it take if they work together?", "8 days", "8.4 days", "8.8 days", "9.2 days", "8.4 days"));
        list.add(new QuestionModel("If 4 men can complete a work in 12 days, how many days will it take for 6 men to complete the same work?", "8 days", "8.2 days", "8.4 days", "8.6 days", "8.2 days"));
        list.add(new QuestionModel("A can complete a work in 16 days and B can complete the same work in 24 days. In how many days can they complete the work if they work together?", "9 days", "9.2 days", "9.4 days", "9.6 days", "9.2 days"));
        list.add(new QuestionModel("If 5 men can complete a work in 15 days, how many days will it take for 10 men to complete the same work?", "7.5 days", "7.8 days", "8 days", "8.2 days", "7.5 days"));
        list.add(new QuestionModel("A can complete a work in 12 days and B can complete the same work in 18 days. In how many days can they complete the work if they work together?", "6.545 days", "6.6 days", "6.7 days", "6.8 days", "6.6 days"));
        list.add(new QuestionModel("If 7 men can complete a work in 20 days, how many days will it take for 12 men to complete the same work?", "11.67 days", "11.8 days", "12 days", "12.2 days", "11.67 days"));
        list.add(new QuestionModel("A can complete a work in 15 days and B can complete the same work in 30 days. In how many days can they complete the work if they work together?", "10 days", "10.4 days", "10.8 days", "11.2 days", "10.4 days"));
        list.add(new QuestionModel("If 8 men can complete a work in 18 days, how many days will it take for 12 men to complete the same work?", "12 days", "12.4 days", "12.8 days", "13.2 days", "12.4 days"));
        list.add(new QuestionModel("A can complete a work in 13 days and B can complete the same work in 26 days. In how many days can they complete the work if they work together?", "8.2 days", "8.4 days", "8.6 days", "8.8 days", "8.6 days"));
        list.add(new QuestionModel("If 5 men can complete a work in 16 days, how many days will it take for 10 men to complete the same work?", "8 days", "8.2 days", "8.4 days", "8.6 days", "8.2 days"));

    }
    private  void setSeven(){
        list.add(new QuestionModel("A can complete a work in 12 days, and B can complete the same work in 15 days. How long will it take if they work together?", "6.857 days", "7 days", "7.143 days", "7.286 days", "7 days"));
        list.add(new QuestionModel("If 4 men can complete a work in 16 days, how many days will it take for 6 men to complete the same work?", "10.67 days", "10.8 days", "10.9 days", "11 days", "10.8 days"));
        list.add(new QuestionModel("A can complete a work in 10 days and B can complete the same work in 20 days. In how many days can they complete the work if they work together?", "6.667 days", "6.7 days", "6.8 days", "6.9 days", "6.7 days"));
        list.add(new QuestionModel("If 5 men can complete a work in 14 days, how many days will it take for 10 men to complete the same work?", "7 days", "7.2 days", "7.4 days", "7.6 days", "7.2 days"));
        list.add(new QuestionModel("A can complete a work in 18 days and B can complete the same work in 24 days. In how many days can they complete the work if they work together?", "10.286 days", "10.4 days", "10.5 days", "10.6 days", "10.4 days"));
        list.add(new QuestionModel("If 7 men can complete a work in 12 days, how many days will it take for 12 men to complete the same work?", "5.091 days", "5.1 days", "5.2 days", "5.3 days", "5.1 days"));
        list.add(new QuestionModel("A can complete a work in 15 days and B can complete the same work in 25 days. In how many days can they complete the work if they work together?", "9 days", "9.4 days", "9.8 days", "10.2 days", "9.4 days"));
        list.add(new QuestionModel("If 8 men can complete a work in 15 days, how many days will it take for 12 men to complete the same work?", "10 days", "10.2 days", "10.4 days", "10.6 days", "10.2 days"));
        list.add(new QuestionModel("A can complete a work in 14 days and B can complete the same work in 28 days. In how many days can they complete the work if they work together?", "9.333 days", "9.4 days", "9.5 days", "9.6 days", "9.4 days"));
        list.add(new QuestionModel("If 5 men can complete a work in 10 days, how many days will it take for 10 men to complete the same work?", "5 days", "5.1 days", "5.2 days", "5.3 days", "5.1 days"));

    }
    private void setEight(){
        list.add(new QuestionModel("A can complete a work in 16 days, and B can complete the same work in 20 days. How long will it take if they work together?", "9.143 days", "9.2 days", "9.3 days", "9.4 days", "9.2 days"));
        list.add(new QuestionModel("If 4 men can complete a work in 10 days, how many days will it take for 6 men to complete the same work?", "6.667 days", "6.7 days", "6.8 days", "6.9 days", "6.7 days"));
        list.add(new QuestionModel("A can complete a work in 12 days and B can complete the same work in 18 days. In how many days can they complete the work if they work together?", "7.2 days", "7.3 days", "7.4 days", "7.5 days", "7.3 days"));
        list.add(new QuestionModel("If 5 men can complete a work in 15 days, how many days will it take for 8 men to complete the same work?", "9.375 days", "9.4 days", "9.5 days", "9.6 days", "9.4 days"));
        list.add(new QuestionModel("A can complete a work in 14 days and B can complete the same work in 21 days. In how many days can they complete the work if they work together?", "8 days", "8.1 days", "8.2 days", "8.3 days", "8.1 days"));
        list.add(new QuestionModel("If 7 men can complete a work in 18 days, how many days will it take for 12 men to complete the same work?", "10.5 days", "10.6 days", "10.7 days", "10.8 days", "10.6 days"));
        list.add(new QuestionModel("A can complete a work in 15 days and B can complete the same work in 30 days. In how many days can they complete the work if they work together?", "10 days", "10.2 days", "10.4 days", "10.6 days", "10.2 days"));
        list.add(new QuestionModel("If 8 men can complete a work in 16 days, how many days will it take for 12 men to complete the same work?", "10.667 days", "10.7 days", "10.8 days", "10.9 days", "10.7 days"));
        list.add(new QuestionModel("A can complete a work in 13 days and B can complete the same work in 26 days. In how many days can they complete the work if they work together?", "8.667 days", "8.7 days", "8.8 days", "8.9 days", "8.7 days"));
        list.add(new QuestionModel("If 5 men can complete a work in 16 days, how many days will it take for 10 men to complete the same work?", "8 days", "8.1 days", "8.2 days", "8.3 days", "8.1 days"));

    }
    private void setNine(){
        list.add(new QuestionModel("A can complete a work in 20 days, and B can complete the same work in 24 days. How long will it take if they work together?", "10.909 days",  "11.1 days", "11.2 days","11 days", "11 days"));
        list.add(new QuestionModel("If 4 men can complete a work in 14 days, how many days will it take for 6 men to complete the same work?", "9.333 days", "9.4 days", "9.5 days", "9.6 days", "9.4 days"));
        list.add(new QuestionModel("A can complete a work in 18 days and B can complete the same work in 24 days. In how many days can they complete the work if they work together?", "10.3 days","10.286 days",  "10.4 days", "10.5 days", "10.4 days"));
        list.add(new QuestionModel("If 5 men can complete a work in 12 days, how many days will it take for 8 men to complete the same work?", "7.5 days", "7.6 days", "7.7 days", "7.8 days", "7.6 days"));
        list.add(new QuestionModel("A can complete a work in 14 days and B can complete the same work in 28 days. In how many days can they complete the work if they work together?", "9.333 days",  "9.5 days","9.4 days", "9.6 days", "9.4 days"));
        list.add(new QuestionModel("If 7 men can complete a work in 15 days, how many days will it take for 12 men to complete the same work?", "8.75 days", "8.8 days", "8.9 days", "9 days", "8.8 days"));
        list.add(new QuestionModel("A can complete a work in 16 days and B can complete the same work in 32 days. In how many days can they complete the work if they work together?", "10.667 days", "10.7 days", "10.8 days", "10.9 days", "10.7 days"));
        list.add(new QuestionModel("If 5 men can complete a work in 10 days, how many days will it take for 10 men to complete the same work?", "5 days", "5.1 days", "5.2 days", "5.3 days", "5.1 days"));
        list.add(new QuestionModel("A can complete a work in 15 days and B can complete the same work in 25 days. In how many days can they complete the work if they work together?", "9 days",  "9.2 days", "9.3 days","9.1 days", "9.1 days"));
        list.add(new QuestionModel("If 8 men can complete a work in 20 days, how many days will it take for 12 men to complete the same work?", "13.333 days",  "13.5 days", "13.6 days","13.4 days", "13.4 days"));

    }
    private void setTen(){
        list.add(new QuestionModel("A can complete a work in 10 days, and B can complete the same work in 15 days. How long will it take if they work together?", "6.2 days","6 days",  "6.4 days", "6.6 days", "6.2 days"));
        list.add(new QuestionModel("If 4 men can complete a work in 16 days, how many days will it take for 6 men to complete the same work?", "10.67 days", "10.8 days", "10.9 days", "11 days", "10.8 days"));
        list.add(new QuestionModel("A can complete a work in 12 days and B can complete the same work in 18 days. In how many days can they complete the work if they work together?", "7.2 days",  "7.4 days","7.3 days", "7.5 days", "7.3 days"));
        list.add(new QuestionModel("If 5 men can complete a work in 14 days, how many days will it take for 8 men to complete the same work?", "8 days", "8.1 days", "8.2 days", "8.3 days", "8.1 days"));
        list.add(new QuestionModel("A can complete a work in 14 days and B can complete the same work in 21 days. In how many days can they complete the work if they work together?", "8 days",  "8.2 days", "8.3 days","8.1 days", "8.1 days"));
        list.add(new QuestionModel("If 7 men can complete a work in 12 days, how many days will it take for 12 men to complete the same work?", "6.545 days", "6.6 days", "6.7 days", "6.8 days", "6.6 days"));
        list.add(new QuestionModel("A can complete a work in 15 days and B can complete the same work in 30 days. In how many days can they complete the work if they work together?", "10 days", "10.1 days", "10.2 days", "10.3 days", "10.1 days"));
        list.add(new QuestionModel("If 8 men can complete a work in 18 days, how many days will it take for 12 men to complete the same work?", "12.1 days","12 days",  "12.2 days", "12.3 days", "12.1 days"));
        list.add(new QuestionModel("A can complete a work in 13 days and B can complete the same work in 26 days. In how many days can they complete the work if they work together?", "8.2 days", "8.3 days", "8.4 days", "8.5 days", "8.3 days"));
        list.add(new QuestionModel("If 5 men can complete a work in 16 days, how many days will it take for 10 men to complete the same work?", "8 days",  "8.2 days", "8.3 days","8.1 days", "8.1 days"));

    }
}
