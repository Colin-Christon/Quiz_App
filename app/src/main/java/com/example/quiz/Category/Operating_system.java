package com.example.quiz.Category;

import com.example.quiz.Models.QuestionModel;

import java.util.ArrayList;

public class Operating_system {
    ArrayList<QuestionModel> list=new ArrayList<>();

    public ArrayList<QuestionModel> operating_system(String setName){
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
        list.add(new QuestionModel("What is the fundamental principle of an operating system?",
                "Process management", "Memory management", "File management", "Device management", "Process management"));
        list.add(new QuestionModel("What is the purpose of an interrupt in an operating system?",
                "To initiate a system shutdown", "To handle errors", "To allocate memory", "To request CPU attention", "To request CPU attention"));
        list.add(new QuestionModel("What is the role of a scheduler in an operating system?",
                "To manage the file system", "To manage network connections", "To manage system resources", "To manage user interfaces", "To manage system resources"));
        list.add(new QuestionModel("What is the function of a device driver in an operating system?",
                "To provide security features", "To manage virtual memory", "To handle input/output operations", "To execute application programs", "To handle input/output operations"));
        list.add(new QuestionModel("What is a deadlock in the context of operating systems?",
                "A system crash", "A memory leak", "A race condition", "A resource deadlock", "A resource deadlock"));
        list.add(new QuestionModel("What is the purpose of virtual memory in an operating system?",
                "To extend the capacity of RAM", "To speed up CPU processing", "To manage network connections", "To encrypt sensitive data", "To extend the capacity of RAM"));
        list.add(new QuestionModel("What is the role of the bootloader in an operating system?",
                "To manage user accounts", "To load the operating system into memory", "To optimize CPU performance", "To handle network protocols", "To load the operating system into memory"));
        list.add(new QuestionModel("What is the difference between a monolithic kernel and a microkernel?",
                "The number of supported devices", "The amount of system resources required", "The size of the kernel", "The number of available applications", "The size of the kernel"));
        list.add(new QuestionModel("What is the purpose of file system permissions in an operating system?",
                "To encrypt files", "To compress files", "To manage file access rights", "To organize files in folders", "To manage file access rights"));
        list.add(new QuestionModel("What is the advantage of using a multi-user operating system?",
                "Improved system performance", "Enhanced security", "Simplified user interface", "Increased file storage capacity", "Enhanced security"));

    }

    private void setTwo(){
        list.add(new QuestionModel("What is the purpose of a page table in virtual memory management?",
                "To store the contents of pages in secondary storage", "To manage physical memory allocation", "To track file system permissions", "To handle CPU interrupts", "To manage physical memory allocation"));
        list.add(new QuestionModel("What is the role of a shell in an operating system?",
                "To provide a graphical user interface", "To manage file system permissions", "To execute user commands", "To handle network protocols", "To execute user commands"));
        list.add(new QuestionModel("What is the difference between a process and a thread in an operating system?",
                "The amount of CPU time allocated", "The level of memory protection", "The degree of concurrency", "The priority assigned by the scheduler", "The degree of concurrency"));
        list.add(new QuestionModel("What is the purpose of a file allocation table (FAT) in a file system?",
                "To manage file permissions", "To store file metadata", "To track the location of files on disk", "To compress file contents", "To track the location of files on disk"));
        list.add(new QuestionModel("What is the role of the command interpreter in an operating system?",
                "To execute application programs", "To manage system resources", "To provide an interface for user commands", "To handle network connections", "To provide an interface for user commands"));
        list.add(new QuestionModel("What is the purpose of a semaphore in process synchronization?",
                "To allocate system resources", "To manage memory allocation", "To handle input/output operations", "To control access to shared resources", "To control access to shared resources"));
        list.add(new QuestionModel("What is the difference between a preemptive and non-preemptive scheduling algorithm?",
                "The number of supported processes", "The order of process execution", "The CPU usage efficiency", "The type of system resources managed", "The order of process execution"));
        list.add(new QuestionModel("What is the purpose of a file descriptor in an operating system?",
                "To store file contents in memory", "To manage file permissions", "To track file access times", "To represent an open file", "To represent an open file"));
        list.add(new QuestionModel("What is the role of a cache in CPU performance optimization?",
                "To increase main memory capacity", "To manage process scheduling", "To store frequently accessed data", "To handle network requests", "To store frequently accessed data"));
        list.add(new QuestionModel("What is the purpose of a mutex in multithreading synchronization?",
                "To manage process priorities", "To allocate CPU time", "To control access to shared resources", "To handle memory allocation", "To control access to shared resources"));

    }

    private void setThree(){
        list.add(new QuestionModel("What is the purpose of a file system journal in an operating system?",
                "To track user login activity", "To handle disk fragmentation", "To recover from system crashes", "To encrypt file contents", "To recover from system crashes"));
        list.add(new QuestionModel("What is the role of a network interface card (NIC) in an operating system?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To handle network communications", "To handle network communications"));
        list.add(new QuestionModel("What is the difference between a preemptive and non-preemptive kernel in an operating system?",
                "The amount of system memory required", "The CPU usage efficiency", "The scheduling algorithm used", "The number of supported devices", "The scheduling algorithm used"));
        list.add(new QuestionModel("What is the purpose of a deadlock detection algorithm in an operating system?",
                "To prevent unauthorized access", "To allocate system resources", "To recover from system crashes", "To identify and resolve resource deadlocks", "To identify and resolve resource deadlocks"));
        list.add(new QuestionModel("What is the role of a file system cache in an operating system?",
                "To store file system metadata", "To handle memory allocation", "To improve file access performance", "To manage system processes", "To improve file access performance"));
        list.add(new QuestionModel("What is the purpose of a context switch in an operating system?",
                "To manage CPU scheduling", "To encrypt file contents", "To handle network requests", "To switch between executing processes", "To switch between executing processes"));
        list.add(new QuestionModel("What is the difference between a kernel mode and user mode in an operating system?",
                "The level of memory protection", "The priority assigned by the scheduler", "The type of system resources managed", "The number of available applications", "The level of memory protection"));
        list.add(new QuestionModel("What is the purpose of a file system hierarchy in an operating system?",
                "To organize files in folders", "To manage file access permissions", "To encrypt file contents", "To compress file size", "To organize files in folders"));
        list.add(new QuestionModel("What is the role of a job scheduler in an operating system?",
                "To manage user accounts", "To load the operating system into memory", "To optimize CPU performance", "To schedule and manage processes", "To schedule and manage processes"));
        list.add(new QuestionModel("What is the purpose of a page replacement algorithm in virtual memory management?",
                "To allocate CPU time", "To handle memory allocation", "To manage process priorities", "To select pages for eviction from memory", "To select pages for eviction from memory"));

    }

    private void setFour(){
        list.add(new QuestionModel("What is the purpose of a file system journal in an operating system?",
                "To track user login activity", "To handle disk fragmentation", "To recover from system crashes", "To encrypt file contents", "To recover from system crashes"));
        list.add(new QuestionModel("What is the role of a network interface card (NIC) in an operating system?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To handle network communications", "To handle network communications"));
        list.add(new QuestionModel("What is the difference between a preemptive and non-preemptive kernel in an operating system?",
                "The amount of system memory required", "The CPU usage efficiency", "The scheduling algorithm used", "The number of supported devices", "The scheduling algorithm used"));
        list.add(new QuestionModel("What is the purpose of a deadlock detection algorithm in an operating system?",
                "To prevent unauthorized access", "To allocate system resources", "To recover from system crashes", "To identify and resolve resource deadlocks", "To identify and resolve resource deadlocks"));
        list.add(new QuestionModel("What is the role of a file system cache in an operating system?",
                "To store file system metadata", "To handle memory allocation", "To improve file access performance", "To manage system processes", "To improve file access performance"));
        list.add(new QuestionModel("What is the purpose of a context switch in an operating system?",
                "To manage CPU scheduling", "To encrypt file contents", "To handle network requests", "To switch between executing processes", "To switch between executing processes"));
        list.add(new QuestionModel("What is the difference between a kernel mode and user mode in an operating system?",
                "The level of memory protection", "The priority assigned by the scheduler", "The type of system resources managed", "The number of available applications", "The level of memory protection"));
        list.add(new QuestionModel("What is the purpose of a file system hierarchy in an operating system?",
                "To organize files in folders", "To manage file access permissions", "To encrypt file contents", "To compress file size", "To organize files in folders"));
        list.add(new QuestionModel("What is the role of a job scheduler in an operating system?",
                "To manage user accounts", "To load the operating system into memory", "To optimize CPU performance", "To schedule and manage processes", "To schedule and manage processes"));
        list.add(new QuestionModel("What is the purpose of a page replacement algorithm in virtual memory management?",
                "To allocate CPU time", "To handle memory allocation", "To manage process priorities", "To select pages for eviction from memory", "To select pages for eviction from memory"));

    }
    private void setFive(){
        list.add(new QuestionModel("What is the purpose of a command-line interface (CLI) in an operating system?",
                "To provide a graphical user interface", "To manage system resources", "To execute user commands", "To handle network protocols", "To execute user commands"));
        list.add(new QuestionModel("What is the role of a memory manager in an operating system?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To handle network communications", "To allocate memory resources"));
        list.add(new QuestionModel("What is the difference between a fat client and a thin client in a networked environment?",
                "The level of network security", "The type of network protocol used", "The amount of system memory required", "The processing capabilities of the client", "The processing capabilities of the client"));
        list.add(new QuestionModel("What is the purpose of a system call in an operating system?",
                "To manage user accounts", "To handle network requests", "To provide an interface to operating system services", "To encrypt file contents", "To provide an interface to operating system services"));
        list.add(new QuestionModel("What is the role of a dispatcher in CPU scheduling?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To facilitate process execution", "To facilitate process execution"));
        list.add(new QuestionModel("What is the purpose of a logical address in memory management?",
                "To identify physical memory locations", "To manage file access permissions", "To store file contents in memory", "To handle network communications", "To identify physical memory locations"));
        list.add(new QuestionModel("What is the difference between a single-user and multi-user operating system?",
                "The number of supported devices", "The level of memory protection", "The degree of concurrency", "The priority assigned by the scheduler", "The degree of concurrency"));
        list.add(new QuestionModel("What is the purpose of a process control block (PCB) in an operating system?",
                "To manage user accounts", "To track file access times", "To store file metadata", "To store process-specific information", "To store process-specific information"));
        list.add(new QuestionModel("What is the role of a system clock in an operating system?",
                "To manage CPU scheduling", "To handle input/output operations", "To provide a time reference", "To control access to shared resources", "To provide a time reference"));
        list.add(new QuestionModel("What is the purpose of a file system in an operating system?",
                "To manage system processes", "To provide system security", "To store and organize files", "To handle network communications", "To store and organize files"));

    }
    private void setSix(){
        list.add(new QuestionModel("What is the purpose of a command-line interface (CLI) in an operating system?",
                "To provide a graphical user interface", "To manage system resources", "To execute user commands", "To handle network protocols", "To execute user commands"));
        list.add(new QuestionModel("What is the role of a memory manager in an operating system?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To handle network communications", "To allocate memory resources"));
        list.add(new QuestionModel("What is the difference between a fat client and a thin client in a networked environment?",
                "The level of network security", "The type of network protocol used", "The amount of system memory required", "The processing capabilities of the client", "The processing capabilities of the client"));
        list.add(new QuestionModel("What is the purpose of a system call in an operating system?",
                "To manage user accounts", "To handle network requests", "To provide an interface to operating system services", "To encrypt file contents", "To provide an interface to operating system services"));
        list.add(new QuestionModel("What is the role of a dispatcher in CPU scheduling?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To facilitate process execution", "To facilitate process execution"));
        list.add(new QuestionModel("What is the purpose of a logical address in memory management?",
                "To identify physical memory locations", "To manage file access permissions", "To store file contents in memory", "To handle network communications", "To identify physical memory locations"));
        list.add(new QuestionModel("What is the difference between a single-user and multi-user operating system?",
                "The number of supported devices", "The level of memory protection", "The degree of concurrency", "The priority assigned by the scheduler", "The degree of concurrency"));
        list.add(new QuestionModel("What is the purpose of a process control block (PCB) in an operating system?",
                "To manage user accounts", "To track file access times", "To store file metadata", "To store process-specific information", "To store process-specific information"));
        list.add(new QuestionModel("What is the role of a system clock in an operating system?",
                "To manage CPU scheduling", "To handle input/output operations", "To provide a time reference", "To control access to shared resources", "To provide a time reference"));
        list.add(new QuestionModel("What is the purpose of a file system in an operating system?",
                "To manage system processes", "To provide system security", "To store and organize files", "To handle network communications", "To store and organize files"));

    }
    private  void setSeven(){
        list.add(new QuestionModel("What is the purpose of a device driver in an operating system?",
                "To manage user accounts", "To handle network requests", "To provide an interface to hardware devices", "To encrypt file contents", "To provide an interface to hardware devices"));
        list.add(new QuestionModel("What is the role of a page table in virtual memory management?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To translate logical addresses to physical addresses", "To translate logical addresses to physical addresses"));
        list.add(new QuestionModel("What is the difference between a symmetric multiprocessing (SMP) and asymmetric multiprocessing (AMP) in an operating system?",
                "The level of network security", "The type of network protocol used", "The number of processors involved", "The processing capabilities of the system", "The number of processors involved"));
        list.add(new QuestionModel("What is the purpose of a file allocation table (FAT) in a file system?",
                "To organize files in folders", "To manage file access permissions", "To store file system metadata", "To compress file size", "To store file system metadata"));
        list.add(new QuestionModel("What is the role of a scheduler in an operating system?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To control process execution order", "To control process execution order"));
        list.add(new QuestionModel("What is the purpose of a virtual machine in an operating system?",
                "To manage user accounts", "To handle network requests", "To provide a simulated environment for running programs", "To encrypt file contents", "To provide a simulated environment for running programs"));
        list.add(new QuestionModel("What is the difference between a monolithic kernel and a microkernel in an operating system?",
                "The level of memory protection", "The priority assigned by the scheduler", "The type of system resources managed", "The amount of kernel code running in privileged mode", "The amount of kernel code running in privileged mode"));
        list.add(new QuestionModel("What is the purpose of a semaphore in process synchronization?",
                "To manage CPU scheduling", "To handle input/output operations", "To provide mutual exclusion and coordination", "To control access to shared resources", "To provide mutual exclusion and coordination"));
        list.add(new QuestionModel("What is the role of a file descriptor in an operating system?",
                "To manage system processes", "To handle network communications", "To store file access times", "To represent an open file in a process", "To represent an open file in a process"));
        list.add(new QuestionModel("What is the purpose of a paging system in memory management?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To enable efficient memory allocation and management", "To enable efficient memory allocation and management"));

    }
    private void setEight(){
        list.add(new QuestionModel("What is the purpose of a device driver in an operating system?",
                "To manage user accounts", "To handle network requests", "To provide an interface to hardware devices", "To encrypt file contents", "To provide an interface to hardware devices"));
        list.add(new QuestionModel("What is the role of a page table in virtual memory management?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To translate logical addresses to physical addresses", "To translate logical addresses to physical addresses"));
        list.add(new QuestionModel("What is the difference between a symmetric multiprocessing (SMP) and asymmetric multiprocessing (AMP) in an operating system?",
                "The level of network security", "The type of network protocol used", "The number of processors involved", "The processing capabilities of the system", "The number of processors involved"));
        list.add(new QuestionModel("What is the purpose of a file allocation table (FAT) in a file system?",
                "To organize files in folders", "To manage file access permissions", "To store file system metadata", "To compress file size", "To store file system metadata"));
        list.add(new QuestionModel("What is the role of a scheduler in an operating system?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To control process execution order", "To control process execution order"));
        list.add(new QuestionModel("What is the purpose of a virtual machine in an operating system?",
                "To manage user accounts", "To handle network requests", "To provide a simulated environment for running programs", "To encrypt file contents", "To provide a simulated environment for running programs"));
        list.add(new QuestionModel("What is the difference between a monolithic kernel and a microkernel in an operating system?",
                "The level of memory protection", "The priority assigned by the scheduler", "The type of system resources managed", "The amount of kernel code running in privileged mode", "The amount of kernel code running in privileged mode"));
        list.add(new QuestionModel("What is the purpose of a semaphore in process synchronization?",
                "To manage CPU scheduling", "To handle input/output operations", "To provide mutual exclusion and coordination", "To control access to shared resources", "To provide mutual exclusion and coordination"));
        list.add(new QuestionModel("What is the role of a file descriptor in an operating system?",
                "To manage system processes", "To handle network communications", "To store file access times", "To represent an open file in a process", "To represent an open file in a process"));
        list.add(new QuestionModel("What is the purpose of a paging system in memory management?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To enable efficient memory allocation and management", "To enable efficient memory allocation and management"));

    }
    private void setNine(){
        list.add(new QuestionModel("What is the purpose of a device driver in an operating system?",
                "To manage user accounts", "To handle network requests", "To provide an interface to hardware devices", "To encrypt file contents", "To provide an interface to hardware devices"));
        list.add(new QuestionModel("What is the role of a page table in virtual memory management?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To translate logical addresses to physical addresses", "To translate logical addresses to physical addresses"));
        list.add(new QuestionModel("What is the difference between a symmetric multiprocessing (SMP) and asymmetric multiprocessing (AMP) in an operating system?",
                "The level of network security", "The type of network protocol used", "The number of processors involved", "The processing capabilities of the system", "The number of processors involved"));
        list.add(new QuestionModel("What is the purpose of a file allocation table (FAT) in a file system?",
                "To organize files in folders", "To manage file access permissions", "To store file system metadata", "To compress file size", "To store file system metadata"));
        list.add(new QuestionModel("What is the role of a scheduler in an operating system?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To control process execution order", "To control process execution order"));
        list.add(new QuestionModel("What is the purpose of a virtual machine in an operating system?",
                "To manage user accounts", "To handle network requests", "To provide a simulated environment for running programs", "To encrypt file contents", "To provide a simulated environment for running programs"));
        list.add(new QuestionModel("What is the difference between a monolithic kernel and a microkernel in an operating system?",
                "The level of memory protection", "The priority assigned by the scheduler", "The type of system resources managed", "The amount of kernel code running in privileged mode", "The amount of kernel code running in privileged mode"));
        list.add(new QuestionModel("What is the purpose of a semaphore in process synchronization?",
                "To manage CPU scheduling", "To handle input/output operations", "To provide mutual exclusion and coordination", "To control access to shared resources", "To provide mutual exclusion and coordination"));
        list.add(new QuestionModel("What is the role of a file descriptor in an operating system?",
                "To manage system processes", "To handle network communications", "To store file access times", "To represent an open file in a process", "To represent an open file in a process"));
        list.add(new QuestionModel("What is the purpose of a paging system in memory management?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To enable efficient memory allocation and management", "To enable efficient memory allocation and management"));

    }
    private void setTen(){
        list.add(new QuestionModel("What is the purpose of a device driver in an operating system?",
                "To manage user accounts", "To handle network requests", "To provide an interface to hardware devices", "To encrypt file contents", "To provide an interface to hardware devices"));
        list.add(new QuestionModel("What is the role of a page table in virtual memory management?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To translate logical addresses to physical addresses", "To translate logical addresses to physical addresses"));
        list.add(new QuestionModel("What is the difference between a symmetric multiprocessing (SMP) and asymmetric multiprocessing (AMP) in an operating system?",
                "The level of network security", "The type of network protocol used", "The number of processors involved", "The processing capabilities of the system", "The number of processors involved"));
        list.add(new QuestionModel("What is the purpose of a file allocation table (FAT) in a file system?",
                "To organize files in folders", "To manage file access permissions", "To store file system metadata", "To compress file size", "To store file system metadata"));
        list.add(new QuestionModel("What is the role of a scheduler in an operating system?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To control process execution order", "To control process execution order"));
        list.add(new QuestionModel("What is the purpose of a virtual machine in an operating system?",
                "To manage user accounts", "To handle network requests", "To provide a simulated environment for running programs", "To encrypt file contents", "To provide a simulated environment for running programs"));
        list.add(new QuestionModel("What is the difference between a monolithic kernel and a microkernel in an operating system?",
                "The level of memory protection", "The priority assigned by the scheduler", "The type of system resources managed", "The amount of kernel code running in privileged mode", "The amount of kernel code running in privileged mode"));
        list.add(new QuestionModel("What is the purpose of a semaphore in process synchronization?",
                "To manage CPU scheduling", "To handle input/output operations", "To provide mutual exclusion and coordination", "To control access to shared resources", "To provide mutual exclusion and coordination"));
        list.add(new QuestionModel("What is the role of a file descriptor in an operating system?",
                "To manage system processes", "To handle network communications", "To store file access times", "To represent an open file in a process", "To represent an open file in a process"));
        list.add(new QuestionModel("What is the purpose of a paging system in memory management?",
                "To manage file system permissions", "To allocate memory resources", "To optimize CPU performance", "To enable efficient memory allocation and management", "To enable efficient memory allocation and management"));

    }
}
