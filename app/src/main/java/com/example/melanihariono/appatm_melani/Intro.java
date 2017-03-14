package com.example.melanihariono.appatm_melani;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Melanihariono on 2/20/2017.
 */
public class Intro {
    private static final String INTRO_NAME = "androidhve-welcome";
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;
    int PRIVATE_MODE = 0;

    public Intro(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(INTRO_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

}
