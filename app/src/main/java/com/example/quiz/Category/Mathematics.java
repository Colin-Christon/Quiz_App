package com.example.quiz.Category;

import com.example.quiz.Models.QuestionModel;

import java.util.ArrayList;

public class Mathematics {
    ArrayList<QuestionModel> list=new ArrayList<>();

    public ArrayList<QuestionModel> mathematics(String setName){
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

    private void setOne() {
        list.add(new QuestionModel(" Solve the equation: 2x + 5 = 15",  "x = 6", "x = 7", "x = 8","x = 5", "x = 5"));
        list.add(new QuestionModel(" What is the value of π (pi) to two decimal places?", "3.14", "3.16", "3.18", "3.12", "3.14"));
        list.add(new QuestionModel(" Simplify the expression: 3(x + 2) - 4x", "3x + 6 - 4x", "3x + 6 + 4x", "3x - 6 - 4x", "3x - 6 + 4x", "3x + 6 - 4x"));
        list.add(new QuestionModel(" Find the square root of 144.",  "10", "14","12", "16", "12"));
        list.add(new QuestionModel(" Solve the equation: 3(x - 7) = 21", "x = 10", "x = 12", "x = 14", "x = 16", "x = 10"));
        list.add(new QuestionModel(" What is the value of log₄16?", "2", "4", "6", "8", "2"));
        list.add(new QuestionModel(" Evaluate: 5! (factorial)", "100","120",  "140", "110", "120"));
        list.add(new QuestionModel(" Find the perimeter of a rectangle with length 8 cm and width 5 cm.",  "30 cm", "32 cm", "24 cm", "26 cm","26 cm"));
        list.add(new QuestionModel(" Simplify the expression: 2x² + 3x - 5x + 4", "2x² - 2x + 4", "2x² + 2x - 4", "2x² - 8x + 4", "2x² + 8x + 4", "2x² - 2x + 4"));
        list.add(new QuestionModel(" What is the value of sin(60°)?",  "1/2", "1","√3/2", "√2/2", "√3/2"));

    }

    private void setTwo(){
        list.add(new QuestionModel(" Solve the equation: 3x - 7 = 14", "x = 7", "x = 8", "x = 9", "x = 10", "x = 7"));
        list.add(new QuestionModel(" What is the value of e (Euler's number) to three decimal places?", "2.716","2.718",  "2.720", "2.714", "2.718"));
        list.add(new QuestionModel(" Simplify the expression: 2(x + 3) + 4x", "2x + 6 + 4x", "2x + 6 - 4x", "2x - 6 - 4x", "2x - 6 + 4x", "2x + 6 + 4x"));
        list.add(new QuestionModel(" Find the cube root of 27.", "3", "4", "5", "6", "3"));
        list.add(new QuestionModel(" Solve the equation: 4(x - 5) = 36",  "x = 12", "x = 13", "x = 14","x = 11", "x = 11"));
        list.add(new QuestionModel(" What is the value of log₂32?", "5", "4", "3", "2", "5"));
        list.add(new QuestionModel(" Evaluate: 6! (factorial)",  "640","720", "840", "760", "720"));
        list.add(new QuestionModel(" Find the perimeter of a square with side length 9 cm.", "36 cm", "32 cm", "40 cm", "44 cm", "36 cm"));
        list.add(new QuestionModel(" Simplify the expression: 3x² - 2x + 5x - 7", "3x² + 3x - 7", "3x² - 3x + 7", "3x² + 7x - 7", "3x² + 7x + 7", "3x² + 3x - 7"));
        list.add(new QuestionModel(" What is the value of cos(45°)?",  "1/2", "1", "√2/2","√3/2", "√2/2"));

    }
    private void setThree() {
        list.add(new QuestionModel(" Solve the equation: 5x + 3 = 18", "x = 3", "x = 4", "x = 5", "x = 6", "x = 3"));
        list.add(new QuestionModel(" What is the value of √9?", "3", "2", "4", "5", "3"));
        list.add(new QuestionModel(" Simplify the expression: 2(3x - 4) + 5x",  "11x + 8", "11x - 10","11x - 8", "11x + 10", "11x - 8"));
        list.add(new QuestionModel(" Find the area of a circle with radius 5 cm (use π = 3.14).", "78.5 cm²", "75.4 cm²", "80.6 cm²", "82.5 cm²", "78.5 cm²"));
        list.add(new QuestionModel(" Solve the equation: 2(x + 6) = 32",  "x = 11", "x = 12", "x = 13","x = 10", "x = 10"));
        list.add(new QuestionModel(" What is the value of log₅25?", "3", "4", "5","2",  "2"));
        list.add(new QuestionModel(" Evaluate: 7!", "5040", "4030", "6040", "5020", "5040"));
        list.add(new QuestionModel(" Find the circumference of a circle with diameter 12 cm (use π = 3.14).", "37.68 cm", "37.56 cm", "38.24 cm", "38.12 cm", "37.68 cm"));
        list.add(new QuestionModel(" Simplify the expression: 4x² + 3x - 2x + 5", "4x² + x + 5",  "4x² + 5x + 5","4x² + 5x - 5", "4x² - x + 5", "4x² + x + 5"));
        list.add(new QuestionModel(" What is the value of tan(30°)?",  "√3","1/√3", "1", "√2/2", "1/√3"));

    }

    private void setFour() {
        list.add(new QuestionModel(" Solve the equation: 3x - 5 = 7", "x = 4", "x = 5", "x = 6", "x = 7", "x = 4"));
        list.add(new QuestionModel(" What is the value of √16?", "4", "2", "6", "8", "4"));
        list.add(new QuestionModel(" Simplify the expression: 5(2x - 3) - 4x", "6x - 15", "6x + 15", "6x - 13", "6x + 13", "6x - 15"));
        list.add(new QuestionModel(" Find the area of a rectangle with length 8 cm and width 6 cm.", "48 cm²", "44 cm²", "52 cm²", "54 cm²", "48 cm²"));
        list.add(new QuestionModel(" Solve the equation: 4(x - 5) = 12", "x = 8", "x = 9", "x = 10", "x = 11", "x = 8"));
        list.add(new QuestionModel(" What is the value of log₇49?", "2", "3", "4", "5", "2"));
        list.add(new QuestionModel(" Evaluate: 8!", "40,320", "36,720", "42,560", "38,240", "40,320"));
        list.add(new QuestionModel(" Find the circumference of a circle with radius 6 cm (use π = 3.14).", "37.68 cm", "37.56 cm", "38.24 cm", "38.12 cm", "37.68 cm"));
        list.add(new QuestionModel(" Simplify the expression: 3x² - 2x + 4x - 6", "3x² + 2x - 6", "3x² + 2x + 6", "3x² + 6x - 6", "3x² + 6x + 6", "3x² + 2x - 6"));
        list.add(new QuestionModel(" What is the value of cot(45°)?", "1", "√2", "1/√3", "√3", "1"));

    }

    private void setFive() {
        list.add(new QuestionModel(" Solve the equation: 4x + 7 = 31", "x = 6", "x = 7", "x = 8", "x = 9", "x = 6"));
        list.add(new QuestionModel(" What is the value of √25?", "5", "2", "4", "6", "5"));
        list.add(new QuestionModel(" Simplify the expression: 2(4x - 5) + 3x", "11x - 10", "11x + 10", "11x - 8", "11x + 8", "11x - 10"));
        list.add(new QuestionModel(" Find the area of a triangle with base 10 cm and height 8 cm.", "40 cm²", "32 cm²", "48 cm²", "36 cm²", "40 cm²"));
        list.add(new QuestionModel(" Solve the equation: 3(x + 4) = 21", "x = 5", "x = 6", "x = 7", "x = 8", "x = 5"));
        list.add(new QuestionModel(" What is the value of log₃27?", "3", "2", "4", "5", "3"));
        list.add(new QuestionModel(" Evaluate: 9!", "362,880", "326,880", "382,680", "368,820", "362,880"));
        list.add(new QuestionModel(" Find the circumference of a circle with diameter 10 cm (use π = 3.14).", "31.4 cm", "32.6 cm", "30.2 cm", "29.8 cm", "31.4 cm"));
        list.add(new QuestionModel(" Simplify the expression: 5x² + 4x - 3x + 2", "5x² + x + 2", "5x² + x - 2", "5x² - x + 2", "5x² + x + 2", "5x² + x + 2"));
        list.add(new QuestionModel(" What is the value of sec(60°)?", "2", "√2", "1/√3", "√3", "2"));

    }
    private void setSix() {
        list.add(new QuestionModel(" Solve the equation: 2x - 3 = 9", "x = 6", "x = 7", "x = 8", "x = 9", "x = 6"));
        list.add(new QuestionModel(" What is the value of √36?", "6", "2", "4", "5", "6"));
        list.add(new QuestionModel(" Simplify the expression: 3(5x - 2) - 2x", "13x - 6", "13x + 6", "13x - 4", "13x + 4", "13x - 6"));
        list.add(new QuestionModel(" Find the area of a square with side length 7 cm.", "49 cm²", "42 cm²", "56 cm²", "63 cm²", "49 cm²"));
        list.add(new QuestionModel(" Solve the equation: 2(x - 3) = 10", "x = 8", "x = 9", "x = 10", "x = 11", "x = 8"));
        list.add(new QuestionModel(" What is the value of log₁₀100?", "2", "3", "4", "5", "2"));
        list.add(new QuestionModel(" Evaluate: 10!", "3,628,800", "3,268,800", "3,826,800", "3,688,200", "3,628,800"));
        list.add(new QuestionModel(" Find the circumference of a circle with radius 8 cm (use π = 3.14).", "50.24 cm", "48.96 cm", "52.36 cm", "51.68 cm", "50.24 cm"));
        list.add(new QuestionModel(" Simplify the expression: 4x² - 3x + 5x - 7", "4x² + 2x - 7", "4x² + 2x + 7", "4x² + 7x - 7", "4x² + 7x + 7", "4x² + 2x - 7"));
        list.add(new QuestionModel(" What is the value of cosec(30°)?", "2", "√2", "1/√3", "√3", "2"));

    }

    private void setSeven() {
        list.add(new QuestionModel(" Solve the equation: 3x + 4 = 25", "x = 7", "x = 8", "x = 9", "x = 10", "x = 7"));
        list.add(new QuestionModel(" What is the value of √49?", "7", "2", "4", "6", "7"));
        list.add(new QuestionModel(" Simplify the expression: 4(2x - 3) + 2x", "10x - 12", "10x + 12", "10x - 10", "10x + 10", "10x - 12"));
        list.add(new QuestionModel(" Find the area of a rectangle with length 12 cm and width 5 cm.", "60 cm²", "55 cm²", "65 cm²", "70 cm²", "60 cm²"));
        list.add(new QuestionModel(" Solve the equation: 5(x + 2) = 45", "x = 7", "x = 8", "x = 9", "x = 10", "x = 7"));
        list.add(new QuestionModel(" What is the value of log₂64?", "6", "5", "4", "3", "6"));
        list.add(new QuestionModel(" Evaluate: 11!", "39,916,800", "39,612,800", "40,015,600", "39,816,200", "39,916,800"));
        list.add(new QuestionModel(" Find the circumference of a circle with diameter 14 cm (use π = 3.14).", "43.96 cm", "44.28 cm", "43.42 cm", "43.14 cm", "43.96 cm"));
        list.add(new QuestionModel(" Simplify the expression: 2x² + 5x - 3x + 4", "2x² + 2x + 4", "2x² + 2x - 4", "2x² - 2x + 4", "2x² + 2x + 4", "2x² + 2x + 4"));
        list.add(new QuestionModel(" What is the value of sec(45°)?", "√2", "1", "1/√3", "√3", "√2"));

    }

    private void setEight() {
        list.add(new QuestionModel(" Solve the equation: 2x + 5 = 17",  "x = 7","x = 6", "x = 8", "x = 9", "x = 6"));
        list.add(new QuestionModel(" What is the value of √64?", "8", "2", "4", "6", "8"));
        list.add(new QuestionModel(" Simplify the expression: 5(3x - 4) - 2x", "13x - 20", "13x + 20", "13x - 18", "13x + 18", "13x - 20"));
        list.add(new QuestionModel(" Find the area of a triangle with base 8 cm and height 6 cm.",  "20 cm²", "18 cm²", "16 cm²","24 cm²", "24 cm²"));
        list.add(new QuestionModel(" Solve the equation: 4(x - 2) = 20", "x = 8", "x = 9", "x = 10", "x = 11", "x = 8"));
        list.add(new QuestionModel(" What is the value of log₄16?", "2", "3", "4", "5", "2"));
        list.add(new QuestionModel(" Evaluate: 12!",  "473,001,600", "482,001,600", "479,001,600","478,001,600", "479,001,600"));
        list.add(new QuestionModel(" Find the circumference of a circle with radius 9 cm (use π = 3.14).", "56.52 cm", "54.76 cm", "57.96 cm", "55.28 cm", "56.52 cm"));
        list.add(new QuestionModel(" Simplify the expression: 3x² - 2x + 3x - 4", "3x² + x - 4", "3x² + x + 4", "3x² + 4x - 4", "3x² + 4x + 4", "3x² + x - 4"));
        list.add(new QuestionModel(" What is the value of cosec(45°)?",  "1", "1/√3", "√3","√2", "√2"));

    }

    private void setNine() {
        list.add(new QuestionModel(" Solve the equation: 3x - 7 = 16", "x = 7", "x = 8", "x = 9", "x = 10", "x = 7"));
        list.add(new QuestionModel(" What is the value of √81?", "9", "2", "4", "6", "9"));
        list.add(new QuestionModel(" Simplify the expression: 2(5x - 3) + 4x",  "14x + 6", "14x - 4","14x - 6", "14x + 4", "14x - 6"));
        list.add(new QuestionModel(" Find the area of a square with side length 9 cm.", "81 cm²", "72 cm²", "90 cm²", "99 cm²", "81 cm²"));
        list.add(new QuestionModel(" Solve the equation: 2(x + 3) = 28",   "x = 13", "x = 14","x = 11", "x = 12","x = 11"));
        list.add(new QuestionModel(" What is the value of log₅25?", "2", "3", "4", "5", "2"));
        list.add(new QuestionModel(" Evaluate: 13!", "6,227,020,800", "6,123,020,800", "6,327,020,800", "6,213,020,800", "6,227,020,800"));
        list.add(new QuestionModel(" Find the circumference of a circle with diameter 12 cm (use π = 3.14).", "38.28 cm", "37.14 cm","37.68 cm",  "36.84 cm", "37.68 cm"));
        list.add(new QuestionModel(" Simplify the expression: 5x² - 3x + 2x - 6", "5x² - x - 6", "5x² - x + 6", "5x² + x - 6", "5x² + x + 6", "5x² - x - 6"));
        list.add(new QuestionModel(" What is the value of sec(30°)?",  "√2", "1/√3","2", "√3", "2"));

    }

    private void setTen() {
        list.add(new QuestionModel(" Solve the equation: 4x + 8 = 32",  "x = 7", "x = 8","x = 6", "x = 9", "x = 6"));
        list.add(new QuestionModel(" What is the value of √100?", "10", "2", "4", "6", "10"));
        list.add(new QuestionModel(" Simplify the expression: 3(4x - 2) - 3x",  "9x + 6","9x - 6", "9x - 4", "9x + 4", "9x - 6"));
        list.add(new QuestionModel(" Find the area of a rectangle with length 10 cm and width 7 cm.", "70 cm²", "57 cm²", "67 cm²", "77 cm²", "70 cm²"));
        list.add(new QuestionModel(" Solve the equation: 3(x - 4) = 21", "x = 9", "x = 10", "x = 11", "x = 12", "x = 9"));
        list.add(new QuestionModel(" What is the value of log₁₆64?", "2", "3", "4", "5", "2"));
        list.add(new QuestionModel(" Evaluate: 14!",  "86,778,291,200", "87,378,291,200", "87,078,291,200","87,178,291,200", "87,178,291,200"));
        list.add(new QuestionModel(" Find the circumference of a circle with radius 6 cm (use π = 3.14).", "37.68 cm", "38.28 cm", "37.14 cm", "36.84 cm", "37.68 cm"));
        list.add(new QuestionModel(" Simplify the expression: 2x² - 4x + 3x - 6",  "2x² - x + 6", "2x² + x - 6", "2x² - x - 6","2x² + x + 6", "2x² - x - 6"));
        list.add(new QuestionModel(" What is the value of cosec(30°)?",  "√2", "1/√3","2", "√3", "2"));

    }

}
