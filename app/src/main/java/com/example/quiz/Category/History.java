package com.example.quiz.Category;

import com.example.quiz.Models.QuestionModel;

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
        list.add(new QuestionModel(" Who was the founder of the Maurya Empire in ancient India?", "Ashoka the Great", "Chandragupta Maurya", "Samudragupta", "Kanishka", "Chandragupta Maurya"));
        list.add(new QuestionModel(" Which Indian state was formerly known as Bombay?", "Maharashtra", "Gujarat", "Tamil Nadu", "Kerala", "Maharashtra"));
        list.add(new QuestionModel(" Who was the first woman to fly solo across the Atlantic Ocean?", "Amelia Earhart", "Valentina Tereshkova", "Sally Ride", "Bessie Coleman", "Amelia Earhart"));
        list.add(new QuestionModel(" When did India gain its independence from British rule?", "1942", "1945", "1947", "1950", "1947"));
        list.add(new QuestionModel(" Who was the first Mughal Emperor of India?",  "Akbar", "Jahangir", "Shah Jahan","Babur", "Babur"));
        list.add(new QuestionModel(" Which Indian leader is known as the 'Nightingle of India'?", "Sarojini Naidu", "Kamala Nehru", "Indira Gandhi", "Rajkumari Amrit Kaur", "Sarojini Naidu"));
        list.add(new QuestionModel(" In which year did the Indian National Congress hold its first session?",  "1905", "1919","1885", "1947", "1885"));
        list.add(new QuestionModel(" Who is considered the 'Father of Modern India'?", "Mahatma Gandhi", "Jawaharlal Nehru", "Subhash Chandra Bose", "Rabindranath Tagore", "Rabindranath Tagore"));
        list.add(new QuestionModel(" Which battle led to the establishment of the British East India Company's rule in India?", "Battle of Plassey", "Battle of Panipat", "Battle of Buxar", "Battle of Haldighati", "Battle of Plassey"));
        list.add(new QuestionModel(" Who composed the Indian national anthem, 'Jana Gana Mana'?", "Rabindranath Tagore", "Bankim Chandra Chattopadhyay", "Swami Vivekananda", "Mahatma Gandhi", "Rabindranath Tagore"));

    }
    private void setTwo(){
        list.add(new QuestionModel(" Who is known as the 'Father of the Nation' in India?", "Rajendra Prasad", "Jawaharlal Nehru", "Mahatma Gandhi", "Subhash Chandra Bose", "Mahatma Gandhi"));
        list.add(new QuestionModel(" Who was the first Prime Minister of India?", "Lal Bahadur Shastri", "Jawaharlal Nehru", "Sardar Vallabhbhai Patel", "Indira Gandhi", "Jawaharlal Nehru"));
        list.add(new QuestionModel(" Which event marked the end of British rule in India?", "Quit India Movement", "Dandi March", "Partition of India", "Indian Rebellion of 1857", "Partition of India"));
        list.add(new QuestionModel(" When was India's independence from British rule officially declared?", "1942", "1945", "1947", "1950", "1947"));
        list.add(new QuestionModel(" Who led the Salt March during the Indian independence movement?", "Bal Gangadhar Tilak", "Bhagat Singh", "Sardar Vallabhbhai Patel", "Mahatma Gandhi", "Mahatma Gandhi"));
        list.add(new QuestionModel(" Who was the first President of the Indian National Congress?", "Bal Gangadhar Tilak", "Dadabhai Naoroji", "W.C. Bonnerjee", "A.O. Hume", "W.C. Bonnerjee"));
        list.add(new QuestionModel(" Which country was ruled by the Mughal Emperor Akbar?", "India", "Persia", "Ottoman Empire", "China", "India"));
        list.add(new QuestionModel(" Who was the leader of the Bolshevik Revolution in Russia?", "Joseph Stalin", "Vladimir Lenin", "Leon Trotsky", "Mikhail Gorbachev", "Vladimir Lenin"));
        list.add(new QuestionModel(" When did World War II start?", "1937", "1939", "1941", "1945", "1939"));
        list.add(new QuestionModel(" Who was the first President of the United States?", "Thomas Jefferson", "George Washington", "Abraham Lincoln", "Benjamin Franklin", "George Washington"));

    }

    private void setThree(){
        list.add(new QuestionModel(" Who is considered the architect of the Indian Constitution?", "B.R. Ambedkar", "Jawaharlal Nehru", "Mahatma Gandhi", "Sardar Vallabhbhai Patel", "B.R. Ambedkar"));
        list.add(new QuestionModel(" Which famous monument in India was built by Emperor Shah Jahan?", "Red Fort", "Hawa Mahal", "Taj Mahal", "Qutub Minar", "Taj Mahal"));
        list.add(new QuestionModel(" When did India become a republic and adopt its Constitution?", "1947", "1950", "1942", "1952", "1950"));
        list.add(new QuestionModel(" Who was the last Viceroy of India?", "C. Rajagopalachari", "Lord Mountbatten", "Lord Curzon", "Lord Dalhousie", "Lord Mountbatten"));
        list.add(new QuestionModel(" Who led the non-violent civil disobedience movement, 'Salt Satyagraha'?", "Jawaharlal Nehru", "Mahatma Gandhi", "Sardar Vallabhbhai Patel", "Subhash Chandra Bose", "Mahatma Gandhi"));
        list.add(new QuestionModel(" Which ancient civilization developed the 'Indus Valley Civilization'?", "Egyptian Civilization", "Greek Civilization", "Mesopotamian Civilization", "Indian Civilization", "Indian Civilization"));
        list.add(new QuestionModel(" The 'Battle of Plassey' was fought in which year?", "1757", "1857", "1657", "1957", "1757"));
        list.add(new QuestionModel(" Who is known as the 'Iron Man of India'?", "B.R. Ambedkar", "Mahatma Gandhi", "Subhash Chandra Bose", "Sardar Vallabhbhai Patel", "Sardar Vallabhbhai Patel"));
        list.add(new QuestionModel(" Which famous freedom fighter was also known as 'Netaji'?", "Jawaharlal Nehru", "Bhagat Singh", "Subhash Chandra Bose", "Lala Lajpat Rai", "Subhash Chandra Bose"));
        list.add(new QuestionModel(" Who was the first female Prime Minister of India?", "Indira Gandhi", "Sarojini Naidu", "Rajkumari Amrit Kaur", "Kamala Nehru", "Indira Gandhi"));

    }
    private void setFour()
    {
        list.add(new QuestionModel(" When did the Magna Carta, an important document in the history of democracy, get signed?", "1215", "1348", "1485", "1649", "1215"));
        list.add(new QuestionModel(" Who was the first female Prime Minister of Israel?", "Golda Meir", "Indira Gandhi", "Angela Merkel", "Margaret Thatcher", "Golda Meir"));
        list.add(new QuestionModel(" Which ancient civilization developed the concept of democracy?", "Egyptians", "Greeks", "Romans", "Persians", "Greeks"));
        list.add(new QuestionModel(" Who painted the famous artwork 'The Scream'?", "Pablo Picasso", "Edvard Munch", "Salvador Dalí", "Henri Matisse", "Edvard Munch"));
        list.add(new QuestionModel(" When did the Industrial Revolution begin in England?", "16th century", "17th century", "18th century", "19th century", "18th century"));
        list.add(new QuestionModel(" Who was the first President of South Africa?", "Nelson Mandela", "F.W. de Klerk", "Jacob Zuma", "Cyril Ramaphosa", "Nelson Mandela"));
        list.add(new QuestionModel(" Which country was ruled by King Louis XIV, known as the 'Sun King'?", "England", "Spain", "France", "Italy", "France"));
        list.add(new QuestionModel(" When did the Black Death pandemic occur in Europe?", "12th century", "14th century", "16th century", "18th century", "14th century"));
        list.add(new QuestionModel(" Who wrote the famous novel 'Pride and Prejudice'?", "Emily Brontë", "Charlotte Brontë", "Jane Austen", "Virginia Woolf", "Jane Austen"));
        list.add(new QuestionModel(" Which country was the birthplace of the Renaissance?", "Italy", "France", "England", "Germany", "Italy"));

    }

    private void setFive()
    {
        list.add(new QuestionModel(" Who was the first Emperor of the Gupta Empire in ancient India?", "Chandragupta Maurya", "Ashoka the Great", "Samudragupta", "Chandragupta I", "Chandragupta I"));
        list.add(new QuestionModel(" Which city was the capital of the Ottoman Empire?", "Cairo", "Istanbul", "Athens", "Baghdad", "Istanbul"));
        list.add(new QuestionModel(" When did the Russian Revolution take place?", "1905", "1917", "1923", "1939", "1917"));
        list.add(new QuestionModel(" Who wrote the famous book 'To Kill a Mockingbird'?", "Harper Lee", "F. Scott Fitzgerald", "Mark Twain", "J.K. Rowling", "Harper Lee"));
        list.add(new QuestionModel(" Which ancient civilization built the temple complex of Angkor Wat?", "Khmer", "Mongols", "Maurya", "Persians", "Khmer"));
        list.add(new QuestionModel(" Who was the first female President of the United States?", "Hillary Clinton", "Kamala Harris", "Michelle Obama", "Jacinda Ardern", "Kamala Harris"));
        list.add(new QuestionModel(" When did the Age of Exploration begin?", "14th century", "15th century", "16th century", "17th century", "15th century"));
        list.add(new QuestionModel(" Who was the first Emperor of the Tang Dynasty in China?", "Kublai Khan", "Qin Shi Huang", "Li Shimin (Emperor Taizong)", "Hongwu Emperor", "Li Shimin (Emperor Taizong)"));
        list.add(new QuestionModel(" Who discovered the theory of evolution by natural selection?", "Isaac Newton", "Charles Darwin", "Galileo Galilei", "Albert Einstein", "Charles Darwin"));
        list.add(new QuestionModel(" Which country was the first to reach the Moon?", "United States", "Russia", "China", "India", "United States"));

    }

    private void setSix()
    {
        list.add(new QuestionModel(" Who was the first Emperor of the Roman Empire?", "Julius Caesar", "Augustus", "Marcus Aurelius", "Constantine the Great", "Augustus"));
        list.add(new QuestionModel(" When did the American Revolutionary War take place?", "1776-1783", "1800-1820", "1850-1870", "1861-1865", "1776-1783"));
        list.add(new QuestionModel(" Who painted the famous artwork 'The Mona Lisa'?", "Pablo Picasso", "Claude Monet", "Vincent van Gogh", "Leonardo da Vinci", "Leonardo da Vinci"));
        list.add(new QuestionModel(" When did the colonization of Australia by Europeans begin?", "1492", "1588", "1776", "1788", "1788"));
        list.add(new QuestionModel(" Which ancient civilization built the Great Wall of China?", "Mongols", "Sumerians", "Persians", "Chinese", "Chinese"));
        list.add(new QuestionModel(" Who was the first President of the United States to be assassinated?", "John F. Kennedy", "Abraham Lincoln", "James Garfield", "William McKinley", "Abraham Lincoln"));
        list.add(new QuestionModel(" When did the Renaissance period occur?", "12th century", "14th century", "16th century", "18th century", "14th century"));
        list.add(new QuestionModel(" Who was the first Emperor of the Maurya Empire in ancient India?", "Chandragupta Maurya", "Ashoka the Great", "Samudragupta", "Kanishka", "Chandragupta Maurya"));
        list.add(new QuestionModel(" Who wrote the famous play 'Romeo and Juliet'?", "William Shakespeare", "John Milton", "Geoffrey Chaucer", "Jane Austen", "William Shakespeare"));
        list.add(new QuestionModel(" In which year did World War II begin?", "1935", "1939", "1941", "1945", "1939"));

    }

    private void setSeven()
    {
        list.add(new QuestionModel(" Who was the first President of the United States?", "George Washington", "Thomas Jefferson", "Abraham Lincoln", "James Madison", "George Washington"));
        list.add(new QuestionModel(" When did the French Revolution begin?", "1776", "1789", "1799", "1804", "1789"));
        list.add(new QuestionModel(" Who wrote the famous book '1984'?", "George Orwell", "Aldous Huxley", "Ray Bradbury", "Fyodor Dostoevsky", "George Orwell"));
        list.add(new QuestionModel(" Which ancient civilization built the pyramids at Giza?", "Mayans", "Aztecs", "Egyptians", "Greeks", "Egyptians"));
        list.add(new QuestionModel(" When did the Cold War end?", "1985", "1989", "1991", "1995", "1991"));
        list.add(new QuestionModel(" Who was the first Emperor of the Maurya Empire in ancient India?", "Chandragupta Maurya", "Ashoka the Great", "Samudragupta", "Kanishka", "Chandragupta Maurya"));
        list.add(new QuestionModel(" When did the Berlin Wall fall?", "1985", "1989", "1991", "1995", "1989"));
        list.add(new QuestionModel(" Who was the first Emperor of China's Qin Dynasty?", "Kublai Khan", "Qin Shi Huang", "Hongwu Emperor", "Emperor Taizong", "Qin Shi Huang"));
        list.add(new QuestionModel(" Which city was the capital of the Inca Empire?", "Cusco", "Lima", "Bogota", "Quito", "Cusco"));
        list.add(new QuestionModel(" Who painted the famous artwork 'The Last Supper'?", "Pablo Picasso", "Claude Monet", "Vincent van Gogh", "Leonardo da Vinci", "Leonardo da Vinci"));

    }

    private void setEight()
    {
        list.add(new QuestionModel(" When did the British Raj in India end?", "1947", "1950", "1962", "1971", "1947"));
        list.add(new QuestionModel(" Who was the first President of the United States to be impeached?", "Thomas Jefferson", "Andrew Johnson", "John F. Kennedy", "Richard Nixon", "Andrew Johnson"));
        list.add(new QuestionModel(" Which civilization developed the first system of writing called cuneiform?", "Egyptians", "Sumerians", "Persians", "Babylonians", "Sumerians"));
        list.add(new QuestionModel(" Who was the first Emperor of the Holy Roman Empire?", "Charlemagne", "Julius Caesar", "Constantine the Great", "Augustus", "Charlemagne"));
        list.add(new QuestionModel(" In which year did World War II end?", "1943", "1945", "1947", "1950", "1945"));
        list.add(new QuestionModel(" Who was the first President of the Soviet Union?", "Vladimir Lenin", "Joseph Stalin", "Leon Trotsky", "Mikhail Gorbachev", "Mikhail Gorbachev"));
        list.add(new QuestionModel(" When did the Renaissance period occur?", "12th century", "14th century", "16th century", "18th century", "14th century"));
        list.add(new QuestionModel(" Who was the first female Prime Minister of India?", "Indira Gandhi", "Golda Meir", "Margaret Thatcher", "Angela Merkel", "Indira Gandhi"));
        list.add(new QuestionModel(" Which ancient civilization built the city of Machu Picchu?", "Mayans", "Aztecs", "Incas", "Moche", "Incas"));
        list.add(new QuestionModel(" When did the American Civil War take place?", "1800-1820", "1850-1870", "1861-1865", "1880-1900", "1861-1865"));

    }

    private void setNine()
    {
        list.add(new QuestionModel(" Who was the first pharaoh of ancient Egypt?", "Ramses II", "Hatshepsut", "Cleopatra", "Narmer", "Narmer"));
        list.add(new QuestionModel(" When did the Protestant Reformation begin?", "1415", "1517", "1618", "1715", "1517"));
        list.add(new QuestionModel(" Who wrote the famous novel 'War and Peace'?", "Leo Tolstoy", "Fyodor Dostoevsky", "Anton Chekhov", "Aleksandr Solzhenitsyn", "Leo Tolstoy"));
        list.add(new QuestionModel(" Which civilization built the ancient city of Teotihuacan in present-day Mexico?", "Mayans", "Aztecs", "Olmecs", "Toltecs", "Toltecs"));
        list.add(new QuestionModel(" When did the Renaissance period end?", "14th century", "15th century", "16th century", "17th century", "17th century"));
        list.add(new QuestionModel(" Who was the first Emperor of Japan?", "Emperor Hirohito", "Emperor Meiji", "Emperor Akihito", "Emperor Taizong", "Emperor Jimmu"));
        list.add(new QuestionModel(" When did the American Revolution end?", "1776", "1783", "1791", "1800", "1783"));
        list.add(new QuestionModel(" Who wrote the famous play 'Hamlet'?", "William Shakespeare", "Arthur Miller", "Tennessee Williams", "Samuel Beckett", "William Shakespeare"));
        list.add(new QuestionModel(" Which country was ruled by Queen Victoria during the Victorian era?", "England", "France", "Germany", "Spain", "England"));
        list.add(new QuestionModel(" When did the French and Indian War take place?", "1689-1697", "1754-1763", "1775-1783", "1803-1815", "1754-1763"));

    }
    private void setTen()
    {
        list.add(new QuestionModel(" Who was the first Emperor of the Ming Dynasty in China?", "Kublai Khan", "Qin Shi Huang", "Hongwu Emperor", "Emperor Taizong", "Hongwu Emperor"));
        list.add(new QuestionModel(" When did the Spanish Civil War take place?", "1914-1918", "1919-1923", "1936-1939", "1945-1949", "1936-1939"));
        list.add(new QuestionModel(" Who wrote the famous book 'The Catcher in the Rye'?", "J.D. Salinger", "Ernest Hemingway", "F. Scott Fitzgerald", "George Orwell", "J.D. Salinger"));
        list.add(new QuestionModel(" Which ancient civilization developed the concept of zero and decimal system?", "Egyptians", "Mayans", "Greeks", "Indians", "Indians"));
        list.add(new QuestionModel(" When did the Russian Revolution take place?", "1905", "1917", "1924", "1939", "1917"));
        list.add(new QuestionModel(" Who was the first President of the United States to be assassinated?", "John F. Kennedy", "Abraham Lincoln", "James Garfield", "William McKinley", "Abraham Lincoln"));
        list.add(new QuestionModel(" When did the Industrial Revolution begin?", "16th century", "17th century", "18th century", "19th century", "18th century"));
        list.add(new QuestionModel(" Who was the first Emperor of the Gupta Empire in ancient India?", "Chandragupta Maurya", "Ashoka the Great", "Samudragupta", "Chandragupta I", "Chandragupta I"));
        list.add(new QuestionModel(" Who wrote the famous play 'Macbeth'?", "William Shakespeare", "John Milton", "Geoffrey Chaucer", "Jane Austen", "William Shakespeare"));
        list.add(new QuestionModel(" In which year did the Berlin Wall fall?", "1985", "1989", "1991", "1995", "1989"));
    }

}
