package com.example.tibur.contentproviderwednesday.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import com.example.tibur.contentproviderwednesday.provider.BicycleContract;

public class BicycleDatabase extends SQLiteOpenHelper {
    public BicycleDatabase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + BicycleContract.TABLE_NAME +
                "( _ID PRIMARY KEY AUTOINCREMENT," +
                BicycleContract.MODEL + " TEXT, " +
                BicycleContract.YEAR + " INTEGER" +
                ");"
        );

        databaseInitialize(db);
    }

    private void databaseInitialize(SQLiteDatabase db) {
        db.execSQL("INSERT INTO " + BicycleContract.TABLE_NAME +
                "(" + BicycleContract.MODEL + "," + BicycleContract.YEAR + ")" +
                " VALUES (1, 'Orbea', 1982)");
        db.execSQL("INSERT INTO " + BicycleContract.TABLE_NAME +
                "(" + BicycleContract.MODEL + "," + BicycleContract.YEAR + ")" +
                " VALUES (2, 'BH', 1982)");
        db.execSQL("INSERT INTO " + BicycleContract.TABLE_NAME +
                "(" + BicycleContract.MODEL + "," + BicycleContract.YEAR + ")" +
                " VALUES (3, 'Trek', 2002)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + BicycleContract.TABLE_NAME);
        onCreate(db);
    }
}
