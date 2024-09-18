package com.example.android_demo_lib;

import android.util.Log;

public class HelloWorld {
    public static void main(String[] args){
        /// Main method
    }

    /// Prints message with tag in logcat
    public static void printLog(String tag, String message){
        Log.d(tag, message);
    }
}
