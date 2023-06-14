package com.example.quiz.Models;

import java.util.ArrayList;

public class Science {

    ArrayList<QuestionModel> list=new ArrayList<>();

    public ArrayList<QuestionModel> science(String setName){
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
        else {
            setOne();
        }
        return list;
    }

    private void setOne() {
        list.add(new QuestionModel("How many trade points have been opened between Nepal and India ?" ,
                "30", "27","26","50","27"));

        list.add(new QuestionModel("How many heritage properties are listed in the World Heritage List? " , "25",
                "30","23","80","23"));

        list.add(new QuestionModel("How many trade points have been opened between Nepal and India ?" ,
                "30", "27","26","50","27"));

        list.add(new QuestionModel("How many heritage properties are listed in the World Heritage List? " , "25",
                "30","23","80","23"));


    }
    private void setThree(){
        list.add(new QuestionModel("This is the first que of Science","Yes","Noo","yes","No","Noo"));
    }

}
