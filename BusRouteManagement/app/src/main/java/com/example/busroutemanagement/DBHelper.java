package com.example.busroutemanagement;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "routedb";
    private static final int DB_VERSION = 1;
    private static final String TABLE_NAME = "routes";
    private static final String ID_COL = "id";
    private static final String NAME_COL = "bus_name";
    private static final String BUSTOP_COL = "bus_stops";

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NAME_COL + " TEXT,"
                + BUSTOP_COL + " TEXT)";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void addNewBusRoute(String busName, String busStops) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(NAME_COL, busName);
        values.put(BUSTOP_COL, busStops);

        db.insert(TABLE_NAME, null, values);
        db.close();;
    }

    public ArrayList<BusModal> readBusRoutes() {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);

        ArrayList<BusModal> busList = new ArrayList<>();

        if (cursor.moveToFirst()) {
            do {
                busList.add(new BusModal(
                        cursor.getString(1),
                        cursor.getString(2)
                ));
            } while (cursor.moveToNext());
        }

        cursor.close();
        return busList;
    }

    public void refreshDb() {

    }
}
