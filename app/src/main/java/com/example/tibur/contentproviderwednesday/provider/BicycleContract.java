package com.example.tibur.contentproviderwednesday.provider;

import android.net.Uri;
import android.provider.BaseColumns;

import com.example.tibur.contentproviderwednesday.application.BicycleApplication;

public class BicycleContract implements BaseColumns {
    public static String TABLE_NAME = "bicycle";
    public static String CONTENT_URI = Uri.parse("content://" +
            BicycleApplication.BICYCLE_AUTHORITY + "/" + TABLE_NAME).toString();

    public static String MODEL = "model";
    public static String YEAR = "year";
}
