package com.example.learningapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DatabaseHelper  extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "App.db";
    private static final int DATABASE_VERSION = 1;
    SQLiteDatabase db;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table users (id integer primary key autoincrement,name text,email text,username text,password text,usertype text default 'user' )");
        db.execSQL("create table score (id integer primary key autoincrement,Livingtissues integer default 0,Photosynthesis integer default 0, Mixture integer default 0, Waves integer default 0, Geometrical integer default 0, Humanbody integer default 0, Acid integer default 0, Heat integer default 0, Power integer default 0, Electronics integer default 0, Electrochemistry integer default 0, Electromagnetism integer default 0, Hydrocarbons integer default 0, Biosphere integer default 0)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists users");


    }
    public static final String md5(final String name) {
        final String MD5 = "MD5";
        try {
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest
                    .getInstance(MD5);
            digest.update(name.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuilder hexString = new StringBuilder();
            for (byte aMessageDigest : messageDigest) {
                String h = Integer.toHexString(0xFF & aMessageDigest);
                while (h.length() < 2)
                    h = "0" + h;
                hexString.append(h);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
    public boolean insert(String name, String email, String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        password = md5(password);
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("email", email);
        contentValues.put("username", username);
        contentValues.put("password", password);
        contentValues.put("usertype", "user");
        long ins = db.insert("users", null, contentValues);
        if (ins == -1) return false;
        else return true;
    }
    public boolean chkemail(String email) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from users where email=?", new String[]{email});
        if (cursor.getCount() > 0) return false;
        else return true;
    }

    public boolean chkuname(String username) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from users where username=?", new String[]{username});
        if (cursor.getCount() > 0) return false;
        else return true;
    }



    public boolean userpassword( String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        password = md5(password);
        Cursor cursor = db.rawQuery("select * from users where username=? and password=?", new String[]{username, password});
        if (cursor.getCount() > 0) return true;
        else return false;
    }

    public boolean updateScore(int score, String id) {
        String scoreStr = String.valueOf(score);
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Mixture", scoreStr);
        // contentValues.put("id",id);
        long ins = db.update("score",contentValues,"id="+id,null);
        if (ins == -1) return false;
        else return true;

    }

    public boolean insertScore(int score,String id) {
        String scoreStr = String.valueOf(score);
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("level1", scoreStr);
        contentValues.put("id",id);
        long ins = db.insert("score", null, contentValues);
        if (ins == -1) return false;
        else return true;


    }



    public Cursor viewScore(String id) {

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("select * from score where id=?", new String[]{id});

        return cursor;
    }

    public Cursor viewHighScore() {

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("select * from score", null);

        return cursor;

    }
    public Cursor getUser() {

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("select * from users", null);

        return cursor;

    }

    public Cursor getUserdetails(String name) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from users where username=?", new String[]{name});
        return cursor;
    }


}
