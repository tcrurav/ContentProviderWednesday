package com.example.tibur.contentproviderwednesday.application;

import android.app.Application;

import com.example.tibur.contentproviderwednesday.R;

public class BicycleApplication extends Application {
    public static String BICYCLE_AUTHORITY;

    public BicycleApplication(){
        this.BICYCLE_AUTHORITY = getString(R.string.bicycle_authorities);
    }
}
