package com.example.quiz.Category;

import com.example.quiz.Models.QuestionModel;

import java.util.ArrayList;

public class Geography {
    ArrayList<QuestionModel> list=new ArrayList<>();

    public ArrayList<QuestionModel> geography(String setName){
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

    }

    private void setTwo(){

    }

    private void setThree(){


    }

    private void setFour(){

    }
    private void setFive(){

    }
    private void setSix(){

    }
    private  void setSeven(){

    }
    private void setEight(){

    }
    private void setNine(){

    }
    private void setTen(){

    }
}
