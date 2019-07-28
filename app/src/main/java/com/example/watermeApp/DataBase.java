package com.example.watermeApp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBase extends SQLiteOpenHelper {

    private static String databaseName="Profile";
    SQLiteDatabase ProfileDB ;

    public DataBase(Context context)
    {
        super(context,databaseName,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table sign_up(name text , email text , age text ,weight text ,height text , water text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists sign_up");
        onCreate(sqLiteDatabase);

    }
    public void createnewtable(String name , String email  , String age  , String weight , String height  , String water )
    {
        ContentValues row =new ContentValues();
        row.put("name",name);
        row.put("email",email);
        row.put("age",age);
        row.put("weight",weight);
        row.put("height",height);
        row.put("water",water);

        ProfileDB=getWritableDatabase();
        ProfileDB.insert("sign_up",null,row);
        ProfileDB.close();

    }

    public Cursor getamount()
    {
        ProfileDB=getReadableDatabase();
        String []amount_ofwater={"water"};
        Cursor cursor=ProfileDB.query("sign_up",amount_ofwater,null,null,null,null,null);
        if(cursor!=null)
        {
            cursor.moveToFirst();
        }
        ProfileDB.close();
        return cursor;

    }


}
