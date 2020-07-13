package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public class DBHelper extends SQLiteOpenHelper {

    static abstract class MyColumns implements BaseColumns {
    static final String NamaTabel = "Barang";
    static final String Id = "id";
    static final String NamaBarang = "Nama_Barang";
    static final String Qty = "Qty";
    static final String Harga = "Harga";
    static final String ExpDate = "Exp_Date";

}

    private static final String NamaDatabse = "crud.db";
    private static final int VersiDatabase = 1;

    //Query yang digunakan untuk membuat Tabel
    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE "+MyColumns.NamaTabel+
            "("+MyColumns.Id+" TEXT PRIMARY KEY, "+MyColumns.NamaBarang+" TEXT NOT NULL, "+MyColumns.Qty+
            " TEXT NOT NULL, "+MyColumns.Harga+" TEXT NOT NULL, "+MyColumns.ExpDate+
            " TEXT NOT NULL)";

    //Query yang digunakan untuk mengupgrade Tabel
    private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS "+MyColumns.NamaTabel;

    DBHelper(Context context) {
        super(context, NamaDatabse, null, VersiDatabase);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);

    }
}
