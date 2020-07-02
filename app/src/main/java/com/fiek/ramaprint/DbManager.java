package com.fiek.ramaprint;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbManager  extends SQLiteOpenHelper
{
    private static final String dbname="PorosiaIme.db";

    DbManager(Context context)
    {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String qry="create table tbl_porosia (id integer primary key autoincrement, emri text, email text, porosia text)";
        db.execSQL(qry);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS tbl_porosia");
        onCreate(db);

    }

    String addRecord(String p1, String p2, String p3)
    {
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues cv=new ContentValues();
        cv.put("emri",p1);
        cv.put("email",p2);
        cv.put("porosia",p3);

        long res=db.insert("tbl_porosia", null,cv);

        if (res==-1)
            return "Gabim!";
        else
            return "Porosia u dergua";

    }
}
