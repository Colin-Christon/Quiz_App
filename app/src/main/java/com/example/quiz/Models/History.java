package com.example.quiz.Models;

import java.util.ArrayList;

public class History {
    ArrayList<QuestionModel> list=new ArrayList<>();

    public ArrayList<QuestionModel> history(String setName){
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
        list.add(new QuestionModel("1. Who was the founder of the Maurya Empire in ancient India?", "Ashoka the Great", "Chandragupta Maurya", "Samudragupta", "Kanishka", "Chandragupta Maurya"));
        list.add(new QuestionModel("2. Which Indian state was formerly known as Bombay?", "Maharashtra", "Gujarat", "Tamil Nadu", "Kerala", "Maharashtra"));
        list.add(new QuestionModel("3. Who was the first woman to fly solo across the Atlantic Ocean?", "Amelia Earhart", "Valentina Tereshkova", "Sally Ride", "Bessie Coleman", "Amelia Earhart"));
        list.add(new QuestionModel("4. When did India gain its independence from British rule?", "1942", "1945", "1947", "1950", "1947"));
        list.add(new QuestionModel("5. Who was the first Mughal Emperor of India?", "Babur", "Akbar", "Jahangir", "Shah Jahan", "Babur"));
        list.add(new QuestionModel("6. Which Indian leader is known as the 'Nightingle of India'?", "Sarojini Naidu", "Kamala Nehru", "Indira Gandhi", "Rajkumari Amrit Kaur", "Sarojini Naidu"));
        list.add(new QuestionModel("7. In which year did the Indian National Congress hold its first session?", "1885", "1905", "1919", "1947", "1885"));
        list.add(new QuestionModel("8. Who is considered the 'Father of Modern India'?", "Mahatma Gandhi", "Jawaharlal Nehru", "Subhash Chandra Bose", "Rabindranath Tagore", "Rabindranath Tagore"));
        list.add(new QuestionModel("9. Which battle led to the establishment of the British East India Company's rule in India?", "Battle of Plassey", "Battle of Panipat", "Battle of Buxar", "Battle of Haldighati", "Battle of Plassey"));
        list.add(new QuestionModel("10. Who composed the Indian national anthem, 'Jana Gana Mana'?", "Rabindranath Tagore", "Bankim Chandra Chattopadhyay", "Swami Vivekananda", "Mahatma Gandhi", "Rabindranath Tagore"));


    }
    private void setTwo(){
        list.add(new QuestionModel("1. Who is known as the 'Father of the Nation' in India?", "Rajendra Prasad", "Jawaharlal Nehru", "Mahatma Gandhi", "Subhash Chandra Bose", "Mahatma Gandhi"));
        list.add(new QuestionModel("2. Who was the first Prime Minister of India?", "Lal Bahadur Shastri", "Jawaharlal Nehru", "Sardar Vallabhbhai Patel", "Indira Gandhi", "Jawaharlal Nehru"));
        list.add(new QuestionModel("3. Which event marked the end of British rule in India?", "Quit India Movement", "Dandi March", "Partition of India", "Indian Rebellion of 1857", "Partition of India"));
        list.add(new QuestionModel("4. When was India's independence from British rule officially declared?", "1942", "1945", "1947", "1950", "1947"));
        list.add(new QuestionModel("5. Who led the Salt March during the Indian independence movement?", "Bal Gangadhar Tilak", "Bhagat Singh", "Sardar Vallabhbhai Patel", "Mahatma Gandhi", "Mahatma Gandhi"));
        list.add(new QuestionModel("6. Who was the first President of the Indian National Congress?", "Bal Gangadhar Tilak", "Dadabhai Naoroji", "W.C. Bonnerjee", "A.O. Hume", "W.C. Bonnerjee"));
        list.add(new QuestionModel("7. Which country was ruled by the Mughal Emperor Akbar?", "India", "Persia", "Ottoman Empire", "China", "India"));
        list.add(new QuestionModel("8. Who was the leader of the Bolshevik Revolution in Russia?", "Joseph Stalin", "Vladimir Lenin", "Leon Trotsky", "Mikhail Gorbachev", "Vladimir Lenin"));
        list.add(new QuestionModel("9. When did World War II start?", "1937", "1939", "1941", "1945", "1939"));
        list.add(new QuestionModel("10. Who was the first President of the United States?", "Thomas Jefferson", "George Washington", "Abraham Lincoln", "Benjamin Franklin", "George Washington"));

    }

    private void setThree(){
        list.add(new QuestionModel("11. Who is considered the architect of the Indian Constitution?", "B.R. Ambedkar", "Jawaharlal Nehru", "Mahatma Gandhi", "Sardar Vallabhbhai Patel", "B.R. Ambedkar"));
        list.add(new QuestionModel("12. Which famous monument in India was built by Emperor Shah Jahan?", "Red Fort", "Hawa Mahal", "Taj Mahal", "Qutub Minar", "Taj Mahal"));
        list.add(new QuestionModel("13. When did India become a republic and adopt its Constitution?", "1947", "1950", "1942", "1952", "1950"));
        list.add(new QuestionModel("14. Who was the last Viceroy of India?", "C. Rajagopalachari", "Lord Mountbatten", "Lord Curzon", "Lord Dalhousie", "Lord Mountbatten"));
        list.add(new QuestionModel("15. Who led the non-violent civil disobedience movement, 'Salt Satyagraha'?", "Jawaharlal Nehru", "Mahatma Gandhi", "Sardar Vallabhbhai Patel", "Subhash Chandra Bose", "Mahatma Gandhi"));
        list.add(new QuestionModel("16. Which ancient civilization developed the 'Indus Valley Civilization'?", "Egyptian Civilization", "Greek Civilization", "Mesopotamian Civilization", "Indian Civilization", "Indian Civilization"));
        list.add(new QuestionModel("17. The 'Battle of Plassey' was fought in which year?", "1757", "1857", "1657", "1957", "1757"));
        list.add(new QuestionModel("18. Who is known as the 'Iron Man of India'?", "B.R. Ambedkar", "Mahatma Gandhi", "Subhash Chandra Bose", "Sardar Vallabhbhai Patel", "Sardar Vallabhbhai Patel"));
        list.add(new QuestionModel("19. Which famous freedom fighter was also known as 'Netaji'?", "Jawaharlal Nehru", "Bhagat Singh", "Subhash Chandra Bose", "Lala Lajpat Rai", "Subhash Chandra Bose"));
        list.add(new QuestionModel("20. Who was the first female Prime Minister of India?", "Indira Gandhi", "Sarojini Naidu", "Rajkumari Amrit Kaur", "Kamala Nehru", "Indira Gandhi"));

    }
}
