package com.example.quiz.Category;

import com.example.quiz.Models.QuestionModel;

import java.util.ArrayList;

public class Science {

    ArrayList<QuestionModel> list=new ArrayList<>();

    public ArrayList<QuestionModel> science(String setName){
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
        list.add(new QuestionModel(" What is the chemical symbol for the element oxygen?", "O", "C", "H", "N", "O"));
        list.add(new QuestionModel(" Which planet is known as the Red Planet?", "Mars", "Venus", "Jupiter", "Mercury", "Mars"));
        list.add(new QuestionModel(" What is the largest organ in the human body?", "Heart", "Brain", "Skin", "Liver", "Skin"));
        list.add(new QuestionModel(" What is the unit of measurement for electric current?", "Volt", "Ampere", "Ohm", "Watt", "Ampere"));
        list.add(new QuestionModel(" Which gas is most abundant in the Earth's atmosphere?", "Oxygen", "Carbon dioxide", "Nitrogen", "Hydrogen", "Nitrogen"));
        list.add(new QuestionModel(" What is the process by which plants convert sunlight into chemical energy?", "Respiration", "Photosynthesis", "Transpiration", "Fermentation", "Photosynthesis"));
        list.add(new QuestionModel(" Which scientist proposed the theory of general relativity?", "Isaac Newton", "Albert Einstein", "Charles Darwin", "Marie Curie", "Albert Einstein"));
        list.add(new QuestionModel(" What is the smallest unit of matter?", "Atom", "Molecule", "Cell", "Particle", "Atom"));
        list.add(new QuestionModel(" What is the speed of light in a vacuum?", "150,000 km/s", "600,000 km/s","300,000 km/s",  "900,000 km/s", "300,000 km/s"));
        list.add(new QuestionModel(" What is the chemical formula for water?", "H2O", "CO2", "NaCl", "C6H12O6", "H2O"));

    }
    private void setTwo()
    {
        list.add(new QuestionModel(" What is the unit of measurement for frequency?", "Hertz", "Watt", "Newton", "Volt", "Hertz"));
        list.add(new QuestionModel(" Which planet is the closest to the Sun?", "Venus", "Mars", "Mercury", "Jupiter", "Mercury"));
        list.add(new QuestionModel(" What is the process by which plants release water vapor into the atmosphere?", "Condensation", "Transpiration", "Evaporation", "Precipitation", "Transpiration"));
        list.add(new QuestionModel(" What is the chemical symbol for the element gold?", "Au", "Ag", "Fe", "Cu", "Au"));
        list.add(new QuestionModel(" What is the largest planet in our solar system?", "Venus", "Saturn", "Jupiter", "Uranus", "Jupiter"));
        list.add(new QuestionModel(" What is the study of living organisms called?",  "Chemistry","Biology", "Physics", "Geology", "Biology"));
        list.add(new QuestionModel(" Which scientist discovered the theory of evolution?", "Isaac Newton", "Albert Einstein", "Charles Darwin", "Marie Curie", "Charles Darwin"));
        list.add(new QuestionModel(" What is the SI unit of force?", "Pascal", "Joule", "Newton", "Watt", "Newton"));
        list.add(new QuestionModel(" What is the process by which solid ice turns directly into water vapor?", "Sublimation", "Evaporation", "Condensation", "Freezing", "Sublimation"));
        list.add(new QuestionModel(" What is the chemical formula for carbon dioxide?",  "H2O", "NaCl", "C6H12O6","CO2", "CO2"));

    }
    private void setThree(){
        list.add(new QuestionModel(" What is the largest planet in our solar system?", "Mars", "Saturn", "Jupiter", "Neptune", "Jupiter"));
        list.add(new QuestionModel(" What is the SI unit of pressure?", "Pascal", "Newton", "Joule", "Watt", "Pascal"));
        list.add(new QuestionModel(" Which scientist is known for discovering the laws of motion?", "Isaac Newton", "Albert Einstein", "Charles Darwin", "Marie Curie", "Isaac Newton"));
        list.add(new QuestionModel(" What is the chemical symbol for the element iron?",  "Au","Fe", "Ag", "Cu", "Fe"));
        list.add(new QuestionModel(" What is the process by which a solid changes directly into a gas?", "Condensation", "Evaporation", "Sublimation", "Melting", "Sublimation"));
        list.add(new QuestionModel(" What is the study of the Earth's physical structure and history called?", "Biology", "Chemistry", "Physics", "Geology", "Geology"));
        list.add(new QuestionModel(" What is the speed of sound in air at room temperature?", "343 m/s", "150 m/s", "700 m/s", "1000 m/s", "343 m/s"));
        list.add(new QuestionModel(" What is the chemical formula for table salt?", "H2O", "CO2", "NaCl", "C6H12O6", "NaCl"));
        list.add(new QuestionModel(" What is the process by which a gas changes into a liquid?", "Evaporation", "Condensation", "Sublimation", "Melting", "Condensation"));
        list.add(new QuestionModel(" What is the unit of measurement for electric resistance?", "Ohm", "Ampere", "Volt", "Watt", "Ohm"));

    }
    private void setFour()
    {
        list.add(new QuestionModel(" What is the chemical symbol for the element carbon?", "C", "O", "H", "N", "C"));
        list.add(new QuestionModel(" Which planet is known as the Blue Planet?",  "Mars", "Jupiter", "Earth","Venus", "Earth"));
        list.add(new QuestionModel(" What is the study of the universe called?", "Biology", "Chemistry", "Physics", "Astronomy", "Astronomy"));
        list.add(new QuestionModel(" What is the chemical symbol for the element silver?", "Ag", "Au", "Fe", "Cu", "Ag"));
        list.add(new QuestionModel(" What is the second most abundant gas in the Earth's atmosphere?", "Carbon dioxide","Oxygen",  "Nitrogen", "Hydrogen", "Oxygen"));
        list.add(new QuestionModel(" What is the process by which a gas changes into a solid?", "Condensation", "Evaporation","Melting", "Deposition",  "Deposition"));
        list.add(new QuestionModel(" Which scientist is known for the discovery of gravity?", "Isaac Newton", "Albert Einstein", "Charles Darwin", "Marie Curie", "Isaac Newton"));
        list.add(new QuestionModel(" What is the SI unit of energy?", "Pascal",  "Newton","Joule", "Watt", "Joule"));
        list.add(new QuestionModel(" What is the process by which a liquid changes into a gas?", "Evaporation", "Condensation", "Sublimation", "Melting", "Evaporation"));
        list.add(new QuestionModel(" What is the chemical formula for glucose?", "H2O", "CO2", "NaCl", "C6H12O6", "C6H12O6"));

    }

    private void setFive()
    {
        list.add(new QuestionModel(" What is the SI unit of temperature?", "Kelvin", "Celsius", "Fahrenheit", "Rankine", "Kelvin"));
        list.add(new QuestionModel(" Which planet is the largest in size?", "Venus", "Saturn", "Jupiter", "Uranus", "Jupiter"));
        list.add(new QuestionModel(" What is the study of the interaction between organisms and their environment called?", "Biology", "Chemistry", "Physics", "Ecology", "Ecology"));
        list.add(new QuestionModel(" What is the chemical symbol for the element copper?", "Cu", "Ag", "Fe", "Au", "Cu"));
        list.add(new QuestionModel(" What is the process by which a liquid changes into a solid?", "Condensation", "Evaporation", "Deposition", "Melting", "Melting"));
        list.add(new QuestionModel(" What is the study of matter and its motion through space and time called?", "Biology", "Chemistry", "Physics", "Geology", "Physics"));
        list.add(new QuestionModel(" What is the SI unit of power?", "Pascal", "Joule", "Newton", "Watt", "Watt"));
        list.add(new QuestionModel(" What is the chemical formula for sodium chloride?", "H2O", "CO2", "NaCl", "C6H12O6", "NaCl"));
        list.add(new QuestionModel(" What is the process by which a solid changes into a liquid?", "Evaporation", "Condensation", "Sublimation", "Melting", "Melting"));
        list.add(new QuestionModel(" What is the unit of measurement for electrical potential difference?", "Volt", "Ampere", "Ohm", "Watt", "Volt"));

    }

    private void setSix()
    {
        list.add(new QuestionModel(" What is the chemical symbol for the element hydrogen?", "H", "O", "C", "N", "H"));
        list.add(new QuestionModel(" Which planet is known as the Giant Planet?", "Mars", "Jupiter", "Venus", "Mercury", "Jupiter"));
        list.add(new QuestionModel(" What is the study of the Earth's atmosphere called?", "Biology", "Chemistry", "Physics", "Meteorology", "Meteorology"));
        list.add(new QuestionModel(" What is the chemical symbol for the element aluminum?", "Al", "Au", "Fe", "Cu", "Al"));
        list.add(new QuestionModel(" What is the process by which a gas changes into a liquid?", "Condensation", "Evaporation", "Sublimation", "Melting", "Condensation"));
        list.add(new QuestionModel(" What is the study of the origin, structure, and composition of rocks called?", "Biology", "Chemistry", "Physics", "Geology", "Geology"));
        list.add(new QuestionModel(" Which scientist is known for the discovery of radioactivity?", "Isaac Newton", "Albert Einstein", "Marie Curie", "Charles Darwin", "Marie Curie"));
        list.add(new QuestionModel(" What is the SI unit of electric charge?", "Volt", "Ampere", "Ohm", "Coulomb", "Coulomb"));
        list.add(new QuestionModel(" What is the process by which a liquid changes into a gas at the surface?", "Evaporation", "Condensation", "Sublimation", "Melting", "Evaporation"));
        list.add(new QuestionModel(" What is the chemical formula for calcium carbonate?", "H2O", "CO2", "NaCl", "CaCO3", "CaCO3"));

    }

    private void setSeven()
    {
        list.add(new QuestionModel(" What is the SI unit of frequency?", "Hertz", "Watt", "Newton", "Volt", "Hertz"));
        list.add(new QuestionModel(" Which planet is the farthest from the Sun?", "Venus", "Mars", "Mercury", "Neptune", "Neptune"));
        list.add(new QuestionModel(" What is the study of the Earth's physical features, climate, and weather patterns called?", "Biology", "Chemistry", "Physics", "Geography", "Geography"));
        list.add(new QuestionModel(" What is the chemical symbol for the element silicon?", "Si", "Au", "Fe", "Cu", "Si"));
        list.add(new QuestionModel(" What is the third most abundant gas in the Earth's atmosphere?", "Oxygen", "Carbon dioxide", "Nitrogen", "Helium", "Carbon dioxide"));
        list.add(new QuestionModel(" What is the process by which plants convert glucose into energy?", "Respiration", "Photosynthesis", "Transpiration", "Fermentation", "Respiration"));
        list.add(new QuestionModel(" Which scientist is known for the discovery of the laws of electromagnetism?", "Isaac Newton", "Albert Einstein", "Michael Faraday", "Marie Curie", "Michael Faraday"));
        list.add(new QuestionModel(" What is the SI unit of electric current?", "Pascal", "Joule", "Ampere", "Watt", "Ampere"));
        list.add(new QuestionModel(" What is the process by which a gas changes into a solid without going through the liquid state?", "Condensation", "Evaporation", "Sublimation", "Melting", "Sublimation"));
        list.add(new QuestionModel(" What is the chemical formula for sodium hydroxide?", "H2O", "CO2", "NaOH", "C6H12O6", "NaOH"));

    }

    private void setEight()
    {
        list.add(new QuestionModel(" What is the chemical symbol for the element nitrogen?", "N", "O", "C", "H", "N"));
        list.add(new QuestionModel(" Which planet is known as the Morning Star or Evening Star?", "Venus", "Mars", "Jupiter", "Mercury", "Venus"));
        list.add(new QuestionModel(" What is the study of the Earth's physical processes, such as earthquakes and volcanoes, called?", "Biology", "Chemistry", "Physics", "Geophysics", "Geophysics"));
        list.add(new QuestionModel(" What is the chemical symbol for the element calcium?", "Ca", "Au", "Fe", "Cu", "Ca"));
        list.add(new QuestionModel(" What is the fourth most abundant gas in the Earth's atmosphere?", "Oxygen", "Carbon dioxide", "Nitrogen", "Argon", "Argon"));
        list.add(new QuestionModel(" What is the process by which a liquid changes into a gas at the surface?", "Condensation", "Evaporation", "Sublimation", "Melting", "Evaporation"));
        list.add(new QuestionModel(" Which scientist is known for the discovery of the laws of heredity?", "Isaac Newton", "Albert Einstein", "Gregor Mendel", "Marie Curie", "Gregor Mendel"));
        list.add(new QuestionModel(" What is the SI unit of electric potential?", "Pascal", "Joule", "Volt", "Watt", "Volt"));
        list.add(new QuestionModel(" What is the process by which a solid changes into a gas without going through the liquid state?", "Evaporation", "Condensation", "Sublimation", "Melting", "Sublimation"));
        list.add(new QuestionModel(" What is the chemical formula for ammonia?", "H2O", "CO2", "NH3", "C6H12O6", "NH3"));

    }

    private void setNine()
    {
        list.add(new QuestionModel(" What is the SI unit of velocity?", "Meter per second", "Kilogram", "Newton", "Watt", "Meter per second"));
        list.add(new QuestionModel(" Which planet is the brightest object in the night sky?", "Venus", "Mars", "Mercury", "Jupiter", "Venus"));
        list.add(new QuestionModel(" What is the study of the Earth's oceans called?", "Biology", "Chemistry", "Physics", "Oceanography", "Oceanography"));
        list.add(new QuestionModel(" What is the chemical symbol for the element potassium?", "K", "Au", "Fe", "Cu", "K"));
        list.add(new QuestionModel(" What is the process by which a gas changes into a liquid called?", "Condensation", "Evaporation", "Sublimation", "Melting", "Condensation"));
        list.add(new QuestionModel(" What is the study of the Earth's history, rocks, and fossils called?", "Biology", "Chemistry", "Physics", "Paleontology", "Paleontology"));
        list.add(new QuestionModel(" Which scientist is known for the discovery of the laws of thermodynamics?", "Isaac Newton", "Albert Einstein", "James Clerk Maxwell", "Marie Curie", "James Clerk Maxwell"));
        list.add(new QuestionModel(" What is the SI unit of electric resistance?", "Pascal", "Joule", "Ohm", "Watt", "Ohm"));
        list.add(new QuestionModel(" What is the process by which a gas changes into a solid called?", "Evaporation", "Condensation", "Sublimation", "Deposition", "Deposition"));
        list.add(new QuestionModel(" What is the chemical formula for sulfuric acid?", "H2O", "CO2", "H2SO4", "C6H12O6", "H2SO4"));

    }
    private void setTen()
    {
        list.add(new QuestionModel(" What is the chemical symbol for the element helium?", "He", "O", "C", "N", "He"));
        list.add(new QuestionModel(" Which planet is known as the Evening Star?", "Venus", "Mars", "Jupiter", "Mercury", "Venus"));
        list.add(new QuestionModel(" What is the study of the Earth's climate and weather patterns called?", "Biology", "Chemistry", "Physics", "Meteorology", "Meteorology"));
        list.add(new QuestionModel(" What is the chemical symbol for the element magnesium?", "Mg", "Au", "Fe", "Cu", "Mg"));
        list.add(new QuestionModel(" What is the process by which a liquid changes into a gas at a temperature below its boiling point?", "Condensation", "Evaporation", "Sublimation", "Melting", "Evaporation"));
        list.add(new QuestionModel(" What is the study of the Earth's landforms, soils, and ecosystems called?", "Biology", "Chemistry", "Physics", "Geography", "Geography"));
        list.add(new QuestionModel(" Which scientist is known for the discovery of the laws of gravitation?", "Isaac Newton", "Albert Einstein", "Charles Darwin", "Marie Curie", "Isaac Newton"));
        list.add(new QuestionModel(" What is the SI unit of electric capacitance?", "Pascal", "Joule", "Ampere", "Farad", "Farad"));
        list.add(new QuestionModel(" What is the process by which a solid changes directly into a gas called?", "Evaporation", "Condensation", "Sublimation", "Melting", "Sublimation"));
        list.add(new QuestionModel(" What is the chemical formula for water?", "H2O", "CO2", "NaCl", "C6H12O6", "H2O"));
    }

}
