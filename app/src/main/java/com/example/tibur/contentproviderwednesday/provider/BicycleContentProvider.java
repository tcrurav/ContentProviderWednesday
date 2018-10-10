package com.example.tibur.contentproviderwednesday.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

import com.example.tibur.contentproviderwednesday.database.BicycleDatabase;

public class BicycleContentProvider extends ContentProvider {

    private static final int BICYCLE_ONE_REG = 1; //     http://miservicioweb.com/bicycle/#
    private static final int BICYCLE_ALL_REG = 2; //     http://miservicioweb.com/bicycle

    private final String DATABASE_NAME = "db_bicycle.db";
    private final int DATABASE_VERSION = 1;
    BicycleDatabase dbHelper = new BicycleDatabase(this, DATABASE_NAME, null, DATABASE_VERSION);

    public BicycleContentProvider() {
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        // Implement this to handle requests to delete one or more rows.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public String getType(Uri uri) {
        // TODO: Implement this to handle requests for the MIME type of the data
        // at the given URI.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        // TODO: Implement this to handle requests to insert a new row.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public boolean onCreate() {

    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        // TODO: Implement this to handle query requests from clients.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        // TODO: Implement this to handle requests to update one or more rows.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
