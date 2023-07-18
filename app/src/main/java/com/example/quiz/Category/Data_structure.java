package com.example.quiz.Category;

import com.example.quiz.Models.QuestionModel;

import java.util.ArrayList;

public class Data_structure {

    ArrayList<QuestionModel> list=new ArrayList<>();

    public ArrayList<QuestionModel> data_structure(String setName){
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
        list.add(new QuestionModel("What is a data structure?", "A way of organizing and storing data", "A programming language", "An algorithm", "A computer system", "A way of organizing and storing data"));
        list.add(new QuestionModel("Which data structure follows the Last-In-First-Out (LIFO) principle?",  "Queue", "Linked List","Stack", "Tree", "Stack"));
        list.add(new QuestionModel("What is the time complexity of searching an element in a balanced binary search tree?",  "O(n)","O(log n)", "O(1)", "O(n log n)", "O(log n)"));
        list.add(new QuestionModel("Which data structure is best suited for implementing a dictionary?",  "Binary search tree", "Heap", "Array","Hash table", "Hash table"));
        list.add(new QuestionModel("What is the process of combining two or more data structures called?", "Data structure composition", "Data structure union", "Data structure aggregation", "Data structure merging", "Data structure composition"));
        list.add(new QuestionModel("Which data structure is used to implement a breadth-first search algorithm?", "Queue", "Stack", "Heap", "Linked List", "Queue"));
        list.add(new QuestionModel("What is the time complexity of inserting an element at the beginning of an array?", "O(n)", "O(log n)", "O(1)", "O(n log n)", "O(n)"));
        list.add(new QuestionModel("What data structure is used to store key-value pairs with constant-time lookup?",  "Binary search tree","Hash table", "Heap", "Array", "Hash table"));
        list.add(new QuestionModel("What is the main advantage of a linked list over an array?", "Dynamic size", "Random access", "Cache locality", "Continuous memory allocation", "Dynamic size"));
        list.add(new QuestionModel("What is the time complexity of deleting an element from a binary heap?",  "O(n)", "O(1)","O(log n)", "O(n log n)", "O(log n)"));

    }

    private void setTwo(){
        list.add(new QuestionModel("What is the difference between a stack and a queue?", "Order of insertion", "Underlying data structure", "Size limitation","Order of removal",  "Order of removal"));
        list.add(new QuestionModel("What is the time complexity of inserting an element at the end of a linked list?", "O(log n)","O(1)",  "O(n)", "O(n log n)", "O(1)"));
        list.add(new QuestionModel("What is a self-balancing binary search tree?", "A binary tree with equal number of left and right nodes", "A binary tree with balanced heights of left and right subtrees", "A binary tree with a fixed number of nodes", "A binary tree that reorganizes itself based on the inserted elements", "A binary tree with balanced heights of left and right subtrees"));
        list.add(new QuestionModel("Which data structure is used to implement depth-first search (DFS)?", "Stack", "Queue", "Heap", "Linked List", "Stack"));
        list.add(new QuestionModel("What is the time complexity of searching an element in a hash table?",  "O(log n)", "O(n)","O(1)", "O(n log n)", "O(1)"));
        list.add(new QuestionModel("What is a circular linked list?", "A linked list with circular references", "A linked list with a fixed size", "A linked list that forms a loop", "A linked list with a constant time complexity", "A linked list that forms a loop"));
        list.add(new QuestionModel("What data structure is used to implement a priority queue?", "Heap", "Stack", "Queue", "Linked List", "Heap"));
        list.add(new QuestionModel("What is the time complexity of merging two sorted arrays into a single sorted array?",  "O(log n)", "O(n^2)", "O(n log n)","O(n)", "O(n)"));
        list.add(new QuestionModel("What is the advantage of using a hash table over an array?", "Fast lookup", "Random access", "Ordered elements", "Dynamic size", "Fast lookup"));
        list.add(new QuestionModel("What is the time complexity of finding the minimum element in a binary search tree?",  "O(n)", "O(1)","O(log n)", "O(n log n)", "O(log n)"));

    }

    private void setThree(){
        list.add(new QuestionModel("What is a binary search tree?", "A tree with exactly two children for each node", "A tree with binary nodes", "A tree with a fixed number of nodes", "A tree that can be sorted in linear time", "A tree with exactly two children for each node"));
        list.add(new QuestionModel("What is the time complexity of searching an element in a linked list?", "O(n)", "O(log n)", "O(1)", "O(n log n)", "O(n)"));
        list.add(new QuestionModel("What is a heap?", "A complete binary tree", "A binary tree with equal number of left and right nodes", "A binary tree with balanced heights of left and right subtrees", "A binary tree that reorganizes itself based on the inserted elements", "A complete binary tree"));
        list.add(new QuestionModel("Which data structure is used to implement a graph?", "Adjacency list", "Stack", "Queue", "Linked List", "Adjacency list"));
        list.add(new QuestionModel("What is the time complexity of inserting an element at the beginning of a linked list?", "O(1)", "O(log n)", "O(n)", "O(n log n)", "O(1)"));
        list.add(new QuestionModel("What is the difference between an array and a linked list?", "Memory allocation", "Access time", "Size limitation", "Underlying data structure", "Memory allocation"));
        list.add(new QuestionModel("What is a binary heap?", "A complete binary tree with a heap property", "A binary tree with equal number of left and right nodes", "A binary tree with balanced heights of left and right subtrees", "A binary tree that reorganizes itself based on the inserted elements", "A complete binary tree with a heap property"));
        list.add(new QuestionModel("What is the time complexity of removing an element from a linked list?", "O(1)", "O(log n)", "O(n)", "O(n log n)", "O(n)"));
        list.add(new QuestionModel("What is the advantage of using a linked list over an array?", "Dynamic size", "Random access", "Cache locality", "Continuous memory allocation", "Dynamic size"));
        list.add(new QuestionModel("What is the time complexity of finding the maximum element in a binary search tree?", "O(log n)", "O(n)", "O(1)", "O(n log n)", "O(log n)"));

    }

    private void setFour(){
        list.add(new QuestionModel("What is a queue?", "A data structure that follows the First-In-First-Out (FIFO) principle", "A data structure that follows the Last-In-First-Out (LIFO) principle", "A data structure with random access", "A data structure with dynamic size", "A data structure that follows the First-In-First-Out (FIFO) principle"));
        list.add(new QuestionModel("What is the time complexity of inserting an element at the end of an array?", "O(1)", "O(log n)", "O(n)", "O(n log n)", "O(1)"));
        list.add(new QuestionModel("What is a binary tree?", "A tree with at most two children for each node", "A tree with binary nodes", "A tree with a fixed number of nodes", "A tree that can be sorted in linear time", "A tree with at most two children for each node"));
        list.add(new QuestionModel("Which data structure is used to implement a depth-first search (DFS)?", "Stack", "Queue", "Heap", "Linked List", "Stack"));
        list.add(new QuestionModel("What is the time complexity of searching an element in a hash table?", "O(1)", "O(log n)", "O(n)", "O(n log n)", "O(1)"));
        list.add(new QuestionModel("What is a circular linked list?", "A linked list with circular references", "A linked list with a fixed size", "A linked list that forms a loop", "A linked list with a constant time complexity", "A linked list that forms a loop"));
        list.add(new QuestionModel("What data structure is used to implement a priority queue?", "Heap", "Stack", "Queue", "Linked List", "Heap"));
        list.add(new QuestionModel("What is the time complexity of merging two sorted arrays into a single sorted array?", "O(n)", "O(log n)", "O(n^2)", "O(n log n)", "O(n)"));
        list.add(new QuestionModel("What is the advantage of using a hash table over an array?", "Fast lookup", "Random access", "Ordered elements", "Dynamic size", "Fast lookup"));
        list.add(new QuestionModel("What is the time complexity of finding the minimum element in a binary search tree?", "O(log n)", "O(n)", "O(1)", "O(n log n)", "O(log n)"));

    }
    private void setFive(){
        list.add(new QuestionModel("What is a linked list?", "A data structure that represents a sequence of nodes", "A data structure that represents a hierarchy of nodes", "A data structure that stores key-value pairs", "A data structure that stores elements in a sorted order", "A data structure that represents a sequence of nodes"));
        list.add(new QuestionModel("What is the time complexity of inserting an element at the end of a linked list?", "O(1)", "O(log n)", "O(n)", "O(n log n)", "O(1)"));
        list.add(new QuestionModel("What is a self-balancing binary search tree?", "A binary tree with balanced heights of left and right subtrees", "A binary tree with a fixed number of nodes", "A binary tree that reorganizes itself based on the inserted elements", "A binary tree with equal number of left and right nodes", "A binary tree with balanced heights of left and right subtrees"));
        list.add(new QuestionModel("Which data structure is used to implement depth-first search (DFS)?", "Stack", "Queue", "Heap", "Linked List", "Stack"));
        list.add(new QuestionModel("What is the time complexity of searching an element in a hash table?", "O(1)", "O(log n)", "O(n)", "O(n log n)", "O(1)"));
        list.add(new QuestionModel("What is a circular linked list?", "A linked list with circular references", "A linked list with a fixed size", "A linked list that forms a loop", "A linked list with a constant time complexity", "A linked list that forms a loop"));
        list.add(new QuestionModel("What data structure is used to implement a priority queue?", "Heap", "Stack", "Queue", "Linked List", "Heap"));
        list.add(new QuestionModel("What is the time complexity of merging two sorted arrays into a single sorted array?", "O(n)", "O(log n)", "O(n^2)", "O(n log n)", "O(n)"));
        list.add(new QuestionModel("What is the advantage of using a hash table over an array?", "Fast lookup", "Random access", "Ordered elements", "Dynamic size", "Fast lookup"));
        list.add(new QuestionModel("What is the time complexity of finding the maximum element in a binary search tree?", "O(log n)", "O(n)", "O(1)", "O(n log n)", "O(log n)"));

    }
    private void setSix(){
        list.add(new QuestionModel("What is a binary search tree?", "A tree with exactly two children for each node", "A tree with binary nodes", "A tree with a fixed number of nodes", "A tree that can be sorted in linear time", "A tree with exactly two children for each node"));
        list.add(new QuestionModel("What is the time complexity of searching an element in a linked list?", "O(n)", "O(log n)", "O(1)", "O(n log n)", "O(n)"));
        list.add(new QuestionModel("What is a heap?", "A complete binary tree", "A binary tree with equal number of left and right nodes", "A binary tree with balanced heights of left and right subtrees", "A binary tree that reorganizes itself based on the inserted elements", "A complete binary tree"));
        list.add(new QuestionModel("Which data structure is used to implement a graph?", "Adjacency list", "Stack", "Queue", "Linked List", "Adjacency list"));
        list.add(new QuestionModel("What is the time complexity of inserting an element at the beginning of a linked list?", "O(1)", "O(log n)", "O(n)", "O(n log n)", "O(1)"));
        list.add(new QuestionModel("What is the difference between an array and a linked list?", "Memory allocation", "Access time", "Size limitation", "Underlying data structure", "Memory allocation"));
        list.add(new QuestionModel("What is a binary heap?", "A complete binary tree with a heap property", "A binary tree with equal number of left and right nodes", "A binary tree with balanced heights of left and right subtrees", "A binary tree that reorganizes itself based on the inserted elements", "A complete binary tree with a heap property"));
        list.add(new QuestionModel("What is the time complexity of removing an element from a linked list?", "O(1)", "O(log n)", "O(n)", "O(n log n)", "O(n)"));
        list.add(new QuestionModel("What is the advantage of using a linked list over an array?", "Dynamic size", "Random access", "Cache locality", "Continuous memory allocation", "Dynamic size"));
        list.add(new QuestionModel("What is the time complexity of finding the minimum element in a binary search tree?", "O(log n)", "O(n)", "O(1)", "O(n log n)", "O(log n)"));

    }
    private  void setSeven(){
        list.add(new QuestionModel("What is a queue?", "A data structure that follows the First-In-First-Out (FIFO) principle", "A data structure that follows the Last-In-First-Out (LIFO) principle", "A data structure with random access", "A data structure with dynamic size", "A data structure that follows the First-In-First-Out (FIFO) principle"));
        list.add(new QuestionModel("What is the time complexity of inserting an element at the end of an array?", "O(1)", "O(log n)", "O(n)", "O(n log n)", "O(1)"));
        list.add(new QuestionModel("What is a binary tree?", "A tree with at most two children for each node", "A tree with binary nodes", "A tree with a fixed number of nodes", "A tree that can be sorted in linear time", "A tree with at most two children for each node"));
        list.add(new QuestionModel("Which data structure is used to implement depth-first search (DFS)?", "Stack", "Queue", "Heap", "Linked List", "Stack"));
        list.add(new QuestionModel("What is the time complexity of searching an element in a hash table?", "O(1)", "O(log n)", "O(n)", "O(n log n)", "O(1)"));
        list.add(new QuestionModel("What is a circular linked list?", "A linked list with circular references", "A linked list with a fixed size", "A linked list that forms a loop", "A linked list with a constant time complexity", "A linked list that forms a loop"));
        list.add(new QuestionModel("What data structure is used to implement a priority queue?", "Heap", "Stack", "Queue", "Linked List", "Heap"));
        list.add(new QuestionModel("What is the time complexity of merging two sorted arrays into a single sorted array?", "O(n)", "O(log n)", "O(n^2)", "O(n log n)", "O(n)"));
        list.add(new QuestionModel("What is the advantage of using a hash table over an array?", "Fast lookup", "Random access", "Ordered elements", "Dynamic size", "Fast lookup"));
        list.add(new QuestionModel("What is the time complexity of finding the maximum element in a binary search tree?", "O(log n)", "O(n)", "O(1)", "O(n log n)", "O(log n)"));

    }
    private void setEight(){
        list.add(new QuestionModel("What is a linked list?", "A data structure that represents a sequence of nodes", "A data structure that represents a hierarchy of nodes", "A data structure that stores key-value pairs", "A data structure that stores elements in a sorted order", "A data structure that represents a sequence of nodes"));
        list.add(new QuestionModel("What is the time complexity of inserting an element at the end of a linked list?", "O(1)", "O(log n)", "O(n)", "O(n log n)", "O(1)"));
        list.add(new QuestionModel("What is a self-balancing binary search tree?", "A binary tree with balanced heights of left and right subtrees", "A binary tree with a fixed number of nodes", "A binary tree that reorganizes itself based on the inserted elements", "A binary tree with equal number of left and right nodes", "A binary tree with balanced heights of left and right subtrees"));
        list.add(new QuestionModel("Which data structure is used to implement depth-first search (DFS)?", "Stack", "Queue", "Heap", "Linked List", "Stack"));
        list.add(new QuestionModel("What is the time complexity of searching an element in a hash table?", "O(1)", "O(log n)", "O(n)", "O(n log n)", "O(1)"));
        list.add(new QuestionModel("What is a circular linked list?", "A linked list with circular references", "A linked list with a fixed size", "A linked list that forms a loop", "A linked list with a constant time complexity", "A linked list that forms a loop"));
        list.add(new QuestionModel("What data structure is used to implement a priority queue?", "Heap", "Stack", "Queue", "Linked List", "Heap"));
        list.add(new QuestionModel("What is the time complexity of merging two sorted arrays into a single sorted array?", "O(n)", "O(log n)", "O(n^2)", "O(n log n)", "O(n)"));
        list.add(new QuestionModel("What is the advantage of using a hash table over an array?", "Fast lookup", "Random access", "Ordered elements", "Dynamic size", "Fast lookup"));
        list.add(new QuestionModel("What is the time complexity of finding the minimum element in a binary search tree?", "O(log n)", "O(n)", "O(1)", "O(n log n)", "O(log n)"));

    }
    private void setNine(){
        list.add(new QuestionModel("What is a queue?", "A data structure that follows the First-In-First-Out (FIFO) principle", "A data structure that follows the Last-In-First-Out (LIFO) principle", "A data structure with random access", "A data structure with dynamic size", "A data structure that follows the First-In-First-Out (FIFO) principle"));
        list.add(new QuestionModel("What is the time complexity of inserting an element at the end of an array?", "O(1)", "O(log n)", "O(n)", "O(n log n)", "O(1)"));
        list.add(new QuestionModel("What is a binary tree?", "A tree with at most two children for each node", "A tree with binary nodes", "A tree with a fixed number of nodes", "A tree that can be sorted in linear time", "A tree with at most two children for each node"));
        list.add(new QuestionModel("Which data structure is used to implement depth-first search (DFS)?", "Stack", "Queue", "Heap", "Linked List", "Stack"));
        list.add(new QuestionModel("What is the time complexity of searching an element in a hash table?", "O(1)", "O(log n)", "O(n)", "O(n log n)", "O(1)"));
        list.add(new QuestionModel("What is a circular linked list?", "A linked list with circular references", "A linked list with a fixed size", "A linked list that forms a loop", "A linked list with a constant time complexity", "A linked list that forms a loop"));
        list.add(new QuestionModel("What data structure is used to implement a priority queue?", "Heap", "Stack", "Queue", "Linked List", "Heap"));
        list.add(new QuestionModel("What is the time complexity of merging two sorted arrays into a single sorted array?", "O(n)", "O(log n)", "O(n^2)", "O(n log n)", "O(n)"));
        list.add(new QuestionModel("What is the advantage of using a hash table over an array?", "Fast lookup", "Random access", "Ordered elements", "Dynamic size", "Fast lookup"));
        list.add(new QuestionModel("What is the time complexity of finding the maximum element in a binary search tree?", "O(log n)", "O(n)", "O(1)", "O(n log n)", "O(log n)"));

    }
    private void setTen(){
        list.add(new QuestionModel("What is a linked list?", "A data structure that represents a sequence of nodes", "A data structure that represents a hierarchy of nodes", "A data structure that stores key-value pairs", "A data structure that stores elements in a sorted order", "A data structure that represents a sequence of nodes"));
        list.add(new QuestionModel("What is the time complexity of inserting an element at the end of a linked list?", "O(1)", "O(log n)", "O(n)", "O(n log n)", "O(1)"));
        list.add(new QuestionModel("What is a self-balancing binary search tree?", "A binary tree with balanced heights of left and right subtrees", "A binary tree with a fixed number of nodes", "A binary tree that reorganizes itself based on the inserted elements", "A binary tree with equal number of left and right nodes", "A binary tree with balanced heights of left and right subtrees"));
        list.add(new QuestionModel("Which data structure is used to implement depth-first search (DFS)?", "Stack", "Queue", "Heap", "Linked List", "Stack"));
        list.add(new QuestionModel("What is the time complexity of searching an element in a hash table?", "O(1)", "O(log n)", "O(n)", "O(n log n)", "O(1)"));
        list.add(new QuestionModel("What is a circular linked list?", "A linked list with circular references", "A linked list with a fixed size", "A linked list that forms a loop", "A linked list with a constant time complexity", "A linked list that forms a loop"));
        list.add(new QuestionModel("What data structure is used to implement a priority queue?", "Heap", "Stack", "Queue", "Linked List", "Heap"));
        list.add(new QuestionModel("What is the time complexity of merging two sorted arrays into a single sorted array?", "O(n)", "O(log n)", "O(n^2)", "O(n log n)", "O(n)"));
        list.add(new QuestionModel("What is the advantage of using a hash table over an array?", "Fast lookup", "Random access", "Ordered elements", "Dynamic size", "Fast lookup"));
        list.add(new QuestionModel("What is the time complexity of finding the minimum element in a binary search tree?", "O(log n)", "O(n)", "O(1)", "O(n log n)", "O(log n)"));

    }
}
