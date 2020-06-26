package com.example.imusic.model.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.musicplayer.app.App;
import com.example.musicplayer.app.Constant;


public class PreferencesHelperImpl implements PreferencesHelper{
    private SharedPreferences mPreferences;

    public PreferencesHelperImpl(){
        mPreferences = App.getContext().getSharedPreferences(Constant.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE);
    }

    @Override
    public void setPlayMode(int mode) {
        mPreferences.edit().putInt(Constant.PREFS_PLAY_MODE,mode).apply();
    }

    @Override
    public int getPlayMode() {
        return mPreferences.getInt(Constant.PREFS_PLAY_MODE,0);
    }
}
