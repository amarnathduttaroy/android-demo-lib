package com.example.android_demo_lib;

import android.content.Context;

import java.io.File;
import java.io.IOException;

public class InternalStorageManager {

    private static InternalStorageManager instance = null;

    private InternalStorageManager() {

    }

    public static InternalStorageManager getInstance(){
        if(instance == null) {
            instance = new InternalStorageManager();
        }
        return instance;
    }

    boolean createCacheFile(Context context, String filename) {
        File file = null;
        try{
            file = File.createTempFile(filename, null, context.getCacheDir());
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return file != null;
    }

    File getCacheFile(Context context, String filename){
        return new File(context.getCacheDir(), filename);
    }

}
