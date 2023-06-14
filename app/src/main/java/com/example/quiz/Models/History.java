package com.example.quiz.Models;

import java.util.ArrayList;

public class History {
    ArrayList<QuestionModel> list=new ArrayList<>();

    public ArrayList<QuestionModel> history(String setName){
        if(setName.equals("SET-1")){
            setOne();
        }
        else if (setName.equals("SET-2")) {
            setOne();
        }
        else if (setName.equals("SET-3")) {
            setOne();
        }
        else if (setName.equals("SET-4")) {
            setOne();
        }
        else if (setName.equals("SET-5")) {
            setOne();
        }
        else if (setName.equals("SET-6")) {
            setOne();
        }
        else if (setName.equals("SET-7")) {
            setOne();
        }
        else if (setName.equals("SET-8")) {
            setOne();
        }
        else if (setName.equals("SET-9")) {
            setOne();
        }
        else if (setName.equals("SET-10")) {
            setOne();
        }
        return list;
    }

    private void setOne() {
        list.add(new QuestionModel("1. The fundamental principal of surveying is to work from the " , "A. part to the whole",
                "B. whole to the part","C. lower level to higher level","D. higher level to the lover level","B. whole to the part"));

        list.add(new QuestionModel("How many trade points have been opened between Nepal and India ?" ,
                "30", "27","26","50","27"));

        list.add(new QuestionModel("How many heritage properties are listed in the World Heritage List? " , "25",
                " 30","23","80","23"));

        list.add(new QuestionModel("How many trade points have been opened between Nepal and India ?" ,
                "30", "27","26","50","27"));

    }

}
