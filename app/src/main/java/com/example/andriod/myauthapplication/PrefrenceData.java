package com.example.andriod.myauthapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PrefrenceData {
    public static final String KEY_USER_ID= "muserId";
    public static final String KEY_USER_NAME = "muserName";
    private static final  String DEFAULT_ID = "";

    public static void setUserId(Context context,String userId){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(KEY_USER_ID, userId);
        editor.apply();
    }

    public static String getUserId(Context context){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        String userId = prefs.getString(KEY_USER_ID, DEFAULT_ID);
        return userId;
    }
}
