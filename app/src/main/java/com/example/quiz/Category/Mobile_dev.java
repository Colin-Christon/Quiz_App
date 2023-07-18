package com.example.quiz.Category;

import com.example.quiz.Models.QuestionModel;

import java.util.ArrayList;

public class Mobile_dev {
    ArrayList<QuestionModel> list=new ArrayList<>();

    public ArrayList<QuestionModel> mobile_dev(String setName){
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
        list.add(new QuestionModel("What is the main component responsible for managing the user interface of an Android app?", "Service", "BroadcastReceiver", "Activity", "Fragment", "Activity"));
        list.add(new QuestionModel("Which programming language is commonly used for Android app development?","Kotlin", "Java", "Swift",  "C#", "Kotlin"));
        list.add(new QuestionModel("Which layout manager is used to arrange elements in a grid-like structure?", "RelativeLayout", "GridLayout","LinearLayout",  "ConstraintLayout", "GridLayout"));
        list.add(new QuestionModel("Which file is used to declare the permissions required by an Android app?", "strings.xml", "styles.xml",  "build.gradle","AndroidManifest.xml", "AndroidManifest.xml"));
        list.add(new QuestionModel("Which component is used to perform tasks in the background without a user interface?", "Activity", "BroadcastReceiver", "ContentProvider", "Service", "Service"));
        list.add(new QuestionModel("Which method is called when an Android app is launched?", "onStart()", "onResume()", "onPause()", "onCreate()", "onCreate()"));
        list.add(new QuestionModel("Which keyword is used to define a constant variable in Java?", "static", "final", "const", "var", "final"));
        list.add(new QuestionModel("What is the full form of APK in Android?", "Android Program Kernel", "Application Package", "Android Package Kit", "Android Programming Kit", "Android Package Kit"));
        list.add(new QuestionModel("What is the purpose of the 'adb' command in Android?", "To compile Android apps", "To install Android Studio", "To communicate with the Android device", "To debug Android apps", "To communicate with the Android device"));
        list.add(new QuestionModel("Which database option is recommended for storing structured data in an Android app?", "SharedPreferences", "External Storage", "SQLite", "Internal Storage", "SQLite"));

    }

    private void setTwo(){
        list.add(new QuestionModel("Which component is responsible for handling system-wide broadcast messages in Android?", "Activity", "BroadcastReceiver", "ContentProvider", "Service", "BroadcastReceiver"));
        list.add(new QuestionModel("What is the purpose of an Intent in Android?", "To define the app's user interface", "To handle background tasks", "To perform inter-component communication", "To manage database operations", "To perform inter-component communication"));
        list.add(new QuestionModel("Which layout manager allows for complex positioning and alignment of elements?", "LinearLayout", "GridLayout", "RelativeLayout", "ConstraintLayout", "ConstraintLayout"));
        list.add(new QuestionModel("Which XML file contains the metadata and configurations for an Android app?", "layout.xml", "strings.xml", "AndroidManifest.xml", "styles.xml", "AndroidManifest.xml"));
        list.add(new QuestionModel("Which component is responsible for managing the lifecycle of an Android app?", "Service", "BroadcastReceiver", "ContentProvider", "Activity", "Activity"));
        list.add(new QuestionModel("Which method is used to retrieve the value of a specific key in a HashMap?", "put()", "remove()", "containsKey()", "get()", "get()"));
        list.add(new QuestionModel("Which keyword is used to define a subclass in Java?", "implements", "super", "this", "extends", "extends"));
        list.add(new QuestionModel("What is the purpose of the 'adb logcat' command in Android?", "To install APK files", "To capture screenshots", "To view the device log messages", "To debug Android apps", "To view the device log messages"));
        list.add(new QuestionModel("What is the default orientation of an Android app?", "Portrait", "Landscape", "Both Portrait and Landscape", "Sensor", "Portrait"));
        list.add(new QuestionModel("Which component is responsible for managing database operations in Android?", "Activity", "BroadcastReceiver", "Service", "ContentProvider", "ContentProvider"));

    }

    private void setThree(){
        list.add(new QuestionModel("Which component is responsible for managing the user interface of an Android app?", "BroadcastReceiver", "Service", "Fragment", "Activity", "Activity"));
        list.add(new QuestionModel("Which programming language is commonly used for Android app development?", "Java", "Kotlin", "C#", "Swift", "Kotlin"));
        list.add(new QuestionModel("Which layout manager is used to arrange elements in a grid-like structure?", "RelativeLayout", "LinearLayout", "GridLayout", "ConstraintLayout", "GridLayout"));
        list.add(new QuestionModel("Which file is used to declare the permissions required by an Android app?", "build.gradle", "AndroidManifest.xml", "styles.xml", "strings.xml", "AndroidManifest.xml"));
        list.add(new QuestionModel("Which component is used to perform tasks in the background without a user interface?", "Activity", "BroadcastReceiver", "ContentProvider", "Service", "Service"));
        list.add(new QuestionModel("Which method is called when an Android app is launched?", "onStart()", "onCreate()", "onResume()", "onPause()", "onCreate()"));
        list.add(new QuestionModel("Which keyword is used to define a constant variable in Java?", "static", "final", "var", "const", "final"));
        list.add(new QuestionModel("What is the full form of APK in Android?", "Application Package", "Android Programming Kit", "Android Package Kit", "Android Program Kernel", "Android Package Kit"));
        list.add(new QuestionModel("What is the purpose of the 'adb' command in Android?", "To communicate with the Android device", "To install Android Studio", "To compile Android apps", "To debug Android apps", "To communicate with the Android device"));
        list.add(new QuestionModel("Which database option is recommended for storing structured data in an Android app?", "SharedPreferences", "Internal Storage", "SQLite", "External Storage", "SQLite"));


    }

    private void setFour(){
        list.add(new QuestionModel("Which component is responsible for handling system-wide broadcast messages in Android?", "BroadcastReceiver", "Activity", "Service", "ContentProvider", "BroadcastReceiver"));
        list.add(new QuestionModel("What is the purpose of an Intent in Android?", "To perform inter-component communication", "To define the app's user interface", "To handle background tasks", "To manage database operations", "To perform inter-component communication"));
        list.add(new QuestionModel("Which layout manager allows for complex positioning and alignment of elements?", "LinearLayout", "RelativeLayout", "ConstraintLayout", "GridLayout", "ConstraintLayout"));
        list.add(new QuestionModel("Which XML file contains the metadata and configurations for an Android app?", "layout.xml", "strings.xml", "AndroidManifest.xml", "styles.xml", "AndroidManifest.xml"));
        list.add(new QuestionModel("Which component is responsible for managing the lifecycle of an Android app?", "Service", "BroadcastReceiver", "ContentProvider", "Activity", "Activity"));
        list.add(new QuestionModel("Which method is used to retrieve the value of a specific key in a HashMap?", "put()", "remove()", "containsKey()", "get()", "get()"));
        list.add(new QuestionModel("Which keyword is used to define a subclass in Java?", "implements", "this", "extends", "super", "extends"));
        list.add(new QuestionModel("What is the purpose of the 'adb logcat' command in Android?", "To view the device log messages", "To install APK files", "To capture screenshots", "To debug Android apps", "To view the device log messages"));
        list.add(new QuestionModel("What is the default orientation of an Android app?", "Landscape", "Portrait", "Both Portrait and Landscape", "Sensor", "Portrait"));
        list.add(new QuestionModel("Which component is responsible for managing database operations in Android?", "BroadcastReceiver", "Activity", "Service", "ContentProvider", "ContentProvider"));

    }
    private void setFive(){
        list.add(new QuestionModel("Which component is used to display a list of scrollable items in Android?", "Service", "Fragment", "BroadcastReceiver", "ListView", "ListView"));
        list.add(new QuestionModel("What is the purpose of a Fragment in Android?", "To handle system-wide broadcast messages", "To define the app's user interface", "To manage database operations", "To represent a portion of UI in an Activity", "To represent a portion of UI in an Activity"));
        list.add(new QuestionModel("Which layout manager is used to arrange elements in a vertical or horizontal linear fashion?", "RelativeLayout", "GridLayout", "LinearLayout", "ConstraintLayout", "LinearLayout"));
        list.add(new QuestionModel("Which file is used to define the visual appearance of an Android app?", "AndroidManifest.xml", "build.gradle", "styles.xml", "strings.xml", "styles.xml"));
        list.add(new QuestionModel("Which component is used to perform tasks in the background and display results to the user?", "BroadcastReceiver", "ContentProvider", "Service", "Activity", "Service"));
        list.add(new QuestionModel("Which method is called when an Android app is brought to the foreground?", "onStart()", "onCreate()", "onResume()", "onPause()", "onResume()"));
        list.add(new QuestionModel("Which keyword is used to define a constant variable in Java?", "final", "static", "const", "var", "final"));
        list.add(new QuestionModel("What is the purpose of the 'adb install' command in Android?", "To view the device log messages", "To install APK files", "To capture screenshots", "To debug Android apps", "To install APK files"));
        list.add(new QuestionModel("Which database option is recommended for storing structured data in an Android app?", "Internal Storage", "SharedPreferences", "External Storage", "SQLite", "SQLite"));
        list.add(new QuestionModel("What is the purpose of the 'adb shell' command in Android?", "To communicate with the Android device", "To compile Android apps", "To debug Android apps", "To view the device log messages", "To communicate with the Android device"));

    }
    private void setSix(){
        list.add(new QuestionModel("Which component is responsible for handling user interactions in Android?", "BroadcastReceiver", "Service", "Activity", "ContentProvider", "Activity"));
        list.add(new QuestionModel("Which programming language is recommended for Android app development?", "Java", "Kotlin", "C#", "Swift", "Kotlin"));
        list.add(new QuestionModel("Which layout manager is used to arrange elements based on constraints?", "RelativeLayout", "LinearLayout", "GridLayout", "ConstraintLayout", "ConstraintLayout"));
        list.add(new QuestionModel("Which file is used to specify the permissions required by an Android app?", "AndroidManifest.xml", "build.gradle", "styles.xml", "strings.xml", "AndroidManifest.xml"));
        list.add(new QuestionModel("Which component is used to perform tasks in the background without a user interface?", "BroadcastReceiver", "ContentProvider", "Service", "Activity", "Service"));
        list.add(new QuestionModel("Which method is called when an Android app is launched?", "onStart()", "onCreate()", "onResume()", "onPause()", "onCreate()"));
        list.add(new QuestionModel("Which keyword is used to define a subclass in Java?", "extends", "implements", "this", "super", "extends"));
        list.add(new QuestionModel("What is the purpose of the 'adb logcat' command in Android?", "To view the device log messages", "To install APK files", "To capture screenshots", "To debug Android apps", "To view the device log messages"));
        list.add(new QuestionModel("Which layout manager is used to create a grid of elements?", "RelativeLayout", "LinearLayout", "GridLayout", "ConstraintLayout", "GridLayout"));
        list.add(new QuestionModel("Which component is used to store and retrieve data in Android?", "BroadcastReceiver", "Activity", "Service", "ContentProvider", "ContentProvider"));

    }
    private  void setSeven(){
        list.add(new QuestionModel("Which component is responsible for handling system-wide broadcast messages in Android?", "BroadcastReceiver", "Service", "Activity", "ContentProvider", "BroadcastReceiver"));
        list.add(new QuestionModel("What is the purpose of an Intent in Android?", "To perform inter-component communication", "To define the app's user interface", "To handle background tasks", "To manage database operations", "To perform inter-component communication"));
        list.add(new QuestionModel("Which layout manager allows for complex positioning and alignment of elements?", "LinearLayout", "RelativeLayout", "ConstraintLayout", "GridLayout", "ConstraintLayout"));
        list.add(new QuestionModel("Which XML file contains the metadata and configurations for an Android app?", "layout.xml", "strings.xml", "AndroidManifest.xml", "styles.xml", "AndroidManifest.xml"));
        list.add(new QuestionModel("Which component is responsible for managing the lifecycle of an Android app?", "Service", "BroadcastReceiver", "ContentProvider", "Activity", "Activity"));
        list.add(new QuestionModel("Which method is used to retrieve the value of a specific key in a HashMap?", "put()", "remove()", "containsKey()", "get()", "get()"));
        list.add(new QuestionModel("Which keyword is used to define a subclass in Java?", "implements", "this", "extends", "super", "extends"));
        list.add(new QuestionModel("What is the purpose of the 'adb logcat' command in Android?", "To view the device log messages", "To install APK files", "To capture screenshots", "To debug Android apps", "To view the device log messages"));
        list.add(new QuestionModel("What is the default orientation of an Android app?", "Landscape", "Portrait", "Both Portrait and Landscape", "Sensor", "Portrait"));
        list.add(new QuestionModel("Which component is responsible for managing database operations in Android?", "BroadcastReceiver", "Activity", "Service", "ContentProvider", "ContentProvider"));

    }
    private void setEight(){
        list.add(new QuestionModel("Which component is used to display a list of scrollable items in Android?", "Service", "Fragment", "BroadcastReceiver", "ListView", "ListView"));
        list.add(new QuestionModel("What is the purpose of a Fragment in Android?", "To handle system-wide broadcast messages", "To define the app's user interface", "To manage database operations", "To represent a portion of UI in an Activity", "To represent a portion of UI in an Activity"));
        list.add(new QuestionModel("Which layout manager is used to arrange elements in a vertical or horizontal linear fashion?", "RelativeLayout", "GridLayout", "LinearLayout", "ConstraintLayout", "LinearLayout"));
        list.add(new QuestionModel("Which file is used to define the visual appearance of an Android app?", "AndroidManifest.xml", "build.gradle", "styles.xml", "strings.xml", "styles.xml"));
        list.add(new QuestionModel("Which component is used to perform tasks in the background and display results to the user?", "BroadcastReceiver", "ContentProvider", "Service", "Activity", "Service"));
        list.add(new QuestionModel("Which method is called when an Android app is brought to the foreground?", "onStart()", "onCreate()", "onResume()", "onPause()", "onResume()"));
        list.add(new QuestionModel("Which keyword is used to define a constant variable in Java?", "final", "static", "const", "var", "final"));
        list.add(new QuestionModel("What is the purpose of the 'adb install' command in Android?", "To view the device log messages", "To install APK files", "To capture screenshots", "To debug Android apps", "To install APK files"));
        list.add(new QuestionModel("Which database option is recommended for storing structured data in an Android app?", "Internal Storage", "SharedPreferences", "External Storage", "SQLite", "SQLite"));
        list.add(new QuestionModel("What is the purpose of the 'adb shell' command in Android?", "To communicate with the Android device", "To compile Android apps", "To debug Android apps", "To view the device log messages", "To communicate with the Android device"));

    }
    private void setNine(){
        list.add(new QuestionModel("Which component is responsible for handling user interactions in Android?", "BroadcastReceiver", "Service", "Activity", "ContentProvider", "Activity"));
        list.add(new QuestionModel("Which programming language is recommended for Android app development?", "Java", "Kotlin", "C#", "Swift", "Kotlin"));
        list.add(new QuestionModel("Which layout manager is used to arrange elements based on constraints?", "RelativeLayout", "LinearLayout", "GridLayout", "ConstraintLayout", "ConstraintLayout"));
        list.add(new QuestionModel("Which file is used to specify the permissions required by an Android app?", "AndroidManifest.xml", "build.gradle", "styles.xml", "strings.xml", "AndroidManifest.xml"));
        list.add(new QuestionModel("Which component is used to perform tasks in the background without a user interface?", "BroadcastReceiver", "ContentProvider", "Service", "Activity", "Service"));
        list.add(new QuestionModel("Which method is called when an Android app is launched?", "onStart()", "onCreate()", "onResume()", "onPause()", "onCreate()"));
        list.add(new QuestionModel("Which keyword is used to define a subclass in Java?", "extends", "implements", "this", "super", "extends"));
        list.add(new QuestionModel("What is the purpose of the 'adb logcat' command in Android?", "To view the device log messages", "To install APK files", "To capture screenshots", "To debug Android apps", "To view the device log messages"));
        list.add(new QuestionModel("Which layout manager allows for complex positioning and alignment of elements?", "LinearLayout", "RelativeLayout", "ConstraintLayout", "GridLayout", "ConstraintLayout"));
        list.add(new QuestionModel("Which XML file contains the metadata and configurations for an Android app?", "layout.xml", "strings.xml", "AndroidManifest.xml", "styles.xml", "AndroidManifest.xml"));

    }
    private void setTen(){
        list.add(new QuestionModel("Which component is responsible for handling system-wide broadcast messages in Android?", "BroadcastReceiver", "Service", "Activity", "ContentProvider", "BroadcastReceiver"));
        list.add(new QuestionModel("What is the purpose of an Intent in Android?", "To perform inter-component communication", "To define the app's user interface", "To handle background tasks", "To manage database operations", "To perform inter-component communication"));
        list.add(new QuestionModel("Which layout manager allows for dynamic positioning and alignment of elements?", "LinearLayout", "RelativeLayout", "ConstraintLayout", "GridLayout", "RelativeLayout"));
        list.add(new QuestionModel("Which file is used to define the app's colors, dimensions, and styles in Android?", "styles.xml", "AndroidManifest.xml", "strings.xml", "build.gradle", "styles.xml"));
        list.add(new QuestionModel("Which component is responsible for managing the lifecycle of an Android app?", "Service", "BroadcastReceiver", "ContentProvider", "Activity", "Activity"));
        list.add(new QuestionModel("Which method is used to retrieve the value of a specific key in a HashMap?", "put()", "remove()", "containsKey()", "get()", "get()"));
        list.add(new QuestionModel("Which keyword is used to define a subclass in Java?", "implements", "this", "extends", "super", "extends"));
        list.add(new QuestionModel("What is the purpose of the 'adb logcat' command in Android?", "To view the device log messages", "To install APK files", "To capture screenshots", "To debug Android apps", "To view the device log messages"));
        list.add(new QuestionModel("What is the default orientation of an Android app?", "Landscape", "Portrait", "Both Portrait and Landscape", "Sensor", "Portrait"));
        list.add(new QuestionModel("Which component is responsible for managing database operations in Android?", "BroadcastReceiver", "Activity", "Service", "ContentProvider", "ContentProvider"));
    }
}
