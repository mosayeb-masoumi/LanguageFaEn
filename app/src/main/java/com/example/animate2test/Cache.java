package com.example.animate2test;

import android.content.Context;
import android.content.SharedPreferences;

public class Cache {
    private static SharedPreferences getPrefs() {
        return App.context.getSharedPreferences("UserNameAcrossApplication", Context.MODE_PRIVATE);
    }

    public static String getString(String Key) {
        return getPrefs().getString(Key, "");
    }

    public static int getInt(String Key) {
        return getPrefs().getInt(Key, 0);
    }

    public static int getInt(String Key, int DefaultValue) {
        return getPrefs().getInt(Key, DefaultValue);
    }

    public static boolean getBoolean(String Key) {
        return getPrefs().getBoolean(Key,false);
    }

    public static boolean getBoolean(String Key, boolean DefaultValue) {
        return getPrefs().getBoolean(Key, DefaultValue);
    }

    public static void setString(String Key, String value) {
        getPrefs().edit().putString(Key, value).apply();
    }

    public static void setInt(String Key, int value) {
        getPrefs().edit().putInt(Key, value).apply();
    }

    public static void setBoolean(String Key, boolean value) {
        getPrefs().edit().putBoolean(Key, value).apply();
    }

}
