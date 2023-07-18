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
    list.add(new QuestionModel("Which continent is known as the 'Dark Continent'?", "Africa", "Asia", "Europe", "North America", "Africa"));
    list.add(new QuestionModel("What is the longest river in the world?", "Amazon River", "Nile River", "Yangtze River", "Mississippi River", "Nile River"));
    list.add(new QuestionModel("What is the largest desert in the world?", "Sahara Desert", "Gobi Desert", "Arabian Desert", "Great Victoria Desert", "Sahara Desert"));
    list.add(new QuestionModel("Which country is the largest producer of coffee?",  "Colombia", "Vietnam", "Brazil","Ethiopia", "Brazil"));
    list.add(new QuestionModel("Which mountain range is located in South America?", "Andes", "Rocky Mountains", "Himalayas", "Alps", "Andes"));
    list.add(new QuestionModel("Which country is the smallest in terms of land area?", "Maldives", "Monaco", "Vatican City", "Nauru", "Vatican City"));
    list.add(new QuestionModel("Which ocean is the largest?", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean","Pacific Ocean",  "Pacific Ocean"));
    list.add(new QuestionModel("Which country is known as the 'Land of the Rising Sun'?", "China", "India", "Japan", "South Korea", "Japan"));
    list.add(new QuestionModel("What is the capital of Canada?", "Toronto", "Montreal", "Ottawa", "Vancouver", "Ottawa"));
    list.add(new QuestionModel("Which country is famous for its tulip fields and windmills?", "Italy", "France", "Netherlands", "Spain", "Netherlands"));

}

    private void setTwo(){
        list.add(new QuestionModel("Which continent is home to the Amazon Rainforest?", "Africa", "Asia", "South America", "North America", "South America"));
        list.add(new QuestionModel("What is the highest mountain in the world?", "Mount Everest", "K2", "Makalu", "Kangchenjunga", "Mount Everest"));
        list.add(new QuestionModel("What is the largest lake in Africa?", "Lake Victoria", "Lake Tanganyika", "Lake Malawi", "Lake Chad", "Lake Victoria"));
        list.add(new QuestionModel("Which country is the largest producer of bananas?", "Brazil", "India", "China", "Ecuador", "Ecuador"));
        list.add(new QuestionModel("Which mountain range is located in Europe?", "Andes", "Rocky Mountains", "Himalayas", "Alps", "Alps"));
        list.add(new QuestionModel("Which country is the largest in terms of land area?",  "Canada", "China", "Russia","United States", "Russia"));
        list.add(new QuestionModel("Which ocean is the smallest?", "Atlantic Ocean", "Pacific Ocean", "Indian Ocean", "Arctic Ocean", "Arctic Ocean"));
        list.add(new QuestionModel("Which country is known as the 'Land Down Under'?", "Brazil", "India", "Australia", "New Zealand", "Australia"));
        list.add(new QuestionModel("What is the capital of Argentina?", "Buenos Aires", "Rio de Janeiro", "Lima", "Santiago", "Buenos Aires"));
        list.add(new QuestionModel("Which country is famous for its fjords?", "Norway", "Sweden", "Denmark", "Finland", "Norway"));

    }

    private void setThree(){
        list.add(new QuestionModel("Which continent is known as the 'Roof of the World'?", "Africa", "Asia", "Europe", "Antarctica", "Asia"));
        list.add(new QuestionModel("What is the deepest ocean trench in the world?", "Mariana Trench", "Java Trench", "Puerto Rico Trench", "Tonga Trench", "Mariana Trench"));
        list.add(new QuestionModel("What is the largest island in the world?", "Greenland", "New Guinea", "Borneo", "Madagascar", "Greenland"));
        list.add(new QuestionModel("Which country is the largest producer of tea?", "India", "China", "Sri Lanka", "Kenya", "China"));
        list.add(new QuestionModel("Which mountain range is located in North America?", "Andes", "Rocky Mountains", "Himalayas", "Alps", "Rocky Mountains"));
        list.add(new QuestionModel("Which country is the most populous in the world?", "India", "United States", "China", "Indonesia", "China"));
        list.add(new QuestionModel("Which ocean is the warmest?", "Atlantic Ocean", "Pacific Ocean", "Indian Ocean", "Caribbean Sea", "Indian Ocean"));
        list.add(new QuestionModel("Which country is known as the 'Land of Fire and Ice'?", "Italy", "France", "Iceland", "Spain", "Iceland"));
        list.add(new QuestionModel("What is the capital of Brazil?", "Rio de Janeiro", "Sao Paulo", "Brasilia", "Buenos Aires", "Brasilia"));
        list.add(new QuestionModel("Which country is famous for its pyramids?", "Egypt", "Greece", "Mexico", "India", "Egypt"));


    }

    private void setFour(){
        list.add(new QuestionModel("Which continent is known as the 'Cradle of Civilization'?", "Africa", "Asia", "Europe", "South America", "Asia"));
        list.add(new QuestionModel("What is the largest canyon in the world?", "Grand Canyon", "Fish River Canyon", "Colca Canyon", "Cotahuasi Canyon", "Grand Canyon"));
        list.add(new QuestionModel("What is the largest island country in the world?", "Australia", "Indonesia", "Philippines", "Japan", "Indonesia"));
        list.add(new QuestionModel("Which country is the largest producer of rice?", "India", "China", "Vietnam", "Thailand", "China"));
        list.add(new QuestionModel("Which mountain range is located in Africa?", "Andes", "Rocky Mountains", "Himalayas", "Atlas Mountains", "Atlas Mountains"));
        list.add(new QuestionModel("Which country has the highest population density?", "Monaco", "Singapore", "Bangladesh", "Netherlands", "Monaco"));
        list.add(new QuestionModel("Which ocean is the saltiest?", "Atlantic Ocean", "Pacific Ocean", "Indian Ocean", "Mediterranean Sea", "Mediterranean Sea"));
        list.add(new QuestionModel("Which country is known as the 'Land of the Midnight Sun'?", "Russia", "Canada", "Norway", "Sweden", "Norway"));
        list.add(new QuestionModel("What is the capital of Mexico?", "Mexico City", "Cancun", "Guadalajara", "Monterrey", "Mexico City"));
        list.add(new QuestionModel("Which country is famous for its kangaroos?", "Australia", "New Zealand", "Argentina", "South Africa", "Australia"));

    }
    private void setFive(){
        list.add(new QuestionModel("Which continent is known as the 'Land of the Rising Sun'?", "Africa", "Asia", "Europe", "Australia", "Asia"));
        list.add(new QuestionModel("What is the largest freshwater lake in the world?", "Lake Superior", "Lake Baikal", "Lake Michigan", "Lake Tanganyika", "Lake Superior"));
        list.add(new QuestionModel("What is the smallest country in the world by land area?", "Monaco", "Vatican City", "Nauru", "San Marino", "Vatican City"));
        list.add(new QuestionModel("Which country is the largest producer of petroleum?", "Saudi Arabia", "United States", "Russia", "Iran", "Saudi Arabia"));
        list.add(new QuestionModel("Which mountain range is located in Asia?", "Andes", "Rocky Mountains", "Himalayas", "Ural Mountains", "Himalayas"));
        list.add(new QuestionModel("Which country has the highest life expectancy?", "Japan", "Switzerland", "Australia", "Sweden", "Japan"));
        list.add(new QuestionModel("Which ocean is the most polluted?", "Atlantic Ocean", "Pacific Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"));
        list.add(new QuestionModel("Which country is known as the 'Land of Fire'?", "Russia", "Argentina", "Chile", "New Zealand", "Argentina"));
        list.add(new QuestionModel("What is the capital of South Africa?", "Cape Town", "Johannesburg", "Pretoria", "Durban", "Pretoria"));
        list.add(new QuestionModel("Which country is famous for its fjords?", "Norway", "Sweden", "Denmark", "Finland", "Norway"));

    }
    private void setSix(){
        list.add(new QuestionModel("Which continent is known as the 'Land Down Under'?", "Africa", "Asia", "Europe", "Australia", "Australia"));
        list.add(new QuestionModel("What is the largest saltwater lake in the world?", "Caspian Sea", "Lake Superior", "Dead Sea", "Great Salt Lake", "Caspian Sea"));
        list.add(new QuestionModel("What is the highest waterfall in the world?", "Angel Falls", "Niagara Falls", "Iguazu Falls", "Victoria Falls", "Angel Falls"));
        list.add(new QuestionModel("Which country is the largest consumer of electricity?", "United States", "China", "India", "Russia", "China"));
        list.add(new QuestionModel("Which mountain range is located in North America?", "Andes", "Rocky Mountains", "Himalayas", "Appalachian Mountains", "Rocky Mountains"));
        list.add(new QuestionModel("Which country has the largest population in Africa?", "Nigeria", "Ethiopia", "Egypt", "South Africa", "Nigeria"));
        list.add(new QuestionModel("Which ocean is the most biologically diverse?", "Atlantic Ocean", "Pacific Ocean", "Indian Ocean", "Great Barrier Reef", "Pacific Ocean"));
        list.add(new QuestionModel("Which country is known as the 'Land of Smiles'?", "Thailand", "Indonesia", "Philippines", "Malaysia", "Thailand"));
        list.add(new QuestionModel("What is the capital of Spain?", "Madrid", "Barcelona", "Seville", "Valencia", "Madrid"));
        list.add(new QuestionModel("Which country is famous for its tulip fields and windmills?", "Italy", "France", "Netherlands", "Spain", "Netherlands"));

    }
    private  void setSeven(){
        list.add(new QuestionModel("Which continent is known as the 'Land of Fire and Ice'?", "Africa", "Asia", "Europe", "Antarctica", "Europe"));
        list.add(new QuestionModel("What is the largest bay in the world?", "Hudson Bay", "Chesapeake Bay", "Bay of Bengal", "Bay of Fundy", "Hudson Bay"));
        list.add(new QuestionModel("What is the largest delta in the world?", "Nile Delta", "Ganges-Brahmaputra Delta", "Mekong Delta", "Amazon Delta", "Ganges-Brahmaputra Delta"));
        list.add(new QuestionModel("Which country is the largest producer of natural gas?", "United States", "Russia", "Iran", "Qatar", "Russia"));
        list.add(new QuestionModel("Which mountain range is located in Europe?", "Andes", "Rocky Mountains", "Himalayas", "Alps", "Alps"));
        list.add(new QuestionModel("Which country has the highest literacy rate?", "Finland", "Canada", "Germany", "Denmark", "Finland"));
        list.add(new QuestionModel("Which ocean is the most acidic?", "Atlantic Ocean", "Pacific Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"));
        list.add(new QuestionModel("Which country is known as the 'Land of the Midnight Sun'?", "Russia", "Canada", "Norway", "Sweden", "Norway"));
        list.add(new QuestionModel("What is the capital of Italy?", "Rome", "Milan", "Florence", "Venice", "Rome"));
        list.add(new QuestionModel("Which country is famous for its pyramids?", "Egypt", "Greece", "Mexico", "India", "Egypt"));

    }
    private void setEight(){
        list.add(new QuestionModel("Which continent is known as the 'Dark Continent'?", "Africa", "Asia", "Europe", "North America", "Africa"));
        list.add(new QuestionModel("What is the largest island in the world?", "Greenland", "Australia", "Madagascar", "Borneo", "Greenland"));
        list.add(new QuestionModel("What is the deepest trench in the ocean?", "Mariana Trench", "Tonga Trench", "Java Trench", "Kermadec Trench", "Mariana Trench"));
        list.add(new QuestionModel("Which country is the largest producer of coffee?", "Brazil", "Colombia", "Vietnam", "Ethiopia", "Brazil"));
        list.add(new QuestionModel("Which mountain range is located in South America?", "Andes", "Rocky Mountains", "Himalayas", "Alps", "Andes"));
        list.add(new QuestionModel("Which country has the highest population in the world?", "China", "India", "United States", "Indonesia", "China"));
        list.add(new QuestionModel("Which ocean is the saltiest?", "Atlantic Ocean", "Pacific Ocean", "Indian Ocean", "Dead Sea", "Dead Sea"));
        list.add(new QuestionModel("Which country is known as the 'Land of the Rising Sun'?", "Japan", "China", "South Korea", "Vietnam", "Japan"));
        list.add(new QuestionModel("What is the capital of Canada?", "Ottawa", "Toronto", "Vancouver", "Montreal", "Ottawa"));
        list.add(new QuestionModel("Which country is famous for its Great Barrier Reef?", "Australia", "New Zealand", "Fiji", "Maldives", "Australia"));

    }
    private void setNine(){
        list.add(new QuestionModel("Which continent is known as the 'Roof of the World'?", "Africa", "Asia", "Europe", "Antarctica", "Asia"));
        list.add(new QuestionModel("What is the largest desert in the world?", "Sahara Desert", "Gobi Desert", "Arabian Desert", "Patagonian Desert", "Sahara Desert"));
        list.add(new QuestionModel("What is the highest peak in the world?", "Mount Everest", "K2", "Kangchenjunga", "Makalu", "Mount Everest"));
        list.add(new QuestionModel("Which country is the largest producer of tea?", "China", "India", "Kenya", "Sri Lanka", "China"));
        list.add(new QuestionModel("Which mountain range is located in North Africa?", "Andes", "Rocky Mountains", "Himalayas", "Atlas Mountains", "Atlas Mountains"));
        list.add(new QuestionModel("Which country has the largest land area?", "Russia", "Canada", "China", "United States", "Russia"));
        list.add(new QuestionModel("Which ocean is the warmest?", "Atlantic Ocean", "Pacific Ocean", "Indian Ocean", "Caribbean Sea", "Indian Ocean"));
        list.add(new QuestionModel("Which country is known as the 'Land of the Long White Cloud'?", "Australia", "New Zealand", "Ireland", "Scotland", "New Zealand"));
        list.add(new QuestionModel("What is the capital of Brazil?", "Brasília", "Rio de Janeiro", "São Paulo", "Buenos Aires", "Brasília"));
        list.add(new QuestionModel("Which country is famous for its Great Wall?", "China", "Japan", "South Korea", "Vietnam", "China"));

    }
    private void setTen(){
        list.add(new QuestionModel("Which continent is known as the 'Emerald Isle'?", "Africa", "Asia", "Europe", "Australia", "Europe"));
        list.add(new QuestionModel("What is the largest lake in the world?", "Caspian Sea", "Lake Superior", "Lake Victoria", "Lake Baikal", "Caspian Sea"));
        list.add(new QuestionModel("What is the largest river in the world?", "Amazon River", "Nile River", "Yangtze River", "Mississippi River", "Amazon River"));
        list.add(new QuestionModel("Which country is the largest producer of wheat?", "United States", "China", "India", "Russia", "China"));
        list.add(new QuestionModel("Which mountain range is located in New Zealand?", "Andes", "Rocky Mountains", "Himalayas", "Southern Alps", "Southern Alps"));
        list.add(new QuestionModel("Which country has the highest life expectancy?", "Japan", "Switzerland", "Australia", "Canada", "Japan"));
        list.add(new QuestionModel("Which ocean is the largest?", "Atlantic Ocean", "Pacific Ocean", "Indian Ocean", "Southern Ocean", "Pacific Ocean"));
        list.add(new QuestionModel("Which country is known as the 'Land Down Under'?", "Australia", "New Zealand", "South Africa", "Argentina", "Australia"));
        list.add(new QuestionModel("What is the capital of India?", "New Delhi", "Mumbai", "Kolkata", "Chennai", "New Delhi"));
        list.add(new QuestionModel("Which country is famous for its fjords?", "Norway", "Sweden", "Denmark", "Finland", "Norway"));

    }
}
