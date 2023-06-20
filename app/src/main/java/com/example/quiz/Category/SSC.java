package com.example.quiz.Category;

import com.example.quiz.Models.QuestionModel;

import java.util.ArrayList;

public class SSC {

    ArrayList<QuestionModel> list=new ArrayList<>();

    public ArrayList<QuestionModel> ssc(String setName){
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
        list.add(new QuestionModel("What is the role of an assembler in system software?",
                "To manage system resources", "To handle network communications", "To convert assembly language code to machine code", "To encrypt file contents", "To convert assembly language code to machine code"));
        list.add(new QuestionModel("What is the purpose of a linker in the compilation process?",
                "To manage user accounts", "To handle input/output operations", "To combine object files into an executable program", "To store file metadata", "To combine object files into an executable program"));
        list.add(new QuestionModel("What is the difference between an interpreter and a compiler?",
                "The programming languages they support", "The speed of program execution", "The size of the executable file", "The memory usage of the program", "The programming languages they support"));
        list.add(new QuestionModel("What is the purpose of a loader in system software?",
                "To manage file system permissions", "To handle memory allocation", "To optimize CPU performance", "To load executable programs into memory", "To load executable programs into memory"));
        list.add(new QuestionModel("What is the role of a debugger in software development?",
                "To manage system processes", "To handle network communications", "To track program execution and identify errors", "To represent an open file in a process", "To track program execution and identify errors"));
        list.add(new QuestionModel("What is the purpose of an operating system in relation to system software?",
                "To manage user accounts", "To handle network requests", "To provide an interface to hardware devices", "To coordinate and control computer resources", "To coordinate and control computer resources"));
        list.add(new QuestionModel("What is the difference between system software and application software?",
                "The programming languages they are written in", "The type of hardware they run on", "The level of user interaction", "The cost of the software", "The level of user interaction"));
        list.add(new QuestionModel("What is the purpose of a preprocessor in the compilation process?",
                "To manage system processes", "To handle network communications", "To perform text manipulation and macro expansion", "To represent an open file in a process", "To perform text manipulation and macro expansion"));
        list.add(new QuestionModel("What is the role of a system library in software development?",
                "To manage file system permissions", "To provide common functions and routines", "To optimize CPU performance", "To handle input/output operations", "To provide common functions and routines"));
        list.add(new QuestionModel("What is the purpose of an optimizing compiler?",
                "To manage user accounts", "To generate efficient machine code", "To handle network requests", "To encrypt file contents", "To generate efficient machine code"));

    }

    private void setTwo(){
        list.add(new QuestionModel("What is the role of an assembler in system software?",
                "To manage system resources", "To handle network communications", "To convert assembly language code to machine code", "To encrypt file contents", "To convert assembly language code to machine code"));
        list.add(new QuestionModel("What is the purpose of a linker in the compilation process?",
                "To manage user accounts", "To handle input/output operations", "To combine object files into an executable program", "To store file metadata", "To combine object files into an executable program"));
        list.add(new QuestionModel("What is the difference between an interpreter and a compiler?",
                "The programming languages they support", "The speed of program execution", "The size of the executable file", "The memory usage of the program", "The programming languages they support"));
        list.add(new QuestionModel("What is the purpose of a loader in system software?",
                "To manage file system permissions", "To handle memory allocation", "To optimize CPU performance", "To load executable programs into memory", "To load executable programs into memory"));
        list.add(new QuestionModel("What is the role of a debugger in software development?",
                "To manage system processes", "To handle network communications", "To track program execution and identify errors", "To represent an open file in a process", "To track program execution and identify errors"));
        list.add(new QuestionModel("What is the purpose of an operating system in relation to system software?",
                "To manage user accounts", "To handle network requests", "To provide an interface to hardware devices", "To coordinate and control computer resources", "To coordinate and control computer resources"));
        list.add(new QuestionModel("What is the difference between system software and application software?",
                "The programming languages they are written in", "The type of hardware they run on", "The level of user interaction", "The cost of the software", "The level of user interaction"));
        list.add(new QuestionModel("What is the purpose of a preprocessor in the compilation process?",
                "To manage system processes", "To handle network communications", "To perform text manipulation and macro expansion", "To represent an open file in a process", "To perform text manipulation and macro expansion"));
        list.add(new QuestionModel("What is the role of a system library in software development?",
                "To manage file system permissions", "To provide common functions and routines", "To optimize CPU performance", "To handle input/output operations", "To provide common functions and routines"));
        list.add(new QuestionModel("What is the purpose of an optimizing compiler?",
                "To manage user accounts", "To generate efficient machine code", "To handle network requests", "To encrypt file contents", "To generate efficient machine code"));

    }

    private void setThree(){

        list.add(new QuestionModel("What is the role of an assembler in system software?",
                "To manage system resources", "To handle network communications", "To convert assembly language code to machine code", "To encrypt file contents", "To convert assembly language code to machine code"));
        list.add(new QuestionModel("What is the purpose of a linker in the compilation process?",
                "To manage user accounts", "To handle input/output operations", "To combine object files into an executable program", "To store file metadata", "To combine object files into an executable program"));
        list.add(new QuestionModel("What is the difference between an interpreter and a compiler?",
                "The programming languages they support", "The speed of program execution", "The size of the executable file", "The memory usage of the program", "The programming languages they support"));
        list.add(new QuestionModel("What is the purpose of a loader in system software?",
                "To manage file system permissions", "To handle memory allocation", "To optimize CPU performance", "To load executable programs into memory", "To load executable programs into memory"));
        list.add(new QuestionModel("What is the role of a debugger in software development?",
                "To manage system processes", "To handle network communications", "To track program execution and identify errors", "To represent an open file in a process", "To track program execution and identify errors"));
        list.add(new QuestionModel("What is the purpose of an operating system in relation to system software?",
                "To manage user accounts", "To handle network requests", "To provide an interface to hardware devices", "To coordinate and control computer resources", "To coordinate and control computer resources"));
        list.add(new QuestionModel("What is the difference between system software and application software?",
                "The programming languages they are written in", "The type of hardware they run on", "The level of user interaction", "The cost of the software", "The level of user interaction"));
        list.add(new QuestionModel("What is the purpose of a preprocessor in the compilation process?",
                "To manage system processes", "To handle network communications", "To perform text manipulation and macro expansion", "To represent an open file in a process", "To perform text manipulation and macro expansion"));
        list.add(new QuestionModel("What is the role of a system library in software development?",
                "To manage file system permissions", "To provide common functions and routines", "To optimize CPU performance", "To handle input/output operations", "To provide common functions and routines"));
        list.add(new QuestionModel("What is the purpose of an optimizing compiler?",
                "To manage user accounts", "To generate efficient machine code", "To handle network requests", "To encrypt file contents", "To generate efficient machine code"));

    }

    private void setFour(){
        list.add(new QuestionModel("What is the role of an assembler in system software?",
                "To manage system resources", "To handle network communications", "To convert assembly language code to machine code", "To encrypt file contents", "To convert assembly language code to machine code"));
        list.add(new QuestionModel("What is the purpose of a linker in the compilation process?",
                "To manage user accounts", "To handle input/output operations", "To combine object files into an executable program", "To store file metadata", "To combine object files into an executable program"));
        list.add(new QuestionModel("What is the difference between an interpreter and a compiler?",
                "The programming languages they support", "The speed of program execution", "The size of the executable file", "The memory usage of the program", "The programming languages they support"));
        list.add(new QuestionModel("What is the purpose of a loader in system software?",
                "To manage file system permissions", "To handle memory allocation", "To optimize CPU performance", "To load executable programs into memory", "To load executable programs into memory"));
        list.add(new QuestionModel("What is the role of a debugger in software development?",
                "To manage system processes", "To handle network communications", "To track program execution and identify errors", "To represent an open file in a process", "To track program execution and identify errors"));
        list.add(new QuestionModel("What is the purpose of an operating system in relation to system software?",
                "To manage user accounts", "To handle network requests", "To provide an interface to hardware devices", "To coordinate and control computer resources", "To coordinate and control computer resources"));
        list.add(new QuestionModel("What is the difference between system software and application software?",
                "The programming languages they are written in", "The type of hardware they run on", "The level of user interaction", "The cost of the software", "The level of user interaction"));
        list.add(new QuestionModel("What is the purpose of a preprocessor in the compilation process?",
                "To manage system processes", "To handle network communications", "To perform text manipulation and macro expansion", "To represent an open file in a process", "To perform text manipulation and macro expansion"));
        list.add(new QuestionModel("What is the role of a system library in software development?",
                "To manage file system permissions", "To provide common functions and routines", "To optimize CPU performance", "To handle input/output operations", "To provide common functions and routines"));
        list.add(new QuestionModel("What is the purpose of an optimizing compiler?",
                "To manage user accounts", "To generate efficient machine code", "To handle network requests", "To encrypt file contents", "To generate efficient machine code"));

    }
    private void setFive(){
        list.add(new QuestionModel("What is the purpose of an operating system in relation to computer hardware?",
                "To manage user accounts", "To handle network requests", "To provide an interface to hardware devices", "To coordinate and control computer resources", "To coordinate and control computer resources"));
        list.add(new QuestionModel("What are the main components of an operating system?",
                "Hardware and software", "Processor and memory", "Kernel and shell", "Files and folders", "Kernel and shell"));
        list.add(new QuestionModel("What is the function of a device driver in an operating system?",
                "To manage system processes", "To handle network communications", "To enable communication between hardware devices and the operating system", "To represent an open file in a process", "To enable communication between hardware devices and the operating system"));
        list.add(new QuestionModel("What is virtual memory in an operating system?",
                "A type of memory used for storing virtual reality data", "A memory management technique that allows the execution of programs larger than the available physical memory", "A virtual machine used for running multiple operating systems simultaneously", "A memory cache used for storing frequently accessed data", "A memory management technique that allows the execution of programs larger than the available physical memory"));
        list.add(new QuestionModel("What is the purpose of a file system in an operating system?",
                "To manage file system permissions", "To handle memory allocation", "To store and organize files on storage devices", "To optimize CPU performance", "To store and organize files on storage devices"));
        list.add(new QuestionModel("What is the role of a scheduler in an operating system?",
                "To manage user accounts", "To handle network requests", "To allocate system resources and determine the order of program execution", "To encrypt file contents", "To allocate system resources and determine the order of program execution"));
        list.add(new QuestionModel("What is the difference between a single-user operating system and a multi-user operating system?",
                "The number of supported hardware devices", "The number of installed software applications", "The size of the executable files", "The number of users that can simultaneously access the system", "The number of users that can simultaneously access the system"));
        list.add(new QuestionModel("What is the role of a shell in an operating system?",
                "To manage system processes", "To handle network communications", "To provide a user interface for interacting with the operating system", "To represent an open file in a process", "To provide a user interface for interacting with the operating system"));
        list.add(new QuestionModel("What is the purpose of a backup utility in an operating system?",
                "To manage file system permissions", "To handle input/output operations", "To create copies of important files and data for data protection", "To optimize CPU performance", "To create copies of important files and data for data protection"));
        list.add(new QuestionModel("What is the role of a command interpreter in an operating system?",
                "To manage user accounts", "To handle network requests", "To interpret and execute user commands", "To encrypt file contents", "To interpret and execute user commands"));

    }
    private void setSix(){
        list.add(new QuestionModel("What is the purpose of an operating system in relation to computer hardware?",
                "To manage user accounts", "To handle network requests", "To provide an interface to hardware devices", "To coordinate and control computer resources", "To coordinate and control computer resources"));
        list.add(new QuestionModel("What are the main components of an operating system?",
                "Hardware and software", "Processor and memory", "Kernel and shell", "Files and folders", "Kernel and shell"));
        list.add(new QuestionModel("What is the function of a device driver in an operating system?",
                "To manage system processes", "To handle network communications", "To enable communication between hardware devices and the operating system", "To represent an open file in a process", "To enable communication between hardware devices and the operating system"));
        list.add(new QuestionModel("What is virtual memory in an operating system?",
                "A type of memory used for storing virtual reality data", "A memory management technique that allows the execution of programs larger than the available physical memory", "A virtual machine used for running multiple operating systems simultaneously", "A memory cache used for storing frequently accessed data", "A memory management technique that allows the execution of programs larger than the available physical memory"));
        list.add(new QuestionModel("What is the purpose of a file system in an operating system?",
                "To manage file system permissions", "To handle memory allocation", "To store and organize files on storage devices", "To optimize CPU performance", "To store and organize files on storage devices"));
        list.add(new QuestionModel("What is the role of a scheduler in an operating system?",
                "To manage user accounts", "To handle network requests", "To allocate system resources and determine the order of program execution", "To encrypt file contents", "To allocate system resources and determine the order of program execution"));
        list.add(new QuestionModel("What is the difference between a single-user operating system and a multi-user operating system?",
                "The number of supported hardware devices", "The number of installed software applications", "The size of the executable files", "The number of users that can simultaneously access the system", "The number of users that can simultaneously access the system"));
        list.add(new QuestionModel("What is the role of a shell in an operating system?",
                "To manage system processes", "To handle network communications", "To provide a user interface for interacting with the operating system", "To represent an open file in a process", "To provide a user interface for interacting with the operating system"));
        list.add(new QuestionModel("What is the purpose of a backup utility in an operating system?",
                "To manage file system permissions", "To handle input/output operations", "To create copies of important files and data for data protection", "To optimize CPU performance", "To create copies of important files and data for data protection"));
        list.add(new QuestionModel("What is the role of a command interpreter in an operating system?",
                "To manage user accounts", "To handle network requests", "To interpret and execute user commands", "To encrypt file contents", "To interpret and execute user commands"));

    }
    private  void setSeven(){
        list.add(new QuestionModel("What is the role of a boot loader in an operating system?",
                "To manage system processes", "To handle network communications", "To initialize the operating system during startup", "To represent an open file in a process", "To initialize the operating system during startup"));
        list.add(new QuestionModel("What is the purpose of a process in an operating system?",
                "To manage user accounts", "To handle network requests", "To execute a program and manage its resources", "To encrypt file contents", "To execute a program and manage its resources"));
        list.add(new QuestionModel("What is the difference between a kernel and a shell in an operating system?",
                "The programming languages they are written in", "The level of user interaction", "Their roles in managing system resources", "Their compatibility with different hardware platforms", "Their roles in managing system resources"));
        list.add(new QuestionModel("What is the purpose of a device manager in an operating system?",
                "To manage file system permissions", "To handle memory allocation", "To manage and control hardware devices", "To optimize CPU performance", "To manage and control hardware devices"));
        list.add(new QuestionModel("What is the role of an interrupt handler in an operating system?",
                "To manage user accounts", "To handle network requests", "To respond to hardware interrupts and handle them appropriately", "To represent an open file in a process", "To respond to hardware interrupts and handle them appropriately"));
        list.add(new QuestionModel("What is the purpose of a memory manager in an operating system?",
                "To manage system processes", "To handle network communications", "To allocate and deallocate memory for programs and processes", "To perform encryption and decryption of memory contents", "To allocate and deallocate memory for programs and processes"));
        list.add(new QuestionModel("What is the difference between a preemptive and a non-preemptive scheduling algorithm?",
                "Their compatibility with different programming languages", "The number of supported hardware devices", "The handling of process priority and resource allocation", "The size of the executable files", "The handling of process priority and resource allocation"));
        list.add(new QuestionModel("What is the purpose of a file permission system in an operating system?",
                "To manage user accounts", "To handle network requests", "To control access to files and directories based on user permissions", "To encrypt file contents", "To control access to files and directories based on user permissions"));
        list.add(new QuestionModel("What is the role of a command-line interface in an operating system?",
                "To manage system processes", "To handle network communications", "To provide a text-based interface for interacting with the operating system", "To represent an open file in a process", "To provide a text-based interface for interacting with the operating system"));
        list.add(new QuestionModel("What is the purpose of a system call in an operating system?",
                "To manage file system permissions", "To handle input/output operations", "To provide an interface for programs to interact with the operating system", "To optimize CPU performance", "To provide an interface for programs to interact with the operating system"));

    }
    private void setEight(){
        list.add(new QuestionModel("What is the role of a boot loader in an operating system?",
                "To manage system processes", "To handle network communications", "To initialize the operating system during startup", "To represent an open file in a process", "To initialize the operating system during startup"));
        list.add(new QuestionModel("What is the purpose of a process in an operating system?",
                "To manage user accounts", "To handle network requests", "To execute a program and manage its resources", "To encrypt file contents", "To execute a program and manage its resources"));
        list.add(new QuestionModel("What is the difference between a kernel and a shell in an operating system?",
                "The programming languages they are written in", "The level of user interaction", "Their roles in managing system resources", "Their compatibility with different hardware platforms", "Their roles in managing system resources"));
        list.add(new QuestionModel("What is the purpose of a device manager in an operating system?",
                "To manage file system permissions", "To handle memory allocation", "To manage and control hardware devices", "To optimize CPU performance", "To manage and control hardware devices"));
        list.add(new QuestionModel("What is the role of an interrupt handler in an operating system?",
                "To manage user accounts", "To handle network requests", "To respond to hardware interrupts and handle them appropriately", "To represent an open file in a process", "To respond to hardware interrupts and handle them appropriately"));
        list.add(new QuestionModel("What is the purpose of a memory manager in an operating system?",
                "To manage system processes", "To handle network communications", "To allocate and deallocate memory for programs and processes", "To perform encryption and decryption of memory contents", "To allocate and deallocate memory for programs and processes"));
        list.add(new QuestionModel("What is the difference between a preemptive and a non-preemptive scheduling algorithm?",
                "Their compatibility with different programming languages", "The number of supported hardware devices", "The handling of process priority and resource allocation", "The size of the executable files", "The handling of process priority and resource allocation"));
        list.add(new QuestionModel("What is the purpose of a file permission system in an operating system?",
                "To manage user accounts", "To handle network requests", "To control access to files and directories based on user permissions", "To encrypt file contents", "To control access to files and directories based on user permissions"));
        list.add(new QuestionModel("What is the role of a command-line interface in an operating system?",
                "To manage system processes", "To handle network communications", "To provide a text-based interface for interacting with the operating system", "To represent an open file in a process", "To provide a text-based interface for interacting with the operating system"));
        list.add(new QuestionModel("What is the purpose of a system call in an operating system?",
                "To manage file system permissions", "To handle input/output operations", "To provide an interface for programs to interact with the operating system", "To optimize CPU performance", "To provide an interface for programs to interact with the operating system"));

    }
    private void setNine(){
        list.add(new QuestionModel("What is the role of a boot loader in an operating system?",
                "To manage system processes", "To handle network communications", "To initialize the operating system during startup", "To represent an open file in a process", "To initialize the operating system during startup"));
        list.add(new QuestionModel("What is the purpose of a process in an operating system?",
                "To manage user accounts", "To handle network requests", "To execute a program and manage its resources", "To encrypt file contents", "To execute a program and manage its resources"));
        list.add(new QuestionModel("What is the difference between a kernel and a shell in an operating system?",
                "The programming languages they are written in", "The level of user interaction", "Their roles in managing system resources", "Their compatibility with different hardware platforms", "Their roles in managing system resources"));
        list.add(new QuestionModel("What is the purpose of a device manager in an operating system?",
                "To manage file system permissions", "To handle memory allocation", "To manage and control hardware devices", "To optimize CPU performance", "To manage and control hardware devices"));
        list.add(new QuestionModel("What is the role of an interrupt handler in an operating system?",
                "To manage user accounts", "To handle network requests", "To respond to hardware interrupts and handle them appropriately", "To represent an open file in a process", "To respond to hardware interrupts and handle them appropriately"));
        list.add(new QuestionModel("What is the purpose of a memory manager in an operating system?",
                "To manage system processes", "To handle network communications", "To allocate and deallocate memory for programs and processes", "To perform encryption and decryption of memory contents", "To allocate and deallocate memory for programs and processes"));
        list.add(new QuestionModel("What is the difference between a preemptive and a non-preemptive scheduling algorithm?",
                "Their compatibility with different programming languages", "The number of supported hardware devices", "The handling of process priority and resource allocation", "The size of the executable files", "The handling of process priority and resource allocation"));
        list.add(new QuestionModel("What is the purpose of a file permission system in an operating system?",
                "To manage user accounts", "To handle network requests", "To control access to files and directories based on user permissions", "To encrypt file contents", "To control access to files and directories based on user permissions"));
        list.add(new QuestionModel("What is the role of a command-line interface in an operating system?",
                "To manage system processes", "To handle network communications", "To provide a text-based interface for interacting with the operating system", "To represent an open file in a process", "To provide a text-based interface for interacting with the operating system"));
        list.add(new QuestionModel("What is the purpose of a system call in an operating system?",
                "To manage file system permissions", "To handle input/output operations", "To provide an interface for programs to interact with the operating system", "To optimize CPU performance", "To provide an interface for programs to interact with the operating system"));

    }
    private void setTen(){
        list.add(new QuestionModel("What is the role of a boot loader in an operating system?",
                "To manage system processes", "To handle network communications", "To initialize the operating system during startup", "To represent an open file in a process", "To initialize the operating system during startup"));
        list.add(new QuestionModel("What is the purpose of a process in an operating system?",
                "To manage user accounts", "To handle network requests", "To execute a program and manage its resources", "To encrypt file contents", "To execute a program and manage its resources"));
        list.add(new QuestionModel("What is the difference between a kernel and a shell in an operating system?",
                "The programming languages they are written in", "The level of user interaction", "Their roles in managing system resources", "Their compatibility with different hardware platforms", "Their roles in managing system resources"));
        list.add(new QuestionModel("What is the purpose of a device manager in an operating system?",
                "To manage file system permissions", "To handle memory allocation", "To manage and control hardware devices", "To optimize CPU performance", "To manage and control hardware devices"));
        list.add(new QuestionModel("What is the role of an interrupt handler in an operating system?",
                "To manage user accounts", "To handle network requests", "To respond to hardware interrupts and handle them appropriately", "To represent an open file in a process", "To respond to hardware interrupts and handle them appropriately"));
        list.add(new QuestionModel("What is the purpose of a memory manager in an operating system?",
                "To manage system processes", "To handle network communications", "To allocate and deallocate memory for programs and processes", "To perform encryption and decryption of memory contents", "To allocate and deallocate memory for programs and processes"));
        list.add(new QuestionModel("What is the difference between a preemptive and a non-preemptive scheduling algorithm?",
                "Their compatibility with different programming languages", "The number of supported hardware devices", "The handling of process priority and resource allocation", "The size of the executable files", "The handling of process priority and resource allocation"));
        list.add(new QuestionModel("What is the purpose of a file permission system in an operating system?",
                "To manage user accounts", "To handle network requests", "To control access to files and directories based on user permissions", "To encrypt file contents", "To control access to files and directories based on user permissions"));
        list.add(new QuestionModel("What is the role of a command-line interface in an operating system?",
                "To manage system processes", "To handle network communications", "To provide a text-based interface for interacting with the operating system", "To represent an open file in a process", "To provide a text-based interface for interacting with the operating system"));
        list.add(new QuestionModel("What is the purpose of a system call in an operating system?",
                "To manage file system permissions", "To handle input/output operations", "To provide an interface for programs to interact with the operating system", "To optimize CPU performance", "To provide an interface for programs to interact with the operating system"));

    }
}
