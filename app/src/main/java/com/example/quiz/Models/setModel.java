package com.example.quiz.Models;

public class setModel{

    String setNmae;
    String name;

    public setModel(String setNmae,String name ) {

        this.setNmae = setNmae;
        this.name=name;
    }

    public String getSetNmae() {
        return setNmae;
    }

    public void setSetNmae(String setNmae) {
        this.setNmae = setNmae;
    }

    public String getName(){
        return name;
    }
}
