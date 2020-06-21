package com.example.musicplayer.app;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * 获取全局Context
 * Created by 黄侣琳 on 2020/06/20.
 */

public class App extends Application {
    @SuppressLint("StaticFieldLeak")
    private static Context context;

    @Override
    public void onCreate(){
        super.onCreate();
        context=getApplicationContext();
        LitePal.initialize(this);
    }

    public static Context getContext(){
        return context;
    }
}
