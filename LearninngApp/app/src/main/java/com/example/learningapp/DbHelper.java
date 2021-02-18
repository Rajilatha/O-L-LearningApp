package com.example.learningapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME ="lessondata.db";
    private static final int DATABASE_VERSION = 1;
    SQLiteDatabase db;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table lesson(id integer primary key autoincrement,lesson text,type text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists lesson");
    }

    public boolean insert(String lesson,String type){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("lesson", lesson);
        contentValues.put("type", type);
        long ins = db.insert("lesson", null, contentValues);
        if (ins == -1) return false;
        else return true;
    }

    public List<word> getAllPlants(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='plant'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllAnimals(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='animal'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllFactors(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='fact'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllProducts(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='pro'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllImportance(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='import'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllDigestion(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='diges'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllRespiration(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='respi'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllExcretion(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='excre'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllCirculation(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='circu'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllCoordination(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='coor'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllLevels(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='level'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllEcosystems(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='eco'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllPollution(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='poll'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllLifestyle(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='life'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllDevelopment(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='devel'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllTypes(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='mix'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllSeparation(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='sep'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllAcids(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='acid'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllBases(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='base'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllSalts(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='salt'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllElectrochemicalcells(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='cell'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllElectrolysis(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='ele'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllEthen(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='ethen'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllPolymer(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='poly'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllMechanical(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='mech'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllSounds(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='sou'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllInstruments(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='inst'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllReflection(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='ref'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllMirrors(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='mirr'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllRefraction(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='refra'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllLenses(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='len'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllTemperature(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='tem'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllHeat(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='heat'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllMatter(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='mat'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllAppliences(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='app'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllCircuits(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='cir'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllIntroduction(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='intro'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllJunctions(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='jun'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllCurrents(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='cur'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllMagnetism(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='mag'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllMagneticeffects(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='effect'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllInduction(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='induc'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllAlgebraicfra(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='alge'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllBinomialex(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='bino'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllDatarepren(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='repre'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllEquations(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='equ'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllGeometric(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='geo'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllPercentages(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='per'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllRealnumbers(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='real'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllSharemarket(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='mar'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllTissuestamil(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='tissuestamil'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllTissuessinhala(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='tissuessinhala'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllPhotosyntamil(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='photosyntamil'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllPhotosynsinhala(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='photosynsinhala'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllHumanbodytamil(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='humanbodytamil'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllHumanbodysinhala(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='humanbodysinhala'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllBiospheretamil(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='biospheretamil'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllBiospheresinhala(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='biospheresinhala'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllMixturestamil(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='mixturestamil'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllMixturessinhala(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='mixturessinhala'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllAcidstamil(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='acidstamil'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllAcidssinhala(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='acidssinhala'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllElectrochenistrytamil(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='electrochemistrytamil'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllElectrochenistrysinhala(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='electrochemistrysinhala'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllHydrocarbonstamil(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='hydrocarbonstamil'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllHydrocarbonssinhala(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='hydrocarbonssinhala'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllWavestamil(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='wavestamil'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllWavessinhala(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='wavessinhala'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllOpticstamil(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='opticstamil'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllOpticssinhala(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='opticssinhala'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllHeattamil(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='heattamil'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllHeatsinhala(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='heatsinhala'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllPowertamil(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='powertamil'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllPowersinhala(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='powersinhala'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllElectronicstamil(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='electronicstamil'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllElectronicssinhala(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='electronicssinhala'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllElectromagnetismtamil(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='electromagnetismtamil'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllElectromagnetismsinhala(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='electromagnetismsinhala'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
}



